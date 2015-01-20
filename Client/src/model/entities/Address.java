package model.entities;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Living Case 2</br>
 *
 *<p>An Address Class</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @author Patrizia Zehnder, patriziasusanna.zehnder@students.bfh.ch
 * @version 21-10-2014
 */
public class Address {

    private int streetNr;
    private String streetName;
    private int zip;
    private String city;

    public Address(String streetName, int streetNr, int zip, String city) {
        this.setStreetNr(streetNr);
        this.setStreetName(streetName);
        this.setZip(zip);
        this.setCity(city);
    }

    public int getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(int streetNr) {
        this.streetNr = streetNr;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
