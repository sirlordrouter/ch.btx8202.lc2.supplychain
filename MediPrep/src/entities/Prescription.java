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
    private List<PreparedMedication> medications;
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
}
