package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import webservice.erp.Patient;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
 *
 *<p>
 * Model for a Patientcell in patient list view
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class PatientCellData {

    public HBox patientCellBox;
    public ImageView genderView;
    public Label fidLabel;
    public Label pidLabel;
    public Label nameLabel;
    public Label firstnameLabel;
    public Label birthdayLabel;
    private Patient patient;


    public PatientCellData() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientCell.fxml"));
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Patient getPatient() {
        return patient;
    }


    public void setContent(Patient patient) {
        this.patient = patient;
        genderView.setImage(patient.getGenderImage());
        fidLabel.setText("FID:" + String.valueOf(patient.getFid()));
        pidLabel.setText("PID: " + String.valueOf(patient.getPid()));
        nameLabel.setText(patient.getLastname());
        firstnameLabel.setText(patient.getLastname());
        birthdayLabel.setText(
                patient.getBirthDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                        + " " + "(" + patient.getAge()+ ")");
    }


    public HBox getPatientCellBox() {
        return patientCellBox;
    }

}
