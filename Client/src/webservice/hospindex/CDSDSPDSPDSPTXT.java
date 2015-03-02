/**
 * CDSDSPDSPDSPTXT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSDSPDSPDSPTXT  implements java.io.Serializable {
    private int LNO;

    private java.lang.String LANG;

    private java.lang.String PTITLE;

    private java.lang.String TXT;

    private java.lang.String TXTHTML;

    public CDSDSPDSPDSPTXT() {
    }

    public CDSDSPDSPDSPTXT(
           int LNO,
           java.lang.String LANG,
           java.lang.String PTITLE,
           java.lang.String TXT,
           java.lang.String TXTHTML) {
           this.LNO = LNO;
           this.LANG = LANG;
           this.PTITLE = PTITLE;
           this.TXT = TXT;
           this.TXTHTML = TXTHTML;
    }


    /**
     * Gets the LNO value for this CDSDSPDSPDSPTXT.
     * 
     * @return LNO
     */
    public int getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this CDSDSPDSPDSPTXT.
     * 
     * @param LNO
     */
    public void setLNO(int LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the LANG value for this CDSDSPDSPDSPTXT.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this CDSDSPDSPDSPTXT.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the PTITLE value for this CDSDSPDSPDSPTXT.
     * 
     * @return PTITLE
     */
    public java.lang.String getPTITLE() {
        return PTITLE;
    }


    /**
     * Sets the PTITLE value for this CDSDSPDSPDSPTXT.
     * 
     * @param PTITLE
     */
    public void setPTITLE(java.lang.String PTITLE) {
        this.PTITLE = PTITLE;
    }


    /**
     * Gets the TXT value for this CDSDSPDSPDSPTXT.
     * 
     * @return TXT
     */
    public java.lang.String getTXT() {
        return TXT;
    }


    /**
     * Sets the TXT value for this CDSDSPDSPDSPTXT.
     * 
     * @param TXT
     */
    public void setTXT(java.lang.String TXT) {
        this.TXT = TXT;
    }


    /**
     * Gets the TXTHTML value for this CDSDSPDSPDSPTXT.
     * 
     * @return TXTHTML
     */
    public java.lang.String getTXTHTML() {
        return TXTHTML;
    }


    /**
     * Sets the TXTHTML value for this CDSDSPDSPDSPTXT.
     * 
     * @param TXTHTML
     */
    public void setTXTHTML(java.lang.String TXTHTML) {
        this.TXTHTML = TXTHTML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSDSPDSPDSPTXT)) return false;
        CDSDSPDSPDSPTXT other = (CDSDSPDSPDSPTXT) obj;
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
            ((this.TXT==null && other.getTXT()==null) || 
             (this.TXT!=null &&
              this.TXT.equals(other.getTXT()))) &&
            ((this.TXTHTML==null && other.getTXTHTML()==null) || 
             (this.TXTHTML!=null &&
              this.TXTHTML.equals(other.getTXTHTML())));
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
        if (getTXT() != null) {
            _hashCode += getTXT().hashCode();
        }
        if (getTXTHTML() != null) {
            _hashCode += getTXTHTML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSDSPDSPDSPTXT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPTXT"));
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
        elemField.setFieldName("TXT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXTHTML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TXTHTML"));
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
