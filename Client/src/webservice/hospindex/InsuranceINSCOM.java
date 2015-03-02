/**
 * InsuranceINSCOM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class InsuranceINSCOM  implements java.io.Serializable {
    private webservice.hospindex.InsuranceINSCOMART ART;

    private webservice.hospindex.InsuranceINSCOMCTYPE CTYPE;

    private java.lang.String PRECOUNTR;

    private java.lang.String PREFIX;

    private java.lang.String NB;

    public InsuranceINSCOM() {
    }

    public InsuranceINSCOM(
           webservice.hospindex.InsuranceINSCOMART ART,
           webservice.hospindex.InsuranceINSCOMCTYPE CTYPE,
           java.lang.String PRECOUNTR,
           java.lang.String PREFIX,
           java.lang.String NB) {
           this.ART = ART;
           this.CTYPE = CTYPE;
           this.PRECOUNTR = PRECOUNTR;
           this.PREFIX = PREFIX;
           this.NB = NB;
    }


    /**
     * Gets the ART value for this InsuranceINSCOM.
     * 
     * @return ART
     */
    public webservice.hospindex.InsuranceINSCOMART getART() {
        return ART;
    }


    /**
     * Sets the ART value for this InsuranceINSCOM.
     * 
     * @param ART
     */
    public void setART(webservice.hospindex.InsuranceINSCOMART ART) {
        this.ART = ART;
    }


    /**
     * Gets the CTYPE value for this InsuranceINSCOM.
     * 
     * @return CTYPE
     */
    public webservice.hospindex.InsuranceINSCOMCTYPE getCTYPE() {
        return CTYPE;
    }


    /**
     * Sets the CTYPE value for this InsuranceINSCOM.
     * 
     * @param CTYPE
     */
    public void setCTYPE(webservice.hospindex.InsuranceINSCOMCTYPE CTYPE) {
        this.CTYPE = CTYPE;
    }


    /**
     * Gets the PRECOUNTR value for this InsuranceINSCOM.
     * 
     * @return PRECOUNTR
     */
    public java.lang.String getPRECOUNTR() {
        return PRECOUNTR;
    }


    /**
     * Sets the PRECOUNTR value for this InsuranceINSCOM.
     * 
     * @param PRECOUNTR
     */
    public void setPRECOUNTR(java.lang.String PRECOUNTR) {
        this.PRECOUNTR = PRECOUNTR;
    }


    /**
     * Gets the PREFIX value for this InsuranceINSCOM.
     * 
     * @return PREFIX
     */
    public java.lang.String getPREFIX() {
        return PREFIX;
    }


    /**
     * Sets the PREFIX value for this InsuranceINSCOM.
     * 
     * @param PREFIX
     */
    public void setPREFIX(java.lang.String PREFIX) {
        this.PREFIX = PREFIX;
    }


    /**
     * Gets the NB value for this InsuranceINSCOM.
     * 
     * @return NB
     */
    public java.lang.String getNB() {
        return NB;
    }


    /**
     * Sets the NB value for this InsuranceINSCOM.
     * 
     * @param NB
     */
    public void setNB(java.lang.String NB) {
        this.NB = NB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuranceINSCOM)) return false;
        InsuranceINSCOM other = (InsuranceINSCOM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ART==null && other.getART()==null) || 
             (this.ART!=null &&
              this.ART.equals(other.getART()))) &&
            ((this.CTYPE==null && other.getCTYPE()==null) || 
             (this.CTYPE!=null &&
              this.CTYPE.equals(other.getCTYPE()))) &&
            ((this.PRECOUNTR==null && other.getPRECOUNTR()==null) || 
             (this.PRECOUNTR!=null &&
              this.PRECOUNTR.equals(other.getPRECOUNTR()))) &&
            ((this.PREFIX==null && other.getPREFIX()==null) || 
             (this.PREFIX!=null &&
              this.PREFIX.equals(other.getPREFIX()))) &&
            ((this.NB==null && other.getNB()==null) || 
             (this.NB!=null &&
              this.NB.equals(other.getNB())));
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
        if (getART() != null) {
            _hashCode += getART().hashCode();
        }
        if (getCTYPE() != null) {
            _hashCode += getCTYPE().hashCode();
        }
        if (getPRECOUNTR() != null) {
            _hashCode += getPRECOUNTR().hashCode();
        }
        if (getPREFIX() != null) {
            _hashCode += getPREFIX().hashCode();
        }
        if (getNB() != null) {
            _hashCode += getNB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsuranceINSCOM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>COM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>COM>ART"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>COM>CTYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRECOUNTR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRECOUNTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PREFIX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PREFIX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NB"));
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
