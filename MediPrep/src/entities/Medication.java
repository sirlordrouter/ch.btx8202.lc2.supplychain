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

    private StringProperty gtin;
    private StringProperty Name;
    private StringProperty Description;
    private StringProperty Dosage;
    private StringProperty DosageUnit;
    private StringProperty ApplicationScheme;


    public Medication(String gtin, String name, String description, String dosage, String dosageUnit, String applicationScheme) {
        this.gtin = new SimpleStringProperty(gtin);
        this.Name = new SimpleStringProperty(name);
        this.Description = new SimpleStringProperty(description);
        this.Dosage = new SimpleStringProperty(dosage);
        this.DosageUnit = new SimpleStringProperty(dosageUnit);
        this.ApplicationScheme = new SimpleStringProperty(applicationScheme);
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
        Name = new SimpleStringProperty(name);
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
