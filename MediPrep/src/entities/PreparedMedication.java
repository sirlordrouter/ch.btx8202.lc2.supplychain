package entities;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

import java.time.LocalDateTime;
import java.util.List;

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

    public static enum MedicationState {open, prepared, controlled, served}

    private StringProperty assignedProductGTIN = new SimpleStringProperty();
    private StringProperty BatchLot = new SimpleStringProperty();
    private StringProperty Serial = new SimpleStringProperty();
    private StringProperty ExpiryDate = new SimpleStringProperty();
    private ObjectProperty<MedicationState> state = new SimpleObjectProperty<>(MedicationState.open);
    private ObjectProperty<Patient> forPatient = new SimpleObjectProperty<>();
    private ObjectProperty<Prescription> basedOnPrescription = new SimpleObjectProperty<>();
    private ObjectProperty<LocalDateTime> preparationTime = new SimpleObjectProperty<LocalDateTime>();
    private StringProperty StaffGln = new SimpleStringProperty();
    private IntegerProperty preparedMedicationId = new SimpleIntegerProperty();

    private boolean isReserve = false;

    public PreparedMedication() {}

    public PreparedMedication(String gtin,List<String> gtinBs, String name, String description, String dosage, String dosageUnit,Integer preparedMedicationId, String applicationScheme, String assignedProductGTIN, String batchLot, String serial, String expiryDate, MedicationState state, Patient forPatient, Prescription basedOnPrescription, LocalDateTime preparationTime, boolean isReserve) {
        super(gtin, gtinBs, name, description, dosage, dosageUnit, applicationScheme);
        this.preparedMedicationId.setValue(preparedMedicationId);
        this.assignedProductGTIN.setValue(assignedProductGTIN);
        BatchLot.setValue(batchLot);
        Serial.setValue(serial);
        ExpiryDate.setValue(expiryDate);
        this.state.setValue(state);
        this.forPatient.setValue(forPatient);
        this.basedOnPrescription.setValue(basedOnPrescription);
        this.preparationTime.setValue(preparationTime);
        this.isReserve = isReserve;
    }

    public int getPreparedMedicationId() {
        return preparedMedicationId.get();
    }

    public IntegerProperty preparedMedicationIdProperty() {
        return preparedMedicationId;
    }

    public void setPreparedMedicationId(int preparedMedicationId) {
        this.preparedMedicationId.set(preparedMedicationId);
    }

    public String getAssignedProductGTIN() {
        return assignedProductGTIN.get();
    }

    public StringProperty assignedProductGTINProperty() {
        return assignedProductGTIN;
    }

    public void setAssignedProductGTIN(String assignedProductGTIN) {
        this.assignedProductGTIN.set(assignedProductGTIN);
    }

    public String getBatchLot() {
        return BatchLot.get();
    }

    public StringProperty batchLotProperty() {
        return BatchLot;
    }

    public void setBatchLot(String batchLot) {
        this.BatchLot.set(batchLot);
    }

    public String getSerial() {
        return Serial.get();
    }

    public StringProperty serialProperty() {
        return Serial;
    }

    public void setSerial(String serial) {
        this.Serial.set(serial);
    }

    public String getExpiryDate() {
        return ExpiryDate.get();
    }

    public StringProperty expiryDateProperty() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.ExpiryDate.set(expiryDate);
    }

    public MedicationState getState() {
        return state.get();
    }

    public ObservableValue<MedicationState> stateProperty() {
        return state;
    }

    public void setState(MedicationState medicationState) {
        this.state.set(medicationState);
    }

    public Patient getForPatient() {
        return forPatient.get();
    }

    public Patient forPatientProperty() {
        return forPatient.get();
    }

    public void setForPatient(Patient forPatient) {
        this.forPatient.set(forPatient);
    }

    public Prescription getBasedOnPrescription() {
        return basedOnPrescription.get();
    }

    public Prescription basedOnPrescriptionProperty() {
        return basedOnPrescription.getValue();
    }

    public void setBasedOnPrescription(Prescription basedOnPrescription) {
        this.basedOnPrescription.set(basedOnPrescription);
    }

    public LocalDateTime getPreparationTime() {
        return preparationTime.get();
    }

    public ObservableValue<LocalDateTime> preparationTimeProperty() {
        return preparationTime;
    }

    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime.set(preparationTime);
    }

    public boolean isReserve() {
        return isReserve;
    }

    public void setIsReserve(boolean isReserve) {
        this.isReserve = isReserve;
    }

    public String getStaffGln() {
        return StaffGln.get();
    }

    public StringProperty staffGlnProperty() {
        return StaffGln;
    }

    public void setStaffGln(String staffGln) {
        this.StaffGln.set(staffGln);
    }
}
