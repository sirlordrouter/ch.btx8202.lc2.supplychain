package ui;

import entities.Patient;
import javafx.scene.control.ListCell;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Patient Cell for List view.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
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
