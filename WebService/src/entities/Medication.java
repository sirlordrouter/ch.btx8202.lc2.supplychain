package entities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Describes a Medication from a Prescription with Identification and Application information.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class Medication {

    private String gtin = new SimpleStringProperty();
    private String Name = new SimpleStringProperty();
    private String Description = new SimpleStringProperty();
    private String Dosage = new SimpleStringProperty();
    private String DosageUnit = new SimpleStringProperty();
    private String ApplicationScheme = new SimpleStringProperty();


    public Medication(String gtin, String name, String description, String dosage, String dosageUnit, String applicationScheme) {
        this.gtin.setValue(gtin);
        this.Name.setValue(name);
        this.Description.setValue(description);
        this.Dosage.setValue(dosage);
        this.DosageUnit.setValue(dosageUnit);
        this.ApplicationScheme.setValue(applicationScheme);
    }

    public Medication() {

    }

    public StringProperty getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin.setValue(gtin);
    }

    public StringProperty getName() {
        return Name;
    }

    public void setName(String name) {
        Name.setValue(name);
    }

    public StringProperty getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description.setValue(description);
    }

    public StringProperty getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage.set(dosage);
    }

    public StringProperty getDosageUnit() {
        return DosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        DosageUnit.set(dosageUnit);
    }

    public StringProperty getApplicationScheme() {
        return ApplicationScheme;
    }

    public void setApplicationScheme(String applicationScheme) {
        ApplicationScheme.set(applicationScheme);
    }
}
