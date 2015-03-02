/**
 * ArticleARTARTPRI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTPRI  implements java.io.Serializable {
    private java.util.Calendar VDAT;

    private java.lang.String PTYP;

    private double PRICE;

    public ArticleARTARTPRI() {
    }

    public ArticleARTARTPRI(
           java.util.Calendar VDAT,
           java.lang.String PTYP,
           double PRICE) {
           this.VDAT = VDAT;
           this.PTYP = PTYP;
           this.PRICE = PRICE;
    }


    /**
     * Gets the VDAT value for this ArticleARTARTPRI.
     * 
     * @return VDAT
     */
    public java.util.Calendar getVDAT() {
        return VDAT;
    }


    /**
     * Sets the VDAT value for this ArticleARTARTPRI.
     * 
     * @param VDAT
     */
    public void setVDAT(java.util.Calendar VDAT) {
        this.VDAT = VDAT;
    }


    /**
     * Gets the PTYP value for this ArticleARTARTPRI.
     * 
     * @return PTYP
     */
    public java.lang.String getPTYP() {
        return PTYP;
    }


    /**
     * Sets the PTYP value for this ArticleARTARTPRI.
     * 
     * @param PTYP
     */
    public void setPTYP(java.lang.String PTYP) {
        this.PTYP = PTYP;
    }


    /**
     * Gets the PRICE value for this ArticleARTARTPRI.
     * 
     * @return PRICE
     */
    public double getPRICE() {
        return PRICE;
    }


    /**
     * Sets the PRICE value for this ArticleARTARTPRI.
     * 
     * @param PRICE
     */
    public void setPRICE(double PRICE) {
        this.PRICE = PRICE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTPRI)) return false;
        ArticleARTARTPRI other = (ArticleARTARTPRI) obj;
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
            ((this.PTYP==null && other.getPTYP()==null) || 
             (this.PTYP!=null &&
              this.PTYP.equals(other.getPTYP()))) &&
            this.PRICE == other.getPRICE();
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
        if (getPTYP() != null) {
            _hashCode += getPTYP().hashCode();
        }
        _hashCode += new Double(getPRICE()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTPRI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTPRI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
