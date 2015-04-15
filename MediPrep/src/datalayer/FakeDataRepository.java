package datalayer;

import entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        patients.add(new Patient(1, "1", "First1", "Last1", LocalDate.of(1967, 4, 12), false, 11, "Station A", "A 100", Patient.Gender.male, Patient.BloodGroup.AB));
        patients.add(new Patient(2, "2", "First2", "Last2", LocalDate.of(1991, 6, 12), false, 12, "Station B", "B 200", Patient.Gender.female, Patient.BloodGroup.Apositive));
        patients.add(new Patient(3, "3", "First3", "Last3", LocalDate.of(2000, 12, 12), false, 13, "Station A", "A 101", Patient.Gender.male, Patient.BloodGroup.ZeroNegative));
        patients.add(new Patient(4, "4", "First4", "Last4", LocalDate.of(1989,3,28), false, 14, "Station A", "A 101", Patient.Gender.undefined, Patient.BloodGroup.ZeroPositive));
        return patients;
    }

    public List<String> getStations() {
        List<String> stations = new ArrayList<String>();

        stations.add("Station A");
        stations.add("Station B");

        return stations;
    }

    @Override
    public List<String> getStaff() {
        return null;
    }

    @Override
    public List<PreparedMedication> getMedications() {

        List<PreparedMedication> prepMedis = new ArrayList<>();
        //(String gtin, String name, String description, String dosage, String dosageUnit, String applicationScheme,
        // String batchLot, String serial, String expiryDate, ObjectProperty<MedicationState> state,
        // ObjectProperty<Patient> forPatient, ObjectProperty<Prescription> basedOnPrescription,
        // ObjectProperty<LocalDateTime> preparationTime, boolean isReserve)

        //prepMedis.add(new PreparedMedication("1", "Testmedi", "Analgetikum", "2", "ml", "1110", "batch", "String serial", "String expiryDate", PreparedMedication.MedicationState.prepared,  new Patient(), new Prescription(), LocalDateTime.now() ,false));
        //prepMedis.add(new PreparedMedication("2", "Testmedi", "Dormikum", "2", "ml", "1000", "batch", "String serial", "String expiryDate", PreparedMedication.MedicationState.open,  new Patient(), new Prescription(), LocalDateTime.now() ,false));
        //prepMedis.add(new PreparedMedication("3", "Testmedi", "Analgetikum", "100", "g", "1011", "batch", "String serial", "String expiryDate", PreparedMedication.MedicationState.open,  new Patient(), new Prescription(), LocalDateTime.now() ,true));
        //prepMedis.add(new PreparedMedication("4", "Testmedi", "Analgetikum", "2", "ml", "1010", "batch", "String serial", "String expiryDate", PreparedMedication.MedicationState.prepared,  new Patient(), new Prescription(), LocalDateTime.now() ,false));

        return prepMedis;
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
