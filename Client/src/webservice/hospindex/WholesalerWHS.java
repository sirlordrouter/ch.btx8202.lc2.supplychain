/**
 * WholesalerWHS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class WholesalerWHS  implements java.io.Serializable {
    private int WHSNO;

    private java.lang.String PLF;

    private java.lang.String WHSNAME;

    private java.lang.String PLFNAME;

    private boolean DEL;

    private java.util.Calendar DT;  // attribute

    public WholesalerWHS() {
    }

    public WholesalerWHS(
           int WHSNO,
           java.lang.String PLF,
           java.lang.String WHSNAME,
           java.lang.String PLFNAME,
           boolean DEL,
           java.util.Calendar DT) {
           this.WHSNO = WHSNO;
           this.PLF = PLF;
           this.WHSNAME = WHSNAME;
           this.PLFNAME = PLFNAME;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the WHSNO value for this WholesalerWHS.
     * 
     * @return WHSNO
     */
    public int getWHSNO() {
        return WHSNO;
    }


    /**
     * Sets the WHSNO value for this WholesalerWHS.
     * 
     * @param WHSNO
     */
    public void setWHSNO(int WHSNO) {
        this.WHSNO = WHSNO;
    }


    /**
     * Gets the PLF value for this WholesalerWHS.
     * 
     * @return PLF
     */
    public java.lang.String getPLF() {
        return PLF;
    }


    /**
     * Sets the PLF value for this WholesalerWHS.
     * 
     * @param PLF
     */
    public void setPLF(java.lang.String PLF) {
        this.PLF = PLF;
    }


    /**
     * Gets the WHSNAME value for this WholesalerWHS.
     * 
     * @return WHSNAME
     */
    public java.lang.String getWHSNAME() {
        return WHSNAME;
    }


    /**
     * Sets the WHSNAME value for this WholesalerWHS.
     * 
     * @param WHSNAME
     */
    public void setWHSNAME(java.lang.String WHSNAME) {
        this.WHSNAME = WHSNAME;
    }


    /**
     * Gets the PLFNAME value for this WholesalerWHS.
     * 
     * @return PLFNAME
     */
    public java.lang.String getPLFNAME() {
        return PLFNAME;
    }


    /**
     * Sets the PLFNAME value for this WholesalerWHS.
     * 
     * @param PLFNAME
     */
    public void setPLFNAME(java.lang.String PLFNAME) {
        this.PLFNAME = PLFNAME;
    }


    /**
     * Gets the DEL value for this WholesalerWHS.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this WholesalerWHS.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this WholesalerWHS.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this WholesalerWHS.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WholesalerWHS)) return false;
        WholesalerWHS other = (WholesalerWHS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.WHSNO == other.getWHSNO() &&
            ((this.PLF==null && other.getPLF()==null) || 
             (this.PLF!=null &&
              this.PLF.equals(other.getPLF()))) &&
            ((this.WHSNAME==null && other.getWHSNAME()==null) || 
             (this.WHSNAME!=null &&
              this.WHSNAME.equals(other.getWHSNAME()))) &&
            ((this.PLFNAME==null && other.getPLFNAME()==null) || 
             (this.PLFNAME!=null &&
              this.PLFNAME.equals(other.getPLFNAME()))) &&
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
        _hashCode += getWHSNO();
        if (getPLF() != null) {
            _hashCode += getPLF().hashCode();
        }
        if (getWHSNAME() != null) {
            _hashCode += getWHSNAME().hashCode();
        }
        if (getPLFNAME() != null) {
            _hashCode += getPLFNAME().hashCode();
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
        new org.apache.axis.description.TypeDesc(WholesalerWHS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Wholesaler>WHS"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHSNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHSNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PLF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHSNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHSNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLFNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PLFNAME"));
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
