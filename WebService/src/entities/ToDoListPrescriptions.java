package entities;

import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p>
 *     Holds a List of Prescriptions for every usual dispensing time.
 * </p>
 * Project: WebService
 * Package: entities
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 21.04.15
 */
public class ToDoListPrescriptions {

    private List<TrspPrescription> scheduldedPrescriptionsMorning;
    private List<TrspPrescription> scheduldedPrescriptionsNoon;
    private List<TrspPrescription> scheduldedPrescriptionsEvening;
    private List<TrspPrescription> scheduldedPrescriptionsNight;

    public ToDoListPrescriptions(List<TrspPrescription> scheduldedPrescriptionsMorning, List<TrspPrescription> scheduldedPrescriptionsNoon, List<TrspPrescription> scheduldedPrescriptionsEvening, List<TrspPrescription> scheduldedPrescriptionsNight) {
        this.scheduldedPrescriptionsMorning = scheduldedPrescriptionsMorning;
        this.scheduldedPrescriptionsNoon = scheduldedPrescriptionsNoon;
        this.scheduldedPrescriptionsEvening = scheduldedPrescriptionsEvening;
        this.scheduldedPrescriptionsNight = scheduldedPrescriptionsNight;
    }

    public List<TrspPrescription> getScheduldedPrescriptionsMorning() {
        return scheduldedPrescriptionsMorning;
    }

    public void setScheduldedPrescriptionsMorning(List<TrspPrescription> scheduldedPrescriptionsMorning) {
        this.scheduldedPrescriptionsMorning = scheduldedPrescriptionsMorning;
    }

    public List<TrspPrescription> getScheduldedPrescriptionsNoon() {
        return scheduldedPrescriptionsNoon;
    }

    public void setScheduldedPrescriptionsNoon(List<TrspPrescription> scheduldedPrescriptionsNoon) {
        this.scheduldedPrescriptionsNoon = scheduldedPrescriptionsNoon;
    }

    public List<TrspPrescription> getScheduldedPrescriptionsEvening() {
        return scheduldedPrescriptionsEvening;
    }

    public void setScheduldedPrescriptionsEvening(List<TrspPrescription> scheduldedPrescriptionsEvening) {
        this.scheduldedPrescriptionsEvening = scheduldedPrescriptionsEvening;
    }

    public List<TrspPrescription> getScheduldedPrescriptionsNight() {
        return scheduldedPrescriptionsNight;
    }

    public void setScheduldedPrescriptionsNight(List<TrspPrescription> scheduldedPrescriptionsNight) {
        this.scheduldedPrescriptionsNight = scheduldedPrescriptionsNight;
    }
}
