package entities;

import java.time.LocalDate;
import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
 *
 *<p>
 * Describes a Prescription with 1 or more medications defined.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class Prescription {

    public static enum PrescriptionState {open, paused, stopped, doseChanged}

    private boolean isStandardMedic = true;
    private String polypointID; //TODO: Replace Polypint in name with InformationSystem
    private String patientPolypointID;//TODO: Replace Polypint in name with InformationSystem
    private LocalDate dateCreated;
    private LocalDate validUntil;
    private String createdByStaffGLN;
    private String name;
    private String firstName;
    private String position;
    private String description;
    private String schedule;
    private String routeOfAdministration;
    private PrescriptionState prescriptionState;
    private String notes;
    private List<PreparedMedication> medications;
    private List<PreparedMedication> medicationsMorning;
    private List<PreparedMedication> medicationsNoon;
    private List<PreparedMedication> medicationsEvening;
    private List<PreparedMedication> medicationsNight;

    public Prescription() {}

    public Prescription(boolean isStandardMedic, List<PreparedMedication> medications, String polypointID, String patientPolypointID, LocalDate dateCreated, String createdByStaffGLN, String name, String firstName, String position, String description, String schedule, String routeOfAdministration) {
        this.isStandardMedic = isStandardMedic;
        this.medications = medications;
        this.polypointID = polypointID;
        this.patientPolypointID = patientPolypointID;
        this.dateCreated = dateCreated;
        this.createdByStaffGLN = createdByStaffGLN;
        this.name = name;
        this.firstName = firstName;
        this.position = position;
        this.description = description;
        this.schedule = schedule;
        this.routeOfAdministration = routeOfAdministration;
    }

    public Prescription(boolean isStandardMedic,List<PreparedMedication> medications, String polypointID, String patientPolypointID, LocalDate dateCreated, LocalDate vaildUntil, String createdByStaffGLN, String name, String firstName, String position, String description, String schedule, String routeOfAdministration, PrescriptionState prescriptionState, String notes,  List<PreparedMedication> medicationsMorning, List<PreparedMedication> medicationsNoon, List<PreparedMedication> medicationsEvening, List<PreparedMedication> medicationsNight) {
        this.isStandardMedic = isStandardMedic;
        this.polypointID = polypointID;
        this.patientPolypointID = patientPolypointID;
        this.dateCreated = dateCreated;
        this.createdByStaffGLN = createdByStaffGLN;
        this.name = name;
        this.firstName = firstName;
        this.position = position;
        this.description = description;
        this.schedule = schedule;
        this.routeOfAdministration = routeOfAdministration;
        this.prescriptionState = prescriptionState;
        this.notes = notes;
        this.medications = medications;
        this.medicationsMorning = medicationsMorning;
        this.medicationsNoon = medicationsNoon;
        this.medicationsEvening = medicationsEvening;
        this.medicationsNight = medicationsNight;
    }

    public boolean isStandardMedic() {
        return isStandardMedic;
    }

    public void setIsStandardMedic(boolean isStandardMedic) {
        this.isStandardMedic = isStandardMedic;
    }

    public List<PreparedMedication> getMedications() {
        return medications;
    }

    public void setMedications(List<PreparedMedication> medications) {
        this.medications = medications;
    }

    public String getPolypointID() {
        return polypointID;
    }

    public void setPolypointID(String polypointID) {
        this.polypointID = polypointID;
    }

    public String getPatientPolypointID() {
        return patientPolypointID;
    }

    public void setPatientPolypointID(String patientPolypointID) {
        this.patientPolypointID = patientPolypointID;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public String getCreatedByStaffGLN() {
        return createdByStaffGLN;
    }

    public void setCreatedByStaffGLN(String createdByStaffGLN) {
        this.createdByStaffGLN = createdByStaffGLN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }

    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration = routeOfAdministration;
    }

    public PrescriptionState getPrescriptionState() {
        return prescriptionState;
    }

    public void setPrescriptionState(PrescriptionState prescriptionState) {
        this.prescriptionState = prescriptionState;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<PreparedMedication> getMedicationsMorning() {
        return medicationsMorning;
    }

    public void setMedicationsMorning(List<PreparedMedication> medicationsMorning) {
        this.medicationsMorning = medicationsMorning;
    }

    public List<PreparedMedication> getMedicationsNoon() {
        return medicationsNoon;
    }

    public void setMedicationsNoon(List<PreparedMedication> medicationsNoon) {
        this.medicationsNoon = medicationsNoon;
    }

    public List<PreparedMedication> getMedicationsEvening() {
        return medicationsEvening;
    }

    public void setMedicationsEvening(List<PreparedMedication> medicationsEvening) {
        this.medicationsEvening = medicationsEvening;
    }

    public List<PreparedMedication> getMedicationsNight() {
        return medicationsNight;
    }

    public void setMedicationsNight(List<PreparedMedication> medicationsNight) {
        this.medicationsNight = medicationsNight;
    }

    public boolean doAllMedicationsHave(PreparedMedication.MedicationState state) {
        for (PreparedMedication medication : medications) {
            if (medication.getState() != state ) {
                return false;
            }
        }
        return true;
    }
}
