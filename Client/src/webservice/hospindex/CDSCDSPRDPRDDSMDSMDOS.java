/**
 * CDSCDSPRDPRDDSMDSMDOS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCDSPRDPRDDSMDSMDOS  implements java.io.Serializable {
    private int DOSLNO;

    private java.lang.String DSMTYP;

    private java.lang.Boolean NOTNAM;

    private java.lang.Boolean ATFLAG;

    private java.lang.Integer SUBNO;

    private java.lang.String REMD;

    private java.lang.String REMF;

    private java.lang.String REME;

    private webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT[] DOSUNIT;

    private webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP[] DOSDSP;

    public CDSCDSPRDPRDDSMDSMDOS() {
    }

    public CDSCDSPRDPRDDSMDSMDOS(
           int DOSLNO,
           java.lang.String DSMTYP,
           java.lang.Boolean NOTNAM,
           java.lang.Boolean ATFLAG,
           java.lang.Integer SUBNO,
           java.lang.String REMD,
           java.lang.String REMF,
           java.lang.String REME,
           webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT[] DOSUNIT,
           webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP[] DOSDSP) {
           this.DOSLNO = DOSLNO;
           this.DSMTYP = DSMTYP;
           this.NOTNAM = NOTNAM;
           this.ATFLAG = ATFLAG;
           this.SUBNO = SUBNO;
           this.REMD = REMD;
           this.REMF = REMF;
           this.REME = REME;
           this.DOSUNIT = DOSUNIT;
           this.DOSDSP = DOSDSP;
    }


    /**
     * Gets the DOSLNO value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return DOSLNO
     */
    public int getDOSLNO() {
        return DOSLNO;
    }


    /**
     * Sets the DOSLNO value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param DOSLNO
     */
    public void setDOSLNO(int DOSLNO) {
        this.DOSLNO = DOSLNO;
    }


    /**
     * Gets the DSMTYP value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return DSMTYP
     */
    public java.lang.String getDSMTYP() {
        return DSMTYP;
    }


    /**
     * Sets the DSMTYP value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param DSMTYP
     */
    public void setDSMTYP(java.lang.String DSMTYP) {
        this.DSMTYP = DSMTYP;
    }


    /**
     * Gets the NOTNAM value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return NOTNAM
     */
    public java.lang.Boolean getNOTNAM() {
        return NOTNAM;
    }


    /**
     * Sets the NOTNAM value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param NOTNAM
     */
    public void setNOTNAM(java.lang.Boolean NOTNAM) {
        this.NOTNAM = NOTNAM;
    }


    /**
     * Gets the ATFLAG value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return ATFLAG
     */
    public java.lang.Boolean getATFLAG() {
        return ATFLAG;
    }


    /**
     * Sets the ATFLAG value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param ATFLAG
     */
    public void setATFLAG(java.lang.Boolean ATFLAG) {
        this.ATFLAG = ATFLAG;
    }


    /**
     * Gets the SUBNO value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return SUBNO
     */
    public java.lang.Integer getSUBNO() {
        return SUBNO;
    }


    /**
     * Sets the SUBNO value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param SUBNO
     */
    public void setSUBNO(java.lang.Integer SUBNO) {
        this.SUBNO = SUBNO;
    }


    /**
     * Gets the REMD value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return REMD
     */
    public java.lang.String getREMD() {
        return REMD;
    }


    /**
     * Sets the REMD value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param REMD
     */
    public void setREMD(java.lang.String REMD) {
        this.REMD = REMD;
    }


    /**
     * Gets the REMF value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return REMF
     */
    public java.lang.String getREMF() {
        return REMF;
    }


    /**
     * Sets the REMF value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param REMF
     */
    public void setREMF(java.lang.String REMF) {
        this.REMF = REMF;
    }


    /**
     * Gets the REME value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return REME
     */
    public java.lang.String getREME() {
        return REME;
    }


    /**
     * Sets the REME value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param REME
     */
    public void setREME(java.lang.String REME) {
        this.REME = REME;
    }


    /**
     * Gets the DOSUNIT value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return DOSUNIT
     */
    public webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT[] getDOSUNIT() {
        return DOSUNIT;
    }


    /**
     * Sets the DOSUNIT value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param DOSUNIT
     */
    public void setDOSUNIT(webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT[] DOSUNIT) {
        this.DOSUNIT = DOSUNIT;
    }

    public webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT getDOSUNIT(int i) {
        return this.DOSUNIT[i];
    }

    public void setDOSUNIT(int i, webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT _value) {
        this.DOSUNIT[i] = _value;
    }


    /**
     * Gets the DOSDSP value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @return DOSDSP
     */
    public webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP[] getDOSDSP() {
        return DOSDSP;
    }


    /**
     * Sets the DOSDSP value for this CDSCDSPRDPRDDSMDSMDOS.
     * 
     * @param DOSDSP
     */
    public void setDOSDSP(webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP[] DOSDSP) {
        this.DOSDSP = DOSDSP;
    }

    public webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP getDOSDSP(int i) {
        return this.DOSDSP[i];
    }

    public void setDOSDSP(int i, webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP _value) {
        this.DOSDSP[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCDSPRDPRDDSMDSMDOS)) return false;
        CDSCDSPRDPRDDSMDSMDOS other = (CDSCDSPRDPRDDSMDSMDOS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.DOSLNO == other.getDOSLNO() &&
            ((this.DSMTYP==null && other.getDSMTYP()==null) || 
             (this.DSMTYP!=null &&
              this.DSMTYP.equals(other.getDSMTYP()))) &&
            ((this.NOTNAM==null && other.getNOTNAM()==null) || 
             (this.NOTNAM!=null &&
              this.NOTNAM.equals(other.getNOTNAM()))) &&
            ((this.ATFLAG==null && other.getATFLAG()==null) || 
             (this.ATFLAG!=null &&
              this.ATFLAG.equals(other.getATFLAG()))) &&
            ((this.SUBNO==null && other.getSUBNO()==null) || 
             (this.SUBNO!=null &&
              this.SUBNO.equals(other.getSUBNO()))) &&
            ((this.REMD==null && other.getREMD()==null) || 
             (this.REMD!=null &&
              this.REMD.equals(other.getREMD()))) &&
            ((this.REMF==null && other.getREMF()==null) || 
             (this.REMF!=null &&
              this.REMF.equals(other.getREMF()))) &&
            ((this.REME==null && other.getREME()==null) || 
             (this.REME!=null &&
              this.REME.equals(other.getREME()))) &&
            ((this.DOSUNIT==null && other.getDOSUNIT()==null) || 
             (this.DOSUNIT!=null &&
              java.util.Arrays.equals(this.DOSUNIT, other.getDOSUNIT()))) &&
            ((this.DOSDSP==null && other.getDOSDSP()==null) || 
             (this.DOSDSP!=null &&
              java.util.Arrays.equals(this.DOSDSP, other.getDOSDSP())));
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
        _hashCode += getDOSLNO();
        if (getDSMTYP() != null) {
            _hashCode += getDSMTYP().hashCode();
        }
        if (getNOTNAM() != null) {
            _hashCode += getNOTNAM().hashCode();
        }
        if (getATFLAG() != null) {
            _hashCode += getATFLAG().hashCode();
        }
        if (getSUBNO() != null) {
            _hashCode += getSUBNO().hashCode();
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
        if (getDOSUNIT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOSUNIT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOSUNIT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOSDSP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOSDSP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOSDSP(), i);
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
        new org.apache.axis.description.TypeDesc(CDSCDSPRDPRDDSMDSMDOS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDDSM>DSMDOS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOSLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOSLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSMTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSMTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTNAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NOTNAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ATFLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUBNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SUBNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("DOSUNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOSUNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>CDS>CDSPRD>PRDDSM>DSMDOS>DOSUNIT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOSDSP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOSDSP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>CDS>CDSPRD>PRDDSM>DSMDOS>DOSDSP"));
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
