package entities;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 * <p/>
 *  Defines a Station from a Hospital.
 * <p>

 * </p>
 * Project: WebService
 * Package: entities
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 27.03.15
 */
public class Station {
    private String gln;
    private String name;

    public Station(String gln, String name) {
        this.gln = gln;
        this.name = name;
    }

    public String getGln() {
        return gln;
    }

    public void setGln(String gln) {
        this.gln = gln;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
