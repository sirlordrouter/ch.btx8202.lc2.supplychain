package datalayer;

import entities.Patient;
import entities.PreparedMedication;
import entities.Prescription;
import webservice.erp.MediPrepResult;

import java.util.List;

/**
 * Created by Johannes on 25.03.15.
 */
public interface IRepository {

    public List<Patient> getPatients();
    public List<String> getStations();
    public List<String> getStaff();
    public List<PreparedMedication> getMedications();
    public List<Prescription> getPrescriptions(Patient patient);
    public MediPrepResult UpdatePreperationState(List<PreparedMedication> preparedMedications, PreparedMedication.MedicationState state);

}
