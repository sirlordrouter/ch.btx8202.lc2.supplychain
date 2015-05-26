package ui;

import barcode.Barcode;
import barcode.BarcodeDecoder;
import barcode.BarcodeInformation;
import barcodeHook.Scanner;
import barcodeHook.ScannerEvent;
import barcodeHook.ScannerListener;
import datalayer.FakeDataRepository;
import datalayer.IRepository;
import entities.Patient;
import entities.PreparedMedication;
import entities.Prescription;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;
import services.BarcodeGenerator;
import services.ErpWebserviceClient;
import services.PropertiesReader;
import ui.exceptions.BarcodeParseException;
import webservice.erp.Item;
import webservice.erp.MediPrepResult;

import java.awt.print.PrinterException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 *  View for additional Medications in fluid application form.
 *  <div>Icons made by <a href="http://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a>,
 *  <a href="http://www.flaticon.com/authors/simpleicon" title="SimpleIcon">SimpleIcon</a>
 *  from <a href="http://www.flaticon.com" title="Flaticon">www.flaticon.com</a>
 *  is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0">CC BY 3.0</a></div>
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class AdditionalMedicViewController extends VBox implements IPartialView, ScannerListener {

    public Label lblNameGender;
    public Label lblBirthdate;
    public Label lblPatInfo;
    public TextField txtBarcode;

    public TableView<Prescription> prescriptionTableView;
    public TableView<Prescription> prescriptionTableViewReserve;
    public TableView<PreparedMedication> preparedMedicationTableView;


    private final ObservableList<Prescription> prescriptions = FXCollections.observableArrayList();
    private final ObservableList<Prescription> prescriptionsAdditional =  FXCollections.observableArrayList();
    private final ObservableList<PreparedMedication> medications =  FXCollections.observableArrayList();
    private IRepository dataSource;
    private BarcodeGenerator barcodeGenerator;
    private String printerName;

    public AdditionalMedicViewController(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }


        Properties prop = null;
        try {
            PropertiesReader reader = new PropertiesReader();
            prop = reader.getPropValues();
        }
        catch (IOException e) {
            //TODO Show Message
        }

        dataSource = new ErpWebserviceClient(prop.getProperty("stationGLN"));
        printerName = prop.getProperty("printerName");
        barcodeGenerator = new BarcodeGenerator();

        setUpPrescriptionsTable(prescriptionTableView);
        setUpPrescriptionsTable(prescriptionTableViewReserve);
        setUpTables(preparedMedicationTableView);

        prescriptionTableView.setItems(prescriptions);
        prescriptionTableViewReserve.setItems(prescriptionsAdditional);
        preparedMedicationTableView.setItems(medications);

    }

    private void setUpPatientInfo(Patient currentPatient) {
        lblNameGender.setText(
                "[PID: " + currentPatient.getPid() + "] " +
                        currentPatient.getLastname() + ", " + currentPatient.getFirstname() +
                        " (" + currentPatient.getGender().toString().substring(0,1) + ")"
        );

        lblBirthdate.setText(
                currentPatient.getBirthDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                        + " (" + currentPatient.getAge() + ")");
        lblPatInfo.setText(
                "Station: " + currentPatient.getStationName() +
                        ", Zimmer: " + currentPatient.getRoom());

    }

    private void setUpPrescriptionsTable(TableView<Prescription> prescriptionTableView) {
        prescriptionTableView.setRowFactory(t -> {
            TableRow<Prescription> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    Prescription rowData = row.getItem();

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmation Dialog");
                    alert.setHeaderText("Ausdruck Verordnungs ID");
                    alert.setContentText("Möchten Sie die Etikette für die Verordnung erneut ausdrucken?");

                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK &&
                            (rowData.doAllMedicationsHave(PreparedMedication.MedicationState.prepared) ||
                            rowData.doAllMedicationsHave(PreparedMedication.MedicationState.controlled))){
                        showSuccessfullPreparationAndPrintLabel(rowData);
                    } else {
                        // ... user chose CANCEL or closed the dialog
                    }
                } else if(event.getClickCount() == 1 && (! row.isEmpty())) {
                    medications.clear();
                    medications.addAll(row.getItem().getMedications());
                }
            });
            return row;
        });
        /**
         * Main Columns
         */
        TableColumn<Prescription, Prescription.PrescriptionState> state = new TableColumn("Status");
        state.setCellValueFactory(cellData -> {
            return cellData.getValue().prescriptionStateProperty();
        });
        state.setCellFactory(cellData -> {
            return new TableCell<Prescription, Prescription.PrescriptionState>() {

                Image openImage = new Image("image/play.png");
                Image pausedImage = new Image("image/paused.png");
                Image stoppedImage = new Image("image/stopped.png");
                Image doseChangedImage = new Image("image/update.png");
                ImageView view;

                {
                    view = new ImageView();
                    view.setFitHeight(26);
                    view.setFitWidth(26);
                    setGraphic(view);
                }

                @Override
                public void updateItem(Prescription.PrescriptionState item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                        view.setImage(null);
                    } else {
                        switch (item) {

                            case open:
                                view.setImage(openImage);
                                break;
                            case paused:
                                view.setImage(pausedImage);
                                break;
                            case stopped:
                                view.setImage(stoppedImage);
                                break;
                            case doseChanged:
                                view.setImage(doseChangedImage);
                                break;
                        }
                    }
                }
            };
        });

        TableColumn<Prescription, String> description = new TableColumn("Beschreibung");
        description.setMaxWidth(200);
        description.setMinWidth(200);
        description.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
        description.setCellFactory(new Callback<TableColumn<Prescription, String>, TableCell<Prescription, String>>() {
            @Override
            public TableCell<Prescription, String> call(TableColumn<Prescription, String> arg0) {
                return new TableCell<Prescription, String>() {
                    private Text text;

                    @Override
                    public void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if (!isEmpty()) {
                            text = new Text(item.toString());
                            text.setWrappingWidth(description.getWidth());
                            this.setWrapText(true);

                            setGraphic(text);
                        }
                    }
                };
            }
        });

        TableColumn<Prescription, String> applicationScheme = new TableColumn("Schema");


        TableColumn<Prescription, LocalDate> preparationTime = new TableColumn("Erstellt am:");
        DateTimeFormatter myDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        preparationTime.setCellValueFactory(cellData -> cellData.getValue().dateCreatedProperty());
        preparationTime.setCellFactory(cellData ->
                new TableCell<Prescription, LocalDate>() {
                    @Override
                    protected void updateItem(LocalDate item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item == null || empty) {
                            setText(null);
                        } else {
                            // Format date.
                            setText(myDateFormatter.format(item));
                        }
                    }
                });


        /**
         *  Nested Columns ApplicationSchme
         */
        TableColumn<Prescription, String> morning = new TableColumn("Mo");
        morning.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSchedule().substring(0, 1)));
        TableColumn<Prescription, String> noon = new TableColumn("Mi");
        noon.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSchedule().substring(1,2)));
        TableColumn<Prescription, String> evening = new TableColumn("Ab");
        evening.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSchedule().substring(2,3)));
        TableColumn<Prescription, String> night = new TableColumn("Na");
        night.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSchedule().substring(3,4)));
        applicationScheme.getColumns().addAll(morning, noon, evening, night);

        TableColumn<Prescription, String> prescriber = new TableColumn("Ausgestellt von");
        prescriber.setCellValueFactory(cellData -> cellData.getValue().getStaffName());

        TableColumn<Prescription, Boolean> prepState = new TableColumn("Vorbereitung");
        prepState.setCellValueFactory(cellData -> cellData.getValue().isPreparedProperty());

        prepState.setCellFactory(cellData -> {
            return new TableCell<Prescription, Boolean>() {

                Image pendingImage = new Image("image/time.png");
                Image readyImage = new Image("image/ok_icon.png");
                ImageView view;

                {
                    view = new ImageView();
                    view.setFitHeight(25);
                    view.setFitWidth(25);
                    setGraphic(view);
                }

                @Override
                public void updateItem(Boolean item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                        view.setImage(null);
                    } else {
                        if (item) {
                            view.setImage(readyImage);
                        } else {
                            view.setImage(pendingImage);
                        }
                    }
                }
            };
        });


        prescriptionTableView.getColumns().addAll(state, description, applicationScheme, preparationTime, prescriber, prepState);

    }

    private void setUpTables(TableView aTable) {
        aTable.setRowFactory(t -> {
                    TableRow<PreparedMedication> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
                    PreparedMedication rowData = row.getItem();
                    System.out.println(rowData);
                    if (rowData.getState() == PreparedMedication.MedicationState.open) {
                        AddMedDialog addMedDialog = new AddMedDialog(null, rowData, dataSource);
                        addMedDialog.centerOnScreen();
                        addMedDialog.showAndWait(); //TODO: Check successful in Dialog to display error

                        if (!addMedDialog.isCanceled()) {
                            if (rowData.getBasedOnPrescription().doAllMedicationsHave(PreparedMedication.MedicationState.controlled)) {
                                showSuccessfullPreparationAndPrintLabel(rowData.getBasedOnPrescription());

                            }
                        }
                    }

                }
            });
            return row;
        });

        /**
         * Main Columns
         */
        TableColumn<PreparedMedication, PreparedMedication.MedicationState> state = new TableColumn("State");
        state.setCellValueFactory(cellData -> {
            return cellData.getValue().stateProperty();
        });
        state.setCellFactory(cellData -> {
            return new TableCell<PreparedMedication, PreparedMedication.MedicationState>() {

                Image pendingImage = new Image("image/time.png");
                Image readyImage = new Image("image/ok_icon.png");
                ImageView view;

                {
                    view = new ImageView();
                    view.setFitHeight(25);
                    view.setFitWidth(25);
                    setGraphic(view);
                }

                @Override
                public void updateItem(PreparedMedication.MedicationState item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                        view.setImage(null);
                    } else {
                        switch (item) {
                            case open:
                                view.setImage(pendingImage);
                                break;
                            case prepared:
                                view.setImage(readyImage);
                                break;
                            case controlled:
                                view.setImage(readyImage);
                                break;
                            case served:
                                view.setImage(null);
                                break;
                            default:
                                view.setImage(null);
                                break;
                        }
                    }
                }
            };
        });

 //       TableColumn<PreparedMedication, String> name = new TableColumn("Name");
 //       name.setCellValueFactory(cellData -> cellData.getValue().getName());

        TableColumn<PreparedMedication, String> name = new TableColumn("Name");
        name.setMaxWidth(250);
        name.setCellValueFactory(cellData -> cellData.getValue().getName());

        TableColumn<PreparedMedication, String> dosage = new TableColumn("Dosierung");
        dosage.setCellValueFactory(cellData -> cellData.getValue().getDosage());

        TableColumn<PreparedMedication, String> dosageUnit = new TableColumn("Einheit");
        dosageUnit.setCellValueFactory(cellData -> cellData.getValue().getDosageUnit());

        aTable.getColumns().addAll(state, name, dosage, dosageUnit);

    }

    @Override
    public void beforeLeaving() {
        Scanner.removeScannerListener(this);
    }

    @Override
    public void beforeOpen() {
        Scanner.addScannerEventListener(this, "(/", 0);

        fetchPatientData();
    }

    private void fetchPatientData() {
        if (FakeDataRepository.getInstance().getCurrentPatient() != null) {
            setUpPatientInfo(FakeDataRepository.getInstance().getCurrentPatient());

            medications.clear();
            prescriptions.clear();
            prescriptionsAdditional.clear();

            List<Prescription> prescriptionListTemp = dataSource.getPrescriptions(
                    FakeDataRepository.getInstance().getCurrentPatient());

            prescriptions.addAll(prescriptionListTemp.stream().filter(
                    p -> p.getMedications().stream().anyMatch(
                            m -> !m.isReserve())
            ).collect(Collectors.toList()));
            prescriptionsAdditional.addAll(prescriptionListTemp.stream().filter(
                    p -> p.getMedications().stream().anyMatch(
                            m -> m.isReserve())
            ).collect(Collectors.toList()));
        }
    }

    @Override
    public void handleScannerEvent(ScannerEvent scannerEvent) {
        List<Item> items;

        //txtareaMediInfo.setText("Barcode " + evt.getBarCode() + " gescannt.");
        Barcode code = BarcodeDecoder.getBarcodeFrom(scannerEvent);
        final BarcodeInformation info =  code.getBarcodeInformation();
        String errorMessage = "";

        if(info != null) {
            System.out.println("Info is not null.");
            if (info.getAI01_HANDELSEINHEIT() != null
                    && info.getAI21_SERIAL_NUMBER() != null
                    && info.getAI17_VERFALLSDATUM() != null
                    && info.getAI10_CHARGENNUMMER() != null) {
                //is product or logistic unit scanned matching a medic in the preparation list?
                errorMessage = findPrecribedMedicForScannedProduct(info, errorMessage);

            } else {
                //TODO: what to do if not every field captured
                errorMessage += "Es konnten nicht alle Informationen zum Medikament ausgelesen werden.";
            }

        } else {
            errorMessage += "Es konnten keine Informationen ausgelesen werden.";
        }

        if(!errorMessage.equals("")) {
            showError(errorMessage);
        }
    }

    private String findPrecribedMedicForScannedProduct(BarcodeInformation info, String errorMessage) {

        final String gtinSearch = info.getAI01_HANDELSEINHEIT();
        List<PreparedMedication> medis =  medications.stream().filter(
                m ->
                        m.getGtinA().get().equals(gtinSearch) ||
                        m.getGtinBs().stream().anyMatch(b -> b.equals(gtinSearch))
        ).collect(Collectors.toList());
        if (medis.size() == 0 || medis.size() > 1) {
            //TODO: fehler, keine entpsrechende gtin gefunden bzw. zu viele passende medis
            errorMessage +=  medis.size() == 0 ? "Fehler 1: Es wurden keine Medikamente in der Verordnung gefunden," +
                    "\n die zum gescannten Medikament passen.\n" : "";
            errorMessage += medis.size() > 1 ? "Fehler 2: Das gescannte Medikament konnte nicht eindeutig\n" +
                    "einer Verordnung zugewiesen werden." : "";
        } else {

            PreparedMedication preparedMedication = medis.get(0);

            if(preparedMedication.getState() == PreparedMedication.MedicationState.open) {

                errorMessage = updatePreparedMedication(preparedMedication, info.getAI01_HANDELSEINHEIT(),
                        info.getAI17_VERFALLSDATUM(), info.getAI10_CHARGENNUMMER(), info.getAI21_SERIAL_NUMBER());

                if (errorMessage.equals("")) {
                    finishPreparation(preparedMedication);
                } else {
                    preparedMedication.setState(PreparedMedication.MedicationState.open);
                }

            }

        }
        return errorMessage;
    }

    private void finishPreparation(PreparedMedication preparedMedication) {
        showSuccessfullScan(preparedMedication);

        if (preparedMedication.getBasedOnPrescription().doAllMedicationsHave(PreparedMedication.MedicationState.controlled)) {
            showSuccessfullPreparationAndPrintLabel(preparedMedication.getBasedOnPrescription());
        }
    }

    public void evaluateCode(ActionEvent event) {
        String barcodeInput = txtBarcode.getText();
        try {
            if (!barcodeInput.startsWith("(/")) throw new BarcodeParseException("Kein Scanner input: Prefix ist falsch.");

            ScannerEvent evt = new ScannerEvent(this, barcodeInput.substring(2),"(/","",0);
            Barcode b = BarcodeDecoder.getBarcodeFrom(evt);
            if (b == null || b.getBarcodeInformation() == null) throw new BarcodeParseException("Barcode konnte nicht evaluiert werden");

            BarcodeInformation information = b.getBarcodeInformation();
            if (information.getAI00_SSCC() != null) throw new BarcodeParseException("Kein Produkt gefunden, es handelt sich um ein SSCC");

            if (information.getAI01_HANDELSEINHEIT() == null
                    || information.getAI21_SERIAL_NUMBER() == null
                    || information.getAI17_VERFALLSDATUM() == null
                    || information.getAI10_CHARGENNUMMER() == null) {
                throw new BarcodeParseException("Informationen nicht vollständig.");
            }

            String errorMessage = findPrecribedMedicForScannedProduct(information, "");
            if (!errorMessage.equals("")) {
                throw new BarcodeParseException(errorMessage);

            }
            txtBarcode.setText("");

        }catch (BarcodeParseException e) {
            showError(e.getMessage());
        }
    }

    private void showError(String errorMessage) {
        Alert alertSuccessfulScan = new Alert(Alert.AlertType.ERROR);
        alertSuccessfulScan.setTitle("Information Dialog");
        alertSuccessfulScan.setHeaderText(null);
        alertSuccessfulScan.setContentText(errorMessage); //"Scan nicht erfolgreich. Gefundene Fehler:\n" +

        alertSuccessfulScan.showAndWait();
    }

    private void showSuccessfullScan(PreparedMedication preparedMedication) {
        Alert alertSuccessfulScan = new Alert(Alert.AlertType.INFORMATION);
        alertSuccessfulScan.setTitle("Information Dialog");
        alertSuccessfulScan.setHeaderText(null);
        alertSuccessfulScan.setContentText("Scan von " + preparedMedication.getDescription() + "erfolgreich.");

        alertSuccessfulScan.showAndWait();
    }

    private String updatePreparedMedication(PreparedMedication preparedMedication, String gtin, String expDate, String lot, String serial) {
        preparedMedication.setAssignedProductGTIN(gtin);
        preparedMedication.setExpiryDate(expDate);
        preparedMedication.setBatchLot(lot);
        preparedMedication.setSerial(serial);

        preparedMedication.setPreparationTime(LocalDateTime.now());
        preparedMedication.setState(PreparedMedication.MedicationState.controlled);
        List<PreparedMedication> medicationList = new ArrayList<>();
        medicationList.add(preparedMedication);
        //Additional Medics are directly in controlled state as they are immediately given to the patient
        MediPrepResult success = dataSource.UpdatePreperationState(medicationList, PreparedMedication.MedicationState.prepared);
        if (!success.isResult()) {
            //fehlermeldung => ev stimmen batch/serial/expirydate nicht überein mit produkten im SPital
            return "Fehler: Spezifisches Produkt konnten im ERP nicht gefunden werden.";
        } else {
            //TODO: get inserted data and set also state to controlled
            return "";
        }
    }

    private void showSuccessfullPreparationAndPrintLabel(Prescription prescription) {
        //Print Barcode for product and make info .....
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);

        if (prescription.getMedications().size() > 1) {

            alert.setContentText("You now have successfully prepared all medications\n for the prescription" +
                            "congratulations!! :-p" +
                            "\nTake the printed barcode and put in on the item" +
                            "\nto enable bedside scanning." +
                            "\n<< Happy Scan >>"
            );

            alert.showAndWait();

            try {
                barcodeGenerator.printBarcode(prescription, printerName);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (PrinterException e) {
                Alert printAlert = new Alert(Alert.AlertType.ERROR);
                printAlert.setTitle("Druckfehler Dialog");
                printAlert.setHeaderText(null);
                printAlert.setContentText("Leider gab es ein Fehler beim Drucken mit Drucker " + printerName + ".\n" +
                        "Falls der Drucker in Ordnung ist, lösen Sie den Vorgang erneut aus.");
            }

        }




    }
}
