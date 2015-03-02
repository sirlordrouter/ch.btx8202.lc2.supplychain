/**
 * CDSCodeCCH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCodeCCH  implements java.io.Serializable {
    private int CCHKEY;

    private java.lang.String CCHTYP;

    private boolean ISCODE;

    private java.lang.String TITD;

    private java.lang.String TITF;

    private java.lang.String REMD;

    private java.lang.String REMF;

    private java.lang.Integer STATE;

    private int SEX;

    private boolean DEL;

    private webservice.hospindex.CDSCodeCCHCCHCCH[] CCHCCH;

    private java.util.Calendar DT;  // attribute

    public CDSCodeCCH() {
    }

    public CDSCodeCCH(
           int CCHKEY,
           java.lang.String CCHTYP,
           boolean ISCODE,
           java.lang.String TITD,
           java.lang.String TITF,
           java.lang.String REMD,
           java.lang.String REMF,
           java.lang.Integer STATE,
           int SEX,
           boolean DEL,
           webservice.hospindex.CDSCodeCCHCCHCCH[] CCHCCH,
           java.util.Calendar DT) {
           this.CCHKEY = CCHKEY;
           this.CCHTYP = CCHTYP;
           this.ISCODE = ISCODE;
           this.TITD = TITD;
           this.TITF = TITF;
           this.REMD = REMD;
           this.REMF = REMF;
           this.STATE = STATE;
           this.SEX = SEX;
           this.DEL = DEL;
           this.CCHCCH = CCHCCH;
           this.DT = DT;
    }


    /**
     * Gets the CCHKEY value for this CDSCodeCCH.
     * 
     * @return CCHKEY
     */
    public int getCCHKEY() {
        return CCHKEY;
    }


    /**
     * Sets the CCHKEY value for this CDSCodeCCH.
     * 
     * @param CCHKEY
     */
    public void setCCHKEY(int CCHKEY) {
        this.CCHKEY = CCHKEY;
    }


    /**
     * Gets the CCHTYP value for this CDSCodeCCH.
     * 
     * @return CCHTYP
     */
    public java.lang.String getCCHTYP() {
        return CCHTYP;
    }


    /**
     * Sets the CCHTYP value for this CDSCodeCCH.
     * 
     * @param CCHTYP
     */
    public void setCCHTYP(java.lang.String CCHTYP) {
        this.CCHTYP = CCHTYP;
    }


    /**
     * Gets the ISCODE value for this CDSCodeCCH.
     * 
     * @return ISCODE
     */
    public boolean isISCODE() {
        return ISCODE;
    }


    /**
     * Sets the ISCODE value for this CDSCodeCCH.
     * 
     * @param ISCODE
     */
    public void setISCODE(boolean ISCODE) {
        this.ISCODE = ISCODE;
    }


    /**
     * Gets the TITD value for this CDSCodeCCH.
     * 
     * @return TITD
     */
    public java.lang.String getTITD() {
        return TITD;
    }


    /**
     * Sets the TITD value for this CDSCodeCCH.
     * 
     * @param TITD
     */
    public void setTITD(java.lang.String TITD) {
        this.TITD = TITD;
    }


    /**
     * Gets the TITF value for this CDSCodeCCH.
     * 
     * @return TITF
     */
    public java.lang.String getTITF() {
        return TITF;
    }


    /**
     * Sets the TITF value for this CDSCodeCCH.
     * 
     * @param TITF
     */
    public void setTITF(java.lang.String TITF) {
        this.TITF = TITF;
    }


    /**
     * Gets the REMD value for this CDSCodeCCH.
     * 
     * @return REMD
     */
    public java.lang.String getREMD() {
        return REMD;
    }


    /**
     * Sets the REMD value for this CDSCodeCCH.
     * 
     * @param REMD
     */
    public void setREMD(java.lang.String REMD) {
        this.REMD = REMD;
    }


    /**
     * Gets the REMF value for this CDSCodeCCH.
     * 
     * @return REMF
     */
    public java.lang.String getREMF() {
        return REMF;
    }


    /**
     * Sets the REMF value for this CDSCodeCCH.
     * 
     * @param REMF
     */
    public void setREMF(java.lang.String REMF) {
        this.REMF = REMF;
    }


    /**
     * Gets the STATE value for this CDSCodeCCH.
     * 
     * @return STATE
     */
    public java.lang.Integer getSTATE() {
        return STATE;
    }


    /**
     * Sets the STATE value for this CDSCodeCCH.
     * 
     * @param STATE
     */
    public void setSTATE(java.lang.Integer STATE) {
        this.STATE = STATE;
    }


    /**
     * Gets the SEX value for this CDSCodeCCH.
     * 
     * @return SEX
     */
    public int getSEX() {
        return SEX;
    }


    /**
     * Sets the SEX value for this CDSCodeCCH.
     * 
     * @param SEX
     */
    public void setSEX(int SEX) {
        this.SEX = SEX;
    }


    /**
     * Gets the DEL value for this CDSCodeCCH.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this CDSCodeCCH.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the CCHCCH value for this CDSCodeCCH.
     * 
     * @return CCHCCH
     */
    public webservice.hospindex.CDSCodeCCHCCHCCH[] getCCHCCH() {
        return CCHCCH;
    }


    /**
     * Sets the CCHCCH value for this CDSCodeCCH.
     * 
     * @param CCHCCH
     */
    public void setCCHCCH(webservice.hospindex.CDSCodeCCHCCHCCH[] CCHCCH) {
        this.CCHCCH = CCHCCH;
    }

    public webservice.hospindex.CDSCodeCCHCCHCCH getCCHCCH(int i) {
        return this.CCHCCH[i];
    }

    public void setCCHCCH(int i, webservice.hospindex.CDSCodeCCHCCHCCH _value) {
        this.CCHCCH[i] = _value;
    }


    /**
     * Gets the DT value for this CDSCodeCCH.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this CDSCodeCCH.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCodeCCH)) return false;
        CDSCodeCCH other = (CDSCodeCCH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CCHKEY == other.getCCHKEY() &&
            ((this.CCHTYP==null && other.getCCHTYP()==null) || 
             (this.CCHTYP!=null &&
              this.CCHTYP.equals(other.getCCHTYP()))) &&
            this.ISCODE == other.isISCODE() &&
            ((this.TITD==null && other.getTITD()==null) || 
             (this.TITD!=null &&
              this.TITD.equals(other.getTITD()))) &&
            ((this.TITF==null && other.getTITF()==null) || 
             (this.TITF!=null &&
              this.TITF.equals(other.getTITF()))) &&
            ((this.REMD==null && other.getREMD()==null) || 
             (this.REMD!=null &&
              this.REMD.equals(other.getREMD()))) &&
            ((this.REMF==null && other.getREMF()==null) || 
             (this.REMF!=null &&
              this.REMF.equals(other.getREMF()))) &&
            ((this.STATE==null && other.getSTATE()==null) || 
             (this.STATE!=null &&
              this.STATE.equals(other.getSTATE()))) &&
            this.SEX == other.getSEX() &&
            this.DEL == other.isDEL() &&
            ((this.CCHCCH==null && other.getCCHCCH()==null) || 
             (this.CCHCCH!=null &&
              java.util.Arrays.equals(this.CCHCCH, other.getCCHCCH()))) &&
            ((this.DT==null && other.getDT()==null) || 
             (this.DT!=null &&
              this.DT.equals(other.getDT())));
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
        _hashCode += getCCHKEY();
        if (getCCHTYP() != null) {
            _hashCode += getCCHTYP().hashCode();
        }
        _hashCode += (isISCODE() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTITD() != null) {
            _hashCode += getTITD().hashCode();
        }
        if (getTITF() != null) {
            _hashCode += getTITF().hashCode();
        }
        if (getREMD() != null) {
            _hashCode += getREMD().hashCode();
        }
        if (getREMF() != null) {
            _hashCode += getREMF().hashCode();
        }
        if (getSTATE() != null) {
            _hashCode += getSTATE().hashCode();
        }
        _hashCode += getSEX();
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCCHCCH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCCHCCH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCCHCCH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSCodeCCH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDSCode>CCH"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ISCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ISCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITF"));
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
        elemField.setFieldName("STATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCHCCH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CCHCCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSCode>CCH>CCHCCH"));
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
