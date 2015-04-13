package services;

import entities.PreparedMedication;
import entities.Prescription;
import webservice.erp.TrspPreparedMedication;
import webservice.erp.TrspPrescription;

import java.util.ArrayList;
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
    public Prescription convertFromWebserviceObject(TrspPrescription trspPrescription) {

        List<PreparedMedication> preparedMedicationList =
                trspPrescription.getMedications().stream().map(this::convertFromWebserviceObject).collect(Collectors.toList());

        Prescription prescription =
                new Prescription(true, preparedMedicationList,
                        trspPrescription.getPolypointID(),
                        trspPrescription.getPatientPolypointID(),
                        trspPrescription.getDateCreated(), trspPrescription.getCreatedByStaffGLN(),
                        trspPrescription.getName(),
                        trspPrescription.getFirstName(),
                        trspPrescription.getPosition(),
                        trspPrescription.getDescription(),
                        trspPrescription.getSchedule(),
                        trspPrescription.getRouteOfAdministration());
        return prescription;
    }

    public PreparedMedication convertFromWebserviceObject(TrspPreparedMedication trspPreparedMedication) {

    }

    public TrspPrescription convertToWebServiceObject(Prescription p) {

    }

    public TrspPreparedMedication convertToWebServiceObject(PreparedMedication preparedMedication) {

    }
}
