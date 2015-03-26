package entities;

import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis<br>
 *
 *<p>
 * Describes a Prescription with 1 or more medications defined.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class Prescription {

    public static enum State {open, paused, stopped, doseChanged}
    private boolean isStandardMedic = true;
    private List<PreparedMedication> medications;


}
