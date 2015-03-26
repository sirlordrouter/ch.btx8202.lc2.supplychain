package ui;

import entities.Patient;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Patient Changer interface for changing events in patient list view.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public interface PatientChanger {

    void addListener(PatientChangerListener listener);
    void removeListener(PatientChangerListener listener);


    interface PatientChangerListener {
        void onPatientChanged(Patient patient);
    }
}
