/**
 * CodeCD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CodeCD  implements java.io.Serializable {
    private int CDTYP;

    private java.lang.String CDVAL;

    private java.lang.String DSCRSD;

    private java.lang.String DSCRSF;

    private java.lang.String DSCRMD;

    private java.lang.String DSCRMF;

    private java.lang.String DSCRD;

    private java.lang.String DSCRF;

    private boolean DEL;

    private java.util.Calendar DT;  // attribute

    public CodeCD() {
    }

    public CodeCD(
           int CDTYP,
           java.lang.String CDVAL,
           java.lang.String DSCRSD,
           java.lang.String DSCRSF,
           java.lang.String DSCRMD,
           java.lang.String DSCRMF,
           java.lang.String DSCRD,
           java.lang.String DSCRF,
           boolean DEL,
           java.util.Calendar DT) {
           this.CDTYP = CDTYP;
           this.CDVAL = CDVAL;
           this.DSCRSD = DSCRSD;
           this.DSCRSF = DSCRSF;
           this.DSCRMD = DSCRMD;
           this.DSCRMF = DSCRMF;
           this.DSCRD = DSCRD;
           this.DSCRF = DSCRF;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the CDTYP value for this CodeCD.
     * 
     * @return CDTYP
     */
    public int getCDTYP() {
        return CDTYP;
    }


    /**
     * Sets the CDTYP value for this CodeCD.
     * 
     * @param CDTYP
     */
    public void setCDTYP(int CDTYP) {
        this.CDTYP = CDTYP;
    }


    /**
     * Gets the CDVAL value for this CodeCD.
     * 
     * @return CDVAL
     */
    public java.lang.String getCDVAL() {
        return CDVAL;
    }


    /**
     * Sets the CDVAL value for this CodeCD.
     * 
     * @param CDVAL
     */
    public void setCDVAL(java.lang.String CDVAL) {
        this.CDVAL = CDVAL;
    }


    /**
     * Gets the DSCRSD value for this CodeCD.
     * 
     * @return DSCRSD
     */
    public java.lang.String getDSCRSD() {
        return DSCRSD;
    }


    /**
     * Sets the DSCRSD value for this CodeCD.
     * 
     * @param DSCRSD
     */
    public void setDSCRSD(java.lang.String DSCRSD) {
        this.DSCRSD = DSCRSD;
    }


    /**
     * Gets the DSCRSF value for this CodeCD.
     * 
     * @return DSCRSF
     */
    public java.lang.String getDSCRSF() {
        return DSCRSF;
    }


    /**
     * Sets the DSCRSF value for this CodeCD.
     * 
     * @param DSCRSF
     */
    public void setDSCRSF(java.lang.String DSCRSF) {
        this.DSCRSF = DSCRSF;
    }


    /**
     * Gets the DSCRMD value for this CodeCD.
     * 
     * @return DSCRMD
     */
    public java.lang.String getDSCRMD() {
        return DSCRMD;
    }


    /**
     * Sets the DSCRMD value for this CodeCD.
     * 
     * @param DSCRMD
     */
    public void setDSCRMD(java.lang.String DSCRMD) {
        this.DSCRMD = DSCRMD;
    }


    /**
     * Gets the DSCRMF value for this CodeCD.
     * 
     * @return DSCRMF
     */
    public java.lang.String getDSCRMF() {
        return DSCRMF;
    }


    /**
     * Sets the DSCRMF value for this CodeCD.
     * 
     * @param DSCRMF
     */
    public void setDSCRMF(java.lang.String DSCRMF) {
        this.DSCRMF = DSCRMF;
    }


    /**
     * Gets the DSCRD value for this CodeCD.
     * 
     * @return DSCRD
     */
    public java.lang.String getDSCRD() {
        return DSCRD;
    }


    /**
     * Sets the DSCRD value for this CodeCD.
     * 
     * @param DSCRD
     */
    public void setDSCRD(java.lang.String DSCRD) {
        this.DSCRD = DSCRD;
    }


    /**
     * Gets the DSCRF value for this CodeCD.
     * 
     * @return DSCRF
     */
    public java.lang.String getDSCRF() {
        return DSCRF;
    }


    /**
     * Sets the DSCRF value for this CodeCD.
     * 
     * @param DSCRF
     */
    public void setDSCRF(java.lang.String DSCRF) {
        this.DSCRF = DSCRF;
    }


    /**
     * Gets the DEL value for this CodeCD.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this CodeCD.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this CodeCD.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this CodeCD.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeCD)) return false;
        CodeCD other = (CodeCD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CDTYP == other.getCDTYP() &&
            ((this.CDVAL==null && other.getCDVAL()==null) || 
             (this.CDVAL!=null &&
              this.CDVAL.equals(other.getCDVAL()))) &&
            ((this.DSCRSD==null && other.getDSCRSD()==null) || 
             (this.DSCRSD!=null &&
              this.DSCRSD.equals(other.getDSCRSD()))) &&
            ((this.DSCRSF==null && other.getDSCRSF()==null) || 
             (this.DSCRSF!=null &&
              this.DSCRSF.equals(other.getDSCRSF()))) &&
            ((this.DSCRMD==null && other.getDSCRMD()==null) || 
             (this.DSCRMD!=null &&
              this.DSCRMD.equals(other.getDSCRMD()))) &&
            ((this.DSCRMF==null && other.getDSCRMF()==null) || 
             (this.DSCRMF!=null &&
              this.DSCRMF.equals(other.getDSCRMF()))) &&
            ((this.DSCRD==null && other.getDSCRD()==null) || 
             (this.DSCRD!=null &&
              this.DSCRD.equals(other.getDSCRD()))) &&
            ((this.DSCRF==null && other.getDSCRF()==null) || 
             (this.DSCRF!=null &&
              this.DSCRF.equals(other.getDSCRF()))) &&
            this.DEL == other.isDEL() &&
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
        _hashCode += getCDTYP();
        if (getCDVAL() != null) {
            _hashCode += getCDVAL().hashCode();
        }
        if (getDSCRSD() != null) {
            _hashCode += getDSCRSD().hashCode();
        }
        if (getDSCRSF() != null) {
            _hashCode += getDSCRSF().hashCode();
        }
        if (getDSCRMD() != null) {
            _hashCode += getDSCRMD().hashCode();
        }
        if (getDSCRMF() != null) {
            _hashCode += getDSCRMF().hashCode();
        }
        if (getDSCRD() != null) {
            _hashCode += getDSCRD().hashCode();
        }
        if (getDSCRF() != null) {
            _hashCode += getDSCRF().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeCD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Code>CD"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDVAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDVAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRSD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRSF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRSF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRMF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
