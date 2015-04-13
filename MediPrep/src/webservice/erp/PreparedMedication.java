
package webservice.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für preparedMedication complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="preparedMedication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service/}medication">
 *       &lt;sequence>
 *         &lt;element name="basedOnPrescription" type="{http://service/}prescription" minOccurs="0"/>
 *         &lt;element name="batchLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forPatient" type="{http://service/}patient" minOccurs="0"/>
 *         &lt;element name="preparationTime" type="{http://service/}localDateTime" minOccurs="0"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staffGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://service/}state" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preparedMedication", propOrder = {
    "basedOnPrescription",
    "batchLot",
    "expiryDate",
    "forPatient",
    "preparationTime",
    "serial",
    "staffGln",
    "state"
})
public class PreparedMedication
    extends Medication
{

    protected Prescription basedOnPrescription;
    protected String batchLot;
    protected String expiryDate;
    protected Patient forPatient;
    protected LocalDateTime preparationTime;
    protected String serial;
    protected String staffGln;
    @XmlSchemaType(name = "string")
    protected State state;

    /**
     * Ruft den Wert der basedOnPrescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Prescription }
     *     
     */
    public Prescription getBasedOnPrescription() {
        return basedOnPrescription;
    }

    /**
     * Legt den Wert der basedOnPrescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Prescription }
     *     
     */
    public void setBasedOnPrescription(Prescription value) {
        this.basedOnPrescription = value;
    }

    /**
     * Ruft den Wert der batchLot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchLot() {
        return batchLot;
    }

    /**
     * Legt den Wert der batchLot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchLot(String value) {
        this.batchLot = value;
    }

    /**
     * Ruft den Wert der expiryDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Legt den Wert der expiryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Ruft den Wert der forPatient-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getForPatient() {
        return forPatient;
    }

    /**
     * Legt den Wert der forPatient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setForPatient(Patient value) {
        this.forPatient = value;
    }

    /**
     * Ruft den Wert der preparationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getPreparationTime() {
        return preparationTime;
    }

    /**
     * Legt den Wert der preparationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setPreparationTime(LocalDateTime value) {
        this.preparationTime = value;
    }

    /**
     * Ruft den Wert der serial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Legt den Wert der serial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Ruft den Wert der staffGln-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffGln() {
        return staffGln;
    }

    /**
     * Legt den Wert der staffGln-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffGln(String value) {
        this.staffGln = value;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

}
