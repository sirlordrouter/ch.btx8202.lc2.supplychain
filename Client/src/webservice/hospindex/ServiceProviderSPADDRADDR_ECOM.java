/**
 * ServiceProviderSPADDRADDR_ECOM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ServiceProviderSPADDRADDR_ECOM  implements java.io.Serializable {
    private webservice.hospindex.ServiceProviderSPADDRADDR_ECOMCAT CAT;

    private webservice.hospindex.ServiceProviderSPADDRADDR_ECOMTYPE TYPE;

    private java.lang.String VALUE;

    public ServiceProviderSPADDRADDR_ECOM() {
    }

    public ServiceProviderSPADDRADDR_ECOM(
           webservice.hospindex.ServiceProviderSPADDRADDR_ECOMCAT CAT,
           webservice.hospindex.ServiceProviderSPADDRADDR_ECOMTYPE TYPE,
           java.lang.String VALUE) {
           this.CAT = CAT;
           this.TYPE = TYPE;
           this.VALUE = VALUE;
    }


    /**
     * Gets the CAT value for this ServiceProviderSPADDRADDR_ECOM.
     * 
     * @return CAT
     */
    public webservice.hospindex.ServiceProviderSPADDRADDR_ECOMCAT getCAT() {
        return CAT;
    }


    /**
     * Sets the CAT value for this ServiceProviderSPADDRADDR_ECOM.
     * 
     * @param CAT
     */
    public void setCAT(webservice.hospindex.ServiceProviderSPADDRADDR_ECOMCAT CAT) {
        this.CAT = CAT;
    }


    /**
     * Gets the TYPE value for this ServiceProviderSPADDRADDR_ECOM.
     * 
     * @return TYPE
     */
    public webservice.hospindex.ServiceProviderSPADDRADDR_ECOMTYPE getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this ServiceProviderSPADDRADDR_ECOM.
     * 
     * @param TYPE
     */
    public void setTYPE(webservice.hospindex.ServiceProviderSPADDRADDR_ECOMTYPE TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the VALUE value for this ServiceProviderSPADDRADDR_ECOM.
     * 
     * @return VALUE
     */
    public java.lang.String getVALUE() {
        return VALUE;
    }


    /**
     * Sets the VALUE value for this ServiceProviderSPADDRADDR_ECOM.
     * 
     * @param VALUE
     */
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviderSPADDRADDR_ECOM)) return false;
        ServiceProviderSPADDRADDR_ECOM other = (ServiceProviderSPADDRADDR_ECOM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CAT==null && other.getCAT()==null) || 
             (this.CAT!=null &&
              this.CAT.equals(other.getCAT()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.VALUE==null && other.getVALUE()==null) || 
             (this.VALUE!=null &&
              this.VALUE.equals(other.getVALUE())));
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
        if (getCAT() != null) {
            _hashCode += getCAT().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getVALUE() != null) {
            _hashCode += getVALUE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceProviderSPADDRADDR_ECOM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>ADDR_ECOM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_ECOM>CAT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_ECOM>TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VALUE"));
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
