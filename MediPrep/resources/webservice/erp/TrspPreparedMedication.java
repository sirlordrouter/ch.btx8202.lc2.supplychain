
package webservice.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für trspPreparedMedication complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="trspPreparedMedication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service/}trspMedication">
 *       &lt;sequence>
 *         &lt;element name="basedOnPrescription" type="{http://service/}trspPrescription" minOccurs="0"/>
 *         &lt;element name="batchLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forPatient" type="{http://service/}trspPatient" minOccurs="0"/>
 *         &lt;element name="gtinFromAssignedItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isReserve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="preparationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preparedMedicationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staffGln" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://service/}medicationState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trspPreparedMedication", propOrder = {
    "basedOnPrescription",
    "batchLot",
    "expiryDate",
    "forPatient",
    "gtinFromAssignedItem",
    "isReserve",
    "preparationTime",
    "preparedMedicationId",
    "serial",
    "staffGln",
    "state"
})
public class TrspPreparedMedication
    extends TrspMedication
{

    protected TrspPrescription basedOnPrescription;
    protected String batchLot;
    protected String expiryDate;
    protected TrspPatient forPatient;
    protected String gtinFromAssignedItem;
    protected boolean isReserve;
    protected String preparationTime;
    protected int preparedMedicationId;
    protected String serial;
    protected String staffGln;
    @XmlSchemaType(name = "string")
    protected MedicationState state;

    /**
     * Ruft den Wert der basedOnPrescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrspPrescription }
     *     
     */
    public TrspPrescription getBasedOnPrescription() {
        return basedOnPrescription;
    }

    /**
     * Legt den Wert der basedOnPrescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrspPrescription }
     *     
     */
    public void setBasedOnPrescription(TrspPrescription value) {
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
     *     {@link TrspPatient }
     *     
     */
    public TrspPatient getForPatient() {
        return forPatient;
    }

    /**
     * Legt den Wert der forPatient-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrspPatient }
     *     
     */
    public void setForPatient(TrspPatient value) {
        this.forPatient = value;
    }

    /**
     * Ruft den Wert der gtinFromAssignedItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtinFromAssignedItem() {
        return gtinFromAssignedItem;
    }

    /**
     * Legt den Wert der gtinFromAssignedItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtinFromAssignedItem(String value) {
        this.gtinFromAssignedItem = value;
    }

    /**
     * Ruft den Wert der isReserve-Eigenschaft ab.
     * 
     */
    public boolean isIsReserve() {
        return isReserve;
    }

    /**
     * Legt den Wert der isReserve-Eigenschaft fest.
     * 
     */
    public void setIsReserve(boolean value) {
        this.isReserve = value;
    }

    /**
     * Ruft den Wert der preparationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparationTime() {
        return preparationTime;
    }

    /**
     * Legt den Wert der preparationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparationTime(String value) {
        this.preparationTime = value;
    }

    /**
     * Ruft den Wert der preparedMedicationId-Eigenschaft ab.
     * 
     */
    public int getPreparedMedicationId() {
        return preparedMedicationId;
    }

    /**
     * Legt den Wert der preparedMedicationId-Eigenschaft fest.
     * 
     */
    public void setPreparedMedicationId(int value) {
        this.preparedMedicationId = value;
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
     *     {@link MedicationState }
     *     
     */
    public MedicationState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicationState }
     *     
     */
    public void setState(MedicationState value) {
        this.state = value;
    }

}
