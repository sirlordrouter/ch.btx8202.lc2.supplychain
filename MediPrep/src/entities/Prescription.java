package entities;

import javafx.beans.property.*;

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
    private StringProperty polypointID = new SimpleStringProperty(); //TODO: Replace Polypoint in name with InformationSystem
    private StringProperty patientPolypointID  = new SimpleStringProperty();//TODO: Replace Polypint in name with InformationSystem
    private ObjectProperty<LocalDate> dateCreated   = new SimpleObjectProperty<>();
    private ObjectProperty<LocalDate> validUntil   = new SimpleObjectProperty<>();
    private StringProperty createdByStaffGLN  = new SimpleStringProperty();
    private StringProperty name  = new SimpleStringProperty();
    private StringProperty firstName  = new SimpleStringProperty();
    private StringProperty position  = new SimpleStringProperty();
    private StringProperty description  = new SimpleStringProperty();
    private StringProperty schedule  = new SimpleStringProperty("0000");
    private StringProperty routeOfAdministration  = new SimpleStringProperty();
    private ObjectProperty<PrescriptionState> prescriptionState  = new SimpleObjectProperty<>();
    private StringProperty notes  = new SimpleStringProperty();
    private List<PreparedMedication> medications;
    private List<PreparedMedication> medicationsMorning;
    private List<PreparedMedication> medicationsNoon;
    private List<PreparedMedication> medicationsEvening;
    private List<PreparedMedication> medicationsNight;
    private BooleanProperty isPrepared = new SimpleBooleanProperty(false);

    public Prescription() {}

    public Prescription(boolean isStandardMedic, List<PreparedMedication> medications, String polypointID, String patientPolypointID, LocalDate dateCreated, String createdByStaffGLN, String name, String firstName, String position, String description, String schedule, String routeOfAdministration) {
        this.isStandardMedic = isStandardMedic;
        this.medications = medications;
        this.polypointID.set(polypointID);
        this.patientPolypointID.set(patientPolypointID);
        this.dateCreated.set(dateCreated);
        this.createdByStaffGLN.set(createdByStaffGLN);
        this.name.set(name);
        this.firstName.set(firstName);
        this.position.set(position);
        this.description.set(description);
        this.schedule.set(schedule);
        this.routeOfAdministration.set(routeOfAdministration);

        if(doAllMedicationsHave(PreparedMedication.MedicationState.prepared) ||
                doAllMedicationsHave(PreparedMedication.MedicationState.controlled)) {
            setIsPrepared(true);
        }
    }

    public Prescription(boolean isStandardMedic,List<PreparedMedication> medications, String polypointID, String patientPolypointID, LocalDate dateCreated, LocalDate vaildUntil, String createdByStaffGLN, String name, String firstName, String position, String description, String schedule, String routeOfAdministration, PrescriptionState prescriptionState, String notes,  List<PreparedMedication> medicationsMorning, List<PreparedMedication> medicationsNoon, List<PreparedMedication> medicationsEvening, List<PreparedMedication> medicationsNight) {
        this.isStandardMedic = isStandardMedic;
        this.polypointID.set(polypointID);
        this.patientPolypointID.set(patientPolypointID);
        this.dateCreated.set(dateCreated);
        this.createdByStaffGLN.set(createdByStaffGLN);
        this.name.set(name);
        this.firstName.set(firstName);
        this.position.set(position);
        this.description.set(description);
        this.schedule.set(schedule);
        this.routeOfAdministration.set(routeOfAdministration);
        this.prescriptionState.set(prescriptionState);
        this.notes.set(notes);
        this.medications = medications;
        this.medicationsMorning = medicationsMorning;
        this.medicationsNoon = medicationsNoon;
        this.medicationsEvening = medicationsEvening;
        this.medicationsNight = medicationsNight;

        if(doAllMedicationsHave(PreparedMedication.MedicationState.prepared) ||
                doAllMedicationsHave(PreparedMedication.MedicationState.controlled)) {
            setIsPrepared(true);
        }
    }

    public boolean isStandardMedic() {
        return isStandardMedic;
    }

    public void setIsStandardMedic(boolean isStandardMedic) {
        this.isStandardMedic = isStandardMedic;
    }

    public String getPolypointID() {
        return polypointID.get();
    }

    public StringProperty polypointIDProperty() {
        return polypointID;
    }

    public void setPolypointID(String polypointID) {
        this.polypointID.set(polypointID);
    }

    public String getPatientPolypointID() {
        return patientPolypointID.get();
    }

    public StringProperty patientPolypointIDProperty() {
        return patientPolypointID;
    }

    public void setPatientPolypointID(String patientPolypointID) {
        this.patientPolypointID.set(patientPolypointID);
    }

    public LocalDate getDateCreated() {
        return dateCreated.get();
    }

    public ObjectProperty<LocalDate> dateCreatedProperty() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated.set(dateCreated);
    }

    public LocalDate getValidUntil() {
        return validUntil.get();
    }

    public ObjectProperty<LocalDate> validUntilProperty() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil.set(validUntil);
    }

    public String getCreatedByStaffGLN() {
        return createdByStaffGLN.get();
    }

    public StringProperty createdByStaffGLNProperty() {
        return createdByStaffGLN;
    }

    public void setCreatedByStaffGLN(String createdByStaffGLN) {
        this.createdByStaffGLN.set(createdByStaffGLN);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getPosition() {
        return position.get();
    }

    public StringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getSchedule() {
        return schedule.get();
    }

    public StringProperty scheduleProperty() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule.set(schedule);
    }

    public String getRouteOfAdministration() {
        return routeOfAdministration.get();
    }

    public StringProperty routeOfAdministrationProperty() {
        return routeOfAdministration;
    }

    public void setRouteOfAdministration(String routeOfAdministration) {
        this.routeOfAdministration.set(routeOfAdministration);
    }

    public PrescriptionState getPrescriptionState() {
        return prescriptionState.get();
    }

    public ObjectProperty<PrescriptionState> prescriptionStateProperty() {
        return prescriptionState;
    }

    public void setPrescriptionState(PrescriptionState prescriptionState) {
        this.prescriptionState.set(prescriptionState);
    }

    public String getNotes() {
        return notes.get();
    }

    public StringProperty notesProperty() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes.set(notes);
    }

    public List<PreparedMedication> getMedications() {
        return medications;
    }

    public void setMedications(List<PreparedMedication> medications) {
        this.medications = medications;
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

    public StringProperty getStaffName() {
        return new SimpleStringProperty(this.getName() + ", " + this.getFirstName());
    }

    public boolean doAllMedicationsHave(PreparedMedication.MedicationState state) {
        for (PreparedMedication medication : medications) {
            if (medication.getState() != state ) {
                return false;
            }
        }
        return true;
    }

    public boolean getIsPrepared() {
        return isPrepared.get();
    }

    public BooleanProperty isPreparedProperty() {
        return isPrepared;
    }

    public void setIsPrepared(boolean isPrepared) {
        this.isPrepared.set(isPrepared);
    }
}
