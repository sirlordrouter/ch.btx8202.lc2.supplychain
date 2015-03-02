/**
 * ServiceProviderSPADDRADDR_COM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ServiceProviderSPADDRADDR_COM  implements java.io.Serializable {
    private webservice.hospindex.ServiceProviderSPADDRADDR_COMCAT CAT;

    private webservice.hospindex.ServiceProviderSPADDRADDR_COMTYPE TYPE;

    private java.lang.String PRECOUNTR;

    private java.lang.String PREFIX;

    private java.lang.String NO;

    public ServiceProviderSPADDRADDR_COM() {
    }

    public ServiceProviderSPADDRADDR_COM(
           webservice.hospindex.ServiceProviderSPADDRADDR_COMCAT CAT,
           webservice.hospindex.ServiceProviderSPADDRADDR_COMTYPE TYPE,
           java.lang.String PRECOUNTR,
           java.lang.String PREFIX,
           java.lang.String NO) {
           this.CAT = CAT;
           this.TYPE = TYPE;
           this.PRECOUNTR = PRECOUNTR;
           this.PREFIX = PREFIX;
           this.NO = NO;
    }


    /**
     * Gets the CAT value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @return CAT
     */
    public webservice.hospindex.ServiceProviderSPADDRADDR_COMCAT getCAT() {
        return CAT;
    }


    /**
     * Sets the CAT value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @param CAT
     */
    public void setCAT(webservice.hospindex.ServiceProviderSPADDRADDR_COMCAT CAT) {
        this.CAT = CAT;
    }


    /**
     * Gets the TYPE value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @return TYPE
     */
    public webservice.hospindex.ServiceProviderSPADDRADDR_COMTYPE getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @param TYPE
     */
    public void setTYPE(webservice.hospindex.ServiceProviderSPADDRADDR_COMTYPE TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the PRECOUNTR value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @return PRECOUNTR
     */
    public java.lang.String getPRECOUNTR() {
        return PRECOUNTR;
    }


    /**
     * Sets the PRECOUNTR value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @param PRECOUNTR
     */
    public void setPRECOUNTR(java.lang.String PRECOUNTR) {
        this.PRECOUNTR = PRECOUNTR;
    }


    /**
     * Gets the PREFIX value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @return PREFIX
     */
    public java.lang.String getPREFIX() {
        return PREFIX;
    }


    /**
     * Sets the PREFIX value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @param PREFIX
     */
    public void setPREFIX(java.lang.String PREFIX) {
        this.PREFIX = PREFIX;
    }


    /**
     * Gets the NO value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @return NO
     */
    public java.lang.String getNO() {
        return NO;
    }


    /**
     * Sets the NO value for this ServiceProviderSPADDRADDR_COM.
     * 
     * @param NO
     */
    public void setNO(java.lang.String NO) {
        this.NO = NO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviderSPADDRADDR_COM)) return false;
        ServiceProviderSPADDRADDR_COM other = (ServiceProviderSPADDRADDR_COM) obj;
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
            ((this.PRECOUNTR==null && other.getPRECOUNTR()==null) || 
             (this.PRECOUNTR!=null &&
              this.PRECOUNTR.equals(other.getPRECOUNTR()))) &&
            ((this.PREFIX==null && other.getPREFIX()==null) || 
             (this.PREFIX!=null &&
              this.PREFIX.equals(other.getPREFIX()))) &&
            ((this.NO==null && other.getNO()==null) || 
             (this.NO!=null &&
              this.NO.equals(other.getNO())));
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
        if (getPRECOUNTR() != null) {
            _hashCode += getPRECOUNTR().hashCode();
        }
        if (getPREFIX() != null) {
            _hashCode += getPREFIX().hashCode();
        }
        if (getNO() != null) {
            _hashCode += getNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceProviderSPADDRADDR_COM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>ADDR_COM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_COM>CAT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_COM>TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRECOUNTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRECOUNTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PREFIX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PREFIX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NO"));
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
