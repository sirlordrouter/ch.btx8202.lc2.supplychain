/**
 * CDSCDSPRDPRDDSK.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCDSPRDPRDDSK  implements java.io.Serializable {
    private int CPTLNO;

    private int LNO;

    private java.lang.String NAMD;

    private java.lang.String NAMF;

    private java.lang.Integer ACTMET;

    private java.lang.Double q0;

    private java.lang.Double HVP;

    private java.lang.Double DOSINT;

    private java.lang.Integer PRODRG;

    private java.lang.String DATASC;

    private webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP[] DSKDSP;

    public CDSCDSPRDPRDDSK() {
    }

    public CDSCDSPRDPRDDSK(
           int CPTLNO,
           int LNO,
           java.lang.String NAMD,
           java.lang.String NAMF,
           java.lang.Integer ACTMET,
           java.lang.Double q0,
           java.lang.Double HVP,
           java.lang.Double DOSINT,
           java.lang.Integer PRODRG,
           java.lang.String DATASC,
           webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP[] DSKDSP) {
           this.CPTLNO = CPTLNO;
           this.LNO = LNO;
           this.NAMD = NAMD;
           this.NAMF = NAMF;
           this.ACTMET = ACTMET;
           this.q0 = q0;
           this.HVP = HVP;
           this.DOSINT = DOSINT;
           this.PRODRG = PRODRG;
           this.DATASC = DATASC;
           this.DSKDSP = DSKDSP;
    }


    /**
     * Gets the CPTLNO value for this CDSCDSPRDPRDDSK.
     * 
     * @return CPTLNO
     */
    public int getCPTLNO() {
        return CPTLNO;
    }


    /**
     * Sets the CPTLNO value for this CDSCDSPRDPRDDSK.
     * 
     * @param CPTLNO
     */
    public void setCPTLNO(int CPTLNO) {
        this.CPTLNO = CPTLNO;
    }


    /**
     * Gets the LNO value for this CDSCDSPRDPRDDSK.
     * 
     * @return LNO
     */
    public int getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this CDSCDSPRDPRDDSK.
     * 
     * @param LNO
     */
    public void setLNO(int LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the NAMD value for this CDSCDSPRDPRDDSK.
     * 
     * @return NAMD
     */
    public java.lang.String getNAMD() {
        return NAMD;
    }


    /**
     * Sets the NAMD value for this CDSCDSPRDPRDDSK.
     * 
     * @param NAMD
     */
    public void setNAMD(java.lang.String NAMD) {
        this.NAMD = NAMD;
    }


    /**
     * Gets the NAMF value for this CDSCDSPRDPRDDSK.
     * 
     * @return NAMF
     */
    public java.lang.String getNAMF() {
        return NAMF;
    }


    /**
     * Sets the NAMF value for this CDSCDSPRDPRDDSK.
     * 
     * @param NAMF
     */
    public void setNAMF(java.lang.String NAMF) {
        this.NAMF = NAMF;
    }


    /**
     * Gets the ACTMET value for this CDSCDSPRDPRDDSK.
     * 
     * @return ACTMET
     */
    public java.lang.Integer getACTMET() {
        return ACTMET;
    }


    /**
     * Sets the ACTMET value for this CDSCDSPRDPRDDSK.
     * 
     * @param ACTMET
     */
    public void setACTMET(java.lang.Integer ACTMET) {
        this.ACTMET = ACTMET;
    }


    /**
     * Gets the q0 value for this CDSCDSPRDPRDDSK.
     * 
     * @return q0
     */
    public java.lang.Double getQ0() {
        return q0;
    }


    /**
     * Sets the q0 value for this CDSCDSPRDPRDDSK.
     * 
     * @param q0
     */
    public void setQ0(java.lang.Double q0) {
        this.q0 = q0;
    }


    /**
     * Gets the HVP value for this CDSCDSPRDPRDDSK.
     * 
     * @return HVP
     */
    public java.lang.Double getHVP() {
        return HVP;
    }


    /**
     * Sets the HVP value for this CDSCDSPRDPRDDSK.
     * 
     * @param HVP
     */
    public void setHVP(java.lang.Double HVP) {
        this.HVP = HVP;
    }


    /**
     * Gets the DOSINT value for this CDSCDSPRDPRDDSK.
     * 
     * @return DOSINT
     */
    public java.lang.Double getDOSINT() {
        return DOSINT;
    }


    /**
     * Sets the DOSINT value for this CDSCDSPRDPRDDSK.
     * 
     * @param DOSINT
     */
    public void setDOSINT(java.lang.Double DOSINT) {
        this.DOSINT = DOSINT;
    }


    /**
     * Gets the PRODRG value for this CDSCDSPRDPRDDSK.
     * 
     * @return PRODRG
     */
    public java.lang.Integer getPRODRG() {
        return PRODRG;
    }


    /**
     * Sets the PRODRG value for this CDSCDSPRDPRDDSK.
     * 
     * @param PRODRG
     */
    public void setPRODRG(java.lang.Integer PRODRG) {
        this.PRODRG = PRODRG;
    }


    /**
     * Gets the DATASC value for this CDSCDSPRDPRDDSK.
     * 
     * @return DATASC
     */
    public java.lang.String getDATASC() {
        return DATASC;
    }


    /**
     * Sets the DATASC value for this CDSCDSPRDPRDDSK.
     * 
     * @param DATASC
     */
    public void setDATASC(java.lang.String DATASC) {
        this.DATASC = DATASC;
    }


    /**
     * Gets the DSKDSP value for this CDSCDSPRDPRDDSK.
     * 
     * @return DSKDSP
     */
    public webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP[] getDSKDSP() {
        return DSKDSP;
    }


    /**
     * Sets the DSKDSP value for this CDSCDSPRDPRDDSK.
     * 
     * @param DSKDSP
     */
    public void setDSKDSP(webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP[] DSKDSP) {
        this.DSKDSP = DSKDSP;
    }

    public webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP getDSKDSP(int i) {
        return this.DSKDSP[i];
    }

    public void setDSKDSP(int i, webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP _value) {
        this.DSKDSP[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCDSPRDPRDDSK)) return false;
        CDSCDSPRDPRDDSK other = (CDSCDSPRDPRDDSK) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CPTLNO == other.getCPTLNO() &&
            this.LNO == other.getLNO() &&
            ((this.NAMD==null && other.getNAMD()==null) || 
             (this.NAMD!=null &&
              this.NAMD.equals(other.getNAMD()))) &&
            ((this.NAMF==null && other.getNAMF()==null) || 
             (this.NAMF!=null &&
              this.NAMF.equals(other.getNAMF()))) &&
            ((this.ACTMET==null && other.getACTMET()==null) || 
             (this.ACTMET!=null &&
              this.ACTMET.equals(other.getACTMET()))) &&
            ((this.q0==null && other.getQ0()==null) || 
             (this.q0!=null &&
              this.q0.equals(other.getQ0()))) &&
            ((this.HVP==null && other.getHVP()==null) || 
             (this.HVP!=null &&
              this.HVP.equals(other.getHVP()))) &&
            ((this.DOSINT==null && other.getDOSINT()==null) || 
             (this.DOSINT!=null &&
              this.DOSINT.equals(other.getDOSINT()))) &&
            ((this.PRODRG==null && other.getPRODRG()==null) || 
             (this.PRODRG!=null &&
              this.PRODRG.equals(other.getPRODRG()))) &&
            ((this.DATASC==null && other.getDATASC()==null) || 
             (this.DATASC!=null &&
              this.DATASC.equals(other.getDATASC()))) &&
            ((this.DSKDSP==null && other.getDSKDSP()==null) || 
             (this.DSKDSP!=null &&
              java.util.Arrays.equals(this.DSKDSP, other.getDSKDSP())));
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
        _hashCode += getCPTLNO();
        _hashCode += getLNO();
        if (getNAMD() != null) {
            _hashCode += getNAMD().hashCode();
        }
        if (getNAMF() != null) {
            _hashCode += getNAMF().hashCode();
        }
        if (getACTMET() != null) {
            _hashCode += getACTMET().hashCode();
        }
        if (getQ0() != null) {
            _hashCode += getQ0().hashCode();
        }
        if (getHVP() != null) {
            _hashCode += getHVP().hashCode();
        }
        if (getDOSINT() != null) {
            _hashCode += getDOSINT().hashCode();
        }
        if (getPRODRG() != null) {
            _hashCode += getPRODRG().hashCode();
        }
        if (getDATASC() != null) {
            _hashCode += getDATASC().hashCode();
        }
        if (getDSKDSP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDSKDSP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDSKDSP(), i);
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
        new org.apache.axis.description.TypeDesc(CDSCDSPRDPRDDSK.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDDSK"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NAMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NAMF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTMET");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ACTMET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q0");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Q0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HVP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "HVP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOSINT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOSINT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRODRG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRODRG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("DSKDSP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSKDSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDDSK>DSKDSP"));
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
