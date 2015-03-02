/**
 * ServiceProviderSPADDR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ServiceProviderSPADDR  implements java.io.Serializable {
    private webservice.hospindex.ServiceProviderSPADDRCAT CAT;

    private java.lang.String APPENDIX;

    private java.lang.String STREET;

    private java.lang.String STRNO;

    private java.lang.String POBOX;

    private java.lang.String ZIP;

    private java.lang.String CITY;

    private java.lang.String STATE;

    private java.lang.String COUNTRY;

    private webservice.hospindex.ServiceProviderSPADDRADDR_COM[] ADDR_COM;

    private webservice.hospindex.ServiceProviderSPADDRADDR_ECOM[] ADDR_ECOM;

    public ServiceProviderSPADDR() {
    }

    public ServiceProviderSPADDR(
           webservice.hospindex.ServiceProviderSPADDRCAT CAT,
           java.lang.String APPENDIX,
           java.lang.String STREET,
           java.lang.String STRNO,
           java.lang.String POBOX,
           java.lang.String ZIP,
           java.lang.String CITY,
           java.lang.String STATE,
           java.lang.String COUNTRY,
           webservice.hospindex.ServiceProviderSPADDRADDR_COM[] ADDR_COM,
           webservice.hospindex.ServiceProviderSPADDRADDR_ECOM[] ADDR_ECOM) {
           this.CAT = CAT;
           this.APPENDIX = APPENDIX;
           this.STREET = STREET;
           this.STRNO = STRNO;
           this.POBOX = POBOX;
           this.ZIP = ZIP;
           this.CITY = CITY;
           this.STATE = STATE;
           this.COUNTRY = COUNTRY;
           this.ADDR_COM = ADDR_COM;
           this.ADDR_ECOM = ADDR_ECOM;
    }


    /**
     * Gets the CAT value for this ServiceProviderSPADDR.
     * 
     * @return CAT
     */
    public webservice.hospindex.ServiceProviderSPADDRCAT getCAT() {
        return CAT;
    }


    /**
     * Sets the CAT value for this ServiceProviderSPADDR.
     * 
     * @param CAT
     */
    public void setCAT(webservice.hospindex.ServiceProviderSPADDRCAT CAT) {
        this.CAT = CAT;
    }


    /**
     * Gets the APPENDIX value for this ServiceProviderSPADDR.
     * 
     * @return APPENDIX
     */
    public java.lang.String getAPPENDIX() {
        return APPENDIX;
    }


    /**
     * Sets the APPENDIX value for this ServiceProviderSPADDR.
     * 
     * @param APPENDIX
     */
    public void setAPPENDIX(java.lang.String APPENDIX) {
        this.APPENDIX = APPENDIX;
    }


    /**
     * Gets the STREET value for this ServiceProviderSPADDR.
     * 
     * @return STREET
     */
    public java.lang.String getSTREET() {
        return STREET;
    }


    /**
     * Sets the STREET value for this ServiceProviderSPADDR.
     * 
     * @param STREET
     */
    public void setSTREET(java.lang.String STREET) {
        this.STREET = STREET;
    }


    /**
     * Gets the STRNO value for this ServiceProviderSPADDR.
     * 
     * @return STRNO
     */
    public java.lang.String getSTRNO() {
        return STRNO;
    }


    /**
     * Sets the STRNO value for this ServiceProviderSPADDR.
     * 
     * @param STRNO
     */
    public void setSTRNO(java.lang.String STRNO) {
        this.STRNO = STRNO;
    }


    /**
     * Gets the POBOX value for this ServiceProviderSPADDR.
     * 
     * @return POBOX
     */
    public java.lang.String getPOBOX() {
        return POBOX;
    }


    /**
     * Sets the POBOX value for this ServiceProviderSPADDR.
     * 
     * @param POBOX
     */
    public void setPOBOX(java.lang.String POBOX) {
        this.POBOX = POBOX;
    }


    /**
     * Gets the ZIP value for this ServiceProviderSPADDR.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this ServiceProviderSPADDR.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }


    /**
     * Gets the CITY value for this ServiceProviderSPADDR.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this ServiceProviderSPADDR.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }


    /**
     * Gets the STATE value for this ServiceProviderSPADDR.
     * 
     * @return STATE
     */
    public java.lang.String getSTATE() {
        return STATE;
    }


    /**
     * Sets the STATE value for this ServiceProviderSPADDR.
     * 
     * @param STATE
     */
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }


    /**
     * Gets the COUNTRY value for this ServiceProviderSPADDR.
     * 
     * @return COUNTRY
     */
    public java.lang.String getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this ServiceProviderSPADDR.
     * 
     * @param COUNTRY
     */
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    /**
     * Gets the ADDR_COM value for this ServiceProviderSPADDR.
     * 
     * @return ADDR_COM
     */
    public webservice.hospindex.ServiceProviderSPADDRADDR_COM[] getADDR_COM() {
        return ADDR_COM;
    }


    /**
     * Sets the ADDR_COM value for this ServiceProviderSPADDR.
     * 
     * @param ADDR_COM
     */
    public void setADDR_COM(webservice.hospindex.ServiceProviderSPADDRADDR_COM[] ADDR_COM) {
        this.ADDR_COM = ADDR_COM;
    }

    public webservice.hospindex.ServiceProviderSPADDRADDR_COM getADDR_COM(int i) {
        return this.ADDR_COM[i];
    }

    public void setADDR_COM(int i, webservice.hospindex.ServiceProviderSPADDRADDR_COM _value) {
        this.ADDR_COM[i] = _value;
    }


    /**
     * Gets the ADDR_ECOM value for this ServiceProviderSPADDR.
     * 
     * @return ADDR_ECOM
     */
    public webservice.hospindex.ServiceProviderSPADDRADDR_ECOM[] getADDR_ECOM() {
        return ADDR_ECOM;
    }


    /**
     * Sets the ADDR_ECOM value for this ServiceProviderSPADDR.
     * 
     * @param ADDR_ECOM
     */
    public void setADDR_ECOM(webservice.hospindex.ServiceProviderSPADDRADDR_ECOM[] ADDR_ECOM) {
        this.ADDR_ECOM = ADDR_ECOM;
    }

    public webservice.hospindex.ServiceProviderSPADDRADDR_ECOM getADDR_ECOM(int i) {
        return this.ADDR_ECOM[i];
    }

    public void setADDR_ECOM(int i, webservice.hospindex.ServiceProviderSPADDRADDR_ECOM _value) {
        this.ADDR_ECOM[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviderSPADDR)) return false;
        ServiceProviderSPADDR other = (ServiceProviderSPADDR) obj;
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
            ((this.APPENDIX==null && other.getAPPENDIX()==null) || 
             (this.APPENDIX!=null &&
              this.APPENDIX.equals(other.getAPPENDIX()))) &&
            ((this.STREET==null && other.getSTREET()==null) || 
             (this.STREET!=null &&
              this.STREET.equals(other.getSTREET()))) &&
            ((this.STRNO==null && other.getSTRNO()==null) || 
             (this.STRNO!=null &&
              this.STRNO.equals(other.getSTRNO()))) &&
            ((this.POBOX==null && other.getPOBOX()==null) || 
             (this.POBOX!=null &&
              this.POBOX.equals(other.getPOBOX()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              this.CITY.equals(other.getCITY()))) &&
            ((this.STATE==null && other.getSTATE()==null) || 
             (this.STATE!=null &&
              this.STATE.equals(other.getSTATE()))) &&
            ((this.COUNTRY==null && other.getCOUNTRY()==null) || 
             (this.COUNTRY!=null &&
              this.COUNTRY.equals(other.getCOUNTRY()))) &&
            ((this.ADDR_COM==null && other.getADDR_COM()==null) || 
             (this.ADDR_COM!=null &&
              java.util.Arrays.equals(this.ADDR_COM, other.getADDR_COM()))) &&
            ((this.ADDR_ECOM==null && other.getADDR_ECOM()==null) || 
             (this.ADDR_ECOM!=null &&
              java.util.Arrays.equals(this.ADDR_ECOM, other.getADDR_ECOM())));
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
        if (getAPPENDIX() != null) {
            _hashCode += getAPPENDIX().hashCode();
        }
        if (getSTREET() != null) {
            _hashCode += getSTREET().hashCode();
        }
        if (getSTRNO() != null) {
            _hashCode += getSTRNO().hashCode();
        }
        if (getPOBOX() != null) {
            _hashCode += getPOBOX().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        if (getCITY() != null) {
            _hashCode += getCITY().hashCode();
        }
        if (getSTATE() != null) {
            _hashCode += getSTATE().hashCode();
        }
        if (getCOUNTRY() != null) {
            _hashCode += getCOUNTRY().hashCode();
        }
        if (getADDR_COM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDR_COM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDR_COM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getADDR_ECOM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDR_ECOM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDR_ECOM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceProviderSPADDR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>ADDR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>CAT"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APPENDIX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "APPENDIX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STREET");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STREET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STRNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STRNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POBOX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "POBOX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ZIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "COUNTRY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDR_COM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADDR_COM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>ADDR_COM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDR_ECOM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADDR_ECOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>ADDR_ECOM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
