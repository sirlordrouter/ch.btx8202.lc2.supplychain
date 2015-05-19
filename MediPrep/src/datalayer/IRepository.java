package datalayer;

import entities.Patient;
import entities.PreparedMedication;
import entities.Prescription;
import webservice.erp.MediPrepResult;

import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Bachelorthesis Durchgaengige Supply CHain<br>
 *
 *<p>
 *     Describes a Repository interface to query data from an update Preparation States of Medications.
 *     Decouples Data Source from Logic. http://de.wikipedia.org/wiki/Repository_%28Entwurfsmuster%29
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 11.05.2015
 */
public interface IRepository {

    public List<Patient> getPatients();
    public List<String> getStations();
    public List<String> getStaff();
    public List<PreparedMedication> getMedications();
    public List<Prescription> getPrescriptions(Patient patient);
    public MediPrepResult UpdatePreperationState(List<PreparedMedication> preparedMedications, PreparedMedication.MedicationState state);

}
