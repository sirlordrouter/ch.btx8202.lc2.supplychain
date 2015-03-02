/**
 * ArticleARTARTINS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTINS  implements java.io.Serializable {
    private java.util.Calendar VDAT;

    private java.lang.Integer INCD;

    private int NINCD;

    public ArticleARTARTINS() {
    }

    public ArticleARTARTINS(
           java.util.Calendar VDAT,
           java.lang.Integer INCD,
           int NINCD) {
           this.VDAT = VDAT;
           this.INCD = INCD;
           this.NINCD = NINCD;
    }


    /**
     * Gets the VDAT value for this ArticleARTARTINS.
     * 
     * @return VDAT
     */
    public java.util.Calendar getVDAT() {
        return VDAT;
    }


    /**
     * Sets the VDAT value for this ArticleARTARTINS.
     * 
     * @param VDAT
     */
    public void setVDAT(java.util.Calendar VDAT) {
        this.VDAT = VDAT;
    }


    /**
     * Gets the INCD value for this ArticleARTARTINS.
     * 
     * @return INCD
     */
    public java.lang.Integer getINCD() {
        return INCD;
    }


    /**
     * Sets the INCD value for this ArticleARTARTINS.
     * 
     * @param INCD
     */
    public void setINCD(java.lang.Integer INCD) {
        this.INCD = INCD;
    }


    /**
     * Gets the NINCD value for this ArticleARTARTINS.
     * 
     * @return NINCD
     */
    public int getNINCD() {
        return NINCD;
    }


    /**
     * Sets the NINCD value for this ArticleARTARTINS.
     * 
     * @param NINCD
     */
    public void setNINCD(int NINCD) {
        this.NINCD = NINCD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTINS)) return false;
        ArticleARTARTINS other = (ArticleARTARTINS) obj;
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
            ((this.INCD==null && other.getINCD()==null) || 
             (this.INCD!=null &&
              this.INCD.equals(other.getINCD()))) &&
            this.NINCD == other.getNINCD();
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
        if (getINCD() != null) {
            _hashCode += getINCD().hashCode();
        }
        _hashCode += getNINCD();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTINS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTINS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "INCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NINCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NINCD"));
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
