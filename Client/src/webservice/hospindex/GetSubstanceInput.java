/**
 * GetSubstanceInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class GetSubstanceInput  implements java.io.Serializable {
    private java.lang.String INDEX;

    private java.lang.String KEYTYPE;

    private java.lang.String KEY;

    public GetSubstanceInput() {
    }

    public GetSubstanceInput(
           java.lang.String INDEX,
           java.lang.String KEYTYPE,
           java.lang.String KEY) {
           this.INDEX = INDEX;
           this.KEYTYPE = KEYTYPE;
           this.KEY = KEY;
    }


    /**
     * Gets the INDEX value for this GetSubstanceInput.
     * 
     * @return INDEX
     */
    public java.lang.String getINDEX() {
        return INDEX;
    }


    /**
     * Sets the INDEX value for this GetSubstanceInput.
     * 
     * @param INDEX
     */
    public void setINDEX(java.lang.String INDEX) {
        this.INDEX = INDEX;
    }


    /**
     * Gets the KEYTYPE value for this GetSubstanceInput.
     * 
     * @return KEYTYPE
     */
    public java.lang.String getKEYTYPE() {
        return KEYTYPE;
    }


    /**
     * Sets the KEYTYPE value for this GetSubstanceInput.
     * 
     * @param KEYTYPE
     */
    public void setKEYTYPE(java.lang.String KEYTYPE) {
        this.KEYTYPE = KEYTYPE;
    }


    /**
     * Gets the KEY value for this GetSubstanceInput.
     * 
     * @return KEY
     */
    public java.lang.String getKEY() {
        return KEY;
    }


    /**
     * Sets the KEY value for this GetSubstanceInput.
     * 
     * @param KEY
     */
    public void setKEY(java.lang.String KEY) {
        this.KEY = KEY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubstanceInput)) return false;
        GetSubstanceInput other = (GetSubstanceInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.INDEX==null && other.getINDEX()==null) || 
             (this.INDEX!=null &&
              this.INDEX.equals(other.getINDEX()))) &&
            ((this.KEYTYPE==null && other.getKEYTYPE()==null) || 
             (this.KEYTYPE!=null &&
              this.KEYTYPE.equals(other.getKEYTYPE()))) &&
            ((this.KEY==null && other.getKEY()==null) || 
             (this.KEY!=null &&
              this.KEY.equals(other.getKEY())));
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
        if (getINDEX() != null) {
            _hashCode += getINDEX().hashCode();
        }
        if (getKEYTYPE() != null) {
            _hashCode += getKEYTYPE().hashCode();
        }
        if (getKEY() != null) {
            _hashCode += getKEY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubstanceInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetSubstanceInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDEX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "INDEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEYTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "KEYTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "KEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
