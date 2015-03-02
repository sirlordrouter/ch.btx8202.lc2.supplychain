/**
 * Product_Proprietary_Quantity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Product_Proprietary_Quantity  implements java.io.Serializable {
    private webservice.hospindex.Product_Proprietary_QuantityPQ[] PQ;

    private webservice.hospindex.Product_Proprietary_QuantityRESULT RESULT;

    private java.util.Calendar CREATION_DATETIME;  // attribute

    private java.util.Calendar PROD_DATE;  // attribute

    private java.util.Calendar VALID_DATE;  // attribute

    public Product_Proprietary_Quantity() {
    }

    public Product_Proprietary_Quantity(
           webservice.hospindex.Product_Proprietary_QuantityPQ[] PQ,
           webservice.hospindex.Product_Proprietary_QuantityRESULT RESULT,
           java.util.Calendar CREATION_DATETIME,
           java.util.Calendar PROD_DATE,
           java.util.Calendar VALID_DATE) {
           this.PQ = PQ;
           this.RESULT = RESULT;
           this.CREATION_DATETIME = CREATION_DATETIME;
           this.PROD_DATE = PROD_DATE;
           this.VALID_DATE = VALID_DATE;
    }


    /**
     * Gets the PQ value for this Product_Proprietary_Quantity.
     * 
     * @return PQ
     */
    public webservice.hospindex.Product_Proprietary_QuantityPQ[] getPQ() {
        return PQ;
    }


    /**
     * Sets the PQ value for this Product_Proprietary_Quantity.
     * 
     * @param PQ
     */
    public void setPQ(webservice.hospindex.Product_Proprietary_QuantityPQ[] PQ) {
        this.PQ = PQ;
    }

    public webservice.hospindex.Product_Proprietary_QuantityPQ getPQ(int i) {
        return this.PQ[i];
    }

    public void setPQ(int i, webservice.hospindex.Product_Proprietary_QuantityPQ _value) {
        this.PQ[i] = _value;
    }


    /**
     * Gets the RESULT value for this Product_Proprietary_Quantity.
     * 
     * @return RESULT
     */
    public webservice.hospindex.Product_Proprietary_QuantityRESULT getRESULT() {
        return RESULT;
    }


    /**
     * Sets the RESULT value for this Product_Proprietary_Quantity.
     * 
     * @param RESULT
     */
    public void setRESULT(webservice.hospindex.Product_Proprietary_QuantityRESULT RESULT) {
        this.RESULT = RESULT;
    }


    /**
     * Gets the CREATION_DATETIME value for this Product_Proprietary_Quantity.
     * 
     * @return CREATION_DATETIME
     */
    public java.util.Calendar getCREATION_DATETIME() {
        return CREATION_DATETIME;
    }


    /**
     * Sets the CREATION_DATETIME value for this Product_Proprietary_Quantity.
     * 
     * @param CREATION_DATETIME
     */
    public void setCREATION_DATETIME(java.util.Calendar CREATION_DATETIME) {
        this.CREATION_DATETIME = CREATION_DATETIME;
    }


    /**
     * Gets the PROD_DATE value for this Product_Proprietary_Quantity.
     * 
     * @return PROD_DATE
     */
    public java.util.Calendar getPROD_DATE() {
        return PROD_DATE;
    }


    /**
     * Sets the PROD_DATE value for this Product_Proprietary_Quantity.
     * 
     * @param PROD_DATE
     */
    public void setPROD_DATE(java.util.Calendar PROD_DATE) {
        this.PROD_DATE = PROD_DATE;
    }


    /**
     * Gets the VALID_DATE value for this Product_Proprietary_Quantity.
     * 
     * @return VALID_DATE
     */
    public java.util.Calendar getVALID_DATE() {
        return VALID_DATE;
    }


    /**
     * Sets the VALID_DATE value for this Product_Proprietary_Quantity.
     * 
     * @param VALID_DATE
     */
    public void setVALID_DATE(java.util.Calendar VALID_DATE) {
        this.VALID_DATE = VALID_DATE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product_Proprietary_Quantity)) return false;
        Product_Proprietary_Quantity other = (Product_Proprietary_Quantity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PQ==null && other.getPQ()==null) || 
             (this.PQ!=null &&
              java.util.Arrays.equals(this.PQ, other.getPQ()))) &&
            ((this.RESULT==null && other.getRESULT()==null) || 
             (this.RESULT!=null &&
              this.RESULT.equals(other.getRESULT()))) &&
            ((this.CREATION_DATETIME==null && other.getCREATION_DATETIME()==null) || 
             (this.CREATION_DATETIME!=null &&
              this.CREATION_DATETIME.equals(other.getCREATION_DATETIME()))) &&
            ((this.PROD_DATE==null && other.getPROD_DATE()==null) || 
             (this.PROD_DATE!=null &&
              this.PROD_DATE.equals(other.getPROD_DATE()))) &&
            ((this.VALID_DATE==null && other.getVALID_DATE()==null) || 
             (this.VALID_DATE!=null &&
              this.VALID_DATE.equals(other.getVALID_DATE())));
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
        if (getPQ() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPQ());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPQ(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRESULT() != null) {
            _hashCode += getRESULT().hashCode();
        }
        if (getCREATION_DATETIME() != null) {
            _hashCode += getCREATION_DATETIME().hashCode();
        }
        if (getPROD_DATE() != null) {
            _hashCode += getPROD_DATE().hashCode();
        }
        if (getVALID_DATE() != null) {
            _hashCode += getVALID_DATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product_Proprietary_Quantity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product_Proprietary_Quantity"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("CREATION_DATETIME");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CREATION_DATETIME"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PROD_DATE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PROD_DATE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("VALID_DATE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VALID_DATE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Proprietary_Quantity>PQ"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RESULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Proprietary_Quantity>RESULT"));
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
