/**
 * SubstanceSB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class SubstanceSB  implements java.io.Serializable {
    private java.math.BigInteger SUBNO;

    private java.lang.String NAMD;

    private java.lang.String ANAMD;

    private java.lang.String NAMF;

    private java.lang.String NAML;

    private java.lang.Integer ABDANO;

    private java.lang.String CAS;

    private java.lang.String MMASS;

    private java.lang.String FORMULA;

    private boolean DEL;

    private java.util.Calendar DT;  // attribute

    public SubstanceSB() {
    }

    public SubstanceSB(
           java.math.BigInteger SUBNO,
           java.lang.String NAMD,
           java.lang.String ANAMD,
           java.lang.String NAMF,
           java.lang.String NAML,
           java.lang.Integer ABDANO,
           java.lang.String CAS,
           java.lang.String MMASS,
           java.lang.String FORMULA,
           boolean DEL,
           java.util.Calendar DT) {
           this.SUBNO = SUBNO;
           this.NAMD = NAMD;
           this.ANAMD = ANAMD;
           this.NAMF = NAMF;
           this.NAML = NAML;
           this.ABDANO = ABDANO;
           this.CAS = CAS;
           this.MMASS = MMASS;
           this.FORMULA = FORMULA;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the SUBNO value for this SubstanceSB.
     * 
     * @return SUBNO
     */
    public java.math.BigInteger getSUBNO() {
        return SUBNO;
    }


    /**
     * Sets the SUBNO value for this SubstanceSB.
     * 
     * @param SUBNO
     */
    public void setSUBNO(java.math.BigInteger SUBNO) {
        this.SUBNO = SUBNO;
    }


    /**
     * Gets the NAMD value for this SubstanceSB.
     * 
     * @return NAMD
     */
    public java.lang.String getNAMD() {
        return NAMD;
    }


    /**
     * Sets the NAMD value for this SubstanceSB.
     * 
     * @param NAMD
     */
    public void setNAMD(java.lang.String NAMD) {
        this.NAMD = NAMD;
    }


    /**
     * Gets the ANAMD value for this SubstanceSB.
     * 
     * @return ANAMD
     */
    public java.lang.String getANAMD() {
        return ANAMD;
    }


    /**
     * Sets the ANAMD value for this SubstanceSB.
     * 
     * @param ANAMD
     */
    public void setANAMD(java.lang.String ANAMD) {
        this.ANAMD = ANAMD;
    }


    /**
     * Gets the NAMF value for this SubstanceSB.
     * 
     * @return NAMF
     */
    public java.lang.String getNAMF() {
        return NAMF;
    }


    /**
     * Sets the NAMF value for this SubstanceSB.
     * 
     * @param NAMF
     */
    public void setNAMF(java.lang.String NAMF) {
        this.NAMF = NAMF;
    }


    /**
     * Gets the NAML value for this SubstanceSB.
     * 
     * @return NAML
     */
    public java.lang.String getNAML() {
        return NAML;
    }


    /**
     * Sets the NAML value for this SubstanceSB.
     * 
     * @param NAML
     */
    public void setNAML(java.lang.String NAML) {
        this.NAML = NAML;
    }


    /**
     * Gets the ABDANO value for this SubstanceSB.
     * 
     * @return ABDANO
     */
    public java.lang.Integer getABDANO() {
        return ABDANO;
    }


    /**
     * Sets the ABDANO value for this SubstanceSB.
     * 
     * @param ABDANO
     */
    public void setABDANO(java.lang.Integer ABDANO) {
        this.ABDANO = ABDANO;
    }


    /**
     * Gets the CAS value for this SubstanceSB.
     * 
     * @return CAS
     */
    public java.lang.String getCAS() {
        return CAS;
    }


    /**
     * Sets the CAS value for this SubstanceSB.
     * 
     * @param CAS
     */
    public void setCAS(java.lang.String CAS) {
        this.CAS = CAS;
    }


    /**
     * Gets the MMASS value for this SubstanceSB.
     * 
     * @return MMASS
     */
    public java.lang.String getMMASS() {
        return MMASS;
    }


    /**
     * Sets the MMASS value for this SubstanceSB.
     * 
     * @param MMASS
     */
    public void setMMASS(java.lang.String MMASS) {
        this.MMASS = MMASS;
    }


    /**
     * Gets the FORMULA value for this SubstanceSB.
     * 
     * @return FORMULA
     */
    public java.lang.String getFORMULA() {
        return FORMULA;
    }


    /**
     * Sets the FORMULA value for this SubstanceSB.
     * 
     * @param FORMULA
     */
    public void setFORMULA(java.lang.String FORMULA) {
        this.FORMULA = FORMULA;
    }


    /**
     * Gets the DEL value for this SubstanceSB.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this SubstanceSB.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this SubstanceSB.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this SubstanceSB.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubstanceSB)) return false;
        SubstanceSB other = (SubstanceSB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SUBNO==null && other.getSUBNO()==null) || 
             (this.SUBNO!=null &&
              this.SUBNO.equals(other.getSUBNO()))) &&
            ((this.NAMD==null && other.getNAMD()==null) || 
             (this.NAMD!=null &&
              this.NAMD.equals(other.getNAMD()))) &&
            ((this.ANAMD==null && other.getANAMD()==null) || 
             (this.ANAMD!=null &&
              this.ANAMD.equals(other.getANAMD()))) &&
            ((this.NAMF==null && other.getNAMF()==null) || 
             (this.NAMF!=null &&
              this.NAMF.equals(other.getNAMF()))) &&
            ((this.NAML==null && other.getNAML()==null) || 
             (this.NAML!=null &&
              this.NAML.equals(other.getNAML()))) &&
            ((this.ABDANO==null && other.getABDANO()==null) || 
             (this.ABDANO!=null &&
              this.ABDANO.equals(other.getABDANO()))) &&
            ((this.CAS==null && other.getCAS()==null) || 
             (this.CAS!=null &&
              this.CAS.equals(other.getCAS()))) &&
            ((this.MMASS==null && other.getMMASS()==null) || 
             (this.MMASS!=null &&
              this.MMASS.equals(other.getMMASS()))) &&
            ((this.FORMULA==null && other.getFORMULA()==null) || 
             (this.FORMULA!=null &&
              this.FORMULA.equals(other.getFORMULA()))) &&
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
        if (getSUBNO() != null) {
            _hashCode += getSUBNO().hashCode();
        }
        if (getNAMD() != null) {
            _hashCode += getNAMD().hashCode();
        }
        if (getANAMD() != null) {
            _hashCode += getANAMD().hashCode();
        }
        if (getNAMF() != null) {
            _hashCode += getNAMF().hashCode();
        }
        if (getNAML() != null) {
            _hashCode += getNAML().hashCode();
        }
        if (getABDANO() != null) {
            _hashCode += getABDANO().hashCode();
        }
        if (getCAS() != null) {
            _hashCode += getCAS().hashCode();
        }
        if (getMMASS() != null) {
            _hashCode += getMMASS().hashCode();
        }
        if (getFORMULA() != null) {
            _hashCode += getFORMULA().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubstanceSB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Substance>SB"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUBNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SUBNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("ANAMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ANAMD"));
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
        elemField.setFieldName("NAML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NAML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABDANO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ABDANO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MMASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MMASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FORMULA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "FORMULA"));
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
