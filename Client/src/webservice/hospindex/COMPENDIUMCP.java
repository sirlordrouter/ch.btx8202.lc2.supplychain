/**
 * COMPENDIUMCP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class COMPENDIUMCP  implements java.io.Serializable {
    private java.lang.String MONIDLANG;

    private webservice.hospindex.COMPENDIUMCPNAME NAME;

    private java.lang.String OWNER;

    private int MONID;

    private java.lang.Integer VERSION;

    private webservice.hospindex.COMPENDIUMCPCONTENT CONTENT;

    private webservice.hospindex.COMPENDIUMCPPARAGRAPHS[] PARAGRAPHS;

    private boolean DEL;

    private java.lang.String MONTYPE;  // attribute

    private java.lang.String MONSUBTYPE;  // attribute

    private java.lang.String LANG;  // attribute

    private boolean HASPI;  // attribute

    private boolean SAFETYRELEVANT;  // attribute

    private java.util.Calendar DT;  // attribute

    public COMPENDIUMCP() {
    }

    public COMPENDIUMCP(
           java.lang.String MONIDLANG,
           webservice.hospindex.COMPENDIUMCPNAME NAME,
           java.lang.String OWNER,
           int MONID,
           java.lang.Integer VERSION,
           webservice.hospindex.COMPENDIUMCPCONTENT CONTENT,
           webservice.hospindex.COMPENDIUMCPPARAGRAPHS[] PARAGRAPHS,
           boolean DEL,
           java.lang.String MONTYPE,
           java.lang.String MONSUBTYPE,
           java.lang.String LANG,
           boolean HASPI,
           boolean SAFETYRELEVANT,
           java.util.Calendar DT) {
           this.MONIDLANG = MONIDLANG;
           this.NAME = NAME;
           this.OWNER = OWNER;
           this.MONID = MONID;
           this.VERSION = VERSION;
           this.CONTENT = CONTENT;
           this.PARAGRAPHS = PARAGRAPHS;
           this.DEL = DEL;
           this.MONTYPE = MONTYPE;
           this.MONSUBTYPE = MONSUBTYPE;
           this.LANG = LANG;
           this.HASPI = HASPI;
           this.SAFETYRELEVANT = SAFETYRELEVANT;
           this.DT = DT;
    }


    /**
     * Gets the MONIDLANG value for this COMPENDIUMCP.
     * 
     * @return MONIDLANG
     */
    public java.lang.String getMONIDLANG() {
        return MONIDLANG;
    }


    /**
     * Sets the MONIDLANG value for this COMPENDIUMCP.
     * 
     * @param MONIDLANG
     */
    public void setMONIDLANG(java.lang.String MONIDLANG) {
        this.MONIDLANG = MONIDLANG;
    }


    /**
     * Gets the NAME value for this COMPENDIUMCP.
     * 
     * @return NAME
     */
    public webservice.hospindex.COMPENDIUMCPNAME getNAME() {
        return NAME;
    }


    /**
     * Sets the NAME value for this COMPENDIUMCP.
     * 
     * @param NAME
     */
    public void setNAME(webservice.hospindex.COMPENDIUMCPNAME NAME) {
        this.NAME = NAME;
    }


    /**
     * Gets the OWNER value for this COMPENDIUMCP.
     * 
     * @return OWNER
     */
    public java.lang.String getOWNER() {
        return OWNER;
    }


    /**
     * Sets the OWNER value for this COMPENDIUMCP.
     * 
     * @param OWNER
     */
    public void setOWNER(java.lang.String OWNER) {
        this.OWNER = OWNER;
    }


    /**
     * Gets the MONID value for this COMPENDIUMCP.
     * 
     * @return MONID
     */
    public int getMONID() {
        return MONID;
    }


    /**
     * Sets the MONID value for this COMPENDIUMCP.
     * 
     * @param MONID
     */
    public void setMONID(int MONID) {
        this.MONID = MONID;
    }


    /**
     * Gets the VERSION value for this COMPENDIUMCP.
     * 
     * @return VERSION
     */
    public java.lang.Integer getVERSION() {
        return VERSION;
    }


    /**
     * Sets the VERSION value for this COMPENDIUMCP.
     * 
     * @param VERSION
     */
    public void setVERSION(java.lang.Integer VERSION) {
        this.VERSION = VERSION;
    }


    /**
     * Gets the CONTENT value for this COMPENDIUMCP.
     * 
     * @return CONTENT
     */
    public webservice.hospindex.COMPENDIUMCPCONTENT getCONTENT() {
        return CONTENT;
    }


    /**
     * Sets the CONTENT value for this COMPENDIUMCP.
     * 
     * @param CONTENT
     */
    public void setCONTENT(webservice.hospindex.COMPENDIUMCPCONTENT CONTENT) {
        this.CONTENT = CONTENT;
    }


    /**
     * Gets the PARAGRAPHS value for this COMPENDIUMCP.
     * 
     * @return PARAGRAPHS
     */
    public webservice.hospindex.COMPENDIUMCPPARAGRAPHS[] getPARAGRAPHS() {
        return PARAGRAPHS;
    }


    /**
     * Sets the PARAGRAPHS value for this COMPENDIUMCP.
     * 
     * @param PARAGRAPHS
     */
    public void setPARAGRAPHS(webservice.hospindex.COMPENDIUMCPPARAGRAPHS[] PARAGRAPHS) {
        this.PARAGRAPHS = PARAGRAPHS;
    }

    public webservice.hospindex.COMPENDIUMCPPARAGRAPHS getPARAGRAPHS(int i) {
        return this.PARAGRAPHS[i];
    }

    public void setPARAGRAPHS(int i, webservice.hospindex.COMPENDIUMCPPARAGRAPHS _value) {
        this.PARAGRAPHS[i] = _value;
    }


    /**
     * Gets the DEL value for this COMPENDIUMCP.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this COMPENDIUMCP.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the MONTYPE value for this COMPENDIUMCP.
     * 
     * @return MONTYPE
     */
    public java.lang.String getMONTYPE() {
        return MONTYPE;
    }


    /**
     * Sets the MONTYPE value for this COMPENDIUMCP.
     * 
     * @param MONTYPE
     */
    public void setMONTYPE(java.lang.String MONTYPE) {
        this.MONTYPE = MONTYPE;
    }


    /**
     * Gets the MONSUBTYPE value for this COMPENDIUMCP.
     * 
     * @return MONSUBTYPE
     */
    public java.lang.String getMONSUBTYPE() {
        return MONSUBTYPE;
    }


    /**
     * Sets the MONSUBTYPE value for this COMPENDIUMCP.
     * 
     * @param MONSUBTYPE
     */
    public void setMONSUBTYPE(java.lang.String MONSUBTYPE) {
        this.MONSUBTYPE = MONSUBTYPE;
    }


    /**
     * Gets the LANG value for this COMPENDIUMCP.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this COMPENDIUMCP.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the HASPI value for this COMPENDIUMCP.
     * 
     * @return HASPI
     */
    public boolean isHASPI() {
        return HASPI;
    }


    /**
     * Sets the HASPI value for this COMPENDIUMCP.
     * 
     * @param HASPI
     */
    public void setHASPI(boolean HASPI) {
        this.HASPI = HASPI;
    }


    /**
     * Gets the SAFETYRELEVANT value for this COMPENDIUMCP.
     * 
     * @return SAFETYRELEVANT
     */
    public boolean isSAFETYRELEVANT() {
        return SAFETYRELEVANT;
    }


    /**
     * Sets the SAFETYRELEVANT value for this COMPENDIUMCP.
     * 
     * @param SAFETYRELEVANT
     */
    public void setSAFETYRELEVANT(boolean SAFETYRELEVANT) {
        this.SAFETYRELEVANT = SAFETYRELEVANT;
    }


    /**
     * Gets the DT value for this COMPENDIUMCP.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this COMPENDIUMCP.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof COMPENDIUMCP)) return false;
        COMPENDIUMCP other = (COMPENDIUMCP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MONIDLANG==null && other.getMONIDLANG()==null) || 
             (this.MONIDLANG!=null &&
              this.MONIDLANG.equals(other.getMONIDLANG()))) &&
            ((this.NAME==null && other.getNAME()==null) || 
             (this.NAME!=null &&
              this.NAME.equals(other.getNAME()))) &&
            ((this.OWNER==null && other.getOWNER()==null) || 
             (this.OWNER!=null &&
              this.OWNER.equals(other.getOWNER()))) &&
            this.MONID == other.getMONID() &&
            ((this.VERSION==null && other.getVERSION()==null) || 
             (this.VERSION!=null &&
              this.VERSION.equals(other.getVERSION()))) &&
            ((this.CONTENT==null && other.getCONTENT()==null) || 
             (this.CONTENT!=null &&
              this.CONTENT.equals(other.getCONTENT()))) &&
            ((this.PARAGRAPHS==null && other.getPARAGRAPHS()==null) || 
             (this.PARAGRAPHS!=null &&
              java.util.Arrays.equals(this.PARAGRAPHS, other.getPARAGRAPHS()))) &&
            this.DEL == other.isDEL() &&
            ((this.MONTYPE==null && other.getMONTYPE()==null) || 
             (this.MONTYPE!=null &&
              this.MONTYPE.equals(other.getMONTYPE()))) &&
            ((this.MONSUBTYPE==null && other.getMONSUBTYPE()==null) || 
             (this.MONSUBTYPE!=null &&
              this.MONSUBTYPE.equals(other.getMONSUBTYPE()))) &&
            ((this.LANG==null && other.getLANG()==null) || 
             (this.LANG!=null &&
              this.LANG.equals(other.getLANG()))) &&
            this.HASPI == other.isHASPI() &&
            this.SAFETYRELEVANT == other.isSAFETYRELEVANT() &&
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
        if (getMONIDLANG() != null) {
            _hashCode += getMONIDLANG().hashCode();
        }
        if (getNAME() != null) {
            _hashCode += getNAME().hashCode();
        }
        if (getOWNER() != null) {
            _hashCode += getOWNER().hashCode();
        }
        _hashCode += getMONID();
        if (getVERSION() != null) {
            _hashCode += getVERSION().hashCode();
        }
        if (getCONTENT() != null) {
            _hashCode += getCONTENT().hashCode();
        }
        if (getPARAGRAPHS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPARAGRAPHS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPARAGRAPHS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMONTYPE() != null) {
            _hashCode += getMONTYPE().hashCode();
        }
        if (getMONSUBTYPE() != null) {
            _hashCode += getMONSUBTYPE().hashCode();
        }
        if (getLANG() != null) {
            _hashCode += getLANG().hashCode();
        }
        _hashCode += (isHASPI() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSAFETYRELEVANT() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COMPENDIUMCP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>COMPENDIUM>CP"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MONTYPE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MONTYPE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MONSUBTYPE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MONSUBTYPE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("LANG");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LANG"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("HASPI");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HASPI"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SAFETYRELEVANT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SAFETYRELEVANT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONIDLANG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MONIDLANG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>NAME"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OWNER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "OWNER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VERSION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CONTENT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CONTENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>CONTENT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PARAGRAPHS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PARAGRAPHS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>PARAGRAPHS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
