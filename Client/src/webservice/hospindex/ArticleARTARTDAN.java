/**
 * ArticleARTARTDAN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTDAN  implements java.io.Serializable {
    private java.lang.String CDTYP;

    private int LINENO;

    private java.lang.String CDVAL;

    public ArticleARTARTDAN() {
    }

    public ArticleARTARTDAN(
           java.lang.String CDTYP,
           int LINENO,
           java.lang.String CDVAL) {
           this.CDTYP = CDTYP;
           this.LINENO = LINENO;
           this.CDVAL = CDVAL;
    }


    /**
     * Gets the CDTYP value for this ArticleARTARTDAN.
     * 
     * @return CDTYP
     */
    public java.lang.String getCDTYP() {
        return CDTYP;
    }


    /**
     * Sets the CDTYP value for this ArticleARTARTDAN.
     * 
     * @param CDTYP
     */
    public void setCDTYP(java.lang.String CDTYP) {
        this.CDTYP = CDTYP;
    }


    /**
     * Gets the LINENO value for this ArticleARTARTDAN.
     * 
     * @return LINENO
     */
    public int getLINENO() {
        return LINENO;
    }


    /**
     * Sets the LINENO value for this ArticleARTARTDAN.
     * 
     * @param LINENO
     */
    public void setLINENO(int LINENO) {
        this.LINENO = LINENO;
    }


    /**
     * Gets the CDVAL value for this ArticleARTARTDAN.
     * 
     * @return CDVAL
     */
    public java.lang.String getCDVAL() {
        return CDVAL;
    }


    /**
     * Sets the CDVAL value for this ArticleARTARTDAN.
     * 
     * @param CDVAL
     */
    public void setCDVAL(java.lang.String CDVAL) {
        this.CDVAL = CDVAL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTDAN)) return false;
        ArticleARTARTDAN other = (ArticleARTARTDAN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDTYP==null && other.getCDTYP()==null) || 
             (this.CDTYP!=null &&
              this.CDTYP.equals(other.getCDTYP()))) &&
            this.LINENO == other.getLINENO() &&
            ((this.CDVAL==null && other.getCDVAL()==null) || 
             (this.CDVAL!=null &&
              this.CDVAL.equals(other.getCDVAL())));
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
        if (getCDTYP() != null) {
            _hashCode += getCDTYP().hashCode();
        }
        _hashCode += getLINENO();
        if (getCDVAL() != null) {
            _hashCode += getCDVAL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTDAN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTDAN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDTYP"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDVAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDVAL"));
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
