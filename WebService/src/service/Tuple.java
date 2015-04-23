package service;

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
public class Tuple<X, Y> {
    public final X first;
    public final Y second;
    public Tuple(X first, Y second) {
        this.first = first;
        this.second = second;
    }
}