/**
 * ArticleARTARTLIM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTLIM  implements java.io.Serializable {
    private java.lang.String LIMCD;

    public ArticleARTARTLIM() {
    }

    public ArticleARTARTLIM(
           java.lang.String LIMCD) {
           this.LIMCD = LIMCD;
    }


    /**
     * Gets the LIMCD value for this ArticleARTARTLIM.
     * 
     * @return LIMCD
     */
    public java.lang.String getLIMCD() {
        return LIMCD;
    }


    /**
     * Sets the LIMCD value for this ArticleARTARTLIM.
     * 
     * @param LIMCD
     */
    public void setLIMCD(java.lang.String LIMCD) {
        this.LIMCD = LIMCD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTLIM)) return false;
        ArticleARTARTLIM other = (ArticleARTARTLIM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LIMCD==null && other.getLIMCD()==null) || 
             (this.LIMCD!=null &&
              this.LIMCD.equals(other.getLIMCD())));
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
        if (getLIMCD() != null) {
            _hashCode += getLIMCD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTLIM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTLIM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIMCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LIMCD"));
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
