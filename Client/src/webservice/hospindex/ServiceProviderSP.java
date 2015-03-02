/**
 * ServiceProviderSP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ServiceProviderSP  implements java.io.Serializable {
    private webservice.hospindex.ServiceProviderSPSPTYPE SPTYPE;

    private java.lang.String CDNAT;

    private java.lang.String GLN;

    private webservice.hospindex.ServiceProviderSPSTATUS STATUS;

    private java.lang.String LANG;

    private java.lang.String TITLE;

    private java.lang.String DESCR1;

    private java.lang.String DESCR2;

    private java.lang.Integer SEX;

    private boolean DEL;

    private webservice.hospindex.ServiceProviderSPADDR[] ADDR;

    private webservice.hospindex.ServiceProviderSPREFNO[] REFNO;

    private webservice.hospindex.ServiceProviderSPNDA[] NDA;

    private webservice.hospindex.ServiceProviderSPROLES[] ROLES;

    private java.util.Calendar DT;  // attribute

    public ServiceProviderSP() {
    }

    public ServiceProviderSP(
           webservice.hospindex.ServiceProviderSPSPTYPE SPTYPE,
           java.lang.String CDNAT,
           java.lang.String GLN,
           webservice.hospindex.ServiceProviderSPSTATUS STATUS,
           java.lang.String LANG,
           java.lang.String TITLE,
           java.lang.String DESCR1,
           java.lang.String DESCR2,
           java.lang.Integer SEX,
           boolean DEL,
           webservice.hospindex.ServiceProviderSPADDR[] ADDR,
           webservice.hospindex.ServiceProviderSPREFNO[] REFNO,
           webservice.hospindex.ServiceProviderSPNDA[] NDA,
           webservice.hospindex.ServiceProviderSPROLES[] ROLES,
           java.util.Calendar DT) {
           this.SPTYPE = SPTYPE;
           this.CDNAT = CDNAT;
           this.GLN = GLN;
           this.STATUS = STATUS;
           this.LANG = LANG;
           this.TITLE = TITLE;
           this.DESCR1 = DESCR1;
           this.DESCR2 = DESCR2;
           this.SEX = SEX;
           this.DEL = DEL;
           this.ADDR = ADDR;
           this.REFNO = REFNO;
           this.NDA = NDA;
           this.ROLES = ROLES;
           this.DT = DT;
    }


    /**
     * Gets the SPTYPE value for this ServiceProviderSP.
     * 
     * @return SPTYPE
     */
    public webservice.hospindex.ServiceProviderSPSPTYPE getSPTYPE() {
        return SPTYPE;
    }


    /**
     * Sets the SPTYPE value for this ServiceProviderSP.
     * 
     * @param SPTYPE
     */
    public void setSPTYPE(webservice.hospindex.ServiceProviderSPSPTYPE SPTYPE) {
        this.SPTYPE = SPTYPE;
    }


    /**
     * Gets the CDNAT value for this ServiceProviderSP.
     * 
     * @return CDNAT
     */
    public java.lang.String getCDNAT() {
        return CDNAT;
    }


    /**
     * Sets the CDNAT value for this ServiceProviderSP.
     * 
     * @param CDNAT
     */
    public void setCDNAT(java.lang.String CDNAT) {
        this.CDNAT = CDNAT;
    }


    /**
     * Gets the GLN value for this ServiceProviderSP.
     * 
     * @return GLN
     */
    public java.lang.String getGLN() {
        return GLN;
    }


    /**
     * Sets the GLN value for this ServiceProviderSP.
     * 
     * @param GLN
     */
    public void setGLN(java.lang.String GLN) {
        this.GLN = GLN;
    }


    /**
     * Gets the STATUS value for this ServiceProviderSP.
     * 
     * @return STATUS
     */
    public webservice.hospindex.ServiceProviderSPSTATUS getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this ServiceProviderSP.
     * 
     * @param STATUS
     */
    public void setSTATUS(webservice.hospindex.ServiceProviderSPSTATUS STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the LANG value for this ServiceProviderSP.
     * 
     * @return LANG
     */
    public java.lang.String getLANG() {
        return LANG;
    }


    /**
     * Sets the LANG value for this ServiceProviderSP.
     * 
     * @param LANG
     */
    public void setLANG(java.lang.String LANG) {
        this.LANG = LANG;
    }


    /**
     * Gets the TITLE value for this ServiceProviderSP.
     * 
     * @return TITLE
     */
    public java.lang.String getTITLE() {
        return TITLE;
    }


    /**
     * Sets the TITLE value for this ServiceProviderSP.
     * 
     * @param TITLE
     */
    public void setTITLE(java.lang.String TITLE) {
        this.TITLE = TITLE;
    }


    /**
     * Gets the DESCR1 value for this ServiceProviderSP.
     * 
     * @return DESCR1
     */
    public java.lang.String getDESCR1() {
        return DESCR1;
    }


    /**
     * Sets the DESCR1 value for this ServiceProviderSP.
     * 
     * @param DESCR1
     */
    public void setDESCR1(java.lang.String DESCR1) {
        this.DESCR1 = DESCR1;
    }


    /**
     * Gets the DESCR2 value for this ServiceProviderSP.
     * 
     * @return DESCR2
     */
    public java.lang.String getDESCR2() {
        return DESCR2;
    }


    /**
     * Sets the DESCR2 value for this ServiceProviderSP.
     * 
     * @param DESCR2
     */
    public void setDESCR2(java.lang.String DESCR2) {
        this.DESCR2 = DESCR2;
    }


    /**
     * Gets the SEX value for this ServiceProviderSP.
     * 
     * @return SEX
     */
    public java.lang.Integer getSEX() {
        return SEX;
    }


    /**
     * Sets the SEX value for this ServiceProviderSP.
     * 
     * @param SEX
     */
    public void setSEX(java.lang.Integer SEX) {
        this.SEX = SEX;
    }


    /**
     * Gets the DEL value for this ServiceProviderSP.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this ServiceProviderSP.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the ADDR value for this ServiceProviderSP.
     * 
     * @return ADDR
     */
    public webservice.hospindex.ServiceProviderSPADDR[] getADDR() {
        return ADDR;
    }


    /**
     * Sets the ADDR value for this ServiceProviderSP.
     * 
     * @param ADDR
     */
    public void setADDR(webservice.hospindex.ServiceProviderSPADDR[] ADDR) {
        this.ADDR = ADDR;
    }

    public webservice.hospindex.ServiceProviderSPADDR getADDR(int i) {
        return this.ADDR[i];
    }

    public void setADDR(int i, webservice.hospindex.ServiceProviderSPADDR _value) {
        this.ADDR[i] = _value;
    }


    /**
     * Gets the REFNO value for this ServiceProviderSP.
     * 
     * @return REFNO
     */
    public webservice.hospindex.ServiceProviderSPREFNO[] getREFNO() {
        return REFNO;
    }


    /**
     * Sets the REFNO value for this ServiceProviderSP.
     * 
     * @param REFNO
     */
    public void setREFNO(webservice.hospindex.ServiceProviderSPREFNO[] REFNO) {
        this.REFNO = REFNO;
    }

    public webservice.hospindex.ServiceProviderSPREFNO getREFNO(int i) {
        return this.REFNO[i];
    }

    public void setREFNO(int i, webservice.hospindex.ServiceProviderSPREFNO _value) {
        this.REFNO[i] = _value;
    }


    /**
     * Gets the NDA value for this ServiceProviderSP.
     * 
     * @return NDA
     */
    public webservice.hospindex.ServiceProviderSPNDA[] getNDA() {
        return NDA;
    }


    /**
     * Sets the NDA value for this ServiceProviderSP.
     * 
     * @param NDA
     */
    public void setNDA(webservice.hospindex.ServiceProviderSPNDA[] NDA) {
        this.NDA = NDA;
    }

    public webservice.hospindex.ServiceProviderSPNDA getNDA(int i) {
        return this.NDA[i];
    }

    public void setNDA(int i, webservice.hospindex.ServiceProviderSPNDA _value) {
        this.NDA[i] = _value;
    }


    /**
     * Gets the ROLES value for this ServiceProviderSP.
     * 
     * @return ROLES
     */
    public webservice.hospindex.ServiceProviderSPROLES[] getROLES() {
        return ROLES;
    }


    /**
     * Sets the ROLES value for this ServiceProviderSP.
     * 
     * @param ROLES
     */
    public void setROLES(webservice.hospindex.ServiceProviderSPROLES[] ROLES) {
        this.ROLES = ROLES;
    }

    public webservice.hospindex.ServiceProviderSPROLES getROLES(int i) {
        return this.ROLES[i];
    }

    public void setROLES(int i, webservice.hospindex.ServiceProviderSPROLES _value) {
        this.ROLES[i] = _value;
    }


    /**
     * Gets the DT value for this ServiceProviderSP.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this ServiceProviderSP.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceProviderSP)) return false;
        ServiceProviderSP other = (ServiceProviderSP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SPTYPE==null && other.getSPTYPE()==null) || 
             (this.SPTYPE!=null &&
              this.SPTYPE.equals(other.getSPTYPE()))) &&
            ((this.CDNAT==null && other.getCDNAT()==null) || 
             (this.CDNAT!=null &&
              this.CDNAT.equals(other.getCDNAT()))) &&
            ((this.GLN==null && other.getGLN()==null) || 
             (this.GLN!=null &&
              this.GLN.equals(other.getGLN()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
            ((this.LANG==null && other.getLANG()==null) || 
             (this.LANG!=null &&
              this.LANG.equals(other.getLANG()))) &&
            ((this.TITLE==null && other.getTITLE()==null) || 
             (this.TITLE!=null &&
              this.TITLE.equals(other.getTITLE()))) &&
            ((this.DESCR1==null && other.getDESCR1()==null) || 
             (this.DESCR1!=null &&
              this.DESCR1.equals(other.getDESCR1()))) &&
            ((this.DESCR2==null && other.getDESCR2()==null) || 
             (this.DESCR2!=null &&
              this.DESCR2.equals(other.getDESCR2()))) &&
            ((this.SEX==null && other.getSEX()==null) || 
             (this.SEX!=null &&
              this.SEX.equals(other.getSEX()))) &&
            this.DEL == other.isDEL() &&
            ((this.ADDR==null && other.getADDR()==null) || 
             (this.ADDR!=null &&
              java.util.Arrays.equals(this.ADDR, other.getADDR()))) &&
            ((this.REFNO==null && other.getREFNO()==null) || 
             (this.REFNO!=null &&
              java.util.Arrays.equals(this.REFNO, other.getREFNO()))) &&
            ((this.NDA==null && other.getNDA()==null) || 
             (this.NDA!=null &&
              java.util.Arrays.equals(this.NDA, other.getNDA()))) &&
            ((this.ROLES==null && other.getROLES()==null) || 
             (this.ROLES!=null &&
              java.util.Arrays.equals(this.ROLES, other.getROLES()))) &&
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
        if (getSPTYPE() != null) {
            _hashCode += getSPTYPE().hashCode();
        }
        if (getCDNAT() != null) {
            _hashCode += getCDNAT().hashCode();
        }
        if (getGLN() != null) {
            _hashCode += getGLN().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        if (getLANG() != null) {
            _hashCode += getLANG().hashCode();
        }
        if (getTITLE() != null) {
            _hashCode += getTITLE().hashCode();
        }
        if (getDESCR1() != null) {
            _hashCode += getDESCR1().hashCode();
        }
        if (getDESCR2() != null) {
            _hashCode += getDESCR2().hashCode();
        }
        if (getSEX() != null) {
            _hashCode += getSEX().hashCode();
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
        if (getNDA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNDA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNDA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getROLES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getROLES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getROLES(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceProviderSP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>ServiceProvider>SP"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SPTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>SPTYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDNAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDNAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>STATUS"));
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
        elemField.setFieldName("TITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TITLE"));
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
        elemField.setFieldName("SEX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>ADDR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REFNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "REFNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>REFNO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NDA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>NDA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ROLES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ROLES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>ROLES"));
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
