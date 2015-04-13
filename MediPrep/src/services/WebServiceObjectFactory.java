package services;

import entities.Patient;
import entities.PreparedMedication;
import entities.Prescription;
import webservice.erp.TrspPatient;
import webservice.erp.TrspPreparedMedication;
import webservice.erp.TrspPrescription;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

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
public class WebServiceObjectFactory {
    public static Prescription convertFromWebserviceObject(TrspPrescription trspPrescription) {

        if (trspPrescription == null) {
            return null;
        }

        List<PreparedMedication> preparedMedicationList =
                trspPrescription.getMedications().stream().map(WebServiceObjectFactory::convertFromWebserviceObject).collect(Collectors.toList());


        Prescription prescription =
                new Prescription(true, preparedMedicationList,
                        trspPrescription.getPolypointID(),
                        trspPrescription.getPatientPolypointID(),
                        LocalDate.parse(trspPrescription.getDateCreated(), DateTimeFormatter.ISO_LOCAL_DATE),
                        trspPrescription.getCreatedByStaffGLN(),
                        trspPrescription.getName(),
                        trspPrescription.getFirstName(),
                        trspPrescription.getPosition(),
                        trspPrescription.getDescription(),
                        trspPrescription.getSchedule(),
                        trspPrescription.getRouteOfAdministration());

        //TODO: solve better (webservice)
        for (PreparedMedication preparedMedication : preparedMedicationList) {
            preparedMedication.setApplicationScheme(trspPrescription.getRouteOfAdministration());
            preparedMedication.setBasedOnPrescription(prescription);
        }

        return prescription;

    }

    public static PreparedMedication convertFromWebserviceObject(TrspPreparedMedication trspPreparedMedication) {

        if (trspPreparedMedication == null) {
            return null;
        }

        PreparedMedication preparedMedication = new PreparedMedication(
                trspPreparedMedication.getGtin(),
                trspPreparedMedication.getName(),
                trspPreparedMedication.getDescription(),
                trspPreparedMedication.getDosage(),
                trspPreparedMedication.getDosageUnit(),
                trspPreparedMedication.getApplicationScheme(),
                trspPreparedMedication.getBatchLot(),
                trspPreparedMedication.getSerial(),
                trspPreparedMedication.getExpiryDate(),
                PreparedMedication.MedicationState.valueOf(trspPreparedMedication.getState().value()),
                trspPreparedMedication.getForPatient() != null ? convertFromWebserviceObject(trspPreparedMedication.getForPatient()) : null,
                null,
                trspPreparedMedication.getPreparationTime() != null ? LocalDateTime.parse(trspPreparedMedication.getPreparationTime(),DateTimeFormatter.ISO_LOCAL_DATE_TIME) : null,
                false
        );
        return preparedMedication;
    }

    public static Patient convertFromWebserviceObject(TrspPatient trspPatient) {

        if (trspPatient == null) {
            return null;
        }

        Patient patient = new Patient(
                trspPatient.getPid(),
                trspPatient.getBeaconID(),
                trspPatient.getFirstname(),
                trspPatient.getLastname(),
                LocalDate.parse(trspPatient.getBirthDate(), DateTimeFormatter.ISO_LOCAL_DATE),
                trspPatient.isReaState(),
                trspPatient.getFid(),
                trspPatient.getStationName(),
                trspPatient.getRoom(),
                Patient.Gender.valueOf(trspPatient.getGender().value()),
                Patient.BloodGroup.valueOf(trspPatient.getBloodGroup().value())
        );

        return patient;
    }

    public static TrspPrescription convertToWebServiceObject(Prescription p) {
        return null;
    }

    public static TrspPreparedMedication convertToWebServiceObject(PreparedMedication preparedMedication) {
        return null;
    }

    public static TrspPatient convertToWebServiceObject(Patient patient) {
        return null;
    }
}
