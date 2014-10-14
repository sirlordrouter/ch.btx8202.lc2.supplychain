/**
 * PHARMAITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package swissindex;

public class PHARMAITEM  implements java.io.Serializable {
    private java.lang.String GTIN;

    private java.math.BigInteger PHAR;

    private swissindex.PHARMAITEMSTATUS STATUS;

    private java.util.Calendar STDATE;

    private java.lang.String LANG;

    private java.lang.String DSCR;

    private java.lang.String ADDSCR;

    private java.lang.String ATC;

    private swissindex.PHARMAITEMCOMP COMP;

    private java.util.Calendar DT;  // attribute

    public PHARMAITEM() {
    }

    public PHARMAITEM(
           java.lang.String GTIN,
           java.math.BigInteger PHAR,
           swissindex.PHARMAITEMSTATUS STATUS,
           java.util.Calendar STDATE,
           java.lang.String LANG,
           java.lang.String DSCR,
           java.lang.String ADDSCR,
           java.lang.String ATC,
           swissindex.PHARMAITEMCOMP COMP,
           java.util.Calendar DT) {
           this.GTIN = GTIN;
           this.PHAR = PHAR;
           this.STATUS = STATUS;
           this.STDATE = STDATE;
           this.LANG = LANG;
           this.DSCR = DSCR;
           this.ADDSCR = ADDSCR;
           this.ATC = ATC;
           this.COMP = COMP;
           this.DT = DT;
    }


    /**
     * Gets the GTIN value for this PHARMAITEM.
     * 
     * @return GTIN
     */
    public java.lang.String getGTIN() {
        return GTIN;
    }


    /**
     * Sets the GTIN value for this PHARMAITEM.
     * 
     * @param GTIN
     */
    public void setGTIN(java.lang.String GTIN) {
        this.GTIN = GTIN;
    }


    /**
     * Gets the PHAR value for this PHARMAITEM.
     * 
     * @return PHAR
     */
    public java.math.BigInteger getPHAR() {
        return PHAR;
    }


    /**
     * Sets the PHAR value for this PHARMAITEM.
     * 
     * @param PHAR
     */
    public void setPHAR(java.math.BigInteger PHAR) {
        this.PHAR = PHAR;
    }


    /**
     * Gets the STATUS value for this PHARMAITEM.
     * 
     * @return STATUS
     */
    public swissindex.PHARMAITEMSTATUS getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this PHARMAITEM.
     * 
     * @param STATUS
     */
    public void setSTATUS(swissindex.PHARMAITEMSTATUS STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the STDATE value for this PHARMAITEM.
     * 
     * @return STDATE
     */
    public java.util.Calendar getSTDATE() {
        return STDATE;
    }


    /**
     * Sets the STDATE value for this PHARMAITEM.
     * 
     * @param STDATE
     */
    public void setSTDATE(java.util.Calendar STDATE) {
        this.STDATE = STDATE;
    }


    /**
     * Gets the LANG value for this PHARMAITEM.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this PHARMAITEM.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the DSCR value for this PHARMAITEM.
     * 
     * @return DSCR
     */
    public java.lang.String getDSCR() {
        return DSCR;
    }


    /**
     * Sets the DSCR value for this PHARMAITEM.
     * 
     * @param DSCR
     */
    public void setDSCR(java.lang.String DSCR) {
        this.DSCR = DSCR;
    }


    /**
     * Gets the ADDSCR value for this PHARMAITEM.
     * 
     * @return ADDSCR
     */
    public java.lang.String getADDSCR() {
        return ADDSCR;
    }


    /**
     * Sets the ADDSCR value for this PHARMAITEM.
     * 
     * @param ADDSCR
     */
    public void setADDSCR(java.lang.String ADDSCR) {
        this.ADDSCR = ADDSCR;
    }


    /**
     * Gets the ATC value for this PHARMAITEM.
     * 
     * @return ATC
     */
    public java.lang.String getATC() {
        return ATC;
    }


    /**
     * Sets the ATC value for this PHARMAITEM.
     * 
     * @param ATC
     */
    public void setATC(java.lang.String ATC) {
        this.ATC = ATC;
    }


    /**
     * Gets the COMP value for this PHARMAITEM.
     * 
     * @return COMP
     */
    public swissindex.PHARMAITEMCOMP getCOMP() {
        return COMP;
    }


    /**
     * Sets the COMP value for this PHARMAITEM.
     * 
     * @param COMP
     */
    public void setCOMP(swissindex.PHARMAITEMCOMP COMP) {
        this.COMP = COMP;
    }


    /**
     * Gets the DT value for this PHARMAITEM.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this PHARMAITEM.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PHARMAITEM)) return false;
        PHARMAITEM other = (PHARMAITEM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GTIN==null && other.getGTIN()==null) || 
             (this.GTIN!=null &&
              this.GTIN.equals(other.getGTIN()))) &&
            ((this.PHAR==null && other.getPHAR()==null) || 
             (this.PHAR!=null &&
              this.PHAR.equals(other.getPHAR()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
            ((this.STDATE==null && other.getSTDATE()==null) || 
             (this.STDATE!=null &&
              this.STDATE.equals(other.getSTDATE()))) &&
            ((this.LANG==null && other.getLANG()==null) || 
             (this.LANG!=null &&
              this.LANG.equals(other.getLANG()))) &&
            ((this.DSCR==null && other.getDSCR()==null) || 
             (this.DSCR!=null &&
              this.DSCR.equals(other.getDSCR()))) &&
            ((this.ADDSCR==null && other.getADDSCR()==null) || 
             (this.ADDSCR!=null &&
              this.ADDSCR.equals(other.getADDSCR()))) &&
            ((this.ATC==null && other.getATC()==null) || 
             (this.ATC!=null &&
              this.ATC.equals(other.getATC()))) &&
            ((this.COMP==null && other.getCOMP()==null) || 
             (this.COMP!=null &&
              this.COMP.equals(other.getCOMP()))) &&
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
        if (getGTIN() != null) {
            _hashCode += getGTIN().hashCode();
        }
        if (getPHAR() != null) {
            _hashCode += getPHAR().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        if (getSTDATE() != null) {
            _hashCode += getSTDATE().hashCode();
        }
        if (getLANG() != null) {
            _hashCode += getLANG().hashCode();
        }
        if (getDSCR() != null) {
            _hashCode += getDSCR().hashCode();
        }
        if (getADDSCR() != null) {
            _hashCode += getADDSCR().hashCode();
        }
        if (getATC() != null) {
            _hashCode += getATC().hashCode();
        }
        if (getCOMP() != null) {
            _hashCode += getCOMP().hashCode();
        }
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PHARMAITEM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>PHARMA>ITEM"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GTIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "GTIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "PHAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>>PHARMA>ITEM>STATUS"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "STDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LANG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "LANG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "DSCR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADDSCR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ADDSCR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ATC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "COMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", ">>>PHARMA>ITEM>COMP"));
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
