/**
 * CDSDSPDSPDSPDOC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSDSPDSPDSPDOC  implements java.io.Serializable {
    private int LNO;

    private java.lang.String LANG;

    private java.lang.String PTITLE;

    private java.lang.String DOCTYP;

    private java.lang.String DOCDATA;

    private java.lang.String DOCDATE;

    private java.lang.String REMARK;

    public CDSDSPDSPDSPDOC() {
    }

    public CDSDSPDSPDSPDOC(
           int LNO,
           java.lang.String LANG,
           java.lang.String PTITLE,
           java.lang.String DOCTYP,
           java.lang.String DOCDATA,
           java.lang.String DOCDATE,
           java.lang.String REMARK) {
           this.LNO = LNO;
           this.LANG = LANG;
           this.PTITLE = PTITLE;
           this.DOCTYP = DOCTYP;
           this.DOCDATA = DOCDATA;
           this.DOCDATE = DOCDATE;
           this.REMARK = REMARK;
    }


    /**
     * Gets the LNO value for this CDSDSPDSPDSPDOC.
     * 
     * @return LNO
     */
    public int getLNO() {
        return LNO;
    }


    /**
     * Sets the LNO value for this CDSDSPDSPDSPDOC.
     * 
     * @param LNO
     */
    public void setLNO(int LNO) {
        this.LNO = LNO;
    }


    /**
     * Gets the LANG value for this CDSDSPDSPDSPDOC.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this CDSDSPDSPDSPDOC.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the PTITLE value for this CDSDSPDSPDSPDOC.
     * 
     * @return PTITLE
     */
    public java.lang.String getPTITLE() {
        return PTITLE;
    }


    /**
     * Sets the PTITLE value for this CDSDSPDSPDSPDOC.
     * 
     * @param PTITLE
     */
    public void setPTITLE(java.lang.String PTITLE) {
        this.PTITLE = PTITLE;
    }


    /**
     * Gets the DOCTYP value for this CDSDSPDSPDSPDOC.
     * 
     * @return DOCTYP
     */
    public java.lang.String getDOCTYP() {
        return DOCTYP;
    }


    /**
     * Sets the DOCTYP value for this CDSDSPDSPDSPDOC.
     * 
     * @param DOCTYP
     */
    public void setDOCTYP(java.lang.String DOCTYP) {
        this.DOCTYP = DOCTYP;
    }


    /**
     * Gets the DOCDATA value for this CDSDSPDSPDSPDOC.
     * 
     * @return DOCDATA
     */
    public java.lang.String getDOCDATA() {
        return DOCDATA;
    }


    /**
     * Sets the DOCDATA value for this CDSDSPDSPDSPDOC.
     * 
     * @param DOCDATA
     */
    public void setDOCDATA(java.lang.String DOCDATA) {
        this.DOCDATA = DOCDATA;
    }


    /**
     * Gets the DOCDATE value for this CDSDSPDSPDSPDOC.
     * 
     * @return DOCDATE
     */
    public java.lang.String getDOCDATE() {
        return DOCDATE;
    }


    /**
     * Sets the DOCDATE value for this CDSDSPDSPDSPDOC.
     * 
     * @param DOCDATE
     */
    public void setDOCDATE(java.lang.String DOCDATE) {
        this.DOCDATE = DOCDATE;
    }


    /**
     * Gets the REMARK value for this CDSDSPDSPDSPDOC.
     * 
     * @return REMARK
     */
    public java.lang.String getREMARK() {
        return REMARK;
    }


    /**
     * Sets the REMARK value for this CDSDSPDSPDSPDOC.
     * 
     * @param REMARK
     */
    public void setREMARK(java.lang.String REMARK) {
        this.REMARK = REMARK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSDSPDSPDSPDOC)) return false;
        CDSDSPDSPDSPDOC other = (CDSDSPDSPDSPDOC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.LNO == other.getLNO() &&
            ((this.LANG==null && other.getLANG()==null) || 
             (this.LANG!=null &&
              this.LANG.equals(other.getLANG()))) &&
            ((this.PTITLE==null && other.getPTITLE()==null) || 
             (this.PTITLE!=null &&
              this.PTITLE.equals(other.getPTITLE()))) &&
            ((this.DOCTYP==null && other.getDOCTYP()==null) || 
             (this.DOCTYP!=null &&
              this.DOCTYP.equals(other.getDOCTYP()))) &&
            ((this.DOCDATA==null && other.getDOCDATA()==null) || 
             (this.DOCDATA!=null &&
              this.DOCDATA.equals(other.getDOCDATA()))) &&
            ((this.DOCDATE==null && other.getDOCDATE()==null) || 
             (this.DOCDATE!=null &&
              this.DOCDATE.equals(other.getDOCDATE()))) &&
            ((this.REMARK==null && other.getREMARK()==null) || 
             (this.REMARK!=null &&
              this.REMARK.equals(other.getREMARK())));
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
        _hashCode += getLNO();
        if (getLANG() != null) {
            _hashCode += getLANG().hashCode();
        }
        if (getPTITLE() != null) {
            _hashCode += getPTITLE().hashCode();
        }
        if (getDOCTYP() != null) {
            _hashCode += getDOCTYP().hashCode();
        }
        if (getDOCDATA() != null) {
            _hashCode += getDOCDATA().hashCode();
        }
        if (getDOCDATE() != null) {
            _hashCode += getDOCDATE().hashCode();
        }
        if (getREMARK() != null) {
            _hashCode += getREMARK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSDSPDSPDSPDOC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPDOC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LANG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LANG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PTITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOCTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOCDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOCDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REMARK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REMARK"));
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
