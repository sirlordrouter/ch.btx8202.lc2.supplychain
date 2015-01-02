/**
 * PHARMA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.swissindex;

public class PHARMA  implements java.io.Serializable {
    private webservice.swissindex.PHARMAITEM[] ITEM;

    private webservice.swissindex.PHARMARESULT RESULT;

    private java.util.Calendar CREATION_DATETIME;  // attribute

    public PHARMA() {
    }

    public PHARMA(
           webservice.swissindex.PHARMAITEM[] ITEM,
           webservice.swissindex.PHARMARESULT RESULT,
           java.util.Calendar CREATION_DATETIME) {
           this.ITEM = ITEM;
           this.RESULT = RESULT;
           this.CREATION_DATETIME = CREATION_DATETIME;
    }


    /**
     * Gets the ITEM value for this PHARMA.
     * 
     * @return ITEM
     */
    public webservice.swissindex.PHARMAITEM[] getITEM() {
        return ITEM;
    }


    /**
     * Sets the ITEM value for this PHARMA.
     * 
     * @param ITEM
     */
    public void setITEM(webservice.swissindex.PHARMAITEM[] ITEM) {
        this.ITEM = ITEM;
    }

    public webservice.swissindex.PHARMAITEM getITEM(int i) {
        return this.ITEM[i];
    }

    public void setITEM(int i, webservice.swissindex.PHARMAITEM _value) {
        this.ITEM[i] = _value;
    }


    /**
     * Gets the RESULT value for this PHARMA.
     * 
     * @return RESULT
     */
    public webservice.swissindex.PHARMARESULT getRESULT() {
        return RESULT;
    }


    /**
     * Sets the RESULT value for this PHARMA.
     * 
     * @param RESULT
     */
    public void setRESULT(webservice.swissindex.PHARMARESULT RESULT) {
        this.RESULT = RESULT;
    }


    /**
     * Gets the CREATION_DATETIME value for this PHARMA.
     * 
     * @return CREATION_DATETIME
     */
    public java.util.Calendar getCREATION_DATETIME() {
        return CREATION_DATETIME;
    }


    /**
     * Sets the CREATION_DATETIME value for this PHARMA.
     * 
     * @param CREATION_DATETIME
     */
    public void setCREATION_DATETIME(java.util.Calendar CREATION_DATETIME) {
        this.CREATION_DATETIME = CREATION_DATETIME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PHARMA)) return false;
        PHARMA other = (PHARMA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ITEM==null && other.getITEM()==null) || 
             (this.ITEM!=null &&
              java.util.Arrays.equals(this.ITEM, other.getITEM()))) &&
            ((this.RESULT==null && other.getRESULT()==null) || 
             (this.RESULT!=null &&
              this.RESULT.equals(other.getRESULT()))) &&
            ((this.CREATION_DATETIME==null && other.getCREATION_DATETIME()==null) || 
             (this.CREATION_DATETIME!=null &&
              this.CREATION_DATETIME.equals(other.getCREATION_DATETIME())));
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
        if (getITEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getITEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getITEM(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PHARMA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">PHARMA"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("CREATION_DATETIME");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CREATION_DATETIME"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ITEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>PHARMA>ITEM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RESULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "RESULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>PHARMA>RESULT"));
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
