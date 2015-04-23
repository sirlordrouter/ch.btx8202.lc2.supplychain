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
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;
import services.ErpWebserviceClient;
import services.PropertiesReader;
import webservice.erp.Item;
import webservice.erp.MediPrepResult;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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

    public TableView<PreparedMedication> medicationsList;
    public TableView<PreparedMedication> medicationsListReserve;

    private final ObservableList<PreparedMedication> medications =  FXCollections.observableArrayList();
    private final ObservableList<PreparedMedication> medicationReserve =  FXCollections.observableArrayList();
    private IRepository dataSource;

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

        setUpTables(medicationsList);
        setUpTables(medicationsListReserve);

        medications.addAll(FakeDataRepository.getInstance().getMedications().stream().filter(m -> !m.isReserve()).collect(Collectors.toList()));
        medicationReserve.addAll(FakeDataRepository.getInstance().getMedications().stream().filter(m -> m.isReserve()).collect(Collectors.toList()));

        medicationsList.setItems(medications);
        medicationsListReserve.setItems(medicationReserve);

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
                        addMedDialog.showAndWait(); //TODO: Check successful in DIalog to display error

                        if (!addMedDialog.isCanceled()) {
                            if (rowData.getBasedOnPrescription().doAllMedicationsHave(PreparedMedication.MedicationState.controlled)) {
                                showSuccessfullPreparationAndPrintLabel(rowData);

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

                Image pendingImage = new Image("resources/image/time.png");
                Image readyImage = new Image("resources/image/ok_icon.png");
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

        TableColumn<PreparedMedication, String> description = new TableColumn("Beschreibung");
        description.setMaxWidth(200);
        description.setMinWidth(200);
        description.setCellValueFactory(cellData -> cellData.getValue().getDescription());
        description.setCellFactory(new Callback<TableColumn<PreparedMedication, String>, TableCell<PreparedMedication, String>>() {
            @Override
            public TableCell<PreparedMedication, String> call(TableColumn<PreparedMedication, String> arg0) {
                return new TableCell<PreparedMedication, String>() {
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


        TableColumn<PreparedMedication, String> dosage = new TableColumn("Dosierung");
        dosage.setCellValueFactory(cellData -> cellData.getValue().getDosage());

        TableColumn<PreparedMedication, String> dosageUnit = new TableColumn("Einheit");
        dosageUnit.setCellValueFactory(cellData -> cellData.getValue().getDosageUnit());

        TableColumn<PreparedMedication, String> applicationScheme = new TableColumn("Schema");


        TableColumn<PreparedMedication, LocalDateTime> preparationTime = new TableColumn("Bereitgestellt am");
        DateTimeFormatter myDateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        preparationTime.setCellValueFactory(cellData -> cellData.getValue().preparationTimeProperty());
        preparationTime.setCellFactory(cellData ->
                new TableCell<PreparedMedication, LocalDateTime>() {
                    @Override
                    protected void updateItem(LocalDateTime item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item == null || empty) {
                            setText(null);
                        } else {
                            // Format date.
                            setText(myDateFormatter.format(item));
                        }
                    }
                });


        //TODO: not working yet
        /**
         *  Nested Columns ApplicationSchme
         */
        TableColumn<PreparedMedication, String> morning = new TableColumn("Mo");
        morning.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApplicationScheme().get().substring(0,1)));
        TableColumn<PreparedMedication, String> noon = new TableColumn("Mi");
        noon.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApplicationScheme().get().substring(1,2)));
        TableColumn<PreparedMedication, String> evening = new TableColumn("Ab");
        evening.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApplicationScheme().get().substring(2,3)));
        TableColumn<PreparedMedication, String> night = new TableColumn("Na");
        night.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApplicationScheme().get().substring(3,4)));
        applicationScheme.getColumns().addAll(morning, noon, evening, night);

        TableColumn<PreparedMedication, String> prescriber = new TableColumn("Ausgestellt von");
        prescriber.setCellValueFactory(cellData -> cellData.getValue().getStaffName());

        aTable.getColumns().addAll(state, name, description, dosage, dosageUnit, applicationScheme, preparationTime, prescriber);

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
            medicationReserve.clear();

            List<Prescription> prescriptionList = dataSource.getPrescriptions(FakeDataRepository.getInstance().getCurrentPatient());
            List<PreparedMedication> preparedMedications = new ArrayList<>();

            for (Prescription prescription : prescriptionList) {
                preparedMedications.addAll(prescription.getMedications());
            }

            medications.addAll(preparedMedications.stream().filter(p -> !p.isReserve()).collect(Collectors.toList()));
            medicationReserve.addAll(preparedMedications.stream().filter(p -> p.isReserve()).collect(Collectors.toList()));

        }
    }

    @Override
    public void handleScannerEvent(ScannerEvent scannerEvent) {
        //Navigator.getInstance().getMainController().setStatusbarWaiting("scanned item is evaluated...");

        List<Item> items;

        //txtareaMediInfo.setText("Barcode " + evt.getBarCode() + " gescannt.");
        Barcode code = BarcodeDecoder.getBarcodeFrom(scannerEvent);
        final BarcodeInformation info =  code.getBarcodeInformation();
        String errorMessage = "";

        if(info != null) {
            if (info.getAI01_HANDELSEINHEIT() != null
                    && info.getAI21_SERIAL_NUMBER() != null
                    && info.getAI17_VERFALLSDATUM() != null
                    && info.getAI10_CHARGENNUMMER() != null) {
                //is product or logistic unit scanned matching a medic in the preparation list?
                List<PreparedMedication> medis =  medications.stream().filter(
                        m ->
                                m.getGtinA().equals(info.getAI01_HANDELSEINHEIT()) ||
                                m.getGtinBs().stream().anyMatch(b -> b.equals(info.getAI01_HANDELSEINHEIT()))
                ).collect(Collectors.toList());
                if (medis.size() == 0 || medis.size() > 1) {
                    //TODO: fehler, keine entpsrechende gtin gefunden bzw. zu viele passende medis
                   errorMessage +=  medis.size() == 0 ? "Fehler 1: Es wurden keine Medikamente in der Verordnung gefunden,\n die zum gescannten Medikament passen.\n" : "";
                    errorMessage += medis.size() > 1 ? "Fehler 2: Das gescannte Medikament konnte nicht eindeutig einer Verordnung zugewiesen werden." : "";
                } else {

                    PreparedMedication preparedMedication = medis.get(0);

                    if(preparedMedication.getState() == PreparedMedication.MedicationState.open) {

                        updatePreparedMedication(preparedMedication, info.getAI01_HANDELSEINHEIT(),
                                info.getAI17_VERFALLSDATUM(), info.getAI10_CHARGENNUMMER(), info.getAI21_SERIAL_NUMBER());

                        showSuccessfullScan(preparedMedication);

                        if (preparedMedication.getBasedOnPrescription().doAllMedicationsHave(PreparedMedication.MedicationState.controlled)) {
                            showSuccessfullPreparationAndPrintLabel(preparedMedication);
                        }
                    }

                }


            } else {
                //TODO: what to do if not every field captured
                errorMessage += "Es konnten nicht alle Informationen zum Medikament ausgelesen werden.";
            }

            if(!errorMessage.equals("")) {
                showError(errorMessage);
            }

        }
    }

    private void showError(String errorMessage) {
        Alert alertSuccessfulScan = new Alert(Alert.AlertType.ERROR);
        alertSuccessfulScan.setTitle("Information Dialog");
        alertSuccessfulScan.setHeaderText(null);
        alertSuccessfulScan.setContentText("Scan von nicht erfolgreich. Gefundene Fehler:\n" + errorMessage);

        alertSuccessfulScan.showAndWait();
    }

    private void showSuccessfullScan(PreparedMedication preparedMedication) {
        Alert alertSuccessfulScan = new Alert(Alert.AlertType.INFORMATION);
        alertSuccessfulScan.setTitle("Information Dialog");
        alertSuccessfulScan.setHeaderText(null);
        alertSuccessfulScan.setContentText("Scan von " + preparedMedication.getDescription() + "erfolgreich.");

        alertSuccessfulScan.showAndWait();
    }

    private void updatePreparedMedication(PreparedMedication preparedMedication, String gtin, String expDate, String lot, String serial) {
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
            System.out.println("Fehler: Produktinformationen konnten im ERP nicht gefunden werden.");
        } else {
            //TODO: get inserted data and set also state to controlled
        }
    }

    private void showSuccessfullPreparationAndPrintLabel(PreparedMedication preparedMedication) {
        //Print Barcode for product and make info .....
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("You now have successfully prepared all medications\n for the prescription" +
                        "congratulations!! :-p" +
                        "\nTake the printed barcode and put in on the item" +
                        "\nto enable bedside scanning." +
                        "\n<< Happy Scan >>"
        );

        alert.showAndWait();
    }
}
