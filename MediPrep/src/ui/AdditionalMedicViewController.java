package ui;

import datalayer.FakeDataRepository;
import entities.Patient;
import entities.PreparedMedication;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import services.PropertiesReader;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 *  View for additional Medications in fluid application form.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class AdditionalMedicViewController extends VBox implements IPartialView {

    public Label lblNameGender;
    public Label lblBirthdate;
    public Label lblPatInfo;


    public TableView<PreparedMedication> medicationsList;
    public TableView<PreparedMedication> medicationsListReserve;

    private final ObservableList<PreparedMedication> medications =  FXCollections.observableArrayList();
    private final ObservableList<PreparedMedication> medicationReserve =  FXCollections.observableArrayList();

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

        /**
         * Main Columns
         */
        TableColumn<PreparedMedication, PreparedMedication.State> state = new TableColumn("State");
        state.setCellValueFactory(cellData -> cellData.getValue().getState());
        state.setCellFactory(cellData -> {
            return new TableCell<PreparedMedication, PreparedMedication.State>() {

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
                public void updateItem(PreparedMedication.State item, boolean empty) {
                    super.updateItem(item, empty);
                    if (item == null || empty) {
                        setText(null);
                    } else {
                        switch (item) {
                            case open:
                                view.setImage(pendingImage);
                                break;
                            case prepared:
                                view.setImage(readyImage);
                                break;
                            case controlled:
                                break;
                            case served:
                                break;
                        }
                    }
                }
            };
        });

        TableColumn<PreparedMedication, String> name = new TableColumn("Name");
        name.setCellValueFactory(cellData -> cellData.getValue().getName());

        TableColumn<PreparedMedication, String> description = new TableColumn("Beschreibung");
        description.setCellValueFactory(cellData -> cellData.getValue().getDescription());

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
        aTable.getColumns().addAll(state, name, description, dosage, dosageUnit, applicationScheme, preparationTime);

    }

    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {
        if (FakeDataRepository.getInstance().getCurrentPatient() != null) {
            setUpPatientInfo(FakeDataRepository.getInstance().getCurrentPatient());
        }
    }
}
