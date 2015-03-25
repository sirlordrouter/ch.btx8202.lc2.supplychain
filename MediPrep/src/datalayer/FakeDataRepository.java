package datalayer;

import entities.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by Johannes on 25.03.15.
 */
public class FakeDataRepository {
    public static Patient getPatientById(String pid) {
        return null;
    }

    public static Patient getPatient(Patient patient) {
        return null;
    }

    public static List<Patient> getPatients() {
        List<Patient> patients = new ArrayList<Patient>();

        patients.add(new Patient(1, UUID.randomUUID(), "First1", "Last1", new Date(12345l), false, 11, "Station A", Patient.Gender.male, Patient.BloodGroup.AB));
        patients.add(new Patient(2, UUID.randomUUID(), "First2", "Last2", new Date(12345l), false, 12, "Station B", Patient.Gender.female, Patient.BloodGroup.Apositive));
        patients.add(new Patient(3, UUID.randomUUID(), "First3", "Last3", new Date(12345l), false, 13, "Station A", Patient.Gender.male, Patient.BloodGroup.ZeroNegative));
        patients.add(new Patient(4, UUID.randomUUID(), "First4", "Last4", new Date(12345l), false, 14, "Station A", Patient.Gender.undefined, Patient.BloodGroup.ZeroPositive));
        return patients;
    }

    public static List<String> getStations() {
        List<String> stations = new ArrayList<String>();

        stations.add("Station A");
        stations.add("Station B");

        return stations;
    }
}
