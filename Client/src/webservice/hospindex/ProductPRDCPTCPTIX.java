/**
 * ProductPRDCPTCPTIX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRDCPTCPTIX  implements java.io.Serializable {
    private int IXNO;

    private int GRP;

    private java.lang.Integer RLV;

    public ProductPRDCPTCPTIX() {
    }

    public ProductPRDCPTCPTIX(
           int IXNO,
           int GRP,
           java.lang.Integer RLV) {
           this.IXNO = IXNO;
           this.GRP = GRP;
           this.RLV = RLV;
    }


    /**
     * Gets the IXNO value for this ProductPRDCPTCPTIX.
     * 
     * @return IXNO
     */
    public int getIXNO() {
        return IXNO;
    }


    /**
     * Sets the IXNO value for this ProductPRDCPTCPTIX.
     * 
     * @param IXNO
     */
    public void setIXNO(int IXNO) {
        this.IXNO = IXNO;
    }


    /**
     * Gets the GRP value for this ProductPRDCPTCPTIX.
     * 
     * @return GRP
     */
    public int getGRP() {
        return GRP;
    }


    /**
     * Sets the GRP value for this ProductPRDCPTCPTIX.
     * 
     * @param GRP
     */
    public void setGRP(int GRP) {
        this.GRP = GRP;
    }


    /**
     * Gets the RLV value for this ProductPRDCPTCPTIX.
     * 
     * @return RLV
     */
    public java.lang.Integer getRLV() {
        return RLV;
    }


    /**
     * Sets the RLV value for this ProductPRDCPTCPTIX.
     * 
     * @param RLV
     */
    public void setRLV(java.lang.Integer RLV) {
        this.RLV = RLV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPRDCPTCPTIX)) return false;
        ProductPRDCPTCPTIX other = (ProductPRDCPTCPTIX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.IXNO == other.getIXNO() &&
            this.GRP == other.getGRP() &&
            ((this.RLV==null && other.getRLV()==null) || 
             (this.RLV!=null &&
              this.RLV.equals(other.getRLV())));
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
        _hashCode += getIXNO();
        _hashCode += getGRP();
        if (getRLV() != null) {
            _hashCode += getRLV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPRDCPTCPTIX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTIX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IXNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IXNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RLV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RLV"));
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
