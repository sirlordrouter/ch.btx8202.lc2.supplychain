package datalayer;

import entities.Medication;
import entities.Patient;
import entities.Prescription;
import entities.Staff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Johannes on 25.03.15.
 */
public class FakeDataRepository implements IRepository {

    private static FakeDataRepository instance;

    public static FakeDataRepository getInstance() {
        if (instance == null)
            instance = new FakeDataRepository();
        return instance;
    }


    private Patient currentPatient;
    private Staff currentStaff;

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    public Staff getCurrentStaff() {
        return currentStaff;
    }

    public void setCurrentStaff(Staff currentStaff) {
        this.currentStaff = currentStaff;
    }

    public Patient getPatientById(String pid) {
        return null;
    }

    public Patient getPatient(Patient patient) {
        return null;
    }

    public List<Patient> getPatients() {
        List<Patient> patients = new ArrayList<Patient>();

        patients.add(new Patient(1, UUID.randomUUID(), "First1", "Last1", new Date(12345l), false, 11, "Station A", "A 100", Patient.Gender.male, Patient.BloodGroup.AB));
        patients.add(new Patient(2, UUID.randomUUID(), "First2", "Last2", new Date(12345l), false, 12, "Station B", "B 200", Patient.Gender.female, Patient.BloodGroup.Apositive));
        patients.add(new Patient(3, UUID.randomUUID(), "First3", "Last3", new Date(12345l), false, 13, "Station A", "A 101", Patient.Gender.male, Patient.BloodGroup.ZeroNegative));
        patients.add(new Patient(4, UUID.randomUUID(), "First4", "Last4", new Date(12345l), false, 14, "Station A", "A 101", Patient.Gender.undefined, Patient.BloodGroup.ZeroPositive));
        return patients;
    }

    public List<String> getStations() {
        List<String> stations = new ArrayList<String>();

        stations.add("Station A");
        stations.add("Station B");

        return stations;
    }

    @Override
    public List<String> getStuff() {
        return null;
    }

    @Override
    public List<Medication> getMedications() {
        return null;
    }

    @Override
    public List<Prescription> getPrescriptions(Patient patient) {
        return null;
    }

    @Override
    public boolean UpdatePreperationState(Prescription prescription, Medication medication, Patient patient) {
        return false;
    }
}
