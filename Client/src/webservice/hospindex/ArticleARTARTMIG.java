/**
 * ArticleARTARTMIG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTMIG  implements java.io.Serializable {
    private java.util.Calendar VDAT;

    private java.lang.String MIGCD;

    private int LINENO;

    public ArticleARTARTMIG() {
    }

    public ArticleARTARTMIG(
           java.util.Calendar VDAT,
           java.lang.String MIGCD,
           int LINENO) {
           this.VDAT = VDAT;
           this.MIGCD = MIGCD;
           this.LINENO = LINENO;
    }


    /**
     * Gets the VDAT value for this ArticleARTARTMIG.
     * 
     * @return VDAT
     */
    public java.util.Calendar getVDAT() {
        return VDAT;
    }


    /**
     * Sets the VDAT value for this ArticleARTARTMIG.
     * 
     * @param VDAT
     */
    public void setVDAT(java.util.Calendar VDAT) {
        this.VDAT = VDAT;
    }


    /**
     * Gets the MIGCD value for this ArticleARTARTMIG.
     * 
     * @return MIGCD
     */
    public java.lang.String getMIGCD() {
        return MIGCD;
    }


    /**
     * Sets the MIGCD value for this ArticleARTARTMIG.
     * 
     * @param MIGCD
     */
    public void setMIGCD(java.lang.String MIGCD) {
        this.MIGCD = MIGCD;
    }


    /**
     * Gets the LINENO value for this ArticleARTARTMIG.
     * 
     * @return LINENO
     */
    public int getLINENO() {
        return LINENO;
    }


    /**
     * Sets the LINENO value for this ArticleARTARTMIG.
     * 
     * @param LINENO
     */
    public void setLINENO(int LINENO) {
        this.LINENO = LINENO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTMIG)) return false;
        ArticleARTARTMIG other = (ArticleARTARTMIG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VDAT==null && other.getVDAT()==null) || 
             (this.VDAT!=null &&
              this.VDAT.equals(other.getVDAT()))) &&
            ((this.MIGCD==null && other.getMIGCD()==null) || 
             (this.MIGCD!=null &&
              this.MIGCD.equals(other.getMIGCD()))) &&
            this.LINENO == other.getLINENO();
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
        if (getVDAT() != null) {
            _hashCode += getVDAT().hashCode();
        }
        if (getMIGCD() != null) {
            _hashCode += getMIGCD().hashCode();
        }
        _hashCode += getLINENO();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTMIG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTMIG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MIGCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MIGCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINENO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LINENO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
