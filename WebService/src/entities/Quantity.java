package entities;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>A Quantity Class.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 02-03-2015
 */
public class Quantity {
    private String gtin;
    private String description;
    private int minQuantity;
    private int optQuantity;

    public Quantity(){

    }

    public Quantity(String aGtin, String aDescription, int aMinQuantity, int anOptQuantity){
        this.gtin=aGtin;
        this.description=aDescription;
        this.minQuantity=aMinQuantity;
        this.optQuantity=anOptQuantity;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(int minQuantity) {
        this.minQuantity = minQuantity;
    }

    public int getOptQuantity() {
        return optQuantity;
    }

    public void setOptQuantity(int optQuantity) {
        this.optQuantity = optQuantity;
    }
}
