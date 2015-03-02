/**
 * ProductPRDPRDICD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRDPRDICD  implements java.io.Serializable {
    private java.lang.String ICD;

    private webservice.hospindex.ProductPRDPRDICDRTYP RTYP;

    private webservice.hospindex.ProductPRDPRDICDRSIG RSIG;

    private java.lang.String REMD;

    private java.lang.String REMF;

    public ProductPRDPRDICD() {
    }

    public ProductPRDPRDICD(
           java.lang.String ICD,
           webservice.hospindex.ProductPRDPRDICDRTYP RTYP,
           webservice.hospindex.ProductPRDPRDICDRSIG RSIG,
           java.lang.String REMD,
           java.lang.String REMF) {
           this.ICD = ICD;
           this.RTYP = RTYP;
           this.RSIG = RSIG;
           this.REMD = REMD;
           this.REMF = REMF;
    }


    /**
     * Gets the ICD value for this ProductPRDPRDICD.
     * 
     * @return ICD
     */
    public java.lang.String getICD() {
        return ICD;
    }


    /**
     * Sets the ICD value for this ProductPRDPRDICD.
     * 
     * @param ICD
     */
    public void setICD(java.lang.String ICD) {
        this.ICD = ICD;
    }


    /**
     * Gets the RTYP value for this ProductPRDPRDICD.
     * 
     * @return RTYP
     */
    public webservice.hospindex.ProductPRDPRDICDRTYP getRTYP() {
        return RTYP;
    }


    /**
     * Sets the RTYP value for this ProductPRDPRDICD.
     * 
     * @param RTYP
     */
    public void setRTYP(webservice.hospindex.ProductPRDPRDICDRTYP RTYP) {
        this.RTYP = RTYP;
    }


    /**
     * Gets the RSIG value for this ProductPRDPRDICD.
     * 
     * @return RSIG
     */
    public webservice.hospindex.ProductPRDPRDICDRSIG getRSIG() {
        return RSIG;
    }


    /**
     * Sets the RSIG value for this ProductPRDPRDICD.
     * 
     * @param RSIG
     */
    public void setRSIG(webservice.hospindex.ProductPRDPRDICDRSIG RSIG) {
        this.RSIG = RSIG;
    }


    /**
     * Gets the REMD value for this ProductPRDPRDICD.
     * 
     * @return REMD
     */
    public java.lang.String getREMD() {
        return REMD;
    }


    /**
     * Sets the REMD value for this ProductPRDPRDICD.
     * 
     * @param REMD
     */
    public void setREMD(java.lang.String REMD) {
        this.REMD = REMD;
    }


    /**
     * Gets the REMF value for this ProductPRDPRDICD.
     * 
     * @return REMF
     */
    public java.lang.String getREMF() {
        return REMF;
    }


    /**
     * Sets the REMF value for this ProductPRDPRDICD.
     * 
     * @param REMF
     */
    public void setREMF(java.lang.String REMF) {
        this.REMF = REMF;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPRDPRDICD)) return false;
        ProductPRDPRDICD other = (ProductPRDPRDICD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICD==null && other.getICD()==null) || 
             (this.ICD!=null &&
              this.ICD.equals(other.getICD()))) &&
            ((this.RTYP==null && other.getRTYP()==null) || 
             (this.RTYP!=null &&
              this.RTYP.equals(other.getRTYP()))) &&
            ((this.RSIG==null && other.getRSIG()==null) || 
             (this.RSIG!=null &&
              this.RSIG.equals(other.getRSIG()))) &&
            ((this.REMD==null && other.getREMD()==null) || 
             (this.REMD!=null &&
              this.REMD.equals(other.getREMD()))) &&
            ((this.REMF==null && other.getREMF()==null) || 
             (this.REMF!=null &&
              this.REMF.equals(other.getREMF())));
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
        if (getICD() != null) {
            _hashCode += getICD().hashCode();
        }
        if (getRTYP() != null) {
            _hashCode += getRTYP().hashCode();
        }
        if (getRSIG() != null) {
            _hashCode += getRSIG().hashCode();
        }
        if (getREMD() != null) {
            _hashCode += getREMD().hashCode();
        }
        if (getREMF() != null) {
            _hashCode += getREMF().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPRDPRDICD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>PRDICD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ICD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>PRDICD>RTYP"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RSIG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RSIG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>PRDICD>RSIG"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REMF"));
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
