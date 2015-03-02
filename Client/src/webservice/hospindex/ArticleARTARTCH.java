/**
 * ArticleARTARTCH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTCH  implements java.io.Serializable {
    private java.lang.String PHAR2;

    private webservice.hospindex.ArticleARTARTCHCHTYPE CHTYPE;

    private int LINENO;

    private java.lang.Double NOUNITS;

    public ArticleARTARTCH() {
    }

    public ArticleARTARTCH(
           java.lang.String PHAR2,
           webservice.hospindex.ArticleARTARTCHCHTYPE CHTYPE,
           int LINENO,
           java.lang.Double NOUNITS) {
           this.PHAR2 = PHAR2;
           this.CHTYPE = CHTYPE;
           this.LINENO = LINENO;
           this.NOUNITS = NOUNITS;
    }


    /**
     * Gets the PHAR2 value for this ArticleARTARTCH.
     * 
     * @return PHAR2
     */
    public java.lang.String getPHAR2() {
        return PHAR2;
    }


    /**
     * Sets the PHAR2 value for this ArticleARTARTCH.
     * 
     * @param PHAR2
     */
    public void setPHAR2(java.lang.String PHAR2) {
        this.PHAR2 = PHAR2;
    }


    /**
     * Gets the CHTYPE value for this ArticleARTARTCH.
     * 
     * @return CHTYPE
     */
    public webservice.hospindex.ArticleARTARTCHCHTYPE getCHTYPE() {
        return CHTYPE;
    }


    /**
     * Sets the CHTYPE value for this ArticleARTARTCH.
     * 
     * @param CHTYPE
     */
    public void setCHTYPE(webservice.hospindex.ArticleARTARTCHCHTYPE CHTYPE) {
        this.CHTYPE = CHTYPE;
    }


    /**
     * Gets the LINENO value for this ArticleARTARTCH.
     * 
     * @return LINENO
     */
    public int getLINENO() {
        return LINENO;
    }


    /**
     * Sets the LINENO value for this ArticleARTARTCH.
     * 
     * @param LINENO
     */
    public void setLINENO(int LINENO) {
        this.LINENO = LINENO;
    }


    /**
     * Gets the NOUNITS value for this ArticleARTARTCH.
     * 
     * @return NOUNITS
     */
    public java.lang.Double getNOUNITS() {
        return NOUNITS;
    }


    /**
     * Sets the NOUNITS value for this ArticleARTARTCH.
     * 
     * @param NOUNITS
     */
    public void setNOUNITS(java.lang.Double NOUNITS) {
        this.NOUNITS = NOUNITS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTCH)) return false;
        ArticleARTARTCH other = (ArticleARTARTCH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PHAR2==null && other.getPHAR2()==null) || 
             (this.PHAR2!=null &&
              this.PHAR2.equals(other.getPHAR2()))) &&
            ((this.CHTYPE==null && other.getCHTYPE()==null) || 
             (this.CHTYPE!=null &&
              this.CHTYPE.equals(other.getCHTYPE()))) &&
            this.LINENO == other.getLINENO() &&
            ((this.NOUNITS==null && other.getNOUNITS()==null) || 
             (this.NOUNITS!=null &&
              this.NOUNITS.equals(other.getNOUNITS())));
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
        if (getPHAR2() != null) {
            _hashCode += getPHAR2().hashCode();
        }
        if (getCHTYPE() != null) {
            _hashCode += getCHTYPE().hashCode();
        }
        _hashCode += getLINENO();
        if (getNOUNITS() != null) {
            _hashCode += getNOUNITS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTCH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTCH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHAR2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PHAR2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CHTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Article>ART>ARTCH>CHTYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINENO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LINENO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOUNITS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NOUNITS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
