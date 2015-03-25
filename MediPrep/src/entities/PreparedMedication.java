package entities;

/**
 * Created by Johannes on 25.03.15.
 */
public class PreparedMedication {

    public static enum State {open, prepared, controlled, served}

    private int id;

    private Patient forPatient;
    private Medication Medication;
    private Prescription basedOnPrescription;

    public PreparedMedication(Patient forPatient, entities.Medication medication, Prescription basedOnPrescription) {
        this.forPatient = forPatient;
        Medication = medication;
        this.basedOnPrescription = basedOnPrescription;
    }

    public Patient getForPatient() {
        return forPatient;
    }

    public void setForPatient(Patient forPatient) {
        this.forPatient = forPatient;
    }

    public Medication getMedication() {
        return Medication;
    }

    public void setMedication(Medication medication) {
        Medication = medication;
    }

    public Prescription getBasedOnPrescription() {
        return basedOnPrescription;
    }

    public void setBasedOnPrescription(Prescription basedOnPrescription) {
        this.basedOnPrescription = basedOnPrescription;
    }
}
