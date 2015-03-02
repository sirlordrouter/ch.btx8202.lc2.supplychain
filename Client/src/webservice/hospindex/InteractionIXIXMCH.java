/**
 * InteractionIXIXMCH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class InteractionIXIXMCH  implements java.io.Serializable {
    private java.lang.String TYP;

    private java.lang.String TYPD;

    private java.lang.String TYPF;

    private java.lang.Integer CD;

    private java.lang.String CDD;

    private java.lang.String CDF;

    private java.lang.String TXTD;

    private java.lang.String TXTF;

    public InteractionIXIXMCH() {
    }

    public InteractionIXIXMCH(
           java.lang.String TYP,
           java.lang.String TYPD,
           java.lang.String TYPF,
           java.lang.Integer CD,
           java.lang.String CDD,
           java.lang.String CDF,
           java.lang.String TXTD,
           java.lang.String TXTF) {
           this.TYP = TYP;
           this.TYPD = TYPD;
           this.TYPF = TYPF;
           this.CD = CD;
           this.CDD = CDD;
           this.CDF = CDF;
           this.TXTD = TXTD;
           this.TXTF = TXTF;
    }


    /**
     * Gets the TYP value for this InteractionIXIXMCH.
     * 
     * @return TYP
     */
    public java.lang.String getTYP() {
        return TYP;
    }


    /**
     * Sets the TYP value for this InteractionIXIXMCH.
     * 
     * @param TYP
     */
    public void setTYP(java.lang.String TYP) {
        this.TYP = TYP;
    }


    /**
     * Gets the TYPD value for this InteractionIXIXMCH.
     * 
     * @return TYPD
     */
    public java.lang.String getTYPD() {
        return TYPD;
    }


    /**
     * Sets the TYPD value for this InteractionIXIXMCH.
     * 
     * @param TYPD
     */
    public void setTYPD(java.lang.String TYPD) {
        this.TYPD = TYPD;
    }


    /**
     * Gets the TYPF value for this InteractionIXIXMCH.
     * 
     * @return TYPF
     */
    public java.lang.String getTYPF() {
        return TYPF;
    }


    /**
     * Sets the TYPF value for this InteractionIXIXMCH.
     * 
     * @param TYPF
     */
    public void setTYPF(java.lang.String TYPF) {
        this.TYPF = TYPF;
    }


    /**
     * Gets the CD value for this InteractionIXIXMCH.
     * 
     * @return CD
     */
    public java.lang.Integer getCD() {
        return CD;
    }


    /**
     * Sets the CD value for this InteractionIXIXMCH.
     * 
     * @param CD
     */
    public void setCD(java.lang.Integer CD) {
        this.CD = CD;
    }


    /**
     * Gets the CDD value for this InteractionIXIXMCH.
     * 
     * @return CDD
     */
    public java.lang.String getCDD() {
        return CDD;
    }


    /**
     * Sets the CDD value for this InteractionIXIXMCH.
     * 
     * @param CDD
     */
    public void setCDD(java.lang.String CDD) {
        this.CDD = CDD;
    }


    /**
     * Gets the CDF value for this InteractionIXIXMCH.
     * 
     * @return CDF
     */
    public java.lang.String getCDF() {
        return CDF;
    }


    /**
     * Sets the CDF value for this InteractionIXIXMCH.
     * 
     * @param CDF
     */
    public void setCDF(java.lang.String CDF) {
        this.CDF = CDF;
    }


    /**
     * Gets the TXTD value for this InteractionIXIXMCH.
     * 
     * @return TXTD
     */
    public java.lang.String getTXTD() {
        return TXTD;
    }


    /**
     * Sets the TXTD value for this InteractionIXIXMCH.
     * 
     * @param TXTD
     */
    public void setTXTD(java.lang.String TXTD) {
        this.TXTD = TXTD;
    }


    /**
     * Gets the TXTF value for this InteractionIXIXMCH.
     * 
     * @return TXTF
     */
    public java.lang.String getTXTF() {
        return TXTF;
    }


    /**
     * Sets the TXTF value for this InteractionIXIXMCH.
     * 
     * @param TXTF
     */
    public void setTXTF(java.lang.String TXTF) {
        this.TXTF = TXTF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InteractionIXIXMCH)) return false;
        InteractionIXIXMCH other = (InteractionIXIXMCH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TYP==null && other.getTYP()==null) || 
             (this.TYP!=null &&
              this.TYP.equals(other.getTYP()))) &&
            ((this.TYPD==null && other.getTYPD()==null) || 
             (this.TYPD!=null &&
              this.TYPD.equals(other.getTYPD()))) &&
            ((this.TYPF==null && other.getTYPF()==null) || 
             (this.TYPF!=null &&
              this.TYPF.equals(other.getTYPF()))) &&
            ((this.CD==null && other.getCD()==null) || 
             (this.CD!=null &&
              this.CD.equals(other.getCD()))) &&
            ((this.CDD==null && other.getCDD()==null) || 
             (this.CDD!=null &&
              this.CDD.equals(other.getCDD()))) &&
            ((this.CDF==null && other.getCDF()==null) || 
             (this.CDF!=null &&
              this.CDF.equals(other.getCDF()))) &&
            ((this.TXTD==null && other.getTXTD()==null) || 
             (this.TXTD!=null &&
              this.TXTD.equals(other.getTXTD()))) &&
            ((this.TXTF==null && other.getTXTF()==null) || 
             (this.TXTF!=null &&
              this.TXTF.equals(other.getTXTF())));
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
        if (getTYP() != null) {
            _hashCode += getTYP().hashCode();
        }
        if (getTYPD() != null) {
            _hashCode += getTYPD().hashCode();
        }
        if (getTYPF() != null) {
            _hashCode += getTYPF().hashCode();
        }
        if (getCD() != null) {
            _hashCode += getCD().hashCode();
        }
        if (getCDD() != null) {
            _hashCode += getCDD().hashCode();
        }
        if (getCDF() != null) {
            _hashCode += getCDF().hashCode();
        }
        if (getTXTD() != null) {
            _hashCode += getTXTD().hashCode();
        }
        if (getTXTF() != null) {
            _hashCode += getTXTF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InteractionIXIXMCH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Interaction>IX>IXMCH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYPD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TYPF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXTD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TXTD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXTF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TXTF"));
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
