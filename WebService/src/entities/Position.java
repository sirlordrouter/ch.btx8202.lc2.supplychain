package entities;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 28-02-2015
 */
public class Position {
    private String gtin, description;
    private int quantity;

    public Position(String aGtin, String aDescription, int aQuantity){
        this.gtin=aGtin;
        this.description=aDescription;
        this.quantity=aQuantity;
    }
    public Position(){

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

