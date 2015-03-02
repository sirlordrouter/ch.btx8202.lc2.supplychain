/**
 * ArticleARTARTBAR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleARTARTBAR  implements java.io.Serializable {
    private webservice.hospindex.ArticleARTARTBARCDTYP CDTYP;

    private java.lang.String BC;

    private java.lang.String BCSTAT;

    private java.lang.String PHAR2;

    public ArticleARTARTBAR() {
    }

    public ArticleARTARTBAR(
           webservice.hospindex.ArticleARTARTBARCDTYP CDTYP,
           java.lang.String BC,
           java.lang.String BCSTAT,
           java.lang.String PHAR2) {
           this.CDTYP = CDTYP;
           this.BC = BC;
           this.BCSTAT = BCSTAT;
           this.PHAR2 = PHAR2;
    }


    /**
     * Gets the CDTYP value for this ArticleARTARTBAR.
     * 
     * @return CDTYP
     */
    public webservice.hospindex.ArticleARTARTBARCDTYP getCDTYP() {
        return CDTYP;
    }


    /**
     * Sets the CDTYP value for this ArticleARTARTBAR.
     * 
     * @param CDTYP
     */
    public void setCDTYP(webservice.hospindex.ArticleARTARTBARCDTYP CDTYP) {
        this.CDTYP = CDTYP;
    }


    /**
     * Gets the BC value for this ArticleARTARTBAR.
     * 
     * @return BC
     */
    public java.lang.String getBC() {
        return BC;
    }


    /**
     * Sets the BC value for this ArticleARTARTBAR.
     * 
     * @param BC
     */
    public void setBC(java.lang.String BC) {
        this.BC = BC;
    }


    /**
     * Gets the BCSTAT value for this ArticleARTARTBAR.
     * 
     * @return BCSTAT
     */
    public java.lang.String getBCSTAT() {
        return BCSTAT;
    }


    /**
     * Sets the BCSTAT value for this ArticleARTARTBAR.
     * 
     * @param BCSTAT
     */
    public void setBCSTAT(java.lang.String BCSTAT) {
        this.BCSTAT = BCSTAT;
    }


    /**
     * Gets the PHAR2 value for this ArticleARTARTBAR.
     * 
     * @return PHAR2
     */
    public java.lang.String getPHAR2() {
        return PHAR2;
    }


    /**
     * Sets the PHAR2 value for this ArticleARTARTBAR.
     * 
     * @param PHAR2
     */
    public void setPHAR2(java.lang.String PHAR2) {
        this.PHAR2 = PHAR2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleARTARTBAR)) return false;
        ArticleARTARTBAR other = (ArticleARTARTBAR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CDTYP==null && other.getCDTYP()==null) || 
             (this.CDTYP!=null &&
              this.CDTYP.equals(other.getCDTYP()))) &&
            ((this.BC==null && other.getBC()==null) || 
             (this.BC!=null &&
              this.BC.equals(other.getBC()))) &&
            ((this.BCSTAT==null && other.getBCSTAT()==null) || 
             (this.BCSTAT!=null &&
              this.BCSTAT.equals(other.getBCSTAT()))) &&
            ((this.PHAR2==null && other.getPHAR2()==null) || 
             (this.PHAR2!=null &&
              this.PHAR2.equals(other.getPHAR2())));
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
        if (getCDTYP() != null) {
            _hashCode += getCDTYP().hashCode();
        }
        if (getBC() != null) {
            _hashCode += getBC().hashCode();
        }
        if (getBCSTAT() != null) {
            _hashCode += getBCSTAT().hashCode();
        }
        if (getPHAR2() != null) {
            _hashCode += getPHAR2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArticleARTARTBAR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTBAR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Article>ART>ARTBAR>CDTYP"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BCSTAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BCSTAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHAR2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PHAR2"));
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
