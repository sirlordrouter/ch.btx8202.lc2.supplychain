package ui;

import entities.Patient;
import javafx.scene.control.ListCell;

/**
 * Created by Johannes on 25.03.15.
 */
public class PatientCell extends ListCell<Patient> {

    @Override
    public void updateItem(Patient patient, boolean empty){
        super.updateItem(patient,empty);
        if(patient != null) {
            PatientCellData data = new PatientCellData();
            data.setContent(patient);
            setGraphic(data.getPatientCellBox());
        }
    }
}
