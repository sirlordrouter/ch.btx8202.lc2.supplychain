/**
 * CDSDSPDSP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class CDSDSPDSP  implements java.io.Serializable {
    private int DSPNO;

    private java.lang.String TITLED;

    private java.lang.String TITLEF;

    private java.lang.String TITLEE;

    private java.lang.String DATASC;

    private boolean DEL;

    private webservice.hospindex.CDSDSPDSPDSPTXT[] DSPTXT;

    private webservice.hospindex.CDSDSPDSPDSPDOC[] DSPDOC;

    private webservice.hospindex.CDSDSPDSPDSPLNK[] DSPLNK;

    private java.util.Calendar DT;  // attribute

    public CDSDSPDSP() {
    }

    public CDSDSPDSP(
           int DSPNO,
           java.lang.String TITLED,
           java.lang.String TITLEF,
           java.lang.String TITLEE,
           java.lang.String DATASC,
           boolean DEL,
           webservice.hospindex.CDSDSPDSPDSPTXT[] DSPTXT,
           webservice.hospindex.CDSDSPDSPDSPDOC[] DSPDOC,
           webservice.hospindex.CDSDSPDSPDSPLNK[] DSPLNK,
           java.util.Calendar DT) {
           this.DSPNO = DSPNO;
           this.TITLED = TITLED;
           this.TITLEF = TITLEF;
           this.TITLEE = TITLEE;
           this.DATASC = DATASC;
           this.DEL = DEL;
           this.DSPTXT = DSPTXT;
           this.DSPDOC = DSPDOC;
           this.DSPLNK = DSPLNK;
           this.DT = DT;
    }


    /**
     * Gets the DSPNO value for this CDSDSPDSP.
     * 
     * @return DSPNO
     */
    public int getDSPNO() {
        return DSPNO;
    }


    /**
     * Sets the DSPNO value for this CDSDSPDSP.
     * 
     * @param DSPNO
     */
    public void setDSPNO(int DSPNO) {
        this.DSPNO = DSPNO;
    }


    /**
     * Gets the TITLED value for this CDSDSPDSP.
     * 
     * @return TITLED
     */
    public java.lang.String getTITLED() {
        return TITLED;
    }


    /**
     * Sets the TITLED value for this CDSDSPDSP.
     * 
     * @param TITLED
     */
    public void setTITLED(java.lang.String TITLED) {
        this.TITLED = TITLED;
    }


    /**
     * Gets the TITLEF value for this CDSDSPDSP.
     * 
     * @return TITLEF
     */
    public java.lang.String getTITLEF() {
        return TITLEF;
    }


    /**
     * Sets the TITLEF value for this CDSDSPDSP.
     * 
     * @param TITLEF
     */
    public void setTITLEF(java.lang.String TITLEF) {
        this.TITLEF = TITLEF;
    }


    /**
     * Gets the TITLEE value for this CDSDSPDSP.
     * 
     * @return TITLEE
     */
    public java.lang.String getTITLEE() {
        return TITLEE;
    }


    /**
     * Sets the TITLEE value for this CDSDSPDSP.
     * 
     * @param TITLEE
     */
    public void setTITLEE(java.lang.String TITLEE) {
        this.TITLEE = TITLEE;
    }


    /**
     * Gets the DATASC value for this CDSDSPDSP.
     * 
     * @return DATASC
     */
    public java.lang.String getDATASC() {
        return DATASC;
    }


    /**
     * Sets the DATASC value for this CDSDSPDSP.
     * 
     * @param DATASC
     */
    public void setDATASC(java.lang.String DATASC) {
        this.DATASC = DATASC;
    }


    /**
     * Gets the DEL value for this CDSDSPDSP.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this CDSDSPDSP.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the DSPTXT value for this CDSDSPDSP.
     * 
     * @return DSPTXT
     */
    public webservice.hospindex.CDSDSPDSPDSPTXT[] getDSPTXT() {
        return DSPTXT;
    }


    /**
     * Sets the DSPTXT value for this CDSDSPDSP.
     * 
     * @param DSPTXT
     */
    public void setDSPTXT(webservice.hospindex.CDSDSPDSPDSPTXT[] DSPTXT) {
        this.DSPTXT = DSPTXT;
    }

    public webservice.hospindex.CDSDSPDSPDSPTXT getDSPTXT(int i) {
        return this.DSPTXT[i];
    }

    public void setDSPTXT(int i, webservice.hospindex.CDSDSPDSPDSPTXT _value) {
        this.DSPTXT[i] = _value;
    }


    /**
     * Gets the DSPDOC value for this CDSDSPDSP.
     * 
     * @return DSPDOC
     */
    public webservice.hospindex.CDSDSPDSPDSPDOC[] getDSPDOC() {
        return DSPDOC;
    }


    /**
     * Sets the DSPDOC value for this CDSDSPDSP.
     * 
     * @param DSPDOC
     */
    public void setDSPDOC(webservice.hospindex.CDSDSPDSPDSPDOC[] DSPDOC) {
        this.DSPDOC = DSPDOC;
    }

    public webservice.hospindex.CDSDSPDSPDSPDOC getDSPDOC(int i) {
        return this.DSPDOC[i];
    }

    public void setDSPDOC(int i, webservice.hospindex.CDSDSPDSPDSPDOC _value) {
        this.DSPDOC[i] = _value;
    }


    /**
     * Gets the DSPLNK value for this CDSDSPDSP.
     * 
     * @return DSPLNK
     */
    public webservice.hospindex.CDSDSPDSPDSPLNK[] getDSPLNK() {
        return DSPLNK;
    }


    /**
     * Sets the DSPLNK value for this CDSDSPDSP.
     * 
     * @param DSPLNK
     */
    public void setDSPLNK(webservice.hospindex.CDSDSPDSPDSPLNK[] DSPLNK) {
        this.DSPLNK = DSPLNK;
    }

    public webservice.hospindex.CDSDSPDSPDSPLNK getDSPLNK(int i) {
        return this.DSPLNK[i];
    }

    public void setDSPLNK(int i, webservice.hospindex.CDSDSPDSPDSPLNK _value) {
        this.DSPLNK[i] = _value;
    }


    /**
     * Gets the DT value for this CDSDSPDSP.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this CDSDSPDSP.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CDSDSPDSP)) return false;
        CDSDSPDSP other = (CDSDSPDSP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.DSPNO == other.getDSPNO() &&
            ((this.TITLED==null && other.getTITLED()==null) || 
             (this.TITLED!=null &&
              this.TITLED.equals(other.getTITLED()))) &&
            ((this.TITLEF==null && other.getTITLEF()==null) || 
             (this.TITLEF!=null &&
              this.TITLEF.equals(other.getTITLEF()))) &&
            ((this.TITLEE==null && other.getTITLEE()==null) || 
             (this.TITLEE!=null &&
              this.TITLEE.equals(other.getTITLEE()))) &&
            ((this.DATASC==null && other.getDATASC()==null) || 
             (this.DATASC!=null &&
              this.DATASC.equals(other.getDATASC()))) &&
            this.DEL == other.isDEL() &&
            ((this.DSPTXT==null && other.getDSPTXT()==null) || 
             (this.DSPTXT!=null &&
              java.util.Arrays.equals(this.DSPTXT, other.getDSPTXT()))) &&
            ((this.DSPDOC==null && other.getDSPDOC()==null) || 
             (this.DSPDOC!=null &&
              java.util.Arrays.equals(this.DSPDOC, other.getDSPDOC()))) &&
            ((this.DSPLNK==null && other.getDSPLNK()==null) || 
             (this.DSPLNK!=null &&
              java.util.Arrays.equals(this.DSPLNK, other.getDSPLNK()))) &&
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
        _hashCode += getDSPNO();
        if (getTITLED() != null) {
            _hashCode += getTITLED().hashCode();
        }
        if (getTITLEF() != null) {
            _hashCode += getTITLEF().hashCode();
        }
        if (getTITLEE() != null) {
            _hashCode += getTITLEE().hashCode();
        }
        if (getDATASC() != null) {
            _hashCode += getDATASC().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDSPTXT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDSPTXT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDSPTXT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDSPDOC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDSPDOC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDSPDOC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDSPLNK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDSPLNK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDSPLNK(), i);
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
        new org.apache.axis.description.TypeDesc(CDSDSPDSP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDSDSP>DSP"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITLED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLEF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITLEF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLEE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITLEE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATASC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DATASC"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPTXT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPTXT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPTXT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPDOC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPDOC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPDOC"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSPLNK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSPLNK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPLNK"));
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
