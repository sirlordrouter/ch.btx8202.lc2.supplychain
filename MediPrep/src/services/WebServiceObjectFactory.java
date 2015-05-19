package services;

import entities.Patient;
import entities.PreparedMedication;
import entities.Prescription;
import webservice.erp.*;

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
 *  Converter class to chnage objects from Webservice to local client specific objects with javafx properties and back.
 *  No validation of Input is performed.
 *  (Problem with data types)
 * </p>
 * Project: MediPrep
 * Package: services
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 13.04.15
 */
public class WebServiceObjectFactory {

    /**
     * Prescription conversion from webservice to local prescription object
     * @param trspPrescription
     *  a webservice prescription
     * @return
     *  a local prescription object
     */
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
                        LocalDate.parse(trspPrescription.getVaildUntil(), DateTimeFormatter.ISO_LOCAL_DATE),
                        trspPrescription.getCreatedByStaffGLN(),
                        trspPrescription.getName(),
                        trspPrescription.getFirstName(),
                        trspPrescription.getPosition(),
                        trspPrescription.getDescription(),
                        trspPrescription.getSchedule(),
                        trspPrescription.getRouteOfAdministration(),
                        Prescription.PrescriptionState.valueOf(trspPrescription.getPrescriptionState().value()),
                        trspPrescription.getNotes(),
                        null,
                        null,
                        null,
                        null
                );

        //TODO: solve better (webservice) => not possible due to serialization
        for (PreparedMedication preparedMedication : preparedMedicationList) {
            preparedMedication.setApplicationScheme(trspPrescription.getSchedule());
            preparedMedication.setBasedOnPrescription(prescription);
            preparedMedication.setDescription(prescription.getDescription());
        }

        return prescription;

    }

    /**
     * Medication conversion from webservice to local medication object
     * @param trspPreparedMedication
     *  a webservice medication
     * @return
     *  a local medication
     */
    public static PreparedMedication convertFromWebserviceObject(TrspPreparedMedication trspPreparedMedication) {

        if (trspPreparedMedication == null) {
            return null;
        }

        PreparedMedication preparedMedication = new PreparedMedication(
                trspPreparedMedication.getGtinA(),
                trspPreparedMedication.getGtinBs(),
                trspPreparedMedication.getName(),
                trspPreparedMedication.getDescription(),
                trspPreparedMedication.getDosage(),
                trspPreparedMedication.getDosageUnit(),
                trspPreparedMedication.getPreparedMedicationId(),
                trspPreparedMedication.getApplicationScheme(),
                trspPreparedMedication.getGtinFromAssignedItem(),
                trspPreparedMedication.getBatchLot(),
                trspPreparedMedication.getSerial(),
                trspPreparedMedication.getExpiryDate(),
                PreparedMedication.MedicationState.valueOf(trspPreparedMedication.getState().value()),
                trspPreparedMedication.getForPatient() != null ? convertFromWebserviceObject(trspPreparedMedication.getForPatient()) : null,
                null,
                trspPreparedMedication.getPreparationTime() != null ? LocalDateTime.parse(trspPreparedMedication.getPreparationTime(),DateTimeFormatter.ISO_LOCAL_DATE_TIME) : null,
                false
        );
        preparedMedication.setIsReserve(trspPreparedMedication.isIsReserve());
        assert preparedMedication.getGtinBs().size() >= 1;
        return preparedMedication;
    }

    /**
     * Patient conversion from webservice to local patient object
     * @param trspPatient
     *  a webservice patient object
     * @return
     *  a local patient object
     */
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

    /**
     * Converts a local prescription to a webservice prescription
     * @param prescription
     *  a local prescription
     * @return
     *  a webservice prescription
     */
    public static TrspPrescription convertToWebServiceObject(Prescription prescription) {

        if (prescription == null) {
            return null;
        }

        TrspPrescription trspPrescription = new TrspPrescription();

        trspPrescription.setCreatedByStaffGLN(prescription.getCreatedByStaffGLN());
        trspPrescription.setDateCreated(prescription.getDateCreated().format(DateTimeFormatter.ISO_LOCAL_DATE)); //TODO: CHange to date time
        trspPrescription.setDescription(prescription.getDescription());
        trspPrescription.setName(prescription.getName());
        trspPrescription.setFirstName(prescription.getFirstName());
        trspPrescription.setPatientPolypointID(prescription.getPatientPolypointID());
        trspPrescription.setPolypointID(prescription.getPolypointID());
        trspPrescription.setPosition(prescription.getPosition());
        trspPrescription.setRouteOfAdministration(prescription.getRouteOfAdministration());
        trspPrescription.setSchedule(prescription.getSchedule());
        trspPrescription.setNotes(prescription.getNotes());
        /*
        trspPrescription.setIsStandardMedic
        trspPrescription.setPrescriptionState
        trspPrescription.setMedications
        trspPrescription.setMedicationMorning
        trspPrescription.setMedicationNoon
        trspPrescription.setMedicationEvening
        trspPrescription.setMedicationNight
        */

        return trspPrescription;
    }

    /**
     * Converts a local medication to a webservice medication object
     * @param preparedMedication
     * @return
     */
    public static TrspPreparedMedication convertToWebServiceObject(PreparedMedication preparedMedication) {

        if (preparedMedication == null) {
            return null;
        }

        TrspPreparedMedication trspPreparedMedication = new TrspPreparedMedication();

        trspPreparedMedication.setGtinA(preparedMedication.getGtinA().get());
        trspPreparedMedication.setName(preparedMedication.getName().get());
        trspPreparedMedication.setDescription(preparedMedication.getDescription().get());
        trspPreparedMedication.setDosage(preparedMedication.getDosage().get());
        trspPreparedMedication.setDosageUnit(preparedMedication.getDosageUnit().get());
        trspPreparedMedication.setApplicationScheme(preparedMedication.getApplicationScheme().get());
        trspPreparedMedication.setGtinFromAssignedItem(preparedMedication.getAssignedProductGTIN());
        trspPreparedMedication.setBatchLot(preparedMedication.getBatchLot());
        trspPreparedMedication.setSerial(preparedMedication.getSerial());
        trspPreparedMedication.setExpiryDate(preparedMedication.getExpiryDate());
        trspPreparedMedication.setState(convertToWebServiceObject(preparedMedication.getState()));
        trspPreparedMedication.setForPatient(convertToWebServiceObject(preparedMedication.getForPatient()));
        trspPreparedMedication.setBasedOnPrescription(convertToWebServiceObject(preparedMedication.getBasedOnPrescription()));
        trspPreparedMedication.setPreparationTime(preparedMedication.getPreparationTime().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        return trspPreparedMedication;
    }

    /**
     * converts a local patient object to a webservice patient object
     * @param patient
     *  a local patient object
     * @return
     *  a webservice patient object
     */
    public static TrspPatient convertToWebServiceObject(Patient patient) {

        if (patient == null) {
            return null;
        }

        TrspPatient trspPatient = new TrspPatient();

        trspPatient.setBeaconID(patient.getBeaconID());
        trspPatient.setBirthDate(patient.getBirthDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
        //trspPatient.setReaState(patient.get);
        trspPatient.setBloodGroup(convertToWebServiceObject((patient.getBloodGroup())));
        trspPatient.setFid(patient.getFid());
        trspPatient.setFirstname(patient.getFirstname());
        trspPatient.setLastname(patient.getLastname());
        trspPatient.setGender(convertToWebServiceObject((patient.getGender())));
        trspPatient.setPid(patient.getPid());
        trspPatient.setRoom(patient.getRoom());
        trspPatient.setStationName(patient.getStationName());

        return trspPatient;
    }

    /**
     * Converts the medication state from local to webservice state
     * @param state
     *  a local medication state
     * @return
     *  a webservice medication state
     */
    public static MedicationState convertToWebServiceObject(PreparedMedication.MedicationState state) {
        switch (state) {
            case open:
                return MedicationState.OPEN;
            case prepared:
                return MedicationState.PREPARED;
            case controlled:
                return MedicationState.CONTROLLED;
            case served:
                return MedicationState.SERVED;
        }
        return null;
    }

    /**
     * Converts a local Gender to webservice gender object
     * @param gender
     *  a local gender object
     * @return
     *  a webservice gender object
     */
    public static Gender convertToWebServiceObject(Patient.Gender gender) {
        switch (gender) {
            case male:
                return Gender.MALE;
            case female:
                return Gender.FEMALE;
            case undefined:
                return Gender.UNDEFINED;
        }

        return null;
    }

    /**
     * converts a local bloodgroup object to webservice bloodgroup
     * @param bloodGroup
     *   a local bloodgroup
     * @return
     *  a webservice bloodgroup
     */
    public static BloodGroup convertToWebServiceObject(Patient.BloodGroup bloodGroup) {
        switch (bloodGroup) {

            case Apositive:
                return BloodGroup.APOSITIVE;
            case Bpositive:
                return BloodGroup.BPOSITIVE;
            case AB:
                return BloodGroup.AB;
            case ZeroNegative:
                return BloodGroup.ZERO_NEGATIVE;
            case ZeroPositive:
                return BloodGroup.ZERO_POSITIVE;
        }
        return null;
    }


}
