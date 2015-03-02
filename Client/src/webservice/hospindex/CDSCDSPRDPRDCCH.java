/**
 * CDSCDSPRDPRDCCH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCDSPRDPRDCCH  implements java.io.Serializable {
    private int LNO;

    private int CCHKEY;

    private java.lang.String CCHTYP;

    private int RLV;

    private java.lang.String MEASCD;

    private java.lang.String REMD;

    private java.lang.String REMF;

    private java.lang.String REME;

    private java.lang.String DATASC;

    private webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP[] CCHDSP;

    public CDSCDSPRDPRDCCH() {
    }

    public CDSCDSPRDPRDCCH(
           int LNO,
           int CCHKEY,
           java.lang.String CCHTYP,
           int RLV,
           java.lang.String MEASCD,
           java.lang.String REMD,
           java.lang.String REMF,
           java.lang.String REME,
           java.lang.String DATASC,
           webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP[] CCHDSP) {
           this.LNO = LNO;
           this.CCHKEY = CCHKEY;
           this.CCHTYP = CCHTYP;
           this.RLV = RLV;
           this.MEASCD = MEASCD;
           this.REMD = REMD;
           this.REMF = REMF;
           this.REME = REME;
           this.DATASC = DATASC;
           this.CCHDSP = CCHDSP;
    }


    /**
     * Gets the LNO value for this CDSCDSPRDPRDCCH.
     * 
     * @return LNO
     */
    public int getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this CDSCDSPRDPRDCCH.
     * 
     * @param LNO
     */
    public void setLNO(int LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the CCHKEY value for this CDSCDSPRDPRDCCH.
     * 
     * @return CCHKEY
     */
    public int getCCHKEY() {
        return CCHKEY;
    }


    /**
     * Sets the CCHKEY value for this CDSCDSPRDPRDCCH.
     * 
     * @param CCHKEY
     */
    public void setCCHKEY(int CCHKEY) {
        this.CCHKEY = CCHKEY;
    }


    /**
     * Gets the CCHTYP value for this CDSCDSPRDPRDCCH.
     * 
     * @return CCHTYP
     */
    public java.lang.String getCCHTYP() {
        return CCHTYP;
    }


    /**
     * Sets the CCHTYP value for this CDSCDSPRDPRDCCH.
     * 
     * @param CCHTYP
     */
    public void setCCHTYP(java.lang.String CCHTYP) {
        this.CCHTYP = CCHTYP;
    }


    /**
     * Gets the RLV value for this CDSCDSPRDPRDCCH.
     * 
     * @return RLV
     */
    public int getRLV() {
        return RLV;
    }


    /**
     * Sets the RLV value for this CDSCDSPRDPRDCCH.
     * 
     * @param RLV
     */
    public void setRLV(int RLV) {
        this.RLV = RLV;
    }


    /**
     * Gets the MEASCD value for this CDSCDSPRDPRDCCH.
     * 
     * @return MEASCD
     */
    public java.lang.String getMEASCD() {
        return MEASCD;
    }


    /**
     * Sets the MEASCD value for this CDSCDSPRDPRDCCH.
     * 
     * @param MEASCD
     */
    public void setMEASCD(java.lang.String MEASCD) {
        this.MEASCD = MEASCD;
    }


    /**
     * Gets the REMD value for this CDSCDSPRDPRDCCH.
     * 
     * @return REMD
     */
    public java.lang.String getREMD() {
        return REMD;
    }


    /**
     * Sets the REMD value for this CDSCDSPRDPRDCCH.
     * 
     * @param REMD
     */
    public void setREMD(java.lang.String REMD) {
        this.REMD = REMD;
    }


    /**
     * Gets the REMF value for this CDSCDSPRDPRDCCH.
     * 
     * @return REMF
     */
    public java.lang.String getREMF() {
        return REMF;
    }


    /**
     * Sets the REMF value for this CDSCDSPRDPRDCCH.
     * 
     * @param REMF
     */
    public void setREMF(java.lang.String REMF) {
        this.REMF = REMF;
    }


    /**
     * Gets the REME value for this CDSCDSPRDPRDCCH.
     * 
     * @return REME
     */
    public java.lang.String getREME() {
        return REME;
    }


    /**
     * Sets the REME value for this CDSCDSPRDPRDCCH.
     * 
     * @param REME
     */
    public void setREME(java.lang.String REME) {
        this.REME = REME;
    }


    /**
     * Gets the DATASC value for this CDSCDSPRDPRDCCH.
     * 
     * @return DATASC
     */
    public java.lang.String getDATASC() {
        return DATASC;
    }


    /**
     * Sets the DATASC value for this CDSCDSPRDPRDCCH.
     * 
     * @param DATASC
     */
    public void setDATASC(java.lang.String DATASC) {
        this.DATASC = DATASC;
    }


    /**
     * Gets the CCHDSP value for this CDSCDSPRDPRDCCH.
     * 
     * @return CCHDSP
     */
    public webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP[] getCCHDSP() {
        return CCHDSP;
    }


    /**
     * Sets the CCHDSP value for this CDSCDSPRDPRDCCH.
     * 
     * @param CCHDSP
     */
    public void setCCHDSP(webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP[] CCHDSP) {
        this.CCHDSP = CCHDSP;
    }

    public webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP getCCHDSP(int i) {
        return this.CCHDSP[i];
    }

    public void setCCHDSP(int i, webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP _value) {
        this.CCHDSP[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCDSPRDPRDCCH)) return false;
        CDSCDSPRDPRDCCH other = (CDSCDSPRDPRDCCH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.LNO == other.getLNO() &&
            this.CCHKEY == other.getCCHKEY() &&
            ((this.CCHTYP==null && other.getCCHTYP()==null) || 
             (this.CCHTYP!=null &&
              this.CCHTYP.equals(other.getCCHTYP()))) &&
            this.RLV == other.getRLV() &&
            ((this.MEASCD==null && other.getMEASCD()==null) || 
             (this.MEASCD!=null &&
              this.MEASCD.equals(other.getMEASCD()))) &&
            ((this.REMD==null && other.getREMD()==null) || 
             (this.REMD!=null &&
              this.REMD.equals(other.getREMD()))) &&
            ((this.REMF==null && other.getREMF()==null) || 
             (this.REMF!=null &&
              this.REMF.equals(other.getREMF()))) &&
            ((this.REME==null && other.getREME()==null) || 
             (this.REME!=null &&
              this.REME.equals(other.getREME()))) &&
            ((this.DATASC==null && other.getDATASC()==null) || 
             (this.DATASC!=null &&
              this.DATASC.equals(other.getDATASC()))) &&
            ((this.CCHDSP==null && other.getCCHDSP()==null) || 
             (this.CCHDSP!=null &&
              java.util.Arrays.equals(this.CCHDSP, other.getCCHDSP())));
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
        _hashCode += getCCHKEY();
        if (getCCHTYP() != null) {
            _hashCode += getCCHTYP().hashCode();
        }
        _hashCode += getRLV();
        if (getMEASCD() != null) {
            _hashCode += getMEASCD().hashCode();
        }
        if (getREMD() != null) {
            _hashCode += getREMD().hashCode();
        }
        if (getREMF() != null) {
            _hashCode += getREMF().hashCode();
        }
        if (getREME() != null) {
            _hashCode += getREME().hashCode();
        }
        if (getDATASC() != null) {
            _hashCode += getDATASC().hashCode();
        }
        if (getCCHDSP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCCHDSP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCCHDSP(), i);
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
        new org.apache.axis.description.TypeDesc(CDSCDSPRDPRDCCH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDCCH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCHKEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CCHKEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCHTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CCHTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RLV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RLV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEASCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MEASCD"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATASC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DATASC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCHDSP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CCHDSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDCCH>CCHDSP"));
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
