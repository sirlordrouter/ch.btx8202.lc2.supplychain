package entities;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Describes a prepared medication from prescrription with a medication set (Batch, serial, Expiry) prepared.
 * TrspPatient, Presritpion and Preparation time used.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class TrspPreparedMedication extends TrspMedication {

    public static enum MedicationState {open, prepared, controlled, served}

    private int preparedMedicationId;
    private String gtinFromAssignedItem;
    private String batchLot;
    private String serial;
    private String expiryDate;
    private MedicationState state = MedicationState.open;
    private TrspPatient forPatient;
    private TrspPrescription basedOnPrescription;
    private LocalDateTime preparationTime;
    private String staffGln;
    private boolean isReserve;
    private String blabla;
    private String tuc;


    public TrspPreparedMedication() {}

    public TrspPreparedMedication(String gtinA, List<String> gtinBs, String name, String description, String dosage,
                                  String dosageUnit, String applicationScheme, String gtinFromAssignedItem, String batchLot,
                                  String serial, String expiryDate,
                                  MedicationState state, TrspPatient forPatient, TrspPrescription basedOnPrescription, LocalDateTime preparationTime, boolean isReserve) {
        super(gtinA,gtinBs, name, description, dosage, dosageUnit, applicationScheme);
        this.gtinFromAssignedItem = gtinFromAssignedItem;
        this.batchLot = batchLot;
        this.serial = serial;
        this.expiryDate = expiryDate;
        this.state = state;
        this.forPatient = forPatient;
        this.basedOnPrescription = basedOnPrescription;
        this.preparationTime = preparationTime;
        this.isReserve = isReserve;
    }

    public TrspPreparedMedication(String gtinA, List<String> gtinBs, String name, String description, String dosage, String dosageUnit, String applicationScheme, int preparedMedicationId, String gtinFromAssignedItem, String batchLot, String serial, String expiryDate, MedicationState state, TrspPatient forPatient, TrspPrescription basedOnPrescription, LocalDateTime preparationTime, String staffGln, boolean isReserve) {
        super(gtinA, gtinBs, name, description, dosage, dosageUnit, applicationScheme);
        this.preparedMedicationId = preparedMedicationId;
        this.gtinFromAssignedItem = gtinFromAssignedItem;
        this.batchLot = batchLot;
        this.serial = serial;
        this.expiryDate = expiryDate;
        this.state = state;
        this.forPatient = forPatient;
        this.basedOnPrescription = basedOnPrescription;
        this.preparationTime = preparationTime;
        this.staffGln = staffGln;
        this.isReserve = isReserve;
    }



    public int getPreparedMedicationId() {
        return preparedMedicationId;
    }

    public void setPreparedMedicationId(int preparedMedicationId) {
        this.preparedMedicationId = preparedMedicationId;
    }

    public String getGtinFromAssignedItem() {
        return gtinFromAssignedItem;
    }

    public void setGtinFromAssignedItem(String gtinFromAssignedItem) {
        this.gtinFromAssignedItem = gtinFromAssignedItem;
    }

    public String getBatchLot() {
        return batchLot;
    }

    public void setBatchLot(String batchLot) {
        this.batchLot = batchLot;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public MedicationState getState() {
        return state;
    }

    public void setState(MedicationState state) {
        this.state = state;
    }

    public TrspPatient getForPatient() {
        return forPatient;
    }

    public void setForPatient(TrspPatient forPatient) {
        this.forPatient = forPatient;
    }

    public TrspPrescription getBasedOnPrescription() {
        return basedOnPrescription;
    }

    public void setBasedOnPrescription(TrspPrescription basedOnPrescription) {
        this.basedOnPrescription = basedOnPrescription;
    }

    public LocalDateTime getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getStaffGln() {
        return staffGln;
    }

    public void setStaffGln(String staffGln) {
        this.staffGln = staffGln;
    }

    public boolean getIsReserve() {
        return isReserve;
    }

    public void setIsReserve(boolean isReserve) {
        this.isReserve = isReserve;
    }
}
