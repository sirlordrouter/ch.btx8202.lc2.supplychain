/**
 * ProductPRDCPTCPTCMP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRDCPTCPTCMP  implements java.io.Serializable {
    private int LINE;

    private int SUBNO;

    private java.lang.String QTY;

    private java.lang.String QTYU;

    private java.lang.String WHK;

    public ProductPRDCPTCPTCMP() {
    }

    public ProductPRDCPTCPTCMP(
           int LINE,
           int SUBNO,
           java.lang.String QTY,
           java.lang.String QTYU,
           java.lang.String WHK) {
           this.LINE = LINE;
           this.SUBNO = SUBNO;
           this.QTY = QTY;
           this.QTYU = QTYU;
           this.WHK = WHK;
    }


    /**
     * Gets the LINE value for this ProductPRDCPTCPTCMP.
     * 
     * @return LINE
     */
    public int getLINE() {
        return LINE;
    }


    /**
     * Sets the LINE value for this ProductPRDCPTCPTCMP.
     * 
     * @param LINE
     */
    public void setLINE(int LINE) {
        this.LINE = LINE;
    }


    /**
     * Gets the SUBNO value for this ProductPRDCPTCPTCMP.
     * 
     * @return SUBNO
     */
    public int getSUBNO() {
        return SUBNO;
    }


    /**
     * Sets the SUBNO value for this ProductPRDCPTCPTCMP.
     * 
     * @param SUBNO
     */
    public void setSUBNO(int SUBNO) {
        this.SUBNO = SUBNO;
    }


    /**
     * Gets the QTY value for this ProductPRDCPTCPTCMP.
     * 
     * @return QTY
     */
    public java.lang.String getQTY() {
        return QTY;
    }


    /**
     * Sets the QTY value for this ProductPRDCPTCPTCMP.
     * 
     * @param QTY
     */
    public void setQTY(java.lang.String QTY) {
        this.QTY = QTY;
    }


    /**
     * Gets the QTYU value for this ProductPRDCPTCPTCMP.
     * 
     * @return QTYU
     */
    public java.lang.String getQTYU() {
        return QTYU;
    }


    /**
     * Sets the QTYU value for this ProductPRDCPTCPTCMP.
     * 
     * @param QTYU
     */
    public void setQTYU(java.lang.String QTYU) {
        this.QTYU = QTYU;
    }


    /**
     * Gets the WHK value for this ProductPRDCPTCPTCMP.
     * 
     * @return WHK
     */
    public java.lang.String getWHK() {
        return WHK;
    }


    /**
     * Sets the WHK value for this ProductPRDCPTCPTCMP.
     * 
     * @param WHK
     */
    public void setWHK(java.lang.String WHK) {
        this.WHK = WHK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPRDCPTCPTCMP)) return false;
        ProductPRDCPTCPTCMP other = (ProductPRDCPTCPTCMP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.LINE == other.getLINE() &&
            this.SUBNO == other.getSUBNO() &&
            ((this.QTY==null && other.getQTY()==null) || 
             (this.QTY!=null &&
              this.QTY.equals(other.getQTY()))) &&
            ((this.QTYU==null && other.getQTYU()==null) || 
             (this.QTYU!=null &&
              this.QTYU.equals(other.getQTYU()))) &&
            ((this.WHK==null && other.getWHK()==null) || 
             (this.WHK!=null &&
              this.WHK.equals(other.getWHK())));
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
        _hashCode += getLINE();
        _hashCode += getSUBNO();
        if (getQTY() != null) {
            _hashCode += getQTY().hashCode();
        }
        if (getQTYU() != null) {
            _hashCode += getQTYU().hashCode();
        }
        if (getWHK() != null) {
            _hashCode += getWHK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPRDCPTCPTCMP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTCMP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LINE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUBNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SUBNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTYU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTYU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHK"));
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
