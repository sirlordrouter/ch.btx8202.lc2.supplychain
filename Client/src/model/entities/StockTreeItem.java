package model.entities;

import javafx.beans.property.SimpleStringProperty;

/**
 * Bern University of Applied Sciences</br>
 * BSc Medical Informatics</br>
 * Module Bachelorthesis</br>
 *
 *<p>This class generates Objects to be filled in a TreeTableView only available in JavaFX 8.</p>
 *
 * @author Patrick Hirschi, patrick.hirschi@students.bfh.ch
 * @version 26-02-2015
 */
public class StockTreeItem {

    private SimpleStringProperty description,quantity,gtin,expdate,batchlot,serial;

    public StockTreeItem(String aDescription, String aQuantity,String aGtin, String anExpdate,String aBatchlot,String aSerial){
        this.description = new SimpleStringProperty(aDescription);
        this.quantity=new SimpleStringProperty(aQuantity);
        this.gtin=new SimpleStringProperty(aGtin);
        this.expdate=new SimpleStringProperty(anExpdate);
        this.batchlot=new SimpleStringProperty(aBatchlot);
        this.serial=new SimpleStringProperty(aSerial);
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

    public String getQuantity() {
        return quantity.get();
    }

    public SimpleStringProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity.set(quantity);
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

    public String getExpdate() {
        return expdate.get();
    }

    public SimpleStringProperty expdateProperty() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate.set(expdate);
    }

    public String getBatchlot() {
        return batchlot.get();
    }

    public SimpleStringProperty batchlotProperty() {
        return batchlot;
    }

    public void setBatchlot(String batchlot) {
        this.batchlot.set(batchlot);
    }

    public String getSerial() {
        return serial.get();
    }

    public SimpleStringProperty serialProperty() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial.set(serial);
    }
}
