/**
 * ArticleARTARTADR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTADR  implements java.io.Serializable {
    private java.lang.String ADRVAL;

    private java.lang.Boolean ENVHAZARD;

    private java.lang.Double NETQTY;

    private java.lang.String NETQTYU;

    private java.lang.String UNREC;

    private java.lang.Integer ADRPACKAGE;

    public ArticleARTARTADR() {
    }

    public ArticleARTARTADR(
           java.lang.String ADRVAL,
           java.lang.Boolean ENVHAZARD,
           java.lang.Double NETQTY,
           java.lang.String NETQTYU,
           java.lang.String UNREC,
           java.lang.Integer ADRPACKAGE) {
           this.ADRVAL = ADRVAL;
           this.ENVHAZARD = ENVHAZARD;
           this.NETQTY = NETQTY;
           this.NETQTYU = NETQTYU;
           this.UNREC = UNREC;
           this.ADRPACKAGE = ADRPACKAGE;
    }


    /**
     * Gets the ADRVAL value for this ArticleARTARTADR.
     * 
     * @return ADRVAL
     */
    public java.lang.String getADRVAL() {
        return ADRVAL;
    }


    /**
     * Sets the ADRVAL value for this ArticleARTARTADR.
     * 
     * @param ADRVAL
     */
    public void setADRVAL(java.lang.String ADRVAL) {
        this.ADRVAL = ADRVAL;
    }


    /**
     * Gets the ENVHAZARD value for this ArticleARTARTADR.
     * 
     * @return ENVHAZARD
     */
    public java.lang.Boolean getENVHAZARD() {
        return ENVHAZARD;
    }


    /**
     * Sets the ENVHAZARD value for this ArticleARTARTADR.
     * 
     * @param ENVHAZARD
     */
    public void setENVHAZARD(java.lang.Boolean ENVHAZARD) {
        this.ENVHAZARD = ENVHAZARD;
    }


    /**
     * Gets the NETQTY value for this ArticleARTARTADR.
     * 
     * @return NETQTY
     */
    public java.lang.Double getNETQTY() {
        return NETQTY;
    }


    /**
     * Sets the NETQTY value for this ArticleARTARTADR.
     * 
     * @param NETQTY
     */
    public void setNETQTY(java.lang.Double NETQTY) {
        this.NETQTY = NETQTY;
    }


    /**
     * Gets the NETQTYU value for this ArticleARTARTADR.
     * 
     * @return NETQTYU
     */
    public java.lang.String getNETQTYU() {
        return NETQTYU;
    }


    /**
     * Sets the NETQTYU value for this ArticleARTARTADR.
     * 
     * @param NETQTYU
     */
    public void setNETQTYU(java.lang.String NETQTYU) {
        this.NETQTYU = NETQTYU;
    }


    /**
     * Gets the UNREC value for this ArticleARTARTADR.
     * 
     * @return UNREC
     */
    public java.lang.String getUNREC() {
        return UNREC;
    }


    /**
     * Sets the UNREC value for this ArticleARTARTADR.
     * 
     * @param UNREC
     */
    public void setUNREC(java.lang.String UNREC) {
        this.UNREC = UNREC;
    }


    /**
     * Gets the ADRPACKAGE value for this ArticleARTARTADR.
     * 
     * @return ADRPACKAGE
     */
    public java.lang.Integer getADRPACKAGE() {
        return ADRPACKAGE;
    }


    /**
     * Sets the ADRPACKAGE value for this ArticleARTARTADR.
     * 
     * @param ADRPACKAGE
     */
    public void setADRPACKAGE(java.lang.Integer ADRPACKAGE) {
        this.ADRPACKAGE = ADRPACKAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTADR)) return false;
        ArticleARTARTADR other = (ArticleARTARTADR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ADRVAL==null && other.getADRVAL()==null) || 
             (this.ADRVAL!=null &&
              this.ADRVAL.equals(other.getADRVAL()))) &&
            ((this.ENVHAZARD==null && other.getENVHAZARD()==null) || 
             (this.ENVHAZARD!=null &&
              this.ENVHAZARD.equals(other.getENVHAZARD()))) &&
            ((this.NETQTY==null && other.getNETQTY()==null) || 
             (this.NETQTY!=null &&
              this.NETQTY.equals(other.getNETQTY()))) &&
            ((this.NETQTYU==null && other.getNETQTYU()==null) || 
             (this.NETQTYU!=null &&
              this.NETQTYU.equals(other.getNETQTYU()))) &&
            ((this.UNREC==null && other.getUNREC()==null) || 
             (this.UNREC!=null &&
              this.UNREC.equals(other.getUNREC()))) &&
            ((this.ADRPACKAGE==null && other.getADRPACKAGE()==null) || 
             (this.ADRPACKAGE!=null &&
              this.ADRPACKAGE.equals(other.getADRPACKAGE())));
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
        if (getADRVAL() != null) {
            _hashCode += getADRVAL().hashCode();
        }
        if (getENVHAZARD() != null) {
            _hashCode += getENVHAZARD().hashCode();
        }
        if (getNETQTY() != null) {
            _hashCode += getNETQTY().hashCode();
        }
        if (getNETQTYU() != null) {
            _hashCode += getNETQTYU().hashCode();
        }
        if (getUNREC() != null) {
            _hashCode += getUNREC().hashCode();
        }
        if (getADRPACKAGE() != null) {
            _hashCode += getADRPACKAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTADR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTADR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADRVAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADRVAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENVHAZARD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ENVHAZARD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETQTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NETQTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NETQTYU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NETQTYU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UNREC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "UNREC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADRPACKAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADRPACKAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
