/**
 * ServiceProviderSPNDA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ServiceProviderSPNDA  implements java.io.Serializable {
    private java.lang.String STATE;

    private java.lang.String NDATYPE;

    public ServiceProviderSPNDA() {
    }

    public ServiceProviderSPNDA(
           java.lang.String STATE,
           java.lang.String NDATYPE) {
           this.STATE = STATE;
           this.NDATYPE = NDATYPE;
    }


    /**
     * Gets the STATE value for this ServiceProviderSPNDA.
     * 
     * @return STATE
     */
    public java.lang.String getSTATE() {
        return STATE;
    }


    /**
     * Sets the STATE value for this ServiceProviderSPNDA.
     * 
     * @param STATE
     */
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }


    /**
     * Gets the NDATYPE value for this ServiceProviderSPNDA.
     * 
     * @return NDATYPE
     */
    public java.lang.String getNDATYPE() {
        return NDATYPE;
    }


    /**
     * Sets the NDATYPE value for this ServiceProviderSPNDA.
     * 
     * @param NDATYPE
     */
    public void setNDATYPE(java.lang.String NDATYPE) {
        this.NDATYPE = NDATYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviderSPNDA)) return false;
        ServiceProviderSPNDA other = (ServiceProviderSPNDA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.STATE==null && other.getSTATE()==null) || 
             (this.STATE!=null &&
              this.STATE.equals(other.getSTATE()))) &&
            ((this.NDATYPE==null && other.getNDATYPE()==null) || 
             (this.NDATYPE!=null &&
              this.NDATYPE.equals(other.getNDATYPE())));
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
        if (getSTATE() != null) {
            _hashCode += getSTATE().hashCode();
        }
        if (getNDATYPE() != null) {
            _hashCode += getNDATYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceProviderSPNDA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>NDA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NDATYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NDATYPE"));
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
