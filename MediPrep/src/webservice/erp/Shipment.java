
package webservice.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für shipment complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="shipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glnDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="glnOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sscc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipment", propOrder = {
    "descDestination",
    "descOrigin",
    "glnDestination",
    "glnOrigin",
    "gsin",
    "orderNr",
    "sscc"
})
public class Shipment {

    protected String descDestination;
    protected String descOrigin;
    protected String glnDestination;
    protected String glnOrigin;
    protected String gsin;
    protected String orderNr;
    protected String sscc;

    /**
     * Ruft den Wert der descDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescDestination() {
        return descDestination;
    }

    /**
     * Legt den Wert der descDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescDestination(String value) {
        this.descDestination = value;
    }

    /**
     * Ruft den Wert der descOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOrigin() {
        return descOrigin;
    }

    /**
     * Legt den Wert der descOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOrigin(String value) {
        this.descOrigin = value;
    }

    /**
     * Ruft den Wert der glnDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnDestination() {
        return glnDestination;
    }

    /**
     * Legt den Wert der glnDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnDestination(String value) {
        this.glnDestination = value;
    }

    /**
     * Ruft den Wert der glnOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlnOrigin() {
        return glnOrigin;
    }

    /**
     * Legt den Wert der glnOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlnOrigin(String value) {
        this.glnOrigin = value;
    }

    /**
     * Ruft den Wert der gsin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsin() {
        return gsin;
    }

    /**
     * Legt den Wert der gsin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsin(String value) {
        this.gsin = value;
    }

    /**
     * Ruft den Wert der orderNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNr() {
        return orderNr;
    }

    /**
     * Legt den Wert der orderNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNr(String value) {
        this.orderNr = value;
    }

    /**
     * Ruft den Wert der sscc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSscc() {
        return sscc;
    }

    /**
     * Legt den Wert der sscc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSscc(String value) {
        this.sscc = value;
    }

}
