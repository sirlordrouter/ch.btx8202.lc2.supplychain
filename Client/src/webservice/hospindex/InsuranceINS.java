/**
 * InsuranceINS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class InsuranceINS  implements java.io.Serializable {
    private java.lang.String GLN;

    private webservice.hospindex.InsuranceINSROLE ROLE;

    private java.lang.String LANG;

    private java.lang.String DESCR1;

    private java.lang.String DESCR2;

    private java.lang.String DIV_GLN;

    private java.lang.String GROUP_GLN;

    private boolean DEL;

    private webservice.hospindex.InsuranceINSADDR[] ADDR;

    private webservice.hospindex.InsuranceINSCOM[] COM;

    private webservice.hospindex.InsuranceINSE_COM[] e_COM;

    private webservice.hospindex.InsuranceINSREFNO[] REFNO;

    private java.util.Calendar DT;  // attribute

    public InsuranceINS() {
    }

    public InsuranceINS(
           java.lang.String GLN,
           webservice.hospindex.InsuranceINSROLE ROLE,
           java.lang.String LANG,
           java.lang.String DESCR1,
           java.lang.String DESCR2,
           java.lang.String DIV_GLN,
           java.lang.String GROUP_GLN,
           boolean DEL,
           webservice.hospindex.InsuranceINSADDR[] ADDR,
           webservice.hospindex.InsuranceINSCOM[] COM,
           webservice.hospindex.InsuranceINSE_COM[] e_COM,
           webservice.hospindex.InsuranceINSREFNO[] REFNO,
           java.util.Calendar DT) {
           this.GLN = GLN;
           this.ROLE = ROLE;
           this.LANG = LANG;
           this.DESCR1 = DESCR1;
           this.DESCR2 = DESCR2;
           this.DIV_GLN = DIV_GLN;
           this.GROUP_GLN = GROUP_GLN;
           this.DEL = DEL;
           this.ADDR = ADDR;
           this.COM = COM;
           this.e_COM = e_COM;
           this.REFNO = REFNO;
           this.DT = DT;
    }


    /**
     * Gets the GLN value for this InsuranceINS.
     * 
     * @return GLN
     */
    public java.lang.String getGLN() {
        return GLN;
    }


    /**
     * Sets the GLN value for this InsuranceINS.
     * 
     * @param GLN
     */
    public void setGLN(java.lang.String GLN) {
        this.GLN = GLN;
    }


    /**
     * Gets the ROLE value for this InsuranceINS.
     * 
     * @return ROLE
     */
    public webservice.hospindex.InsuranceINSROLE getROLE() {
        return ROLE;
    }


    /**
     * Sets the ROLE value for this InsuranceINS.
     * 
     * @param ROLE
     */
    public void setROLE(webservice.hospindex.InsuranceINSROLE ROLE) {
        this.ROLE = ROLE;
    }


    /**
     * Gets the LANG value for this InsuranceINS.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this InsuranceINS.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the DESCR1 value for this InsuranceINS.
     * 
     * @return DESCR1
     */
    public java.lang.String getDESCR1() {
        return DESCR1;
    }


    /**
     * Sets the DESCR1 value for this InsuranceINS.
     * 
     * @param DESCR1
     */
    public void setDESCR1(java.lang.String DESCR1) {
        this.DESCR1 = DESCR1;
    }


    /**
     * Gets the DESCR2 value for this InsuranceINS.
     * 
     * @return DESCR2
     */
    public java.lang.String getDESCR2() {
        return DESCR2;
    }


    /**
     * Sets the DESCR2 value for this InsuranceINS.
     * 
     * @param DESCR2
     */
    public void setDESCR2(java.lang.String DESCR2) {
        this.DESCR2 = DESCR2;
    }


    /**
     * Gets the DIV_GLN value for this InsuranceINS.
     * 
     * @return DIV_GLN
     */
    public java.lang.String getDIV_GLN() {
        return DIV_GLN;
    }


    /**
     * Sets the DIV_GLN value for this InsuranceINS.
     * 
     * @param DIV_GLN
     */
    public void setDIV_GLN(java.lang.String DIV_GLN) {
        this.DIV_GLN = DIV_GLN;
    }


    /**
     * Gets the GROUP_GLN value for this InsuranceINS.
     * 
     * @return GROUP_GLN
     */
    public java.lang.String getGROUP_GLN() {
        return GROUP_GLN;
    }


    /**
     * Sets the GROUP_GLN value for this InsuranceINS.
     * 
     * @param GROUP_GLN
     */
    public void setGROUP_GLN(java.lang.String GROUP_GLN) {
        this.GROUP_GLN = GROUP_GLN;
    }


    /**
     * Gets the DEL value for this InsuranceINS.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this InsuranceINS.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the ADDR value for this InsuranceINS.
     * 
     * @return ADDR
     */
    public webservice.hospindex.InsuranceINSADDR[] getADDR() {
        return ADDR;
    }


    /**
     * Sets the ADDR value for this InsuranceINS.
     * 
     * @param ADDR
     */
    public void setADDR(webservice.hospindex.InsuranceINSADDR[] ADDR) {
        this.ADDR = ADDR;
    }

    public webservice.hospindex.InsuranceINSADDR getADDR(int i) {
        return this.ADDR[i];
    }

    public void setADDR(int i, webservice.hospindex.InsuranceINSADDR _value) {
        this.ADDR[i] = _value;
    }


    /**
     * Gets the COM value for this InsuranceINS.
     * 
     * @return COM
     */
    public webservice.hospindex.InsuranceINSCOM[] getCOM() {
        return COM;
    }


    /**
     * Sets the COM value for this InsuranceINS.
     * 
     * @param COM
     */
    public void setCOM(webservice.hospindex.InsuranceINSCOM[] COM) {
        this.COM = COM;
    }

    public webservice.hospindex.InsuranceINSCOM getCOM(int i) {
        return this.COM[i];
    }

    public void setCOM(int i, webservice.hospindex.InsuranceINSCOM _value) {
        this.COM[i] = _value;
    }


    /**
     * Gets the e_COM value for this InsuranceINS.
     * 
     * @return e_COM
     */
    public webservice.hospindex.InsuranceINSE_COM[] getE_COM() {
        return e_COM;
    }


    /**
     * Sets the e_COM value for this InsuranceINS.
     * 
     * @param e_COM
     */
    public void setE_COM(webservice.hospindex.InsuranceINSE_COM[] e_COM) {
        this.e_COM = e_COM;
    }

    public webservice.hospindex.InsuranceINSE_COM getE_COM(int i) {
        return this.e_COM[i];
    }

    public void setE_COM(int i, webservice.hospindex.InsuranceINSE_COM _value) {
        this.e_COM[i] = _value;
    }


    /**
     * Gets the REFNO value for this InsuranceINS.
     * 
     * @return REFNO
     */
    public webservice.hospindex.InsuranceINSREFNO[] getREFNO() {
        return REFNO;
    }


    /**
     * Sets the REFNO value for this InsuranceINS.
     * 
     * @param REFNO
     */
    public void setREFNO(webservice.hospindex.InsuranceINSREFNO[] REFNO) {
        this.REFNO = REFNO;
    }

    public webservice.hospindex.InsuranceINSREFNO getREFNO(int i) {
        return this.REFNO[i];
    }

    public void setREFNO(int i, webservice.hospindex.InsuranceINSREFNO _value) {
        this.REFNO[i] = _value;
    }


    /**
     * Gets the DT value for this InsuranceINS.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this InsuranceINS.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuranceINS)) return false;
        InsuranceINS other = (InsuranceINS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLN==null && other.getGLN()==null) || 
             (this.GLN!=null &&
              this.GLN.equals(other.getGLN()))) &&
            ((this.ROLE==null && other.getROLE()==null) || 
             (this.ROLE!=null &&
              this.ROLE.equals(other.getROLE()))) &&
            ((this.LANG==null && other.getLANG()==null) || 
             (this.LANG!=null &&
              this.LANG.equals(other.getLANG()))) &&
            ((this.DESCR1==null && other.getDESCR1()==null) || 
             (this.DESCR1!=null &&
              this.DESCR1.equals(other.getDESCR1()))) &&
            ((this.DESCR2==null && other.getDESCR2()==null) || 
             (this.DESCR2!=null &&
              this.DESCR2.equals(other.getDESCR2()))) &&
            ((this.DIV_GLN==null && other.getDIV_GLN()==null) || 
             (this.DIV_GLN!=null &&
              this.DIV_GLN.equals(other.getDIV_GLN()))) &&
            ((this.GROUP_GLN==null && other.getGROUP_GLN()==null) || 
             (this.GROUP_GLN!=null &&
              this.GROUP_GLN.equals(other.getGROUP_GLN()))) &&
            this.DEL == other.isDEL() &&
            ((this.ADDR==null && other.getADDR()==null) || 
             (this.ADDR!=null &&
              java.util.Arrays.equals(this.ADDR, other.getADDR()))) &&
            ((this.COM==null && other.getCOM()==null) || 
             (this.COM!=null &&
              java.util.Arrays.equals(this.COM, other.getCOM()))) &&
            ((this.e_COM==null && other.getE_COM()==null) || 
             (this.e_COM!=null &&
              java.util.Arrays.equals(this.e_COM, other.getE_COM()))) &&
            ((this.REFNO==null && other.getREFNO()==null) || 
             (this.REFNO!=null &&
              java.util.Arrays.equals(this.REFNO, other.getREFNO()))) &&
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
        if (getGLN() != null) {
            _hashCode += getGLN().hashCode();
        }
        if (getROLE() != null) {
            _hashCode += getROLE().hashCode();
        }
        if (getLANG() != null) {
            _hashCode += getLANG().hashCode();
        }
        if (getDESCR1() != null) {
            _hashCode += getDESCR1().hashCode();
        }
        if (getDESCR2() != null) {
            _hashCode += getDESCR2().hashCode();
        }
        if (getDIV_GLN() != null) {
            _hashCode += getDIV_GLN().hashCode();
        }
        if (getGROUP_GLN() != null) {
            _hashCode += getGROUP_GLN().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getADDR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getADDR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getADDR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getE_COM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getE_COM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getE_COM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREFNO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREFNO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREFNO(), i);
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
        new org.apache.axis.description.TypeDesc(InsuranceINS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Insurance>INS"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ROLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>ROLE"));
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
        elemField.setFieldName("DESCR1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DESCR1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCR2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DESCR2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIV_GLN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DIV_GLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GROUP_GLN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GROUP_GLN"));
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
        elemField.setFieldName("ADDR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>ADDR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "COM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>COM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_COM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "E_COM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>E_COM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REFNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REFNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>REFNO"));
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
