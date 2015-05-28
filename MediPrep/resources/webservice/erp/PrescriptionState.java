
package webservice.erp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für prescriptionState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="prescriptionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="open"/>
 *     &lt;enumeration value="paused"/>
 *     &lt;enumeration value="stopped"/>
 *     &lt;enumeration value="doseChanged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "prescriptionState")
@XmlEnum
public enum PrescriptionState {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("paused")
    PAUSED("paused"),
    @XmlEnumValue("stopped")
    STOPPED("stopped"),
    @XmlEnumValue("doseChanged")
    DOSE_CHANGED("doseChanged");
    private final String value;

    PrescriptionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrescriptionState fromValue(String v) {
        for (PrescriptionState c: PrescriptionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
