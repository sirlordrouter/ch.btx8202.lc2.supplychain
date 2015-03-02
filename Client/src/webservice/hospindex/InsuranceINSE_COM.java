/**
 * InsuranceINSE_COM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class InsuranceINSE_COM  implements java.io.Serializable {
    private webservice.hospindex.InsuranceINSE_COMART ART;

    private webservice.hospindex.InsuranceINSE_COMTYPE TYPE;

    private java.lang.String VALUE;

    public InsuranceINSE_COM() {
    }

    public InsuranceINSE_COM(
           webservice.hospindex.InsuranceINSE_COMART ART,
           webservice.hospindex.InsuranceINSE_COMTYPE TYPE,
           java.lang.String VALUE) {
           this.ART = ART;
           this.TYPE = TYPE;
           this.VALUE = VALUE;
    }


    /**
     * Gets the ART value for this InsuranceINSE_COM.
     * 
     * @return ART
     */
    public webservice.hospindex.InsuranceINSE_COMART getART() {
        return ART;
    }


    /**
     * Sets the ART value for this InsuranceINSE_COM.
     * 
     * @param ART
     */
    public void setART(webservice.hospindex.InsuranceINSE_COMART ART) {
        this.ART = ART;
    }


    /**
     * Gets the TYPE value for this InsuranceINSE_COM.
     * 
     * @return TYPE
     */
    public webservice.hospindex.InsuranceINSE_COMTYPE getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this InsuranceINSE_COM.
     * 
     * @param TYPE
     */
    public void setTYPE(webservice.hospindex.InsuranceINSE_COMTYPE TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the VALUE value for this InsuranceINSE_COM.
     * 
     * @return VALUE
     */
    public java.lang.String getVALUE() {
        return VALUE;
    }


    /**
     * Sets the VALUE value for this InsuranceINSE_COM.
     * 
     * @param VALUE
     */
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuranceINSE_COM)) return false;
        InsuranceINSE_COM other = (InsuranceINSE_COM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ART==null && other.getART()==null) || 
             (this.ART!=null &&
              this.ART.equals(other.getART()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.VALUE==null && other.getVALUE()==null) || 
             (this.VALUE!=null &&
              this.VALUE.equals(other.getVALUE())));
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
        if (getART() != null) {
            _hashCode += getART().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getVALUE() != null) {
            _hashCode += getVALUE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsuranceINSE_COM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>E_COM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>E_COM>ART"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>E_COM>TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VALUE"));
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
