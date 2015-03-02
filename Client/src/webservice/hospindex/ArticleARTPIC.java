/**
 * ArticleARTPIC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTPIC  implements java.io.Serializable {
    private java.lang.String PTYP;

    private java.util.Calendar PDAT;

    public ArticleARTPIC() {
    }

    public ArticleARTPIC(
           java.lang.String PTYP,
           java.util.Calendar PDAT) {
           this.PTYP = PTYP;
           this.PDAT = PDAT;
    }


    /**
     * Gets the PTYP value for this ArticleARTPIC.
     * 
     * @return PTYP
     */
    public java.lang.String getPTYP() {
        return PTYP;
    }


    /**
     * Sets the PTYP value for this ArticleARTPIC.
     * 
     * @param PTYP
     */
    public void setPTYP(java.lang.String PTYP) {
        this.PTYP = PTYP;
    }


    /**
     * Gets the PDAT value for this ArticleARTPIC.
     * 
     * @return PDAT
     */
    public java.util.Calendar getPDAT() {
        return PDAT;
    }


    /**
     * Sets the PDAT value for this ArticleARTPIC.
     * 
     * @param PDAT
     */
    public void setPDAT(java.util.Calendar PDAT) {
        this.PDAT = PDAT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTPIC)) return false;
        ArticleARTPIC other = (ArticleARTPIC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PTYP==null && other.getPTYP()==null) || 
             (this.PTYP!=null &&
              this.PTYP.equals(other.getPTYP()))) &&
            ((this.PDAT==null && other.getPDAT()==null) || 
             (this.PDAT!=null &&
              this.PDAT.equals(other.getPDAT())));
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
        if (getPTYP() != null) {
            _hashCode += getPTYP().hashCode();
        }
        if (getPDAT() != null) {
            _hashCode += getPDAT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTPIC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>PIC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
