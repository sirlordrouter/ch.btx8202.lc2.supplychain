/**
 * CDSCDSPRDPRDCCHCCHDSP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCDSPRDPRDCCHCCHDSP  implements java.io.Serializable {
    private int DSPLNO;

    private int DSPNO;

    private java.lang.String DSPLG;

    private java.lang.String REMD;

    private java.lang.String REMF;

    private java.lang.String REME;

    public CDSCDSPRDPRDCCHCCHDSP() {
    }

    public CDSCDSPRDPRDCCHCCHDSP(
           int DSPLNO,
           int DSPNO,
           java.lang.String DSPLG,
           java.lang.String REMD,
           java.lang.String REMF,
           java.lang.String REME) {
           this.DSPLNO = DSPLNO;
           this.DSPNO = DSPNO;
           this.DSPLG = DSPLG;
           this.REMD = REMD;
           this.REMF = REMF;
           this.REME = REME;
    }


    /**
     * Gets the DSPLNO value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @return DSPLNO
     */
    public int getDSPLNO() {
        return DSPLNO;
    }


    /**
     * Sets the DSPLNO value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @param DSPLNO
     */
    public void setDSPLNO(int DSPLNO) {
        this.DSPLNO = DSPLNO;
    }


    /**
     * Gets the DSPNO value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @return DSPNO
     */
    public int getDSPNO() {
        return DSPNO;
    }


    /**
     * Sets the DSPNO value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @param DSPNO
     */
    public void setDSPNO(int DSPNO) {
        this.DSPNO = DSPNO;
    }


    /**
     * Gets the DSPLG value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @return DSPLG
     */
    public java.lang.String getDSPLG() {
        return DSPLG;
    }


    /**
     * Sets the DSPLG value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @param DSPLG
     */
    public void setDSPLG(java.lang.String DSPLG) {
        this.DSPLG = DSPLG;
    }


    /**
     * Gets the REMD value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @return REMD
     */
    public java.lang.String getREMD() {
        return REMD;
    }


    /**
     * Sets the REMD value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @param REMD
     */
    public void setREMD(java.lang.String REMD) {
        this.REMD = REMD;
    }


    /**
     * Gets the REMF value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @return REMF
     */
    public java.lang.String getREMF() {
        return REMF;
    }


    /**
     * Sets the REMF value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @param REMF
     */
    public void setREMF(java.lang.String REMF) {
        this.REMF = REMF;
    }


    /**
     * Gets the REME value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @return REME
     */
    public java.lang.String getREME() {
        return REME;
    }


    /**
     * Sets the REME value for this CDSCDSPRDPRDCCHCCHDSP.
     * 
     * @param REME
     */
    public void setREME(java.lang.String REME) {
        this.REME = REME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCDSPRDPRDCCHCCHDSP)) return false;
        CDSCDSPRDPRDCCHCCHDSP other = (CDSCDSPRDPRDCCHCCHDSP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.DSPLNO == other.getDSPLNO() &&
            this.DSPNO == other.getDSPNO() &&
            ((this.DSPLG==null && other.getDSPLG()==null) || 
             (this.DSPLG!=null &&
              this.DSPLG.equals(other.getDSPLG()))) &&
            ((this.REMD==null && other.getREMD()==null) || 
             (this.REMD!=null &&
              this.REMD.equals(other.getREMD()))) &&
            ((this.REMF==null && other.getREMF()==null) || 
             (this.REMF!=null &&
              this.REMF.equals(other.getREMF()))) &&
            ((this.REME==null && other.getREME()==null) || 
             (this.REME!=null &&
              this.REME.equals(other.getREME())));
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
        _hashCode += getDSPLNO();
        _hashCode += getDSPNO();
        if (getDSPLG() != null) {
            _hashCode += getDSPLG().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSCDSPRDPRDCCHCCHDSP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDCCH>CCHDSP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPLG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPLG"));
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
