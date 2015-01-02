/**
 * PHARMARESULT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.swissindex;

public class PHARMARESULT  implements java.io.Serializable {
    private webservice.swissindex.PHARMARESULTOK_ERROR OK_ERROR;

    private java.lang.Integer NBR_RECORD;

    private java.lang.String ERROR_CODE;

    private java.lang.String MESSAGE;

    public PHARMARESULT() {
    }

    public PHARMARESULT(
           webservice.swissindex.PHARMARESULTOK_ERROR OK_ERROR,
           java.lang.Integer NBR_RECORD,
           java.lang.String ERROR_CODE,
           java.lang.String MESSAGE) {
           this.OK_ERROR = OK_ERROR;
           this.NBR_RECORD = NBR_RECORD;
           this.ERROR_CODE = ERROR_CODE;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the OK_ERROR value for this PHARMARESULT.
     * 
     * @return OK_ERROR
     */
    public webservice.swissindex.PHARMARESULTOK_ERROR getOK_ERROR() {
        return OK_ERROR;
    }


    /**
     * Sets the OK_ERROR value for this PHARMARESULT.
     * 
     * @param OK_ERROR
     */
    public void setOK_ERROR(webservice.swissindex.PHARMARESULTOK_ERROR OK_ERROR) {
        this.OK_ERROR = OK_ERROR;
    }


    /**
     * Gets the NBR_RECORD value for this PHARMARESULT.
     * 
     * @return NBR_RECORD
     */
    public java.lang.Integer getNBR_RECORD() {
        return NBR_RECORD;
    }


    /**
     * Sets the NBR_RECORD value for this PHARMARESULT.
     * 
     * @param NBR_RECORD
     */
    public void setNBR_RECORD(java.lang.Integer NBR_RECORD) {
        this.NBR_RECORD = NBR_RECORD;
    }


    /**
     * Gets the ERROR_CODE value for this PHARMARESULT.
     * 
     * @return ERROR_CODE
     */
    public java.lang.String getERROR_CODE() {
        return ERROR_CODE;
    }


    /**
     * Sets the ERROR_CODE value for this PHARMARESULT.
     * 
     * @param ERROR_CODE
     */
    public void setERROR_CODE(java.lang.String ERROR_CODE) {
        this.ERROR_CODE = ERROR_CODE;
    }


    /**
     * Gets the MESSAGE value for this PHARMARESULT.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this PHARMARESULT.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PHARMARESULT)) return false;
        PHARMARESULT other = (PHARMARESULT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OK_ERROR==null && other.getOK_ERROR()==null) || 
             (this.OK_ERROR!=null &&
              this.OK_ERROR.equals(other.getOK_ERROR()))) &&
            ((this.NBR_RECORD==null && other.getNBR_RECORD()==null) || 
             (this.NBR_RECORD!=null &&
              this.NBR_RECORD.equals(other.getNBR_RECORD()))) &&
            ((this.ERROR_CODE==null && other.getERROR_CODE()==null) || 
             (this.ERROR_CODE!=null &&
              this.ERROR_CODE.equals(other.getERROR_CODE()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE())));
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
        if (getOK_ERROR() != null) {
            _hashCode += getOK_ERROR().hashCode();
        }
        if (getNBR_RECORD() != null) {
            _hashCode += getNBR_RECORD().hashCode();
        }
        if (getERROR_CODE() != null) {
            _hashCode += getERROR_CODE().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PHARMARESULT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>PHARMA>RESULT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OK_ERROR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "OK_ERROR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>>PHARMA>RESULT>OK_ERROR"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NBR_RECORD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "NBR_RECORD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ERROR_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "MESSAGE"));
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
