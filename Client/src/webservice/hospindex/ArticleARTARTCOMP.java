/**
 * ArticleARTARTCOMP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTCOMP  implements java.io.Serializable {
    private int COMPNO;

    private java.lang.String ROLE;

    private java.lang.String ARTNO1;

    private java.lang.String ARTNO2;

    private java.lang.String ARTNO3;

    public ArticleARTARTCOMP() {
    }

    public ArticleARTARTCOMP(
           int COMPNO,
           java.lang.String ROLE,
           java.lang.String ARTNO1,
           java.lang.String ARTNO2,
           java.lang.String ARTNO3) {
           this.COMPNO = COMPNO;
           this.ROLE = ROLE;
           this.ARTNO1 = ARTNO1;
           this.ARTNO2 = ARTNO2;
           this.ARTNO3 = ARTNO3;
    }


    /**
     * Gets the COMPNO value for this ArticleARTARTCOMP.
     * 
     * @return COMPNO
     */
    public int getCOMPNO() {
        return COMPNO;
    }


    /**
     * Sets the COMPNO value for this ArticleARTARTCOMP.
     * 
     * @param COMPNO
     */
    public void setCOMPNO(int COMPNO) {
        this.COMPNO = COMPNO;
    }


    /**
     * Gets the ROLE value for this ArticleARTARTCOMP.
     * 
     * @return ROLE
     */
    public java.lang.String getROLE() {
        return ROLE;
    }


    /**
     * Sets the ROLE value for this ArticleARTARTCOMP.
     * 
     * @param ROLE
     */
    public void setROLE(java.lang.String ROLE) {
        this.ROLE = ROLE;
    }


    /**
     * Gets the ARTNO1 value for this ArticleARTARTCOMP.
     * 
     * @return ARTNO1
     */
    public java.lang.String getARTNO1() {
        return ARTNO1;
    }


    /**
     * Sets the ARTNO1 value for this ArticleARTARTCOMP.
     * 
     * @param ARTNO1
     */
    public void setARTNO1(java.lang.String ARTNO1) {
        this.ARTNO1 = ARTNO1;
    }


    /**
     * Gets the ARTNO2 value for this ArticleARTARTCOMP.
     * 
     * @return ARTNO2
     */
    public java.lang.String getARTNO2() {
        return ARTNO2;
    }


    /**
     * Sets the ARTNO2 value for this ArticleARTARTCOMP.
     * 
     * @param ARTNO2
     */
    public void setARTNO2(java.lang.String ARTNO2) {
        this.ARTNO2 = ARTNO2;
    }


    /**
     * Gets the ARTNO3 value for this ArticleARTARTCOMP.
     * 
     * @return ARTNO3
     */
    public java.lang.String getARTNO3() {
        return ARTNO3;
    }


    /**
     * Sets the ARTNO3 value for this ArticleARTARTCOMP.
     * 
     * @param ARTNO3
     */
    public void setARTNO3(java.lang.String ARTNO3) {
        this.ARTNO3 = ARTNO3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTCOMP)) return false;
        ArticleARTARTCOMP other = (ArticleARTARTCOMP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.COMPNO == other.getCOMPNO() &&
            ((this.ROLE==null && other.getROLE()==null) || 
             (this.ROLE!=null &&
              this.ROLE.equals(other.getROLE()))) &&
            ((this.ARTNO1==null && other.getARTNO1()==null) || 
             (this.ARTNO1!=null &&
              this.ARTNO1.equals(other.getARTNO1()))) &&
            ((this.ARTNO2==null && other.getARTNO2()==null) || 
             (this.ARTNO2!=null &&
              this.ARTNO2.equals(other.getARTNO2()))) &&
            ((this.ARTNO3==null && other.getARTNO3()==null) || 
             (this.ARTNO3!=null &&
              this.ARTNO3.equals(other.getARTNO3())));
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
        _hashCode += getCOMPNO();
        if (getROLE() != null) {
            _hashCode += getROLE().hashCode();
        }
        if (getARTNO1() != null) {
            _hashCode += getARTNO1().hashCode();
        }
        if (getARTNO2() != null) {
            _hashCode += getARTNO2().hashCode();
        }
        if (getARTNO3() != null) {
            _hashCode += getARTNO3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTCOMP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTCOMP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "COMPNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ROLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTNO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTNO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTNO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTNO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTNO3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTNO3"));
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
