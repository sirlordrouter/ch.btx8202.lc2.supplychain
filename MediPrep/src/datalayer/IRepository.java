package datalayer;

import entities.Medication;
import entities.Patient;
import entities.PreparedMedication;
import entities.Prescription;

import java.util.List;

/**
 * Created by Johannes on 25.03.15.
 */
public interface IRepository {

    public List<Patient> getPatients();
    public List<String> getStations();
    public List<String> getStuff();
    public List<PreparedMedication> getMedications();
    public List<Prescription> getPrescriptions(Patient patient);
    public boolean UpdatePreperationState(Prescription prescription, Medication medication, Patient patient);

}
