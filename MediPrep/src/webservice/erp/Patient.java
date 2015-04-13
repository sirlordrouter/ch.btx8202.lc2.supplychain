
package webservice.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für patient complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="patient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genderImage" type="{http://service/}image" minOccurs="0"/>
 *         &lt;element name="beaconID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://service/}localDate" minOccurs="0"/>
 *         &lt;element name="bloodGroup" type="{http://service/}bloodGroup" minOccurs="0"/>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://service/}gender" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reaState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient", propOrder = {
    "genderImage",
    "beaconID",
    "birthDate",
    "bloodGroup",
    "fid",
    "firstname",
    "gender",
    "lastname",
    "pid",
    "reaState",
    "room",
    "stationName"
})
public class Patient {

    protected Image genderImage;
    protected String beaconID;
    protected LocalDate birthDate;
    @XmlSchemaType(name = "string")
    protected BloodGroup bloodGroup;
    protected int fid;
    protected String firstname;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected String lastname;
    protected int pid;
    protected boolean reaState;
    protected String room;
    protected String stationName;

    /**
     * Ruft den Wert der genderImage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getGenderImage() {
        return genderImage;
    }

    /**
     * Legt den Wert der genderImage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setGenderImage(Image value) {
        this.genderImage = value;
    }

    /**
     * Ruft den Wert der beaconID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeaconID() {
        return beaconID;
    }

    /**
     * Legt den Wert der beaconID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeaconID(String value) {
        this.beaconID = value;
    }

    /**
     * Ruft den Wert der birthDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Legt den Wert der birthDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setBirthDate(LocalDate value) {
        this.birthDate = value;
    }

    /**
     * Ruft den Wert der bloodGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BloodGroup }
     *     
     */
    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Legt den Wert der bloodGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BloodGroup }
     *     
     */
    public void setBloodGroup(BloodGroup value) {
        this.bloodGroup = value;
    }

    /**
     * Ruft den Wert der fid-Eigenschaft ab.
     * 
     */
    public int getFid() {
        return fid;
    }

    /**
     * Legt den Wert der fid-Eigenschaft fest.
     * 
     */
    public void setFid(int value) {
        this.fid = value;
    }

    /**
     * Ruft den Wert der firstname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Legt den Wert der firstname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Ruft den Wert der lastname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Legt den Wert der lastname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Ruft den Wert der pid-Eigenschaft ab.
     * 
     */
    public int getPid() {
        return pid;
    }

    /**
     * Legt den Wert der pid-Eigenschaft fest.
     * 
     */
    public void setPid(int value) {
        this.pid = value;
    }

    /**
     * Ruft den Wert der reaState-Eigenschaft ab.
     * 
     */
    public boolean isReaState() {
        return reaState;
    }

    /**
     * Legt den Wert der reaState-Eigenschaft fest.
     * 
     */
    public void setReaState(boolean value) {
        this.reaState = value;
    }

    /**
     * Ruft den Wert der room-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Legt den Wert der room-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Ruft den Wert der stationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Legt den Wert der stationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

}
