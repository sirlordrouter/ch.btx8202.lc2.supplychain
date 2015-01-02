/**
 * PHARMAITEMCOMP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.swissindex;

public class PHARMAITEMCOMP  implements java.io.Serializable {
    private java.lang.String NAME;

    private java.lang.String GLN;

    public PHARMAITEMCOMP() {
    }

    public PHARMAITEMCOMP(
           java.lang.String NAME,
           java.lang.String GLN) {
           this.NAME = NAME;
           this.GLN = GLN;
    }


    /**
     * Gets the NAME value for this PHARMAITEMCOMP.
     * 
     * @return NAME
     */
    public java.lang.String getNAME() {
        return NAME;
    }


    /**
     * Sets the NAME value for this PHARMAITEMCOMP.
     * 
     * @param NAME
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }


    /**
     * Gets the GLN value for this PHARMAITEMCOMP.
     * 
     * @return GLN
     */
    public java.lang.String getGLN() {
        return GLN;
    }


    /**
     * Sets the GLN value for this PHARMAITEMCOMP.
     * 
     * @param GLN
     */
    public void setGLN(java.lang.String GLN) {
        this.GLN = GLN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PHARMAITEMCOMP)) return false;
        PHARMAITEMCOMP other = (PHARMAITEMCOMP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NAME==null && other.getNAME()==null) || 
             (this.NAME!=null &&
              this.NAME.equals(other.getNAME()))) &&
            ((this.GLN==null && other.getGLN()==null) || 
             (this.GLN!=null &&
              this.GLN.equals(other.getGLN())));
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
        if (getNAME() != null) {
            _hashCode += getNAME().hashCode();
        }
        if (getGLN() != null) {
            _hashCode += getGLN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PHARMAITEMCOMP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>>PHARMA>ITEM>COMP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "GLN"));
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
