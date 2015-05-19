package entities;

import java.util.List;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Describes a TrspMedication from a TrspPrescription with Identification and Application information.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class TrspMedication {

    private String gtinA;
    private List<String> gtinBs;
    private String name;
    private String description;
    private String dosage;
    private String dosageUnit;
    private String applicationScheme;


    public TrspMedication(String gtinA,List<String> gtinBs, String name, String description, String dosage, String dosageUnit, String applicationScheme) {
        this.gtinA = gtinA;
        this.gtinBs = gtinBs;
        this.name = name;
        this.description = description;
        this.dosage = dosage;
        this.dosageUnit = dosageUnit;
        this.applicationScheme = applicationScheme;
    }

    public TrspMedication() {

    }

    public String getGtinA() {
        return gtinA;
    }

    public void setGtinA(String gtinA) {
        this.gtinA = gtinA;
    }

    public List<String> getGtinBs() {
        return gtinBs;
    }

    public void setGtinBs(List<String> gtinBs) {
        this.gtinBs = gtinBs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
    }

    public String getApplicationScheme() {
        return applicationScheme;
    }

    public void setApplicationScheme(String applicationScheme) {
        this.applicationScheme = applicationScheme;
    }


}
