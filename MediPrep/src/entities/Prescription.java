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
    private String PolypointID; //TODO: Replace Polypint in Name with InformationSystem
    private String PatientPolypointID;//TODO: Replace Polypint in Name with InformationSystem
    private LocalDate DateCreated;
    private String CreatedByStaffGLN;
    private String Name;
    private String FirstName;
    private String Position;
    private String Description;
    private String Schedule;
    private String RouteOfAdministration;
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
        PolypointID = polypointID;
        PatientPolypointID = patientPolypointID;
        DateCreated = dateCreated;
        CreatedByStaffGLN = createdByStaffGLN;
        Name = name;
        FirstName = firstName;
        Position = position;
        Description = description;
        Schedule = schedule;
        RouteOfAdministration = routeOfAdministration;
    }

    public Prescription(boolean isStandardMedic,List<PreparedMedication> medications, String polypointID, String patientPolypointID, LocalDate dateCreated, String createdByStaffGLN, String name, String firstName, String position, String description, String schedule, String routeOfAdministration, PrescriptionState prescriptionState, String notes,  List<PreparedMedication> medicationsMorning, List<PreparedMedication> medicationsNoon, List<PreparedMedication> medicationsEvening, List<PreparedMedication> medicationsNight) {
        this.isStandardMedic = isStandardMedic;
        PolypointID = polypointID;
        PatientPolypointID = patientPolypointID;
        DateCreated = dateCreated;
        CreatedByStaffGLN = createdByStaffGLN;
        Name = name;
        FirstName = firstName;
        Position = position;
        Description = description;
        Schedule = schedule;
        RouteOfAdministration = routeOfAdministration;
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
        return PolypointID;
    }

    public void setPolypointID(String polypointID) {
        PolypointID = polypointID;
    }

    public String getPatientPolypointID() {
        return PatientPolypointID;
    }

    public void setPatientPolypointID(String patientPolypointID) {
        PatientPolypointID = patientPolypointID;
    }

    public LocalDate getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        DateCreated = dateCreated;
    }

    public String getCreatedByStaffGLN() {
        return CreatedByStaffGLN;
    }

    public void setCreatedByStaffGLN(String createdByStaffGLN) {
        CreatedByStaffGLN = createdByStaffGLN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public String getRouteOfAdministration() {
        return RouteOfAdministration;
    }

    public void setRouteOfAdministration(String routeOfAdministration) {
        RouteOfAdministration = routeOfAdministration;
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
