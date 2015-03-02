/**
 * ArticleARTSIZE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTSIZE  implements java.io.Serializable {
    private java.lang.Double WIDTH;

    private java.lang.Double HEIGHT;

    private java.lang.Double DEPTH;

    public ArticleARTSIZE() {
    }

    public ArticleARTSIZE(
           java.lang.Double WIDTH,
           java.lang.Double HEIGHT,
           java.lang.Double DEPTH) {
           this.WIDTH = WIDTH;
           this.HEIGHT = HEIGHT;
           this.DEPTH = DEPTH;
    }


    /**
     * Gets the WIDTH value for this ArticleARTSIZE.
     * 
     * @return WIDTH
     */
    public java.lang.Double getWIDTH() {
        return WIDTH;
    }


    /**
     * Sets the WIDTH value for this ArticleARTSIZE.
     * 
     * @param WIDTH
     */
    public void setWIDTH(java.lang.Double WIDTH) {
        this.WIDTH = WIDTH;
    }


    /**
     * Gets the HEIGHT value for this ArticleARTSIZE.
     * 
     * @return HEIGHT
     */
    public java.lang.Double getHEIGHT() {
        return HEIGHT;
    }


    /**
     * Sets the HEIGHT value for this ArticleARTSIZE.
     * 
     * @param HEIGHT
     */
    public void setHEIGHT(java.lang.Double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }


    /**
     * Gets the DEPTH value for this ArticleARTSIZE.
     * 
     * @return DEPTH
     */
    public java.lang.Double getDEPTH() {
        return DEPTH;
    }


    /**
     * Sets the DEPTH value for this ArticleARTSIZE.
     * 
     * @param DEPTH
     */
    public void setDEPTH(java.lang.Double DEPTH) {
        this.DEPTH = DEPTH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTSIZE)) return false;
        ArticleARTSIZE other = (ArticleARTSIZE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.WIDTH==null && other.getWIDTH()==null) || 
             (this.WIDTH!=null &&
              this.WIDTH.equals(other.getWIDTH()))) &&
            ((this.HEIGHT==null && other.getHEIGHT()==null) || 
             (this.HEIGHT!=null &&
              this.HEIGHT.equals(other.getHEIGHT()))) &&
            ((this.DEPTH==null && other.getDEPTH()==null) || 
             (this.DEPTH!=null &&
              this.DEPTH.equals(other.getDEPTH())));
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
        if (getWIDTH() != null) {
            _hashCode += getWIDTH().hashCode();
        }
        if (getHEIGHT() != null) {
            _hashCode += getHEIGHT().hashCode();
        }
        if (getDEPTH() != null) {
            _hashCode += getDEPTH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTSIZE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SIZE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WIDTH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WIDTH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HEIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "HEIGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPTH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEPTH"));
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
