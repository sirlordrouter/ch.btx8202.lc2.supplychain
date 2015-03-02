/**
 * LimitationLIM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class LimitationLIM  implements java.io.Serializable {
    private java.lang.String LIMCD;

    private java.lang.String ITBAG;

    private java.lang.String LIMTYP;

    private java.lang.Double LIMVAL;

    private java.lang.String DSCRD;

    private java.lang.String DSCRF;

    private java.util.Calendar VDAT;

    private java.lang.Boolean DEL;

    private java.util.Calendar DT;  // attribute

    public LimitationLIM() {
    }

    public LimitationLIM(
           java.lang.String LIMCD,
           java.lang.String ITBAG,
           java.lang.String LIMTYP,
           java.lang.Double LIMVAL,
           java.lang.String DSCRD,
           java.lang.String DSCRF,
           java.util.Calendar VDAT,
           java.lang.Boolean DEL,
           java.util.Calendar DT) {
           this.LIMCD = LIMCD;
           this.ITBAG = ITBAG;
           this.LIMTYP = LIMTYP;
           this.LIMVAL = LIMVAL;
           this.DSCRD = DSCRD;
           this.DSCRF = DSCRF;
           this.VDAT = VDAT;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the LIMCD value for this LimitationLIM.
     * 
     * @return LIMCD
     */
    public java.lang.String getLIMCD() {
        return LIMCD;
    }


    /**
     * Sets the LIMCD value for this LimitationLIM.
     * 
     * @param LIMCD
     */
    public void setLIMCD(java.lang.String LIMCD) {
        this.LIMCD = LIMCD;
    }


    /**
     * Gets the ITBAG value for this LimitationLIM.
     * 
     * @return ITBAG
     */
    public java.lang.String getITBAG() {
        return ITBAG;
    }


    /**
     * Sets the ITBAG value for this LimitationLIM.
     * 
     * @param ITBAG
     */
    public void setITBAG(java.lang.String ITBAG) {
        this.ITBAG = ITBAG;
    }


    /**
     * Gets the LIMTYP value for this LimitationLIM.
     * 
     * @return LIMTYP
     */
    public java.lang.String getLIMTYP() {
        return LIMTYP;
    }


    /**
     * Sets the LIMTYP value for this LimitationLIM.
     * 
     * @param LIMTYP
     */
    public void setLIMTYP(java.lang.String LIMTYP) {
        this.LIMTYP = LIMTYP;
    }


    /**
     * Gets the LIMVAL value for this LimitationLIM.
     * 
     * @return LIMVAL
     */
    public java.lang.Double getLIMVAL() {
        return LIMVAL;
    }


    /**
     * Sets the LIMVAL value for this LimitationLIM.
     * 
     * @param LIMVAL
     */
    public void setLIMVAL(java.lang.Double LIMVAL) {
        this.LIMVAL = LIMVAL;
    }


    /**
     * Gets the DSCRD value for this LimitationLIM.
     * 
     * @return DSCRD
     */
    public java.lang.String getDSCRD() {
        return DSCRD;
    }


    /**
     * Sets the DSCRD value for this LimitationLIM.
     * 
     * @param DSCRD
     */
    public void setDSCRD(java.lang.String DSCRD) {
        this.DSCRD = DSCRD;
    }


    /**
     * Gets the DSCRF value for this LimitationLIM.
     * 
     * @return DSCRF
     */
    public java.lang.String getDSCRF() {
        return DSCRF;
    }


    /**
     * Sets the DSCRF value for this LimitationLIM.
     * 
     * @param DSCRF
     */
    public void setDSCRF(java.lang.String DSCRF) {
        this.DSCRF = DSCRF;
    }


    /**
     * Gets the VDAT value for this LimitationLIM.
     * 
     * @return VDAT
     */
    public java.util.Calendar getVDAT() {
        return VDAT;
    }


    /**
     * Sets the VDAT value for this LimitationLIM.
     * 
     * @param VDAT
     */
    public void setVDAT(java.util.Calendar VDAT) {
        this.VDAT = VDAT;
    }


    /**
     * Gets the DEL value for this LimitationLIM.
     * 
     * @return DEL
     */
    public java.lang.Boolean getDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this LimitationLIM.
     * 
     * @param DEL
     */
    public void setDEL(java.lang.Boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this LimitationLIM.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this LimitationLIM.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimitationLIM)) return false;
        LimitationLIM other = (LimitationLIM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LIMCD==null && other.getLIMCD()==null) || 
             (this.LIMCD!=null &&
              this.LIMCD.equals(other.getLIMCD()))) &&
            ((this.ITBAG==null && other.getITBAG()==null) || 
             (this.ITBAG!=null &&
              this.ITBAG.equals(other.getITBAG()))) &&
            ((this.LIMTYP==null && other.getLIMTYP()==null) || 
             (this.LIMTYP!=null &&
              this.LIMTYP.equals(other.getLIMTYP()))) &&
            ((this.LIMVAL==null && other.getLIMVAL()==null) || 
             (this.LIMVAL!=null &&
              this.LIMVAL.equals(other.getLIMVAL()))) &&
            ((this.DSCRD==null && other.getDSCRD()==null) || 
             (this.DSCRD!=null &&
              this.DSCRD.equals(other.getDSCRD()))) &&
            ((this.DSCRF==null && other.getDSCRF()==null) || 
             (this.DSCRF!=null &&
              this.DSCRF.equals(other.getDSCRF()))) &&
            ((this.VDAT==null && other.getVDAT()==null) || 
             (this.VDAT!=null &&
              this.VDAT.equals(other.getVDAT()))) &&
            ((this.DEL==null && other.getDEL()==null) || 
             (this.DEL!=null &&
              this.DEL.equals(other.getDEL()))) &&
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
        if (getLIMCD() != null) {
            _hashCode += getLIMCD().hashCode();
        }
        if (getITBAG() != null) {
            _hashCode += getITBAG().hashCode();
        }
        if (getLIMTYP() != null) {
            _hashCode += getLIMTYP().hashCode();
        }
        if (getLIMVAL() != null) {
            _hashCode += getLIMVAL().hashCode();
        }
        if (getDSCRD() != null) {
            _hashCode += getDSCRD().hashCode();
        }
        if (getDSCRF() != null) {
            _hashCode += getDSCRF().hashCode();
        }
        if (getVDAT() != null) {
            _hashCode += getVDAT().hashCode();
        }
        if (getDEL() != null) {
            _hashCode += getDEL().hashCode();
        }
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimitationLIM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Limitation>LIM"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIMCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LIMCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITBAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ITBAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIMTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LIMTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIMVAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LIMVAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("VDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
