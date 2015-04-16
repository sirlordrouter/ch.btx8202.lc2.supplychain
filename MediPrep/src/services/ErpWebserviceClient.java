package services;

import datalayer.IRepository;
import entities.*;
import webservice.erp.*;

import javax.xml.ws.soap.SOAPFaultException;
import java.util.ArrayList;
import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: services
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 13.04.15
 */
public class ErpWebserviceClient implements IRepository {

    private String stationGLN;
    private SupplyChainServiceService supplyChainService;
    private SupplyChainService supplyChainServicePort;

    public ErpWebserviceClient(String gln) {
        this.stationGLN = gln;

        supplyChainService = new SupplyChainServiceService();
        supplyChainServicePort = supplyChainService.getSupplyChainServicePort();

    }

    @Override
    public List<Patient> getPatients() {
        try{

            List<Patient> patientList= new ArrayList<>();
            List<TrspPatient> trspPatientList = supplyChainServicePort.getPatients();
            for (TrspPatient trspPatient : trspPatientList) {
                patientList.add(WebServiceObjectFactory.convertFromWebserviceObject(trspPatient));
            }

            return patientList;


        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<String> getStations() {
        try{
            List<String> stations = new ArrayList<String>();

            stations.add("Station A");
            stations.add("Station B");

            return stations;


        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<String> getStaff() {
        try{
            List<String> staffList = new ArrayList<>();

            return staffList;

        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PreparedMedication> getMedications() {
        try{

            return null;

        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prescription> getPrescriptions(Patient patient) {
        try{
           List<TrspPrescription> trspPrescriptions = supplyChainServicePort.getPrescriptionsForPatient(Integer.toString(patient.getPid()));
            List<Prescription> prescriptions = new ArrayList<>();

            for (TrspPrescription trspPrescription : trspPrescriptions) {
                prescriptions.add(WebServiceObjectFactory.convertFromWebserviceObject(trspPrescription));
            }

            return prescriptions;
        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean UpdatePreperationState(List<PreparedMedication> preparedMedications, PreparedMedication.MedicationState state) {
        try{
           MedicationState medicationState = WebServiceObjectFactory.convertToWebServiceObject(state);
           assert !medicationState.value().equals("");
           List<TrspPreparedMedication> trspPreparedMedicationList = new ArrayList<>();

            for (PreparedMedication preparedMedication : preparedMedications) {
                trspPreparedMedicationList.add(WebServiceObjectFactory.convertToWebServiceObject(preparedMedication));
            }

            return supplyChainServicePort.updatePreparedMedications(trspPreparedMedicationList, medicationState, this.stationGLN);

        } catch (SOAPFaultException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
