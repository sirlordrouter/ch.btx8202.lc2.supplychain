package model.entities;

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
    private SimpleStringProperty gtin, description;
    private SimpleIntegerProperty quantity;

    public Position(String aGtin, String aDescription, int aQuantity){
        this.gtin=new SimpleStringProperty(aGtin);
        this.description=new SimpleStringProperty(aDescription);
        this.quantity=new SimpleIntegerProperty(aQuantity);
    }

    public String getGtin() {
        return gtin.get();
    }

    public SimpleStringProperty gtinProperty() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin.set(gtin);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public int getQuantity() {
        return quantity.get();
    }

    public SimpleIntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }
}
