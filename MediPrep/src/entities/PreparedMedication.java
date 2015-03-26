package entities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Created by Johannes on 25.03.15.
 */
public class PreparedMedication extends Medication {

    public static enum State {open, prepared, controlled, served}

    private StringProperty BatchLot;
    private StringProperty Serial;
    private StringProperty ExpiryDate;
    private State state;
    private Patient forPatient;
    private Prescription basedOnPrescription;

    public PreparedMedication(String gtin, String name, String description, String dosage, String dosageUnit, String applicationScheme, LocalDate preparationTime) {
        super(gtin,name,description,dosage,dosageUnit,applicationScheme,preparationTime);

    }

    public PreparedMedication(String gtin, String name, String description, String dosage,
                              String dosageUnit, String applicationScheme, LocalDate preparationTime, String batchLot, String serial, String expiryDate, Patient patient, Prescription prescription) {
        super(gtin,name,description,dosage,dosageUnit,applicationScheme,preparationTime);
        this.BatchLot = new SimpleStringProperty(batchLot);
        this.Serial = new SimpleStringProperty(serial);
        this.ExpiryDate = new SimpleStringProperty(expiryDate);
        this.forPatient = patient;
        this.basedOnPrescription = prescription;

    }

    public Patient getForPatient() {
        return forPatient;
    }

    public void setForPatient(Patient forPatient) {
        this.forPatient = forPatient;
    }

    public Prescription getBasedOnPrescription() {
        return basedOnPrescription;
    }

    public void setBasedOnPrescription(Prescription basedOnPrescription) {
        this.basedOnPrescription = basedOnPrescription;
    }

    public StringProperty getBatchLot() {
        return BatchLot;
    }

    public void setBatchLot(String batchLot) {
        BatchLot.set(batchLot);
    }

    public StringProperty getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial.set(serial);
    }

    public StringProperty getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate.set(expiryDate);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
