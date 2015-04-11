package entities;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDateTime;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Describes a prepared medication from prescrription with a medication set (Batch, Serial, Expiry) prepared.
 * Patient, Presritpion and Preparation time used.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class PreparedMedication extends Medication {

    public static enum State {open, prepared, controlled, served}

    private StringProperty BatchLot;
    private StringProperty Serial;
    private StringProperty ExpiryDate;
    private ObjectProperty<State> state = new SimpleObjectProperty<>(State.open);
    private ObjectProperty<Patient> forPatient = new SimpleObjectProperty<>();
    private ObjectProperty<Prescription> basedOnPrescription = new SimpleObjectProperty<>();
    private ObjectProperty<LocalDateTime> preparationTime = new SimpleObjectProperty<LocalDateTime>();

    private boolean isReserve = false;

    public PreparedMedication() {}

    public PreparedMedication(String gtin, String name, String description, String dosage, String dosageUnit, String applicationScheme, LocalDateTime preparationTime) {
        super(gtin,name,description,dosage,dosageUnit,applicationScheme);
    }

    public PreparedMedication(String gtin, String name, String description, String dosage,
                              String dosageUnit, String applicationScheme, LocalDateTime preparationTime, String batchLot, String serial, String expiryDate, Patient patient, Prescription prescription, boolean isReserve, State state) {
        super(gtin,name,description,dosage,dosageUnit,applicationScheme);
        this.BatchLot = new SimpleStringProperty(batchLot);
        this.Serial = new SimpleStringProperty(serial);
        this.ExpiryDate = new SimpleStringProperty(expiryDate);
        this.forPatient.set(patient);
        this.basedOnPrescription.set(prescription);
        this.isReserve = isReserve;
        this.state.set(state);
        this.preparationTime.set(preparationTime);
    }

    public ObjectProperty<Patient> getForPatient() {
        return forPatient;
    }

    public void setForPatient(Patient forPatient) {
        this.forPatient.set(forPatient);
    }

    public ObjectProperty<Prescription> getBasedOnPrescription() {
        return basedOnPrescription;
    }

    public void setBasedOnPrescription(Prescription basedOnPrescription) {
        this.basedOnPrescription.set(basedOnPrescription);
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

    public ObjectProperty<State> getState() {
        return state;
    }

    public void setState(State state) {
        this.state.set(state);
    }

    public boolean isReserve() {
        return isReserve;
    }

    public void setReserve(boolean isReserve) {
        this.isReserve = isReserve;
    }

    public ObjectProperty<LocalDateTime> preparationTimeProperty() {
        return preparationTime;
    }

    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime.set(preparationTime);
    }
}
