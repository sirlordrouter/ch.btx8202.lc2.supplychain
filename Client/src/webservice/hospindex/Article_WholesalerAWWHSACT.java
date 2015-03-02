/**
 * Article_WholesalerAWWHSACT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Article_WholesalerAWWHSACT  implements java.io.Serializable {
    private java.lang.String ACTNO;

    private java.lang.String ACTCD;

    private java.util.Calendar ACTSTRT;

    private java.util.Calendar ACTEND;

    private java.lang.Double QDEL;

    private java.lang.Double QINV;

    private java.lang.Double DISC;

    private java.lang.Double UPRICE;

    public Article_WholesalerAWWHSACT() {
    }

    public Article_WholesalerAWWHSACT(
           java.lang.String ACTNO,
           java.lang.String ACTCD,
           java.util.Calendar ACTSTRT,
           java.util.Calendar ACTEND,
           java.lang.Double QDEL,
           java.lang.Double QINV,
           java.lang.Double DISC,
           java.lang.Double UPRICE) {
           this.ACTNO = ACTNO;
           this.ACTCD = ACTCD;
           this.ACTSTRT = ACTSTRT;
           this.ACTEND = ACTEND;
           this.QDEL = QDEL;
           this.QINV = QINV;
           this.DISC = DISC;
           this.UPRICE = UPRICE;
    }


    /**
     * Gets the ACTNO value for this Article_WholesalerAWWHSACT.
     * 
     * @return ACTNO
     */
    public java.lang.String getACTNO() {
        return ACTNO;
    }


    /**
     * Sets the ACTNO value for this Article_WholesalerAWWHSACT.
     * 
     * @param ACTNO
     */
    public void setACTNO(java.lang.String ACTNO) {
        this.ACTNO = ACTNO;
    }


    /**
     * Gets the ACTCD value for this Article_WholesalerAWWHSACT.
     * 
     * @return ACTCD
     */
    public java.lang.String getACTCD() {
        return ACTCD;
    }


    /**
     * Sets the ACTCD value for this Article_WholesalerAWWHSACT.
     * 
     * @param ACTCD
     */
    public void setACTCD(java.lang.String ACTCD) {
        this.ACTCD = ACTCD;
    }


    /**
     * Gets the ACTSTRT value for this Article_WholesalerAWWHSACT.
     * 
     * @return ACTSTRT
     */
    public java.util.Calendar getACTSTRT() {
        return ACTSTRT;
    }


    /**
     * Sets the ACTSTRT value for this Article_WholesalerAWWHSACT.
     * 
     * @param ACTSTRT
     */
    public void setACTSTRT(java.util.Calendar ACTSTRT) {
        this.ACTSTRT = ACTSTRT;
    }


    /**
     * Gets the ACTEND value for this Article_WholesalerAWWHSACT.
     * 
     * @return ACTEND
     */
    public java.util.Calendar getACTEND() {
        return ACTEND;
    }


    /**
     * Sets the ACTEND value for this Article_WholesalerAWWHSACT.
     * 
     * @param ACTEND
     */
    public void setACTEND(java.util.Calendar ACTEND) {
        this.ACTEND = ACTEND;
    }


    /**
     * Gets the QDEL value for this Article_WholesalerAWWHSACT.
     * 
     * @return QDEL
     */
    public java.lang.Double getQDEL() {
        return QDEL;
    }


    /**
     * Sets the QDEL value for this Article_WholesalerAWWHSACT.
     * 
     * @param QDEL
     */
    public void setQDEL(java.lang.Double QDEL) {
        this.QDEL = QDEL;
    }


    /**
     * Gets the QINV value for this Article_WholesalerAWWHSACT.
     * 
     * @return QINV
     */
    public java.lang.Double getQINV() {
        return QINV;
    }


    /**
     * Sets the QINV value for this Article_WholesalerAWWHSACT.
     * 
     * @param QINV
     */
    public void setQINV(java.lang.Double QINV) {
        this.QINV = QINV;
    }


    /**
     * Gets the DISC value for this Article_WholesalerAWWHSACT.
     * 
     * @return DISC
     */
    public java.lang.Double getDISC() {
        return DISC;
    }


    /**
     * Sets the DISC value for this Article_WholesalerAWWHSACT.
     * 
     * @param DISC
     */
    public void setDISC(java.lang.Double DISC) {
        this.DISC = DISC;
    }


    /**
     * Gets the UPRICE value for this Article_WholesalerAWWHSACT.
     * 
     * @return UPRICE
     */
    public java.lang.Double getUPRICE() {
        return UPRICE;
    }


    /**
     * Sets the UPRICE value for this Article_WholesalerAWWHSACT.
     * 
     * @param UPRICE
     */
    public void setUPRICE(java.lang.Double UPRICE) {
        this.UPRICE = UPRICE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article_WholesalerAWWHSACT)) return false;
        Article_WholesalerAWWHSACT other = (Article_WholesalerAWWHSACT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACTNO==null && other.getACTNO()==null) || 
             (this.ACTNO!=null &&
              this.ACTNO.equals(other.getACTNO()))) &&
            ((this.ACTCD==null && other.getACTCD()==null) || 
             (this.ACTCD!=null &&
              this.ACTCD.equals(other.getACTCD()))) &&
            ((this.ACTSTRT==null && other.getACTSTRT()==null) || 
             (this.ACTSTRT!=null &&
              this.ACTSTRT.equals(other.getACTSTRT()))) &&
            ((this.ACTEND==null && other.getACTEND()==null) || 
             (this.ACTEND!=null &&
              this.ACTEND.equals(other.getACTEND()))) &&
            ((this.QDEL==null && other.getQDEL()==null) || 
             (this.QDEL!=null &&
              this.QDEL.equals(other.getQDEL()))) &&
            ((this.QINV==null && other.getQINV()==null) || 
             (this.QINV!=null &&
              this.QINV.equals(other.getQINV()))) &&
            ((this.DISC==null && other.getDISC()==null) || 
             (this.DISC!=null &&
              this.DISC.equals(other.getDISC()))) &&
            ((this.UPRICE==null && other.getUPRICE()==null) || 
             (this.UPRICE!=null &&
              this.UPRICE.equals(other.getUPRICE())));
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
        if (getACTNO() != null) {
            _hashCode += getACTNO().hashCode();
        }
        if (getACTCD() != null) {
            _hashCode += getACTCD().hashCode();
        }
        if (getACTSTRT() != null) {
            _hashCode += getACTSTRT().hashCode();
        }
        if (getACTEND() != null) {
            _hashCode += getACTEND().hashCode();
        }
        if (getQDEL() != null) {
            _hashCode += getQDEL().hashCode();
        }
        if (getQINV() != null) {
            _hashCode += getQINV().hashCode();
        }
        if (getDISC() != null) {
            _hashCode += getDISC().hashCode();
        }
        if (getUPRICE() != null) {
            _hashCode += getUPRICE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Article_WholesalerAWWHSACT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>AW>WHSACT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ACTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ACTCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTSTRT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ACTSTRT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTEND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ACTEND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QDEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QDEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QINV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QINV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DISC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPRICE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "UPRICE"));
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
