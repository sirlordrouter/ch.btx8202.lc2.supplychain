/**
 * Article_Proprietary_QuantityAPQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Article_Proprietary_QuantityAPQ  implements java.io.Serializable {
    private java.lang.String PHAR;

    private java.lang.Integer LNO;

    private java.lang.Double QTY1;

    private java.lang.String QTYU1;

    private java.lang.Double QTY2;

    private java.lang.String QTYU2;

    private java.lang.Boolean DEL;

    private java.util.Calendar DT;  // attribute

    public Article_Proprietary_QuantityAPQ() {
    }

    public Article_Proprietary_QuantityAPQ(
           java.lang.String PHAR,
           java.lang.Integer LNO,
           java.lang.Double QTY1,
           java.lang.String QTYU1,
           java.lang.Double QTY2,
           java.lang.String QTYU2,
           java.lang.Boolean DEL,
           java.util.Calendar DT) {
           this.PHAR = PHAR;
           this.LNO = LNO;
           this.QTY1 = QTY1;
           this.QTYU1 = QTYU1;
           this.QTY2 = QTY2;
           this.QTYU2 = QTYU2;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the PHAR value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return PHAR
     */
    public java.lang.String getPHAR() {
        return PHAR;
    }


    /**
     * Sets the PHAR value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param PHAR
     */
    public void setPHAR(java.lang.String PHAR) {
        this.PHAR = PHAR;
    }


    /**
     * Gets the LNO value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return LNO
     */
    public java.lang.Integer getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param LNO
     */
    public void setLNO(java.lang.Integer LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the QTY1 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return QTY1
     */
    public java.lang.Double getQTY1() {
        return QTY1;
    }


    /**
     * Sets the QTY1 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param QTY1
     */
    public void setQTY1(java.lang.Double QTY1) {
        this.QTY1 = QTY1;
    }


    /**
     * Gets the QTYU1 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return QTYU1
     */
    public java.lang.String getQTYU1() {
        return QTYU1;
    }


    /**
     * Sets the QTYU1 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param QTYU1
     */
    public void setQTYU1(java.lang.String QTYU1) {
        this.QTYU1 = QTYU1;
    }


    /**
     * Gets the QTY2 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return QTY2
     */
    public java.lang.Double getQTY2() {
        return QTY2;
    }


    /**
     * Sets the QTY2 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param QTY2
     */
    public void setQTY2(java.lang.Double QTY2) {
        this.QTY2 = QTY2;
    }


    /**
     * Gets the QTYU2 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return QTYU2
     */
    public java.lang.String getQTYU2() {
        return QTYU2;
    }


    /**
     * Sets the QTYU2 value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param QTYU2
     */
    public void setQTYU2(java.lang.String QTYU2) {
        this.QTYU2 = QTYU2;
    }


    /**
     * Gets the DEL value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return DEL
     */
    public java.lang.Boolean getDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param DEL
     */
    public void setDEL(java.lang.Boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this Article_Proprietary_QuantityAPQ.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this Article_Proprietary_QuantityAPQ.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article_Proprietary_QuantityAPQ)) return false;
        Article_Proprietary_QuantityAPQ other = (Article_Proprietary_QuantityAPQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PHAR==null && other.getPHAR()==null) || 
             (this.PHAR!=null &&
              this.PHAR.equals(other.getPHAR()))) &&
            ((this.LNO==null && other.getLNO()==null) || 
             (this.LNO!=null &&
              this.LNO.equals(other.getLNO()))) &&
            ((this.QTY1==null && other.getQTY1()==null) || 
             (this.QTY1!=null &&
              this.QTY1.equals(other.getQTY1()))) &&
            ((this.QTYU1==null && other.getQTYU1()==null) || 
             (this.QTYU1!=null &&
              this.QTYU1.equals(other.getQTYU1()))) &&
            ((this.QTY2==null && other.getQTY2()==null) || 
             (this.QTY2!=null &&
              this.QTY2.equals(other.getQTY2()))) &&
            ((this.QTYU2==null && other.getQTYU2()==null) || 
             (this.QTYU2!=null &&
              this.QTYU2.equals(other.getQTYU2()))) &&
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
        if (getPHAR() != null) {
            _hashCode += getPHAR().hashCode();
        }
        if (getLNO() != null) {
            _hashCode += getLNO().hashCode();
        }
        if (getQTY1() != null) {
            _hashCode += getQTY1().hashCode();
        }
        if (getQTYU1() != null) {
            _hashCode += getQTYU1().hashCode();
        }
        if (getQTY2() != null) {
            _hashCode += getQTY2().hashCode();
        }
        if (getQTYU2() != null) {
            _hashCode += getQTYU2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Article_Proprietary_QuantityAPQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article_Proprietary_Quantity>APQ"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PHAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTY1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTY1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTYU1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTYU1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTY2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTY2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTYU2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTYU2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
