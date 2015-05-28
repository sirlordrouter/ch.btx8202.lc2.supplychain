
package webservice.erp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für toDoListPrescriptions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="toDoListPrescriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduldedPrescriptionsEvening" type="{http://service/}trspPrescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduldedPrescriptionsMorning" type="{http://service/}trspPrescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduldedPrescriptionsNight" type="{http://service/}trspPrescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduldedPrescriptionsNoon" type="{http://service/}trspPrescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "toDoListPrescriptions", propOrder = {
    "scheduldedPrescriptionsEvening",
    "scheduldedPrescriptionsMorning",
    "scheduldedPrescriptionsNight",
    "scheduldedPrescriptionsNoon"
})
public class ToDoListPrescriptions {

    @XmlElement(nillable = true)
    protected List<TrspPrescription> scheduldedPrescriptionsEvening;
    @XmlElement(nillable = true)
    protected List<TrspPrescription> scheduldedPrescriptionsMorning;
    @XmlElement(nillable = true)
    protected List<TrspPrescription> scheduldedPrescriptionsNight;
    @XmlElement(nillable = true)
    protected List<TrspPrescription> scheduldedPrescriptionsNoon;

    /**
     * Gets the value of the scheduldedPrescriptionsEvening property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduldedPrescriptionsEvening property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduldedPrescriptionsEvening().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPrescription }
     * 
     * 
     */
    public List<TrspPrescription> getScheduldedPrescriptionsEvening() {
        if (scheduldedPrescriptionsEvening == null) {
            scheduldedPrescriptionsEvening = new ArrayList<TrspPrescription>();
        }
        return this.scheduldedPrescriptionsEvening;
    }

    /**
     * Gets the value of the scheduldedPrescriptionsMorning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduldedPrescriptionsMorning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduldedPrescriptionsMorning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPrescription }
     * 
     * 
     */
    public List<TrspPrescription> getScheduldedPrescriptionsMorning() {
        if (scheduldedPrescriptionsMorning == null) {
            scheduldedPrescriptionsMorning = new ArrayList<TrspPrescription>();
        }
        return this.scheduldedPrescriptionsMorning;
    }

    /**
     * Gets the value of the scheduldedPrescriptionsNight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduldedPrescriptionsNight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduldedPrescriptionsNight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPrescription }
     * 
     * 
     */
    public List<TrspPrescription> getScheduldedPrescriptionsNight() {
        if (scheduldedPrescriptionsNight == null) {
            scheduldedPrescriptionsNight = new ArrayList<TrspPrescription>();
        }
        return this.scheduldedPrescriptionsNight;
    }

    /**
     * Gets the value of the scheduldedPrescriptionsNoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduldedPrescriptionsNoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduldedPrescriptionsNoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrspPrescription }
     * 
     * 
     */
    public List<TrspPrescription> getScheduldedPrescriptionsNoon() {
        if (scheduldedPrescriptionsNoon == null) {
            scheduldedPrescriptionsNoon = new ArrayList<TrspPrescription>();
        }
        return this.scheduldedPrescriptionsNoon;
    }

}
