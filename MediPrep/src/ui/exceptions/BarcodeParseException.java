package ui.exceptions;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: MediPrep
 * Package: ui.exceptions
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 23.05.15
 */
public class BarcodeParseException extends Exception {
    public BarcodeParseException(String message) {
        super(message);
    }
}
