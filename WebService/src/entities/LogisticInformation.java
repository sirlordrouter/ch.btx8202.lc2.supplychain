package entities;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 * <p>
 * <p></p>
 * Project: WebService
 * Package: service
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 22.04.15
 */
public class LogisticInformation {
    public final String GtinA;
    public final String Manufacturer;
    public final int LogisticQuantity;

    public LogisticInformation(String gtinA, String manufacturer, int logisticQuantity) {
        this.GtinA = gtinA;
        this.Manufacturer = manufacturer;
        this.LogisticQuantity = logisticQuantity;
    }
}