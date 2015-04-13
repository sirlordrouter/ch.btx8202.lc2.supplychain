package entities;

import service.LocalDateTimeAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Describes a prepared medication from prescrription with a medication set (Batch, Serial, Expiry) prepared.
 * TrspPatient, Presritpion and Preparation time used.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class TrspPreparedMedication extends TrspMedication {

    public static enum MedicationState {open, prepared, controlled, served}

    private String BatchLot;
    private String Serial;
    private String ExpiryDate;
    private MedicationState state = MedicationState.open;
    private TrspPatient forPatient;
    private TrspPrescription basedOnPrescription;
    private LocalDateTime preparationTime;
    private String StaffGln;

    private boolean isReserve = false;

    public TrspPreparedMedication() {}

    public TrspPreparedMedication(String gtin, String name, String description, String dosage,
                                  String dosageUnit, String applicationScheme, String batchLot,
                                  String serial, String expiryDate,
                                  MedicationState state, TrspPatient forPatient, TrspPrescription basedOnPrescription, LocalDateTime preparationTime, boolean isReserve) {
        super(gtin, name, description, dosage, dosageUnit, applicationScheme);
        BatchLot = batchLot;
        Serial = serial;
        ExpiryDate = expiryDate;
        this.state = state;
        this.forPatient = forPatient;
        this.basedOnPrescription = basedOnPrescription;
        this.preparationTime = preparationTime;
        this.isReserve = isReserve;
    }

    public String getBatchLot() {
        return BatchLot;
    }

    public void setBatchLot(String batchLot) {
        BatchLot = batchLot;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
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

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    public LocalDateTime getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(LocalDateTime preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getStaffGln() {
        return StaffGln;
    }

    public void setStaffGln(String staffGln) {
        StaffGln = staffGln;
    }

    public boolean isReserve() {
        return isReserve;
    }

    public void setIsReserve(boolean isReserve) {
        this.isReserve = isReserve;
    }
}
