/**
 * CDSCDSPRD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSCDSPRD  implements java.io.Serializable {
    private int PRDNO;

    private boolean DEL;

    private webservice.hospindex.CDSCDSPRDPRDCCH[] PRDCCH;

    private webservice.hospindex.CDSCDSPRDPRDDSM[] PRDDSM;

    private webservice.hospindex.CDSCDSPRDPRDDSK[] PRDDSK;

    private java.util.Calendar DT;  // attribute

    public CDSCDSPRD() {
    }

    public CDSCDSPRD(
           int PRDNO,
           boolean DEL,
           webservice.hospindex.CDSCDSPRDPRDCCH[] PRDCCH,
           webservice.hospindex.CDSCDSPRDPRDDSM[] PRDDSM,
           webservice.hospindex.CDSCDSPRDPRDDSK[] PRDDSK,
           java.util.Calendar DT) {
           this.PRDNO = PRDNO;
           this.DEL = DEL;
           this.PRDCCH = PRDCCH;
           this.PRDDSM = PRDDSM;
           this.PRDDSK = PRDDSK;
           this.DT = DT;
    }


    /**
     * Gets the PRDNO value for this CDSCDSPRD.
     * 
     * @return PRDNO
     */
    public int getPRDNO() {
        return PRDNO;
    }


    /**
     * Sets the PRDNO value for this CDSCDSPRD.
     * 
     * @param PRDNO
     */
    public void setPRDNO(int PRDNO) {
        this.PRDNO = PRDNO;
    }


    /**
     * Gets the DEL value for this CDSCDSPRD.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this CDSCDSPRD.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the PRDCCH value for this CDSCDSPRD.
     * 
     * @return PRDCCH
     */
    public webservice.hospindex.CDSCDSPRDPRDCCH[] getPRDCCH() {
        return PRDCCH;
    }


    /**
     * Sets the PRDCCH value for this CDSCDSPRD.
     * 
     * @param PRDCCH
     */
    public void setPRDCCH(webservice.hospindex.CDSCDSPRDPRDCCH[] PRDCCH) {
        this.PRDCCH = PRDCCH;
    }

    public webservice.hospindex.CDSCDSPRDPRDCCH getPRDCCH(int i) {
        return this.PRDCCH[i];
    }

    public void setPRDCCH(int i, webservice.hospindex.CDSCDSPRDPRDCCH _value) {
        this.PRDCCH[i] = _value;
    }


    /**
     * Gets the PRDDSM value for this CDSCDSPRD.
     * 
     * @return PRDDSM
     */
    public webservice.hospindex.CDSCDSPRDPRDDSM[] getPRDDSM() {
        return PRDDSM;
    }


    /**
     * Sets the PRDDSM value for this CDSCDSPRD.
     * 
     * @param PRDDSM
     */
    public void setPRDDSM(webservice.hospindex.CDSCDSPRDPRDDSM[] PRDDSM) {
        this.PRDDSM = PRDDSM;
    }

    public webservice.hospindex.CDSCDSPRDPRDDSM getPRDDSM(int i) {
        return this.PRDDSM[i];
    }

    public void setPRDDSM(int i, webservice.hospindex.CDSCDSPRDPRDDSM _value) {
        this.PRDDSM[i] = _value;
    }


    /**
     * Gets the PRDDSK value for this CDSCDSPRD.
     * 
     * @return PRDDSK
     */
    public webservice.hospindex.CDSCDSPRDPRDDSK[] getPRDDSK() {
        return PRDDSK;
    }


    /**
     * Sets the PRDDSK value for this CDSCDSPRD.
     * 
     * @param PRDDSK
     */
    public void setPRDDSK(webservice.hospindex.CDSCDSPRDPRDDSK[] PRDDSK) {
        this.PRDDSK = PRDDSK;
    }

    public webservice.hospindex.CDSCDSPRDPRDDSK getPRDDSK(int i) {
        return this.PRDDSK[i];
    }

    public void setPRDDSK(int i, webservice.hospindex.CDSCDSPRDPRDDSK _value) {
        this.PRDDSK[i] = _value;
    }


    /**
     * Gets the DT value for this CDSCDSPRD.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this CDSCDSPRD.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSCDSPRD)) return false;
        CDSCDSPRD other = (CDSCDSPRD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.PRDNO == other.getPRDNO() &&
            this.DEL == other.isDEL() &&
            ((this.PRDCCH==null && other.getPRDCCH()==null) || 
             (this.PRDCCH!=null &&
              java.util.Arrays.equals(this.PRDCCH, other.getPRDCCH()))) &&
            ((this.PRDDSM==null && other.getPRDDSM()==null) || 
             (this.PRDDSM!=null &&
              java.util.Arrays.equals(this.PRDDSM, other.getPRDDSM()))) &&
            ((this.PRDDSK==null && other.getPRDDSK()==null) || 
             (this.PRDDSK!=null &&
              java.util.Arrays.equals(this.PRDDSK, other.getPRDDSK()))) &&
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
        _hashCode += getPRDNO();
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPRDCCH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRDCCH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRDCCH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPRDDSM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRDDSM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRDDSM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPRDDSK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRDDSK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRDDSK(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDT() != null) {
            _hashCode += getDT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CDSCDSPRD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDS>CDSPRD"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDCCH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDCCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDCCH"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDDSM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDDSM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDDSM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDDSK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDDSK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDDSK"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
