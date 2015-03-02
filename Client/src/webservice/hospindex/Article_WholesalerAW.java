/**
 * Article_WholesalerAW.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class Article_WholesalerAW  implements java.io.Serializable {
    private int WHSNO;

    private java.lang.String PLF;

    private java.lang.String PHAR;

    private java.lang.Integer STCK;

    private java.lang.String GSCD;

    private java.lang.Integer RPTYP;

    private java.lang.Integer RPCD;

    private java.lang.String RPART;

    private java.lang.String STCKIN;

    private java.lang.String RETCD;

    private java.lang.String RETDEL;

    private java.lang.Double RETPRC;

    private java.lang.Double MINORD;

    private java.lang.Double SIZEX;

    private java.lang.Double SIZEY;

    private java.lang.Double SIZEZ;

    private java.lang.Double WHSARTCD;

    private java.lang.String PRICD;

    private java.lang.String SEASN;

    private java.lang.Double VOL;

    private java.lang.Double WGHT;

    private boolean DEL;

    private webservice.hospindex.Article_WholesalerAWWHSACT[] WHSACT;

    private webservice.hospindex.Article_WholesalerAWWHSPRI[] WHSPRI;

    private java.util.Calendar DT;  // attribute

    public Article_WholesalerAW() {
    }

    public Article_WholesalerAW(
           int WHSNO,
           java.lang.String PLF,
           java.lang.String PHAR,
           java.lang.Integer STCK,
           java.lang.String GSCD,
           java.lang.Integer RPTYP,
           java.lang.Integer RPCD,
           java.lang.String RPART,
           java.lang.String STCKIN,
           java.lang.String RETCD,
           java.lang.String RETDEL,
           java.lang.Double RETPRC,
           java.lang.Double MINORD,
           java.lang.Double SIZEX,
           java.lang.Double SIZEY,
           java.lang.Double SIZEZ,
           java.lang.Double WHSARTCD,
           java.lang.String PRICD,
           java.lang.String SEASN,
           java.lang.Double VOL,
           java.lang.Double WGHT,
           boolean DEL,
           webservice.hospindex.Article_WholesalerAWWHSACT[] WHSACT,
           webservice.hospindex.Article_WholesalerAWWHSPRI[] WHSPRI,
           java.util.Calendar DT) {
           this.WHSNO = WHSNO;
           this.PLF = PLF;
           this.PHAR = PHAR;
           this.STCK = STCK;
           this.GSCD = GSCD;
           this.RPTYP = RPTYP;
           this.RPCD = RPCD;
           this.RPART = RPART;
           this.STCKIN = STCKIN;
           this.RETCD = RETCD;
           this.RETDEL = RETDEL;
           this.RETPRC = RETPRC;
           this.MINORD = MINORD;
           this.SIZEX = SIZEX;
           this.SIZEY = SIZEY;
           this.SIZEZ = SIZEZ;
           this.WHSARTCD = WHSARTCD;
           this.PRICD = PRICD;
           this.SEASN = SEASN;
           this.VOL = VOL;
           this.WGHT = WGHT;
           this.DEL = DEL;
           this.WHSACT = WHSACT;
           this.WHSPRI = WHSPRI;
           this.DT = DT;
    }


    /**
     * Gets the WHSNO value for this Article_WholesalerAW.
     * 
     * @return WHSNO
     */
    public int getWHSNO() {
        return WHSNO;
    }


    /**
     * Sets the WHSNO value for this Article_WholesalerAW.
     * 
     * @param WHSNO
     */
    public void setWHSNO(int WHSNO) {
        this.WHSNO = WHSNO;
    }


    /**
     * Gets the PLF value for this Article_WholesalerAW.
     * 
     * @return PLF
     */
    public java.lang.String getPLF() {
        return PLF;
    }


    /**
     * Sets the PLF value for this Article_WholesalerAW.
     * 
     * @param PLF
     */
    public void setPLF(java.lang.String PLF) {
        this.PLF = PLF;
    }


    /**
     * Gets the PHAR value for this Article_WholesalerAW.
     * 
     * @return PHAR
     */
    public java.lang.String getPHAR() {
        return PHAR;
    }


    /**
     * Sets the PHAR value for this Article_WholesalerAW.
     * 
     * @param PHAR
     */
    public void setPHAR(java.lang.String PHAR) {
        this.PHAR = PHAR;
    }


    /**
     * Gets the STCK value for this Article_WholesalerAW.
     * 
     * @return STCK
     */
    public java.lang.Integer getSTCK() {
        return STCK;
    }


    /**
     * Sets the STCK value for this Article_WholesalerAW.
     * 
     * @param STCK
     */
    public void setSTCK(java.lang.Integer STCK) {
        this.STCK = STCK;
    }


    /**
     * Gets the GSCD value for this Article_WholesalerAW.
     * 
     * @return GSCD
     */
    public java.lang.String getGSCD() {
        return GSCD;
    }


    /**
     * Sets the GSCD value for this Article_WholesalerAW.
     * 
     * @param GSCD
     */
    public void setGSCD(java.lang.String GSCD) {
        this.GSCD = GSCD;
    }


    /**
     * Gets the RPTYP value for this Article_WholesalerAW.
     * 
     * @return RPTYP
     */
    public java.lang.Integer getRPTYP() {
        return RPTYP;
    }


    /**
     * Sets the RPTYP value for this Article_WholesalerAW.
     * 
     * @param RPTYP
     */
    public void setRPTYP(java.lang.Integer RPTYP) {
        this.RPTYP = RPTYP;
    }


    /**
     * Gets the RPCD value for this Article_WholesalerAW.
     * 
     * @return RPCD
     */
    public java.lang.Integer getRPCD() {
        return RPCD;
    }


    /**
     * Sets the RPCD value for this Article_WholesalerAW.
     * 
     * @param RPCD
     */
    public void setRPCD(java.lang.Integer RPCD) {
        this.RPCD = RPCD;
    }


    /**
     * Gets the RPART value for this Article_WholesalerAW.
     * 
     * @return RPART
     */
    public java.lang.String getRPART() {
        return RPART;
    }


    /**
     * Sets the RPART value for this Article_WholesalerAW.
     * 
     * @param RPART
     */
    public void setRPART(java.lang.String RPART) {
        this.RPART = RPART;
    }


    /**
     * Gets the STCKIN value for this Article_WholesalerAW.
     * 
     * @return STCKIN
     */
    public java.lang.String getSTCKIN() {
        return STCKIN;
    }


    /**
     * Sets the STCKIN value for this Article_WholesalerAW.
     * 
     * @param STCKIN
     */
    public void setSTCKIN(java.lang.String STCKIN) {
        this.STCKIN = STCKIN;
    }


    /**
     * Gets the RETCD value for this Article_WholesalerAW.
     * 
     * @return RETCD
     */
    public java.lang.String getRETCD() {
        return RETCD;
    }


    /**
     * Sets the RETCD value for this Article_WholesalerAW.
     * 
     * @param RETCD
     */
    public void setRETCD(java.lang.String RETCD) {
        this.RETCD = RETCD;
    }


    /**
     * Gets the RETDEL value for this Article_WholesalerAW.
     * 
     * @return RETDEL
     */
    public java.lang.String getRETDEL() {
        return RETDEL;
    }


    /**
     * Sets the RETDEL value for this Article_WholesalerAW.
     * 
     * @param RETDEL
     */
    public void setRETDEL(java.lang.String RETDEL) {
        this.RETDEL = RETDEL;
    }


    /**
     * Gets the RETPRC value for this Article_WholesalerAW.
     * 
     * @return RETPRC
     */
    public java.lang.Double getRETPRC() {
        return RETPRC;
    }


    /**
     * Sets the RETPRC value for this Article_WholesalerAW.
     * 
     * @param RETPRC
     */
    public void setRETPRC(java.lang.Double RETPRC) {
        this.RETPRC = RETPRC;
    }


    /**
     * Gets the MINORD value for this Article_WholesalerAW.
     * 
     * @return MINORD
     */
    public java.lang.Double getMINORD() {
        return MINORD;
    }


    /**
     * Sets the MINORD value for this Article_WholesalerAW.
     * 
     * @param MINORD
     */
    public void setMINORD(java.lang.Double MINORD) {
        this.MINORD = MINORD;
    }


    /**
     * Gets the SIZEX value for this Article_WholesalerAW.
     * 
     * @return SIZEX
     */
    public java.lang.Double getSIZEX() {
        return SIZEX;
    }


    /**
     * Sets the SIZEX value for this Article_WholesalerAW.
     * 
     * @param SIZEX
     */
    public void setSIZEX(java.lang.Double SIZEX) {
        this.SIZEX = SIZEX;
    }


    /**
     * Gets the SIZEY value for this Article_WholesalerAW.
     * 
     * @return SIZEY
     */
    public java.lang.Double getSIZEY() {
        return SIZEY;
    }


    /**
     * Sets the SIZEY value for this Article_WholesalerAW.
     * 
     * @param SIZEY
     */
    public void setSIZEY(java.lang.Double SIZEY) {
        this.SIZEY = SIZEY;
    }


    /**
     * Gets the SIZEZ value for this Article_WholesalerAW.
     * 
     * @return SIZEZ
     */
    public java.lang.Double getSIZEZ() {
        return SIZEZ;
    }


    /**
     * Sets the SIZEZ value for this Article_WholesalerAW.
     * 
     * @param SIZEZ
     */
    public void setSIZEZ(java.lang.Double SIZEZ) {
        this.SIZEZ = SIZEZ;
    }


    /**
     * Gets the WHSARTCD value for this Article_WholesalerAW.
     * 
     * @return WHSARTCD
     */
    public java.lang.Double getWHSARTCD() {
        return WHSARTCD;
    }


    /**
     * Sets the WHSARTCD value for this Article_WholesalerAW.
     * 
     * @param WHSARTCD
     */
    public void setWHSARTCD(java.lang.Double WHSARTCD) {
        this.WHSARTCD = WHSARTCD;
    }


    /**
     * Gets the PRICD value for this Article_WholesalerAW.
     * 
     * @return PRICD
     */
    public java.lang.String getPRICD() {
        return PRICD;
    }


    /**
     * Sets the PRICD value for this Article_WholesalerAW.
     * 
     * @param PRICD
     */
    public void setPRICD(java.lang.String PRICD) {
        this.PRICD = PRICD;
    }


    /**
     * Gets the SEASN value for this Article_WholesalerAW.
     * 
     * @return SEASN
     */
    public java.lang.String getSEASN() {
        return SEASN;
    }


    /**
     * Sets the SEASN value for this Article_WholesalerAW.
     * 
     * @param SEASN
     */
    public void setSEASN(java.lang.String SEASN) {
        this.SEASN = SEASN;
    }


    /**
     * Gets the VOL value for this Article_WholesalerAW.
     * 
     * @return VOL
     */
    public java.lang.Double getVOL() {
        return VOL;
    }


    /**
     * Sets the VOL value for this Article_WholesalerAW.
     * 
     * @param VOL
     */
    public void setVOL(java.lang.Double VOL) {
        this.VOL = VOL;
    }


    /**
     * Gets the WGHT value for this Article_WholesalerAW.
     * 
     * @return WGHT
     */
    public java.lang.Double getWGHT() {
        return WGHT;
    }


    /**
     * Sets the WGHT value for this Article_WholesalerAW.
     * 
     * @param WGHT
     */
    public void setWGHT(java.lang.Double WGHT) {
        this.WGHT = WGHT;
    }


    /**
     * Gets the DEL value for this Article_WholesalerAW.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this Article_WholesalerAW.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the WHSACT value for this Article_WholesalerAW.
     * 
     * @return WHSACT
     */
    public webservice.hospindex.Article_WholesalerAWWHSACT[] getWHSACT() {
        return WHSACT;
    }


    /**
     * Sets the WHSACT value for this Article_WholesalerAW.
     * 
     * @param WHSACT
     */
    public void setWHSACT(webservice.hospindex.Article_WholesalerAWWHSACT[] WHSACT) {
        this.WHSACT = WHSACT;
    }

    public webservice.hospindex.Article_WholesalerAWWHSACT getWHSACT(int i) {
        return this.WHSACT[i];
    }

    public void setWHSACT(int i, webservice.hospindex.Article_WholesalerAWWHSACT _value) {
        this.WHSACT[i] = _value;
    }


    /**
     * Gets the WHSPRI value for this Article_WholesalerAW.
     * 
     * @return WHSPRI
     */
    public webservice.hospindex.Article_WholesalerAWWHSPRI[] getWHSPRI() {
        return WHSPRI;
    }


    /**
     * Sets the WHSPRI value for this Article_WholesalerAW.
     * 
     * @param WHSPRI
     */
    public void setWHSPRI(webservice.hospindex.Article_WholesalerAWWHSPRI[] WHSPRI) {
        this.WHSPRI = WHSPRI;
    }

    public webservice.hospindex.Article_WholesalerAWWHSPRI getWHSPRI(int i) {
        return this.WHSPRI[i];
    }

    public void setWHSPRI(int i, webservice.hospindex.Article_WholesalerAWWHSPRI _value) {
        this.WHSPRI[i] = _value;
    }


    /**
     * Gets the DT value for this Article_WholesalerAW.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this Article_WholesalerAW.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Article_WholesalerAW)) return false;
        Article_WholesalerAW other = (Article_WholesalerAW) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.WHSNO == other.getWHSNO() &&
            ((this.PLF==null && other.getPLF()==null) || 
             (this.PLF!=null &&
              this.PLF.equals(other.getPLF()))) &&
            ((this.PHAR==null && other.getPHAR()==null) || 
             (this.PHAR!=null &&
              this.PHAR.equals(other.getPHAR()))) &&
            ((this.STCK==null && other.getSTCK()==null) || 
             (this.STCK!=null &&
              this.STCK.equals(other.getSTCK()))) &&
            ((this.GSCD==null && other.getGSCD()==null) || 
             (this.GSCD!=null &&
              this.GSCD.equals(other.getGSCD()))) &&
            ((this.RPTYP==null && other.getRPTYP()==null) || 
             (this.RPTYP!=null &&
              this.RPTYP.equals(other.getRPTYP()))) &&
            ((this.RPCD==null && other.getRPCD()==null) || 
             (this.RPCD!=null &&
              this.RPCD.equals(other.getRPCD()))) &&
            ((this.RPART==null && other.getRPART()==null) || 
             (this.RPART!=null &&
              this.RPART.equals(other.getRPART()))) &&
            ((this.STCKIN==null && other.getSTCKIN()==null) || 
             (this.STCKIN!=null &&
              this.STCKIN.equals(other.getSTCKIN()))) &&
            ((this.RETCD==null && other.getRETCD()==null) || 
             (this.RETCD!=null &&
              this.RETCD.equals(other.getRETCD()))) &&
            ((this.RETDEL==null && other.getRETDEL()==null) || 
             (this.RETDEL!=null &&
              this.RETDEL.equals(other.getRETDEL()))) &&
            ((this.RETPRC==null && other.getRETPRC()==null) || 
             (this.RETPRC!=null &&
              this.RETPRC.equals(other.getRETPRC()))) &&
            ((this.MINORD==null && other.getMINORD()==null) || 
             (this.MINORD!=null &&
              this.MINORD.equals(other.getMINORD()))) &&
            ((this.SIZEX==null && other.getSIZEX()==null) || 
             (this.SIZEX!=null &&
              this.SIZEX.equals(other.getSIZEX()))) &&
            ((this.SIZEY==null && other.getSIZEY()==null) || 
             (this.SIZEY!=null &&
              this.SIZEY.equals(other.getSIZEY()))) &&
            ((this.SIZEZ==null && other.getSIZEZ()==null) || 
             (this.SIZEZ!=null &&
              this.SIZEZ.equals(other.getSIZEZ()))) &&
            ((this.WHSARTCD==null && other.getWHSARTCD()==null) || 
             (this.WHSARTCD!=null &&
              this.WHSARTCD.equals(other.getWHSARTCD()))) &&
            ((this.PRICD==null && other.getPRICD()==null) || 
             (this.PRICD!=null &&
              this.PRICD.equals(other.getPRICD()))) &&
            ((this.SEASN==null && other.getSEASN()==null) || 
             (this.SEASN!=null &&
              this.SEASN.equals(other.getSEASN()))) &&
            ((this.VOL==null && other.getVOL()==null) || 
             (this.VOL!=null &&
              this.VOL.equals(other.getVOL()))) &&
            ((this.WGHT==null && other.getWGHT()==null) || 
             (this.WGHT!=null &&
              this.WGHT.equals(other.getWGHT()))) &&
            this.DEL == other.isDEL() &&
            ((this.WHSACT==null && other.getWHSACT()==null) || 
             (this.WHSACT!=null &&
              java.util.Arrays.equals(this.WHSACT, other.getWHSACT()))) &&
            ((this.WHSPRI==null && other.getWHSPRI()==null) || 
             (this.WHSPRI!=null &&
              java.util.Arrays.equals(this.WHSPRI, other.getWHSPRI()))) &&
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
        _hashCode += getWHSNO();
        if (getPLF() != null) {
            _hashCode += getPLF().hashCode();
        }
        if (getPHAR() != null) {
            _hashCode += getPHAR().hashCode();
        }
        if (getSTCK() != null) {
            _hashCode += getSTCK().hashCode();
        }
        if (getGSCD() != null) {
            _hashCode += getGSCD().hashCode();
        }
        if (getRPTYP() != null) {
            _hashCode += getRPTYP().hashCode();
        }
        if (getRPCD() != null) {
            _hashCode += getRPCD().hashCode();
        }
        if (getRPART() != null) {
            _hashCode += getRPART().hashCode();
        }
        if (getSTCKIN() != null) {
            _hashCode += getSTCKIN().hashCode();
        }
        if (getRETCD() != null) {
            _hashCode += getRETCD().hashCode();
        }
        if (getRETDEL() != null) {
            _hashCode += getRETDEL().hashCode();
        }
        if (getRETPRC() != null) {
            _hashCode += getRETPRC().hashCode();
        }
        if (getMINORD() != null) {
            _hashCode += getMINORD().hashCode();
        }
        if (getSIZEX() != null) {
            _hashCode += getSIZEX().hashCode();
        }
        if (getSIZEY() != null) {
            _hashCode += getSIZEY().hashCode();
        }
        if (getSIZEZ() != null) {
            _hashCode += getSIZEZ().hashCode();
        }
        if (getWHSARTCD() != null) {
            _hashCode += getWHSARTCD().hashCode();
        }
        if (getPRICD() != null) {
            _hashCode += getPRICD().hashCode();
        }
        if (getSEASN() != null) {
            _hashCode += getSEASN().hashCode();
        }
        if (getVOL() != null) {
            _hashCode += getVOL().hashCode();
        }
        if (getWGHT() != null) {
            _hashCode += getWGHT().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWHSACT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWHSACT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWHSACT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWHSPRI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWHSPRI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWHSPRI(), i);
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
        new org.apache.axis.description.TypeDesc(Article_WholesalerAW.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article_Wholesaler>AW"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHSNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHSNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PLF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PHAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STCK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GSCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GSCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RPTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RPTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RPCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RPART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RPART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCKIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STCKIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RETCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETDEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RETDEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETPRC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "RETPRC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MINORD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MINORD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIZEX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIZEX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIZEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIZEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIZEZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIZEZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHSARTCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHSARTCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRICD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRICD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEASN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SEASN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VOL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VOL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("WHSACT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHSACT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>AW>WHSACT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WHSPRI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WHSPRI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>AW>WHSPRI"));
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
