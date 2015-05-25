package entities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.List;

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

    private StringProperty gtinA = new SimpleStringProperty();
    private List<String> gtinBs = new ArrayList<>();
    private StringProperty Name = new SimpleStringProperty();
    private StringProperty Description = new SimpleStringProperty();
    private StringProperty Dosage = new SimpleStringProperty();
    private StringProperty DosageUnit = new SimpleStringProperty();
    private StringProperty ApplicationScheme = new SimpleStringProperty();

    public Medication(String gtin,List<String> gtinBs, String name, String description, String dosage, String dosageUnit, String applicationScheme) {
        this.gtinA.setValue(gtin);
        this.gtinBs = gtinBs;
        this.Name.setValue(name);
        this.Description.setValue(description);
        this.Dosage.setValue(dosage);
        this.DosageUnit.setValue(dosageUnit);
        this.ApplicationScheme.setValue(applicationScheme);
    }

    public Medication() {

    }

    public StringProperty getGtinA() {
        return gtinA;
    }

    public void setGtinA(String gtinA) {
        this.gtinA.setValue(gtinA);
    }

    public List<String> getGtinBs() {
        return gtinBs;
    }

    public void setGtinBs(List<String> gtinBs) {
        
        this.gtinBs = gtinBs;
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
