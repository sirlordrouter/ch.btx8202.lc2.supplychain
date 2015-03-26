package ui;

import entities.PreparedMedication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import services.PropertiesReader;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Johannes on 25.03.15.
 */
public class AdditionalMedicViewController extends VBox implements IPartialView {

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
            //TODO SHow Message
        }

        setUpTables();

    }

    private void setUpTables() {

        /**
         * Main Columns
         */
        TableColumn<PreparedMedication, String> state = new TableColumn("State");
        state.setCellValueFactory(cellData -> cellData.getValue().getState().toString());

        TableColumn<PreparedMedication, String> name = new TableColumn("Name");
        name.setCellValueFactory(cellData -> cellData.getValue().getName());

        TableColumn<PreparedMedication, String> description = new TableColumn("Description");


        TableColumn<PreparedMedication, String> dosage = new TableColumn("Dosage");


        TableColumn<PreparedMedication, String> dosageUnit = new TableColumn("Dosage Unit");


        TableColumn<PreparedMedication, String> applicationScheme = new TableColumn("Schema");


        TableColumn<PreparedMedication, String> preparationTime = new TableColumn("Preparation Time");


        //TODO: not working yet
        /**
         *  Nested Columns ApplicationSchme
         */
        TableColumn<PreparedMedication, String> morning = new TableColumn("M");
        TableColumn<PreparedMedication, String> noon = new TableColumn("N");
        TableColumn<PreparedMedication, String> evening = new TableColumn("E");
        TableColumn<PreparedMedication, String> night = new TableColumn("N");

        applicationScheme.getColumns().addAll(morning, noon, evening, night);
        medicationsList.getColumns().addAll(state, name, description, dosage, dosageUnit, applicationScheme, preparationTime);
        medicationsListReserve.getColumns().addAll(state,name,description,dosage, dosageUnit, applicationScheme,preparationTime);


    }

    @Override
    public void beforeLeaving() {

    }

    @Override
    public void beforeOpen() {

    }
}
