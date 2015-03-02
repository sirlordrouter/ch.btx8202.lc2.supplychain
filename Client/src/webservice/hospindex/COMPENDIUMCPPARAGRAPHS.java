/**
 * COMPENDIUMCPPARAGRAPHS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class COMPENDIUMCPPARAGRAPHS  implements java.io.Serializable {
    private webservice.hospindex.COMPENDIUMCPPARAGRAPHSTITLE TITLE;

    private int ID;  // attribute

    public COMPENDIUMCPPARAGRAPHS() {
    }

    public COMPENDIUMCPPARAGRAPHS(
           webservice.hospindex.COMPENDIUMCPPARAGRAPHSTITLE TITLE,
           int ID) {
           this.TITLE = TITLE;
           this.ID = ID;
    }


    /**
     * Gets the TITLE value for this COMPENDIUMCPPARAGRAPHS.
     * 
     * @return TITLE
     */
    public webservice.hospindex.COMPENDIUMCPPARAGRAPHSTITLE getTITLE() {
        return TITLE;
    }


    /**
     * Sets the TITLE value for this COMPENDIUMCPPARAGRAPHS.
     * 
     * @param TITLE
     */
    public void setTITLE(webservice.hospindex.COMPENDIUMCPPARAGRAPHSTITLE TITLE) {
        this.TITLE = TITLE;
    }


    /**
     * Gets the ID value for this COMPENDIUMCPPARAGRAPHS.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this COMPENDIUMCPPARAGRAPHS.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COMPENDIUMCPPARAGRAPHS)) return false;
        COMPENDIUMCPPARAGRAPHS other = (COMPENDIUMCPPARAGRAPHS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TITLE==null && other.getTITLE()==null) || 
             (this.TITLE!=null &&
              this.TITLE.equals(other.getTITLE()))) &&
            this.ID == other.getID();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTITLE() != null) {
            _hashCode += getTITLE().hashCode();
        }
        _hashCode += getID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COMPENDIUMCPPARAGRAPHS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>PARAGRAPHS"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>COMPENDIUM>CP>PARAGRAPHS>TITLE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
