
package webservice.erp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für medicationState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="medicationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="prepared"/>
 *     &lt;enumeration value="controlled"/>
 *     &lt;enumeration value="served"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "medicationState")
@XmlEnum
public enum MedicationState {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("prepared")
    PREPARED("prepared"),
    @XmlEnumValue("controlled")
    CONTROLLED("controlled"),
    @XmlEnumValue("served")
    SERVED("served");
    private final String value;

    MedicationState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicationState fromValue(String v) {
        for (MedicationState c: MedicationState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
