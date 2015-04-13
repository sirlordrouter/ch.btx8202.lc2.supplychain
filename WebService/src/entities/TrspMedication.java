package entities;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module Bachelorthesis <br>
 *
 *<p>
 * Describes a TrspMedication from a Prescription with Identification and Application information.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class TrspMedication {

    private String gtin;
    private String Name;
    private String Description;
    private String Dosage;
    private String DosageUnit;
    private String ApplicationScheme;


    public TrspMedication(String gtin, String name, String description, String dosage, String dosageUnit, String applicationScheme) {
        this.gtin = gtin;
        this.Name = name;
        this.Description = description;
        this.Dosage = dosage;
        this.DosageUnit = dosageUnit;
        this.ApplicationScheme = applicationScheme;
    }

    public TrspMedication() {

    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description= description;
    }

    public String getDosage() {
        return Dosage;
    }

    public void setDosage(String dosage) {
        Dosage= dosage;
    }

    public String getDosageUnit() {
        return DosageUnit;
    }

    public void setDosageUnit(String dosageUnit) {
        DosageUnit= dosageUnit;
    }

    public String getApplicationScheme() {
        return ApplicationScheme;
    }

    public void setApplicationScheme(String applicationScheme) {
        ApplicationScheme = applicationScheme;
    }
}
