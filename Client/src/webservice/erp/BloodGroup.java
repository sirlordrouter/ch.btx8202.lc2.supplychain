
package webservice.erp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für bloodGroup.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="bloodGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Apositive"/>
 *     &lt;enumeration value="Bpositive"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="ZeroNegative"/>
 *     &lt;enumeration value="ZeroPositive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bloodGroup")
@XmlEnum
public enum BloodGroup {

    @XmlEnumValue("Apositive")
    APOSITIVE("Apositive"),
    @XmlEnumValue("Bpositive")
    BPOSITIVE("Bpositive"),
    AB("AB"),
    @XmlEnumValue("ZeroNegative")
    ZERO_NEGATIVE("ZeroNegative"),
    @XmlEnumValue("ZeroPositive")
    ZERO_POSITIVE("ZeroPositive");
    private final String value;

    BloodGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BloodGroup fromValue(String v) {
        for (BloodGroup c: BloodGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
