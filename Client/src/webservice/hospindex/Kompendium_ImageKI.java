/**
 * Kompendium_ImageKI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Kompendium_ImageKI  implements java.io.Serializable {
    private java.lang.String IMAGENAME;

    private java.lang.String IMAGETYPE;

    private java.lang.String IMAGEURL;

    private java.lang.String IMAGECDATA;

    private boolean DEL;

    private java.util.Calendar DT;  // attribute

    public Kompendium_ImageKI() {
    }

    public Kompendium_ImageKI(
           java.lang.String IMAGENAME,
           java.lang.String IMAGETYPE,
           java.lang.String IMAGEURL,
           java.lang.String IMAGECDATA,
           boolean DEL,
           java.util.Calendar DT) {
           this.IMAGENAME = IMAGENAME;
           this.IMAGETYPE = IMAGETYPE;
           this.IMAGEURL = IMAGEURL;
           this.IMAGECDATA = IMAGECDATA;
           this.DEL = DEL;
           this.DT = DT;
    }


    /**
     * Gets the IMAGENAME value for this Kompendium_ImageKI.
     * 
     * @return IMAGENAME
     */
    public java.lang.String getIMAGENAME() {
        return IMAGENAME;
    }


    /**
     * Sets the IMAGENAME value for this Kompendium_ImageKI.
     * 
     * @param IMAGENAME
     */
    public void setIMAGENAME(java.lang.String IMAGENAME) {
        this.IMAGENAME = IMAGENAME;
    }


    /**
     * Gets the IMAGETYPE value for this Kompendium_ImageKI.
     * 
     * @return IMAGETYPE
     */
    public java.lang.String getIMAGETYPE() {
        return IMAGETYPE;
    }


    /**
     * Sets the IMAGETYPE value for this Kompendium_ImageKI.
     * 
     * @param IMAGETYPE
     */
    public void setIMAGETYPE(java.lang.String IMAGETYPE) {
        this.IMAGETYPE = IMAGETYPE;
    }


    /**
     * Gets the IMAGEURL value for this Kompendium_ImageKI.
     * 
     * @return IMAGEURL
     */
    public java.lang.String getIMAGEURL() {
        return IMAGEURL;
    }


    /**
     * Sets the IMAGEURL value for this Kompendium_ImageKI.
     * 
     * @param IMAGEURL
     */
    public void setIMAGEURL(java.lang.String IMAGEURL) {
        this.IMAGEURL = IMAGEURL;
    }


    /**
     * Gets the IMAGECDATA value for this Kompendium_ImageKI.
     * 
     * @return IMAGECDATA
     */
    public java.lang.String getIMAGECDATA() {
        return IMAGECDATA;
    }


    /**
     * Sets the IMAGECDATA value for this Kompendium_ImageKI.
     * 
     * @param IMAGECDATA
     */
    public void setIMAGECDATA(java.lang.String IMAGECDATA) {
        this.IMAGECDATA = IMAGECDATA;
    }


    /**
     * Gets the DEL value for this Kompendium_ImageKI.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this Kompendium_ImageKI.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DT value for this Kompendium_ImageKI.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this Kompendium_ImageKI.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kompendium_ImageKI)) return false;
        Kompendium_ImageKI other = (Kompendium_ImageKI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMAGENAME==null && other.getIMAGENAME()==null) || 
             (this.IMAGENAME!=null &&
              this.IMAGENAME.equals(other.getIMAGENAME()))) &&
            ((this.IMAGETYPE==null && other.getIMAGETYPE()==null) || 
             (this.IMAGETYPE!=null &&
              this.IMAGETYPE.equals(other.getIMAGETYPE()))) &&
            ((this.IMAGEURL==null && other.getIMAGEURL()==null) || 
             (this.IMAGEURL!=null &&
              this.IMAGEURL.equals(other.getIMAGEURL()))) &&
            ((this.IMAGECDATA==null && other.getIMAGECDATA()==null) || 
             (this.IMAGECDATA!=null &&
              this.IMAGECDATA.equals(other.getIMAGECDATA()))) &&
            this.DEL == other.isDEL() &&
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
        if (getIMAGENAME() != null) {
            _hashCode += getIMAGENAME().hashCode();
        }
        if (getIMAGETYPE() != null) {
            _hashCode += getIMAGETYPE().hashCode();
        }
        if (getIMAGEURL() != null) {
            _hashCode += getIMAGEURL().hashCode();
        }
        if (getIMAGECDATA() != null) {
            _hashCode += getIMAGECDATA().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Kompendium_ImageKI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Kompendium_Image>KI"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMAGENAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IMAGENAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMAGETYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IMAGETYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMAGEURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IMAGEURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMAGECDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IMAGECDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
