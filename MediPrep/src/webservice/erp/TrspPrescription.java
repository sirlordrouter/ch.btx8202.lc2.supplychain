
package webservice.erp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für trspPrescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="trspPrescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdByStaffGLN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medications" type="{http://service/}trspPreparedMedication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicationsEvening" type="{http://service/}trspPreparedMedication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicationsMorning" type="{http://service/}trspPreparedMedication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicationsNight" type="{http://service/}trspPreparedMedication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicationsNoon" type="{http://service/}trspPreparedMedication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patientPolypointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polypointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prescriptionState" type="{http://service/}prescriptionState" minOccurs="0"/>
 *         &lt;element name="routeOfAdministration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vaildUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trspPrescription", propOrder = {
    "createdByStaffGLN",
    "dateCreated",
    "description",
    "firstName",
    "medications",
    "medicationsEvening",
    "medicationsMorning",
    "medicationsNight",
    "medicationsNoon",
    "name",
    "notes",
    "patientPolypointID",
    "polypointID",
    "position",
    "prescriptionState",
    "routeOfAdministration",
    "schedule",
    "vaildUntil"
})
public class TrspPrescription {

    protected String createdByStaffGLN;
    protected String dateCreated;
    protected String description;
    protected String firstName;
    @XmlElement(nillable = true)
    protected List<TrspPreparedMedication> medications;
    @XmlElement(nillable = true)
    protected List<TrspPreparedMedication> medicationsEvening;
    @XmlElement(nillable = true)
    protected List<TrspPreparedMedication> medicationsMorning;
    @XmlElement(nillable = true)
    protected List<TrspPreparedMedication> medicationsNight;
    @XmlElement(nillable = true)
    protected List<TrspPreparedMedication> medicationsNoon;
    protected String name;
    protected String notes;
    protected String patientPolypointID;
    protected String polypointID;
    protected String position;
    @XmlSchemaType(name = "string")
    protected PrescriptionState prescriptionState;
    protected String routeOfAdministration;
    protected String schedule;
    protected String vaildUntil;

    /**
     * Ruft den Wert der createdByStaffGLN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByStaffGLN() {
        return createdByStaffGLN;
    }

    /**
     * Legt den Wert der createdByStaffGLN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByStaffGLN(String value) {
        this.createdByStaffGLN = value;
    }

    /**
     * Ruft den Wert der dateCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Legt den Wert der dateCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreated(String value) {
        this.dateCreated = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der firstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Legt den Wert der firstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the medications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPreparedMedication }
     * 
     * 
     */
    public List<TrspPreparedMedication> getMedications() {
        if (medications == null) {
            medications = new ArrayList<TrspPreparedMedication>();
        }
        return this.medications;
    }

    /**
     * Gets the value of the medicationsEvening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationsEvening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationsEvening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPreparedMedication }
     * 
     * 
     */
    public List<TrspPreparedMedication> getMedicationsEvening() {
        if (medicationsEvening == null) {
            medicationsEvening = new ArrayList<TrspPreparedMedication>();
        }
        return this.medicationsEvening;
    }

    /**
     * Gets the value of the medicationsMorning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationsMorning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationsMorning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPreparedMedication }
     * 
     * 
     */
    public List<TrspPreparedMedication> getMedicationsMorning() {
        if (medicationsMorning == null) {
            medicationsMorning = new ArrayList<TrspPreparedMedication>();
        }
        return this.medicationsMorning;
    }

    /**
     * Gets the value of the medicationsNight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationsNight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationsNight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPreparedMedication }
     * 
     * 
     */
    public List<TrspPreparedMedication> getMedicationsNight() {
        if (medicationsNight == null) {
            medicationsNight = new ArrayList<TrspPreparedMedication>();
        }
        return this.medicationsNight;
    }

    /**
     * Gets the value of the medicationsNoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationsNoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationsNoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPreparedMedication }
     * 
     * 
     */
    public List<TrspPreparedMedication> getMedicationsNoon() {
        if (medicationsNoon == null) {
            medicationsNoon = new ArrayList<TrspPreparedMedication>();
        }
        return this.medicationsNoon;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der notes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Legt den Wert der notes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Ruft den Wert der patientPolypointID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientPolypointID() {
        return patientPolypointID;
    }

    /**
     * Legt den Wert der patientPolypointID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientPolypointID(String value) {
        this.patientPolypointID = value;
    }

    /**
     * Ruft den Wert der polypointID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolypointID() {
        return polypointID;
    }

    /**
     * Legt den Wert der polypointID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolypointID(String value) {
        this.polypointID = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der prescriptionState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionState }
     *     
     */
    public PrescriptionState getPrescriptionState() {
        return prescriptionState;
    }

    /**
     * Legt den Wert der prescriptionState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionState }
     *     
     */
    public void setPrescriptionState(PrescriptionState value) {
        this.prescriptionState = value;
    }

    /**
     * Ruft den Wert der routeOfAdministration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }

    /**
     * Legt den Wert der routeOfAdministration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteOfAdministration(String value) {
        this.routeOfAdministration = value;
    }

    /**
     * Ruft den Wert der schedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Legt den Wert der schedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * Ruft den Wert der vaildUntil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaildUntil() {
        return vaildUntil;
    }

    /**
     * Legt den Wert der vaildUntil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaildUntil(String value) {
        this.vaildUntil = value;
    }

}
