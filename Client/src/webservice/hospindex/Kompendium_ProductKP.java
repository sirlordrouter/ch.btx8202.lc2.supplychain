/**
 * Kompendium_ProductKP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Kompendium_ProductKP  implements java.io.Serializable {
    private int MONID;

    private java.lang.String CDTEXTTYPE;

    private int PRDNO;

    private boolean DEL;

    private java.util.Calendar DT;  // attribute

    public Kompendium_ProductKP() {
    }

    public Kompendium_ProductKP(
           int MONID,
           java.lang.String CDTEXTTYPE,
           int PRDNO,
           boolean DEL,
           java.util.Calendar DT) {
           this.MONID = MONID;
           this.CDTEXTTYPE = CDTEXTTYPE;
           this.PRDNO = PRDNO;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the MONID value for this Kompendium_ProductKP.
     * 
     * @return MONID
     */
    public int getMONID() {
        return MONID;
    }


    /**
     * Sets the MONID value for this Kompendium_ProductKP.
     * 
     * @param MONID
     */
    public void setMONID(int MONID) {
        this.MONID = MONID;
    }


    /**
     * Gets the CDTEXTTYPE value for this Kompendium_ProductKP.
     * 
     * @return CDTEXTTYPE
     */
    public java.lang.String getCDTEXTTYPE() {
        return CDTEXTTYPE;
    }


    /**
     * Sets the CDTEXTTYPE value for this Kompendium_ProductKP.
     * 
     * @param CDTEXTTYPE
     */
    public void setCDTEXTTYPE(java.lang.String CDTEXTTYPE) {
        this.CDTEXTTYPE = CDTEXTTYPE;
    }


    /**
     * Gets the PRDNO value for this Kompendium_ProductKP.
     * 
     * @return PRDNO
     */
    public int getPRDNO() {
        return PRDNO;
    }


    /**
     * Sets the PRDNO value for this Kompendium_ProductKP.
     * 
     * @param PRDNO
     */
    public void setPRDNO(int PRDNO) {
        this.PRDNO = PRDNO;
    }


    /**
     * Gets the DEL value for this Kompendium_ProductKP.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this Kompendium_ProductKP.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this Kompendium_ProductKP.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this Kompendium_ProductKP.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kompendium_ProductKP)) return false;
        Kompendium_ProductKP other = (Kompendium_ProductKP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.MONID == other.getMONID() &&
            ((this.CDTEXTTYPE==null && other.getCDTEXTTYPE()==null) || 
             (this.CDTEXTTYPE!=null &&
              this.CDTEXTTYPE.equals(other.getCDTEXTTYPE()))) &&
            this.PRDNO == other.getPRDNO() &&
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
        _hashCode += getMONID();
        if (getCDTEXTTYPE() != null) {
            _hashCode += getCDTEXTTYPE().hashCode();
        }
        _hashCode += getPRDNO();
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Kompendium_ProductKP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Kompendium_Product>KP"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MONID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDTEXTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDTEXTTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
