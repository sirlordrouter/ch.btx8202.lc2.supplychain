
package webservice.erp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für quantity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="quantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quantity", propOrder = {
    "description",
    "gtin",
    "minQuantity",
    "optQuantity"
})
public class Quantity {

    protected String description;
    protected String gtin;
    protected int minQuantity;
    protected int optQuantity;

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
     * Ruft den Wert der gtin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Legt den Wert der gtin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * Ruft den Wert der minQuantity-Eigenschaft ab.
     * 
     */
    public int getMinQuantity() {
        return minQuantity;
    }

    /**
     * Legt den Wert der minQuantity-Eigenschaft fest.
     * 
     */
    public void setMinQuantity(int value) {
        this.minQuantity = value;
    }

    /**
     * Ruft den Wert der optQuantity-Eigenschaft ab.
     * 
     */
    public int getOptQuantity() {
        return optQuantity;
    }

    /**
     * Legt den Wert der optQuantity-Eigenschaft fest.
     * 
     */
    public void setOptQuantity(int value) {
        this.optQuantity = value;
    }

}
