/**
 * InsuranceINSADDR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class InsuranceINSADDR  implements java.io.Serializable {
    private webservice.hospindex.InsuranceINSADDRTYPE TYPE;

    private java.lang.String COUNTRY;

    private java.lang.String STATE;

    private java.lang.String ZIP;

    private java.lang.String CITY;

    private java.lang.String STREET;

    private java.lang.String STRNO;

    private java.lang.String POBOX;

    public InsuranceINSADDR() {
    }

    public InsuranceINSADDR(
           webservice.hospindex.InsuranceINSADDRTYPE TYPE,
           java.lang.String COUNTRY,
           java.lang.String STATE,
           java.lang.String ZIP,
           java.lang.String CITY,
           java.lang.String STREET,
           java.lang.String STRNO,
           java.lang.String POBOX) {
           this.TYPE = TYPE;
           this.COUNTRY = COUNTRY;
           this.STATE = STATE;
           this.ZIP = ZIP;
           this.CITY = CITY;
           this.STREET = STREET;
           this.STRNO = STRNO;
           this.POBOX = POBOX;
    }


    /**
     * Gets the TYPE value for this InsuranceINSADDR.
     * 
     * @return TYPE
     */
    public webservice.hospindex.InsuranceINSADDRTYPE getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this InsuranceINSADDR.
     * 
     * @param TYPE
     */
    public void setTYPE(webservice.hospindex.InsuranceINSADDRTYPE TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the COUNTRY value for this InsuranceINSADDR.
     * 
     * @return COUNTRY
     */
    public java.lang.String getCOUNTRY() {
        return COUNTRY;
    }


    /**
     * Sets the COUNTRY value for this InsuranceINSADDR.
     * 
     * @param COUNTRY
     */
    public void setCOUNTRY(java.lang.String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }


    /**
     * Gets the STATE value for this InsuranceINSADDR.
     * 
     * @return STATE
     */
    public java.lang.String getSTATE() {
        return STATE;
    }


    /**
     * Sets the STATE value for this InsuranceINSADDR.
     * 
     * @param STATE
     */
    public void setSTATE(java.lang.String STATE) {
        this.STATE = STATE;
    }


    /**
     * Gets the ZIP value for this InsuranceINSADDR.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this InsuranceINSADDR.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }


    /**
     * Gets the CITY value for this InsuranceINSADDR.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this InsuranceINSADDR.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }


    /**
     * Gets the STREET value for this InsuranceINSADDR.
     * 
     * @return STREET
     */
    public java.lang.String getSTREET() {
        return STREET;
    }


    /**
     * Sets the STREET value for this InsuranceINSADDR.
     * 
     * @param STREET
     */
    public void setSTREET(java.lang.String STREET) {
        this.STREET = STREET;
    }


    /**
     * Gets the STRNO value for this InsuranceINSADDR.
     * 
     * @return STRNO
     */
    public java.lang.String getSTRNO() {
        return STRNO;
    }


    /**
     * Sets the STRNO value for this InsuranceINSADDR.
     * 
     * @param STRNO
     */
    public void setSTRNO(java.lang.String STRNO) {
        this.STRNO = STRNO;
    }


    /**
     * Gets the POBOX value for this InsuranceINSADDR.
     * 
     * @return POBOX
     */
    public java.lang.String getPOBOX() {
        return POBOX;
    }


    /**
     * Sets the POBOX value for this InsuranceINSADDR.
     * 
     * @param POBOX
     */
    public void setPOBOX(java.lang.String POBOX) {
        this.POBOX = POBOX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuranceINSADDR)) return false;
        InsuranceINSADDR other = (InsuranceINSADDR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.COUNTRY==null && other.getCOUNTRY()==null) || 
             (this.COUNTRY!=null &&
              this.COUNTRY.equals(other.getCOUNTRY()))) &&
            ((this.STATE==null && other.getSTATE()==null) || 
             (this.STATE!=null &&
              this.STATE.equals(other.getSTATE()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              this.CITY.equals(other.getCITY()))) &&
            ((this.STREET==null && other.getSTREET()==null) || 
             (this.STREET!=null &&
              this.STREET.equals(other.getSTREET()))) &&
            ((this.STRNO==null && other.getSTRNO()==null) || 
             (this.STRNO!=null &&
              this.STRNO.equals(other.getSTRNO()))) &&
            ((this.POBOX==null && other.getPOBOX()==null) || 
             (this.POBOX!=null &&
              this.POBOX.equals(other.getPOBOX())));
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
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getCOUNTRY() != null) {
            _hashCode += getCOUNTRY().hashCode();
        }
        if (getSTATE() != null) {
            _hashCode += getSTATE().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        if (getCITY() != null) {
            _hashCode += getCITY().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsuranceINSADDR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>ADDR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>ADDR>TYPE"));
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
        elemField.setFieldName("STATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STATE"));
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
