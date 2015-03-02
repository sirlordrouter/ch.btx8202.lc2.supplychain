/**
 * Product_Substance_Alternative_QuantityPAQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Product_Substance_Alternative_QuantityPAQ  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger PRDNO;

    private int CPTLNO;

    private org.apache.axis.types.PositiveInteger SUBNO;

    private int CLNO;

    private int SBLNO;

    private int QULNO;

    private java.lang.Double QTY;

    private java.lang.String QTYU;

    private java.lang.Boolean NSFLAG;

    private java.lang.Boolean DEL;

    private java.util.Calendar DT;  // attribute

    public Product_Substance_Alternative_QuantityPAQ() {
    }

    public Product_Substance_Alternative_QuantityPAQ(
           org.apache.axis.types.PositiveInteger PRDNO,
           int CPTLNO,
           org.apache.axis.types.PositiveInteger SUBNO,
           int CLNO,
           int SBLNO,
           int QULNO,
           java.lang.Double QTY,
           java.lang.String QTYU,
           java.lang.Boolean NSFLAG,
           java.lang.Boolean DEL,
           java.util.Calendar DT) {
           this.PRDNO = PRDNO;
           this.CPTLNO = CPTLNO;
           this.SUBNO = SUBNO;
           this.CLNO = CLNO;
           this.SBLNO = SBLNO;
           this.QULNO = QULNO;
           this.QTY = QTY;
           this.QTYU = QTYU;
           this.NSFLAG = NSFLAG;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the PRDNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return PRDNO
     */
    public org.apache.axis.types.PositiveInteger getPRDNO() {
        return PRDNO;
    }


    /**
     * Sets the PRDNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param PRDNO
     */
    public void setPRDNO(org.apache.axis.types.PositiveInteger PRDNO) {
        this.PRDNO = PRDNO;
    }


    /**
     * Gets the CPTLNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return CPTLNO
     */
    public int getCPTLNO() {
        return CPTLNO;
    }


    /**
     * Sets the CPTLNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param CPTLNO
     */
    public void setCPTLNO(int CPTLNO) {
        this.CPTLNO = CPTLNO;
    }


    /**
     * Gets the SUBNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return SUBNO
     */
    public org.apache.axis.types.PositiveInteger getSUBNO() {
        return SUBNO;
    }


    /**
     * Sets the SUBNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param SUBNO
     */
    public void setSUBNO(org.apache.axis.types.PositiveInteger SUBNO) {
        this.SUBNO = SUBNO;
    }


    /**
     * Gets the CLNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return CLNO
     */
    public int getCLNO() {
        return CLNO;
    }


    /**
     * Sets the CLNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param CLNO
     */
    public void setCLNO(int CLNO) {
        this.CLNO = CLNO;
    }


    /**
     * Gets the SBLNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return SBLNO
     */
    public int getSBLNO() {
        return SBLNO;
    }


    /**
     * Sets the SBLNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param SBLNO
     */
    public void setSBLNO(int SBLNO) {
        this.SBLNO = SBLNO;
    }


    /**
     * Gets the QULNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return QULNO
     */
    public int getQULNO() {
        return QULNO;
    }


    /**
     * Sets the QULNO value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param QULNO
     */
    public void setQULNO(int QULNO) {
        this.QULNO = QULNO;
    }


    /**
     * Gets the QTY value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return QTY
     */
    public java.lang.Double getQTY() {
        return QTY;
    }


    /**
     * Sets the QTY value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param QTY
     */
    public void setQTY(java.lang.Double QTY) {
        this.QTY = QTY;
    }


    /**
     * Gets the QTYU value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return QTYU
     */
    public java.lang.String getQTYU() {
        return QTYU;
    }


    /**
     * Sets the QTYU value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param QTYU
     */
    public void setQTYU(java.lang.String QTYU) {
        this.QTYU = QTYU;
    }


    /**
     * Gets the NSFLAG value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return NSFLAG
     */
    public java.lang.Boolean getNSFLAG() {
        return NSFLAG;
    }


    /**
     * Sets the NSFLAG value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param NSFLAG
     */
    public void setNSFLAG(java.lang.Boolean NSFLAG) {
        this.NSFLAG = NSFLAG;
    }


    /**
     * Gets the DEL value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return DEL
     */
    public java.lang.Boolean getDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param DEL
     */
    public void setDEL(java.lang.Boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this Product_Substance_Alternative_QuantityPAQ.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product_Substance_Alternative_QuantityPAQ)) return false;
        Product_Substance_Alternative_QuantityPAQ other = (Product_Substance_Alternative_QuantityPAQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PRDNO==null && other.getPRDNO()==null) || 
             (this.PRDNO!=null &&
              this.PRDNO.equals(other.getPRDNO()))) &&
            this.CPTLNO == other.getCPTLNO() &&
            ((this.SUBNO==null && other.getSUBNO()==null) || 
             (this.SUBNO!=null &&
              this.SUBNO.equals(other.getSUBNO()))) &&
            this.CLNO == other.getCLNO() &&
            this.SBLNO == other.getSBLNO() &&
            this.QULNO == other.getQULNO() &&
            ((this.QTY==null && other.getQTY()==null) || 
             (this.QTY!=null &&
              this.QTY.equals(other.getQTY()))) &&
            ((this.QTYU==null && other.getQTYU()==null) || 
             (this.QTYU!=null &&
              this.QTYU.equals(other.getQTYU()))) &&
            ((this.NSFLAG==null && other.getNSFLAG()==null) || 
             (this.NSFLAG!=null &&
              this.NSFLAG.equals(other.getNSFLAG()))) &&
            ((this.DEL==null && other.getDEL()==null) || 
             (this.DEL!=null &&
              this.DEL.equals(other.getDEL()))) &&
            ((this.DT==null && other.getDT()==null) || 
             (this.DT!=null &&
              this.DT.equals(other.getDT())));
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
        if (getPRDNO() != null) {
            _hashCode += getPRDNO().hashCode();
        }
        _hashCode += getCPTLNO();
        if (getSUBNO() != null) {
            _hashCode += getSUBNO().hashCode();
        }
        _hashCode += getCLNO();
        _hashCode += getSBLNO();
        _hashCode += getQULNO();
        if (getQTY() != null) {
            _hashCode += getQTY().hashCode();
        }
        if (getQTYU() != null) {
            _hashCode += getQTYU().hashCode();
        }
        if (getNSFLAG() != null) {
            _hashCode += getNSFLAG().hashCode();
        }
        if (getDEL() != null) {
            _hashCode += getDEL().hashCode();
        }
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product_Substance_Alternative_QuantityPAQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Substance_Alternative_Quantity>PAQ"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SUBNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SUBNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SBLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QULNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QULNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("NSFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NSFLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
