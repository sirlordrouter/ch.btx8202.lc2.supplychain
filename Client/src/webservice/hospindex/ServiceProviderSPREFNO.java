/**
 * ServiceProviderSPREFNO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ServiceProviderSPREFNO  implements java.io.Serializable {
    private java.lang.String CODE;

    private java.lang.String VALUE;

    private java.lang.String NOTE;

    public ServiceProviderSPREFNO() {
    }

    public ServiceProviderSPREFNO(
           java.lang.String CODE,
           java.lang.String VALUE,
           java.lang.String NOTE) {
           this.CODE = CODE;
           this.VALUE = VALUE;
           this.NOTE = NOTE;
    }


    /**
     * Gets the CODE value for this ServiceProviderSPREFNO.
     * 
     * @return CODE
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this ServiceProviderSPREFNO.
     * 
     * @param CODE
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }


    /**
     * Gets the VALUE value for this ServiceProviderSPREFNO.
     * 
     * @return VALUE
     */
    public java.lang.String getVALUE() {
        return VALUE;
    }


    /**
     * Sets the VALUE value for this ServiceProviderSPREFNO.
     * 
     * @param VALUE
     */
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }


    /**
     * Gets the NOTE value for this ServiceProviderSPREFNO.
     * 
     * @return NOTE
     */
    public java.lang.String getNOTE() {
        return NOTE;
    }


    /**
     * Sets the NOTE value for this ServiceProviderSPREFNO.
     * 
     * @param NOTE
     */
    public void setNOTE(java.lang.String NOTE) {
        this.NOTE = NOTE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviderSPREFNO)) return false;
        ServiceProviderSPREFNO other = (ServiceProviderSPREFNO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE()))) &&
            ((this.VALUE==null && other.getVALUE()==null) || 
             (this.VALUE!=null &&
              this.VALUE.equals(other.getVALUE()))) &&
            ((this.NOTE==null && other.getNOTE()==null) || 
             (this.NOTE!=null &&
              this.NOTE.equals(other.getNOTE())));
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
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        if (getVALUE() != null) {
            _hashCode += getVALUE().hashCode();
        }
        if (getNOTE() != null) {
            _hashCode += getNOTE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceProviderSPREFNO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>REFNO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NOTE"));
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
