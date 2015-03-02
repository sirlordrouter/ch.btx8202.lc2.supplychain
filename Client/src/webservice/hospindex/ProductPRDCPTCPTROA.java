/**
 * ProductPRDCPTCPTROA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRDCPTCPTROA  implements java.io.Serializable {
    private java.lang.String SYSLOC;

    private java.lang.String ROA;

    public ProductPRDCPTCPTROA() {
    }

    public ProductPRDCPTCPTROA(
           java.lang.String SYSLOC,
           java.lang.String ROA) {
           this.SYSLOC = SYSLOC;
           this.ROA = ROA;
    }


    /**
     * Gets the SYSLOC value for this ProductPRDCPTCPTROA.
     * 
     * @return SYSLOC
     */
    public java.lang.String getSYSLOC() {
        return SYSLOC;
    }


    /**
     * Sets the SYSLOC value for this ProductPRDCPTCPTROA.
     * 
     * @param SYSLOC
     */
    public void setSYSLOC(java.lang.String SYSLOC) {
        this.SYSLOC = SYSLOC;
    }


    /**
     * Gets the ROA value for this ProductPRDCPTCPTROA.
     * 
     * @return ROA
     */
    public java.lang.String getROA() {
        return ROA;
    }


    /**
     * Sets the ROA value for this ProductPRDCPTCPTROA.
     * 
     * @param ROA
     */
    public void setROA(java.lang.String ROA) {
        this.ROA = ROA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPRDCPTCPTROA)) return false;
        ProductPRDCPTCPTROA other = (ProductPRDCPTCPTROA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SYSLOC==null && other.getSYSLOC()==null) || 
             (this.SYSLOC!=null &&
              this.SYSLOC.equals(other.getSYSLOC()))) &&
            ((this.ROA==null && other.getROA()==null) || 
             (this.ROA!=null &&
              this.ROA.equals(other.getROA())));
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
        if (getSYSLOC() != null) {
            _hashCode += getSYSLOC().hashCode();
        }
        if (getROA() != null) {
            _hashCode += getROA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPRDCPTCPTROA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTROA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSLOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SYSLOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ROA"));
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
