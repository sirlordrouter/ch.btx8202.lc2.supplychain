/**
 * Product_Proprietary_QuantityPQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Product_Proprietary_QuantityPQ  implements java.io.Serializable {
    private java.lang.Integer PRDNO;

    private java.lang.Integer CPTLNO;

    private java.lang.Integer LNO;

    private java.lang.Double STDQTY;

    private java.lang.String STDQTYU;

    private java.lang.Double PRPQTY;

    private java.lang.String PRPQTYU;

    private java.lang.Integer DIV;

    private java.lang.Boolean DEL;

    private java.util.Calendar DT;  // attribute

    public Product_Proprietary_QuantityPQ() {
    }

    public Product_Proprietary_QuantityPQ(
           java.lang.Integer PRDNO,
           java.lang.Integer CPTLNO,
           java.lang.Integer LNO,
           java.lang.Double STDQTY,
           java.lang.String STDQTYU,
           java.lang.Double PRPQTY,
           java.lang.String PRPQTYU,
           java.lang.Integer DIV,
           java.lang.Boolean DEL,
           java.util.Calendar DT) {
           this.PRDNO = PRDNO;
           this.CPTLNO = CPTLNO;
           this.LNO = LNO;
           this.STDQTY = STDQTY;
           this.STDQTYU = STDQTYU;
           this.PRPQTY = PRPQTY;
           this.PRPQTYU = PRPQTYU;
           this.DIV = DIV;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the PRDNO value for this Product_Proprietary_QuantityPQ.
     * 
     * @return PRDNO
     */
    public java.lang.Integer getPRDNO() {
        return PRDNO;
    }


    /**
     * Sets the PRDNO value for this Product_Proprietary_QuantityPQ.
     * 
     * @param PRDNO
     */
    public void setPRDNO(java.lang.Integer PRDNO) {
        this.PRDNO = PRDNO;
    }


    /**
     * Gets the CPTLNO value for this Product_Proprietary_QuantityPQ.
     * 
     * @return CPTLNO
     */
    public java.lang.Integer getCPTLNO() {
        return CPTLNO;
    }


    /**
     * Sets the CPTLNO value for this Product_Proprietary_QuantityPQ.
     * 
     * @param CPTLNO
     */
    public void setCPTLNO(java.lang.Integer CPTLNO) {
        this.CPTLNO = CPTLNO;
    }


    /**
     * Gets the LNO value for this Product_Proprietary_QuantityPQ.
     * 
     * @return LNO
     */
    public java.lang.Integer getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this Product_Proprietary_QuantityPQ.
     * 
     * @param LNO
     */
    public void setLNO(java.lang.Integer LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the STDQTY value for this Product_Proprietary_QuantityPQ.
     * 
     * @return STDQTY
     */
    public java.lang.Double getSTDQTY() {
        return STDQTY;
    }


    /**
     * Sets the STDQTY value for this Product_Proprietary_QuantityPQ.
     * 
     * @param STDQTY
     */
    public void setSTDQTY(java.lang.Double STDQTY) {
        this.STDQTY = STDQTY;
    }


    /**
     * Gets the STDQTYU value for this Product_Proprietary_QuantityPQ.
     * 
     * @return STDQTYU
     */
    public java.lang.String getSTDQTYU() {
        return STDQTYU;
    }


    /**
     * Sets the STDQTYU value for this Product_Proprietary_QuantityPQ.
     * 
     * @param STDQTYU
     */
    public void setSTDQTYU(java.lang.String STDQTYU) {
        this.STDQTYU = STDQTYU;
    }


    /**
     * Gets the PRPQTY value for this Product_Proprietary_QuantityPQ.
     * 
     * @return PRPQTY
     */
    public java.lang.Double getPRPQTY() {
        return PRPQTY;
    }


    /**
     * Sets the PRPQTY value for this Product_Proprietary_QuantityPQ.
     * 
     * @param PRPQTY
     */
    public void setPRPQTY(java.lang.Double PRPQTY) {
        this.PRPQTY = PRPQTY;
    }


    /**
     * Gets the PRPQTYU value for this Product_Proprietary_QuantityPQ.
     * 
     * @return PRPQTYU
     */
    public java.lang.String getPRPQTYU() {
        return PRPQTYU;
    }


    /**
     * Sets the PRPQTYU value for this Product_Proprietary_QuantityPQ.
     * 
     * @param PRPQTYU
     */
    public void setPRPQTYU(java.lang.String PRPQTYU) {
        this.PRPQTYU = PRPQTYU;
    }


    /**
     * Gets the DIV value for this Product_Proprietary_QuantityPQ.
     * 
     * @return DIV
     */
    public java.lang.Integer getDIV() {
        return DIV;
    }


    /**
     * Sets the DIV value for this Product_Proprietary_QuantityPQ.
     * 
     * @param DIV
     */
    public void setDIV(java.lang.Integer DIV) {
        this.DIV = DIV;
    }


    /**
     * Gets the DEL value for this Product_Proprietary_QuantityPQ.
     * 
     * @return DEL
     */
    public java.lang.Boolean getDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this Product_Proprietary_QuantityPQ.
     * 
     * @param DEL
     */
    public void setDEL(java.lang.Boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this Product_Proprietary_QuantityPQ.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this Product_Proprietary_QuantityPQ.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product_Proprietary_QuantityPQ)) return false;
        Product_Proprietary_QuantityPQ other = (Product_Proprietary_QuantityPQ) obj;
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
            ((this.CPTLNO==null && other.getCPTLNO()==null) || 
             (this.CPTLNO!=null &&
              this.CPTLNO.equals(other.getCPTLNO()))) &&
            ((this.LNO==null && other.getLNO()==null) || 
             (this.LNO!=null &&
              this.LNO.equals(other.getLNO()))) &&
            ((this.STDQTY==null && other.getSTDQTY()==null) || 
             (this.STDQTY!=null &&
              this.STDQTY.equals(other.getSTDQTY()))) &&
            ((this.STDQTYU==null && other.getSTDQTYU()==null) || 
             (this.STDQTYU!=null &&
              this.STDQTYU.equals(other.getSTDQTYU()))) &&
            ((this.PRPQTY==null && other.getPRPQTY()==null) || 
             (this.PRPQTY!=null &&
              this.PRPQTY.equals(other.getPRPQTY()))) &&
            ((this.PRPQTYU==null && other.getPRPQTYU()==null) || 
             (this.PRPQTYU!=null &&
              this.PRPQTYU.equals(other.getPRPQTYU()))) &&
            ((this.DIV==null && other.getDIV()==null) || 
             (this.DIV!=null &&
              this.DIV.equals(other.getDIV()))) &&
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
        if (getCPTLNO() != null) {
            _hashCode += getCPTLNO().hashCode();
        }
        if (getLNO() != null) {
            _hashCode += getLNO().hashCode();
        }
        if (getSTDQTY() != null) {
            _hashCode += getSTDQTY().hashCode();
        }
        if (getSTDQTYU() != null) {
            _hashCode += getSTDQTYU().hashCode();
        }
        if (getPRPQTY() != null) {
            _hashCode += getPRPQTY().hashCode();
        }
        if (getPRPQTYU() != null) {
            _hashCode += getPRPQTYU().hashCode();
        }
        if (getDIV() != null) {
            _hashCode += getDIV().hashCode();
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
        new org.apache.axis.description.TypeDesc(Product_Proprietary_QuantityPQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Proprietary_Quantity>PQ"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("STDQTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STDQTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STDQTYU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STDQTYU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRPQTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRPQTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRPQTYU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRPQTYU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DIV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
