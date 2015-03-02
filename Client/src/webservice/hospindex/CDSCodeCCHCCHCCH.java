/**
 * CDSCodeCCHCCHCCH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCodeCCHCCHCCH  implements java.io.Serializable {
    private int LNO;

    private int CCHKEY2;

    private java.lang.String RTYP;

    private java.lang.String REMD;

    private java.lang.String REMF;

    public CDSCodeCCHCCHCCH() {
    }

    public CDSCodeCCHCCHCCH(
           int LNO,
           int CCHKEY2,
           java.lang.String RTYP,
           java.lang.String REMD,
           java.lang.String REMF) {
           this.LNO = LNO;
           this.CCHKEY2 = CCHKEY2;
           this.RTYP = RTYP;
           this.REMD = REMD;
           this.REMF = REMF;
    }


    /**
     * Gets the LNO value for this CDSCodeCCHCCHCCH.
     * 
     * @return LNO
     */
    public int getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this CDSCodeCCHCCHCCH.
     * 
     * @param LNO
     */
    public void setLNO(int LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the CCHKEY2 value for this CDSCodeCCHCCHCCH.
     * 
     * @return CCHKEY2
     */
    public int getCCHKEY2() {
        return CCHKEY2;
    }


    /**
     * Sets the CCHKEY2 value for this CDSCodeCCHCCHCCH.
     * 
     * @param CCHKEY2
     */
    public void setCCHKEY2(int CCHKEY2) {
        this.CCHKEY2 = CCHKEY2;
    }


    /**
     * Gets the RTYP value for this CDSCodeCCHCCHCCH.
     * 
     * @return RTYP
     */
    public java.lang.String getRTYP() {
        return RTYP;
    }


    /**
     * Sets the RTYP value for this CDSCodeCCHCCHCCH.
     * 
     * @param RTYP
     */
    public void setRTYP(java.lang.String RTYP) {
        this.RTYP = RTYP;
    }


    /**
     * Gets the REMD value for this CDSCodeCCHCCHCCH.
     * 
     * @return REMD
     */
    public java.lang.String getREMD() {
        return REMD;
    }


    /**
     * Sets the REMD value for this CDSCodeCCHCCHCCH.
     * 
     * @param REMD
     */
    public void setREMD(java.lang.String REMD) {
        this.REMD = REMD;
    }


    /**
     * Gets the REMF value for this CDSCodeCCHCCHCCH.
     * 
     * @return REMF
     */
    public java.lang.String getREMF() {
        return REMF;
    }


    /**
     * Sets the REMF value for this CDSCodeCCHCCHCCH.
     * 
     * @param REMF
     */
    public void setREMF(java.lang.String REMF) {
        this.REMF = REMF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCodeCCHCCHCCH)) return false;
        CDSCodeCCHCCHCCH other = (CDSCodeCCHCCHCCH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.LNO == other.getLNO() &&
            this.CCHKEY2 == other.getCCHKEY2() &&
            ((this.RTYP==null && other.getRTYP()==null) || 
             (this.RTYP!=null &&
              this.RTYP.equals(other.getRTYP()))) &&
            ((this.REMD==null && other.getREMD()==null) || 
             (this.REMD!=null &&
              this.REMD.equals(other.getREMD()))) &&
            ((this.REMF==null && other.getREMF()==null) || 
             (this.REMF!=null &&
              this.REMF.equals(other.getREMF())));
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
        _hashCode += getLNO();
        _hashCode += getCCHKEY2();
        if (getRTYP() != null) {
            _hashCode += getRTYP().hashCode();
        }
        if (getREMD() != null) {
            _hashCode += getREMD().hashCode();
        }
        if (getREMF() != null) {
            _hashCode += getREMF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSCodeCCHCCHCCH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSCode>CCH>CCHCCH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCHKEY2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CCHKEY2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REMF"));
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
