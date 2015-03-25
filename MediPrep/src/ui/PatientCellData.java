package ui;

import entities.Patient;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.IOException;

/**
 * Created by Johannes on 25.03.15.
 */
public class PatientCellData {

    public HBox patientCellBox;
    public ImageView genderView;
    public Label fidLabel;
    public Label pidLabel;
    public Label nameLabel;
    public Label firstnameLabel;
    public Label birthdayLabel;


    public PatientCellData() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PatientCell.fxml"));
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setContent(Patient patient) {
        genderView.setImage(patient.getGenderImage());
        fidLabel.setText(String.valueOf(patient.getFid()));
        pidLabel.setText(String.valueOf(patient.getPid()));
        nameLabel.setText(patient.getLastname());
        firstnameLabel.setText(patient.getLastname());
        birthdayLabel.setText(patient.getBirthDate().toString());
    }


    public HBox getPatientCellBox() {
        return patientCellBox;
    }
}
