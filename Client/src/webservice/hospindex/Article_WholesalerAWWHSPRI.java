/**
 * Article_WholesalerAWWHSPRI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Article_WholesalerAWWHSPRI  implements java.io.Serializable {
    private java.lang.String PTYP;

    private java.util.Calendar VDAT;

    private double PRICE;

    private java.lang.Double PDPRI;

    private java.lang.Double BDPRI;

    public Article_WholesalerAWWHSPRI() {
    }

    public Article_WholesalerAWWHSPRI(
           java.lang.String PTYP,
           java.util.Calendar VDAT,
           double PRICE,
           java.lang.Double PDPRI,
           java.lang.Double BDPRI) {
           this.PTYP = PTYP;
           this.VDAT = VDAT;
           this.PRICE = PRICE;
           this.PDPRI = PDPRI;
           this.BDPRI = BDPRI;
    }


    /**
     * Gets the PTYP value for this Article_WholesalerAWWHSPRI.
     * 
     * @return PTYP
     */
    public java.lang.String getPTYP() {
        return PTYP;
    }


    /**
     * Sets the PTYP value for this Article_WholesalerAWWHSPRI.
     * 
     * @param PTYP
     */
    public void setPTYP(java.lang.String PTYP) {
        this.PTYP = PTYP;
    }


    /**
     * Gets the VDAT value for this Article_WholesalerAWWHSPRI.
     * 
     * @return VDAT
     */
    public java.util.Calendar getVDAT() {
        return VDAT;
    }


    /**
     * Sets the VDAT value for this Article_WholesalerAWWHSPRI.
     * 
     * @param VDAT
     */
    public void setVDAT(java.util.Calendar VDAT) {
        this.VDAT = VDAT;
    }


    /**
     * Gets the PRICE value for this Article_WholesalerAWWHSPRI.
     * 
     * @return PRICE
     */
    public double getPRICE() {
        return PRICE;
    }


    /**
     * Sets the PRICE value for this Article_WholesalerAWWHSPRI.
     * 
     * @param PRICE
     */
    public void setPRICE(double PRICE) {
        this.PRICE = PRICE;
    }


    /**
     * Gets the PDPRI value for this Article_WholesalerAWWHSPRI.
     * 
     * @return PDPRI
     */
    public java.lang.Double getPDPRI() {
        return PDPRI;
    }


    /**
     * Sets the PDPRI value for this Article_WholesalerAWWHSPRI.
     * 
     * @param PDPRI
     */
    public void setPDPRI(java.lang.Double PDPRI) {
        this.PDPRI = PDPRI;
    }


    /**
     * Gets the BDPRI value for this Article_WholesalerAWWHSPRI.
     * 
     * @return BDPRI
     */
    public java.lang.Double getBDPRI() {
        return BDPRI;
    }


    /**
     * Sets the BDPRI value for this Article_WholesalerAWWHSPRI.
     * 
     * @param BDPRI
     */
    public void setBDPRI(java.lang.Double BDPRI) {
        this.BDPRI = BDPRI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article_WholesalerAWWHSPRI)) return false;
        Article_WholesalerAWWHSPRI other = (Article_WholesalerAWWHSPRI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PTYP==null && other.getPTYP()==null) || 
             (this.PTYP!=null &&
              this.PTYP.equals(other.getPTYP()))) &&
            ((this.VDAT==null && other.getVDAT()==null) || 
             (this.VDAT!=null &&
              this.VDAT.equals(other.getVDAT()))) &&
            this.PRICE == other.getPRICE() &&
            ((this.PDPRI==null && other.getPDPRI()==null) || 
             (this.PDPRI!=null &&
              this.PDPRI.equals(other.getPDPRI()))) &&
            ((this.BDPRI==null && other.getBDPRI()==null) || 
             (this.BDPRI!=null &&
              this.BDPRI.equals(other.getBDPRI())));
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
        if (getPTYP() != null) {
            _hashCode += getPTYP().hashCode();
        }
        if (getVDAT() != null) {
            _hashCode += getVDAT().hashCode();
        }
        _hashCode += new Double(getPRICE()).hashCode();
        if (getPDPRI() != null) {
            _hashCode += getPDPRI().hashCode();
        }
        if (getBDPRI() != null) {
            _hashCode += getBDPRI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Article_WholesalerAWWHSPRI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>AW>WHSPRI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDPRI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PDPRI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BDPRI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BDPRI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
