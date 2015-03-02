/**
 * CDSDSPDSPDSPLNK.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSDSPDSPDSPLNK  implements java.io.Serializable {
    private int LNO;

    private java.lang.String LANG;

    private java.lang.String PTITLE;

    private java.lang.String URL;

    private java.lang.String REMARK;

    public CDSDSPDSPDSPLNK() {
    }

    public CDSDSPDSPDSPLNK(
           int LNO,
           java.lang.String LANG,
           java.lang.String PTITLE,
           java.lang.String URL,
           java.lang.String REMARK) {
           this.LNO = LNO;
           this.LANG = LANG;
           this.PTITLE = PTITLE;
           this.URL = URL;
           this.REMARK = REMARK;
    }


    /**
     * Gets the LNO value for this CDSDSPDSPDSPLNK.
     * 
     * @return LNO
     */
    public int getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this CDSDSPDSPDSPLNK.
     * 
     * @param LNO
     */
    public void setLNO(int LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the LANG value for this CDSDSPDSPDSPLNK.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this CDSDSPDSPDSPLNK.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the PTITLE value for this CDSDSPDSPDSPLNK.
     * 
     * @return PTITLE
     */
    public java.lang.String getPTITLE() {
        return PTITLE;
    }


    /**
     * Sets the PTITLE value for this CDSDSPDSPDSPLNK.
     * 
     * @param PTITLE
     */
    public void setPTITLE(java.lang.String PTITLE) {
        this.PTITLE = PTITLE;
    }


    /**
     * Gets the URL value for this CDSDSPDSPDSPLNK.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this CDSDSPDSPDSPLNK.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the REMARK value for this CDSDSPDSPDSPLNK.
     * 
     * @return REMARK
     */
    public java.lang.String getREMARK() {
        return REMARK;
    }


    /**
     * Sets the REMARK value for this CDSDSPDSPDSPLNK.
     * 
     * @param REMARK
     */
    public void setREMARK(java.lang.String REMARK) {
        this.REMARK = REMARK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSDSPDSPDSPLNK)) return false;
        CDSDSPDSPDSPLNK other = (CDSDSPDSPDSPLNK) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.LNO == other.getLNO() &&
            ((this.LANG==null && other.getLANG()==null) || 
             (this.LANG!=null &&
              this.LANG.equals(other.getLANG()))) &&
            ((this.PTITLE==null && other.getPTITLE()==null) || 
             (this.PTITLE!=null &&
              this.PTITLE.equals(other.getPTITLE()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.REMARK==null && other.getREMARK()==null) || 
             (this.REMARK!=null &&
              this.REMARK.equals(other.getREMARK())));
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
        _hashCode += getLNO();
        if (getLANG() != null) {
            _hashCode += getLANG().hashCode();
        }
        if (getPTITLE() != null) {
            _hashCode += getPTITLE().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getREMARK() != null) {
            _hashCode += getREMARK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSDSPDSPDSPLNK.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPLNK"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LANG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LANG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PTITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMARK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REMARK"));
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
