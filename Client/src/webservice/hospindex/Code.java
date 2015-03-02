/**
 * Code.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Code  implements java.io.Serializable {
    private webservice.hospindex.CodeCD[] CD;

    private webservice.hospindex.CodeRESULT RESULT;

    private java.util.Calendar CREATION_DATETIME;  // attribute

    private java.util.Calendar PROD_DATE;  // attribute

    private java.util.Calendar VALID_DATE;  // attribute

    private java.lang.String schemaLocation;  // attribute

    public Code() {
    }

    public Code(
           webservice.hospindex.CodeCD[] CD,
           webservice.hospindex.CodeRESULT RESULT,
           java.util.Calendar CREATION_DATETIME,
           java.util.Calendar PROD_DATE,
           java.util.Calendar VALID_DATE,
           java.lang.String schemaLocation) {
           this.CD = CD;
           this.RESULT = RESULT;
           this.CREATION_DATETIME = CREATION_DATETIME;
           this.PROD_DATE = PROD_DATE;
           this.VALID_DATE = VALID_DATE;
           this.schemaLocation = schemaLocation;
    }


    /**
     * Gets the CD value for this Code.
     * 
     * @return CD
     */
    public webservice.hospindex.CodeCD[] getCD() {
        return CD;
    }


    /**
     * Sets the CD value for this Code.
     * 
     * @param CD
     */
    public void setCD(webservice.hospindex.CodeCD[] CD) {
        this.CD = CD;
    }

    public webservice.hospindex.CodeCD getCD(int i) {
        return this.CD[i];
    }

    public void setCD(int i, webservice.hospindex.CodeCD _value) {
        this.CD[i] = _value;
    }


    /**
     * Gets the RESULT value for this Code.
     * 
     * @return RESULT
     */
    public webservice.hospindex.CodeRESULT getRESULT() {
        return RESULT;
    }


    /**
     * Sets the RESULT value for this Code.
     * 
     * @param RESULT
     */
    public void setRESULT(webservice.hospindex.CodeRESULT RESULT) {
        this.RESULT = RESULT;
    }


    /**
     * Gets the CREATION_DATETIME value for this Code.
     * 
     * @return CREATION_DATETIME
     */
    public java.util.Calendar getCREATION_DATETIME() {
        return CREATION_DATETIME;
    }


    /**
     * Sets the CREATION_DATETIME value for this Code.
     * 
     * @param CREATION_DATETIME
     */
    public void setCREATION_DATETIME(java.util.Calendar CREATION_DATETIME) {
        this.CREATION_DATETIME = CREATION_DATETIME;
    }


    /**
     * Gets the PROD_DATE value for this Code.
     * 
     * @return PROD_DATE
     */
    public java.util.Calendar getPROD_DATE() {
        return PROD_DATE;
    }


    /**
     * Sets the PROD_DATE value for this Code.
     * 
     * @param PROD_DATE
     */
    public void setPROD_DATE(java.util.Calendar PROD_DATE) {
        this.PROD_DATE = PROD_DATE;
    }


    /**
     * Gets the VALID_DATE value for this Code.
     * 
     * @return VALID_DATE
     */
    public java.util.Calendar getVALID_DATE() {
        return VALID_DATE;
    }


    /**
     * Sets the VALID_DATE value for this Code.
     * 
     * @param VALID_DATE
     */
    public void setVALID_DATE(java.util.Calendar VALID_DATE) {
        this.VALID_DATE = VALID_DATE;
    }


    /**
     * Gets the schemaLocation value for this Code.
     * 
     * @return schemaLocation
     */
    public java.lang.String getSchemaLocation() {
        return schemaLocation;
    }


    /**
     * Sets the schemaLocation value for this Code.
     * 
     * @param schemaLocation
     */
    public void setSchemaLocation(java.lang.String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Code)) return false;
        Code other = (Code) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CD==null && other.getCD()==null) || 
             (this.CD!=null &&
              java.util.Arrays.equals(this.CD, other.getCD()))) &&
            ((this.RESULT==null && other.getRESULT()==null) || 
             (this.RESULT!=null &&
              this.RESULT.equals(other.getRESULT()))) &&
            ((this.CREATION_DATETIME==null && other.getCREATION_DATETIME()==null) || 
             (this.CREATION_DATETIME!=null &&
              this.CREATION_DATETIME.equals(other.getCREATION_DATETIME()))) &&
            ((this.PROD_DATE==null && other.getPROD_DATE()==null) || 
             (this.PROD_DATE!=null &&
              this.PROD_DATE.equals(other.getPROD_DATE()))) &&
            ((this.VALID_DATE==null && other.getVALID_DATE()==null) || 
             (this.VALID_DATE!=null &&
              this.VALID_DATE.equals(other.getVALID_DATE()))) &&
            ((this.schemaLocation==null && other.getSchemaLocation()==null) || 
             (this.schemaLocation!=null &&
              this.schemaLocation.equals(other.getSchemaLocation())));
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
        if (getCD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRESULT() != null) {
            _hashCode += getRESULT().hashCode();
        }
        if (getCREATION_DATETIME() != null) {
            _hashCode += getCREATION_DATETIME().hashCode();
        }
        if (getPROD_DATE() != null) {
            _hashCode += getPROD_DATE().hashCode();
        }
        if (getVALID_DATE() != null) {
            _hashCode += getVALID_DATE().hashCode();
        }
        if (getSchemaLocation() != null) {
            _hashCode += getSchemaLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Code.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Code"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("CREATION_DATETIME");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CREATION_DATETIME"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PROD_DATE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PROD_DATE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("VALID_DATE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VALID_DATE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemaLocation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemaLocation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Code>CD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RESULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Code>RESULT"));
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
