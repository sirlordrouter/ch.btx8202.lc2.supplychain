/**
 * ProductPRDCPT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRDCPT  implements java.io.Serializable {
    private int CPTLNO;

    private java.lang.String CNAMED;

    private java.lang.String CNAMEF;

    private java.lang.String IDXIND;

    private java.lang.Double DDDD;

    private java.lang.String DDDU;

    private java.lang.String DDDA;

    private java.lang.String IDXIA;

    private java.lang.Integer IXREL;

    private java.lang.String GALF;

    private webservice.hospindex.ProductPRDCPTDRGGRPCD DRGGRPCD;

    private java.lang.Boolean PRBSUIT;

    private java.lang.Boolean CSOLV;

    private java.lang.Double SOLVQ;

    private java.lang.String SOLVQU;

    private java.lang.Double PHVAL;

    private java.lang.Double LSPNSOL;

    private java.lang.Double APDURSOL;

    private java.lang.String EXCIP;

    private java.lang.String EXCIPQ;

    private java.lang.String EXCIPCD;

    private java.lang.String EXCIPCF;

    private java.lang.Double PQTY;

    private java.lang.String PQTYU;

    private java.math.BigDecimal SIZEMM;

    private java.math.BigDecimal WEIGHT;

    private java.lang.String LOOKD;

    private java.lang.String LOOKF;

    private java.lang.Boolean IMG2;

    private webservice.hospindex.ProductPRDCPTCPTCMP[] CPTCMP;

    private webservice.hospindex.ProductPRDCPTCPTIX[] CPTIX;

    private webservice.hospindex.ProductPRDCPTCPTROA[] CPTROA;

    public ProductPRDCPT() {
    }

    public ProductPRDCPT(
           int CPTLNO,
           java.lang.String CNAMED,
           java.lang.String CNAMEF,
           java.lang.String IDXIND,
           java.lang.Double DDDD,
           java.lang.String DDDU,
           java.lang.String DDDA,
           java.lang.String IDXIA,
           java.lang.Integer IXREL,
           java.lang.String GALF,
           webservice.hospindex.ProductPRDCPTDRGGRPCD DRGGRPCD,
           java.lang.Boolean PRBSUIT,
           java.lang.Boolean CSOLV,
           java.lang.Double SOLVQ,
           java.lang.String SOLVQU,
           java.lang.Double PHVAL,
           java.lang.Double LSPNSOL,
           java.lang.Double APDURSOL,
           java.lang.String EXCIP,
           java.lang.String EXCIPQ,
           java.lang.String EXCIPCD,
           java.lang.String EXCIPCF,
           java.lang.Double PQTY,
           java.lang.String PQTYU,
           java.math.BigDecimal SIZEMM,
           java.math.BigDecimal WEIGHT,
           java.lang.String LOOKD,
           java.lang.String LOOKF,
           java.lang.Boolean IMG2,
           webservice.hospindex.ProductPRDCPTCPTCMP[] CPTCMP,
           webservice.hospindex.ProductPRDCPTCPTIX[] CPTIX,
           webservice.hospindex.ProductPRDCPTCPTROA[] CPTROA) {
           this.CPTLNO = CPTLNO;
           this.CNAMED = CNAMED;
           this.CNAMEF = CNAMEF;
           this.IDXIND = IDXIND;
           this.DDDD = DDDD;
           this.DDDU = DDDU;
           this.DDDA = DDDA;
           this.IDXIA = IDXIA;
           this.IXREL = IXREL;
           this.GALF = GALF;
           this.DRGGRPCD = DRGGRPCD;
           this.PRBSUIT = PRBSUIT;
           this.CSOLV = CSOLV;
           this.SOLVQ = SOLVQ;
           this.SOLVQU = SOLVQU;
           this.PHVAL = PHVAL;
           this.LSPNSOL = LSPNSOL;
           this.APDURSOL = APDURSOL;
           this.EXCIP = EXCIP;
           this.EXCIPQ = EXCIPQ;
           this.EXCIPCD = EXCIPCD;
           this.EXCIPCF = EXCIPCF;
           this.PQTY = PQTY;
           this.PQTYU = PQTYU;
           this.SIZEMM = SIZEMM;
           this.WEIGHT = WEIGHT;
           this.LOOKD = LOOKD;
           this.LOOKF = LOOKF;
           this.IMG2 = IMG2;
           this.CPTCMP = CPTCMP;
           this.CPTIX = CPTIX;
           this.CPTROA = CPTROA;
    }


    /**
     * Gets the CPTLNO value for this ProductPRDCPT.
     * 
     * @return CPTLNO
     */
    public int getCPTLNO() {
        return CPTLNO;
    }


    /**
     * Sets the CPTLNO value for this ProductPRDCPT.
     * 
     * @param CPTLNO
     */
    public void setCPTLNO(int CPTLNO) {
        this.CPTLNO = CPTLNO;
    }


    /**
     * Gets the CNAMED value for this ProductPRDCPT.
     * 
     * @return CNAMED
     */
    public java.lang.String getCNAMED() {
        return CNAMED;
    }


    /**
     * Sets the CNAMED value for this ProductPRDCPT.
     * 
     * @param CNAMED
     */
    public void setCNAMED(java.lang.String CNAMED) {
        this.CNAMED = CNAMED;
    }


    /**
     * Gets the CNAMEF value for this ProductPRDCPT.
     * 
     * @return CNAMEF
     */
    public java.lang.String getCNAMEF() {
        return CNAMEF;
    }


    /**
     * Sets the CNAMEF value for this ProductPRDCPT.
     * 
     * @param CNAMEF
     */
    public void setCNAMEF(java.lang.String CNAMEF) {
        this.CNAMEF = CNAMEF;
    }


    /**
     * Gets the IDXIND value for this ProductPRDCPT.
     * 
     * @return IDXIND
     */
    public java.lang.String getIDXIND() {
        return IDXIND;
    }


    /**
     * Sets the IDXIND value for this ProductPRDCPT.
     * 
     * @param IDXIND
     */
    public void setIDXIND(java.lang.String IDXIND) {
        this.IDXIND = IDXIND;
    }


    /**
     * Gets the DDDD value for this ProductPRDCPT.
     * 
     * @return DDDD
     */
    public java.lang.Double getDDDD() {
        return DDDD;
    }


    /**
     * Sets the DDDD value for this ProductPRDCPT.
     * 
     * @param DDDD
     */
    public void setDDDD(java.lang.Double DDDD) {
        this.DDDD = DDDD;
    }


    /**
     * Gets the DDDU value for this ProductPRDCPT.
     * 
     * @return DDDU
     */
    public java.lang.String getDDDU() {
        return DDDU;
    }


    /**
     * Sets the DDDU value for this ProductPRDCPT.
     * 
     * @param DDDU
     */
    public void setDDDU(java.lang.String DDDU) {
        this.DDDU = DDDU;
    }


    /**
     * Gets the DDDA value for this ProductPRDCPT.
     * 
     * @return DDDA
     */
    public java.lang.String getDDDA() {
        return DDDA;
    }


    /**
     * Sets the DDDA value for this ProductPRDCPT.
     * 
     * @param DDDA
     */
    public void setDDDA(java.lang.String DDDA) {
        this.DDDA = DDDA;
    }


    /**
     * Gets the IDXIA value for this ProductPRDCPT.
     * 
     * @return IDXIA
     */
    public java.lang.String getIDXIA() {
        return IDXIA;
    }


    /**
     * Sets the IDXIA value for this ProductPRDCPT.
     * 
     * @param IDXIA
     */
    public void setIDXIA(java.lang.String IDXIA) {
        this.IDXIA = IDXIA;
    }


    /**
     * Gets the IXREL value for this ProductPRDCPT.
     * 
     * @return IXREL
     */
    public java.lang.Integer getIXREL() {
        return IXREL;
    }


    /**
     * Sets the IXREL value for this ProductPRDCPT.
     * 
     * @param IXREL
     */
    public void setIXREL(java.lang.Integer IXREL) {
        this.IXREL = IXREL;
    }


    /**
     * Gets the GALF value for this ProductPRDCPT.
     * 
     * @return GALF
     */
    public java.lang.String getGALF() {
        return GALF;
    }


    /**
     * Sets the GALF value for this ProductPRDCPT.
     * 
     * @param GALF
     */
    public void setGALF(java.lang.String GALF) {
        this.GALF = GALF;
    }


    /**
     * Gets the DRGGRPCD value for this ProductPRDCPT.
     * 
     * @return DRGGRPCD
     */
    public webservice.hospindex.ProductPRDCPTDRGGRPCD getDRGGRPCD() {
        return DRGGRPCD;
    }


    /**
     * Sets the DRGGRPCD value for this ProductPRDCPT.
     * 
     * @param DRGGRPCD
     */
    public void setDRGGRPCD(webservice.hospindex.ProductPRDCPTDRGGRPCD DRGGRPCD) {
        this.DRGGRPCD = DRGGRPCD;
    }


    /**
     * Gets the PRBSUIT value for this ProductPRDCPT.
     * 
     * @return PRBSUIT
     */
    public java.lang.Boolean getPRBSUIT() {
        return PRBSUIT;
    }


    /**
     * Sets the PRBSUIT value for this ProductPRDCPT.
     * 
     * @param PRBSUIT
     */
    public void setPRBSUIT(java.lang.Boolean PRBSUIT) {
        this.PRBSUIT = PRBSUIT;
    }


    /**
     * Gets the CSOLV value for this ProductPRDCPT.
     * 
     * @return CSOLV
     */
    public java.lang.Boolean getCSOLV() {
        return CSOLV;
    }


    /**
     * Sets the CSOLV value for this ProductPRDCPT.
     * 
     * @param CSOLV
     */
    public void setCSOLV(java.lang.Boolean CSOLV) {
        this.CSOLV = CSOLV;
    }


    /**
     * Gets the SOLVQ value for this ProductPRDCPT.
     * 
     * @return SOLVQ
     */
    public java.lang.Double getSOLVQ() {
        return SOLVQ;
    }


    /**
     * Sets the SOLVQ value for this ProductPRDCPT.
     * 
     * @param SOLVQ
     */
    public void setSOLVQ(java.lang.Double SOLVQ) {
        this.SOLVQ = SOLVQ;
    }


    /**
     * Gets the SOLVQU value for this ProductPRDCPT.
     * 
     * @return SOLVQU
     */
    public java.lang.String getSOLVQU() {
        return SOLVQU;
    }


    /**
     * Sets the SOLVQU value for this ProductPRDCPT.
     * 
     * @param SOLVQU
     */
    public void setSOLVQU(java.lang.String SOLVQU) {
        this.SOLVQU = SOLVQU;
    }


    /**
     * Gets the PHVAL value for this ProductPRDCPT.
     * 
     * @return PHVAL
     */
    public java.lang.Double getPHVAL() {
        return PHVAL;
    }


    /**
     * Sets the PHVAL value for this ProductPRDCPT.
     * 
     * @param PHVAL
     */
    public void setPHVAL(java.lang.Double PHVAL) {
        this.PHVAL = PHVAL;
    }


    /**
     * Gets the LSPNSOL value for this ProductPRDCPT.
     * 
     * @return LSPNSOL
     */
    public java.lang.Double getLSPNSOL() {
        return LSPNSOL;
    }


    /**
     * Sets the LSPNSOL value for this ProductPRDCPT.
     * 
     * @param LSPNSOL
     */
    public void setLSPNSOL(java.lang.Double LSPNSOL) {
        this.LSPNSOL = LSPNSOL;
    }


    /**
     * Gets the APDURSOL value for this ProductPRDCPT.
     * 
     * @return APDURSOL
     */
    public java.lang.Double getAPDURSOL() {
        return APDURSOL;
    }


    /**
     * Sets the APDURSOL value for this ProductPRDCPT.
     * 
     * @param APDURSOL
     */
    public void setAPDURSOL(java.lang.Double APDURSOL) {
        this.APDURSOL = APDURSOL;
    }


    /**
     * Gets the EXCIP value for this ProductPRDCPT.
     * 
     * @return EXCIP
     */
    public java.lang.String getEXCIP() {
        return EXCIP;
    }


    /**
     * Sets the EXCIP value for this ProductPRDCPT.
     * 
     * @param EXCIP
     */
    public void setEXCIP(java.lang.String EXCIP) {
        this.EXCIP = EXCIP;
    }


    /**
     * Gets the EXCIPQ value for this ProductPRDCPT.
     * 
     * @return EXCIPQ
     */
    public java.lang.String getEXCIPQ() {
        return EXCIPQ;
    }


    /**
     * Sets the EXCIPQ value for this ProductPRDCPT.
     * 
     * @param EXCIPQ
     */
    public void setEXCIPQ(java.lang.String EXCIPQ) {
        this.EXCIPQ = EXCIPQ;
    }


    /**
     * Gets the EXCIPCD value for this ProductPRDCPT.
     * 
     * @return EXCIPCD
     */
    public java.lang.String getEXCIPCD() {
        return EXCIPCD;
    }


    /**
     * Sets the EXCIPCD value for this ProductPRDCPT.
     * 
     * @param EXCIPCD
     */
    public void setEXCIPCD(java.lang.String EXCIPCD) {
        this.EXCIPCD = EXCIPCD;
    }


    /**
     * Gets the EXCIPCF value for this ProductPRDCPT.
     * 
     * @return EXCIPCF
     */
    public java.lang.String getEXCIPCF() {
        return EXCIPCF;
    }


    /**
     * Sets the EXCIPCF value for this ProductPRDCPT.
     * 
     * @param EXCIPCF
     */
    public void setEXCIPCF(java.lang.String EXCIPCF) {
        this.EXCIPCF = EXCIPCF;
    }


    /**
     * Gets the PQTY value for this ProductPRDCPT.
     * 
     * @return PQTY
     */
    public java.lang.Double getPQTY() {
        return PQTY;
    }


    /**
     * Sets the PQTY value for this ProductPRDCPT.
     * 
     * @param PQTY
     */
    public void setPQTY(java.lang.Double PQTY) {
        this.PQTY = PQTY;
    }


    /**
     * Gets the PQTYU value for this ProductPRDCPT.
     * 
     * @return PQTYU
     */
    public java.lang.String getPQTYU() {
        return PQTYU;
    }


    /**
     * Sets the PQTYU value for this ProductPRDCPT.
     * 
     * @param PQTYU
     */
    public void setPQTYU(java.lang.String PQTYU) {
        this.PQTYU = PQTYU;
    }


    /**
     * Gets the SIZEMM value for this ProductPRDCPT.
     * 
     * @return SIZEMM
     */
    public java.math.BigDecimal getSIZEMM() {
        return SIZEMM;
    }


    /**
     * Sets the SIZEMM value for this ProductPRDCPT.
     * 
     * @param SIZEMM
     */
    public void setSIZEMM(java.math.BigDecimal SIZEMM) {
        this.SIZEMM = SIZEMM;
    }


    /**
     * Gets the WEIGHT value for this ProductPRDCPT.
     * 
     * @return WEIGHT
     */
    public java.math.BigDecimal getWEIGHT() {
        return WEIGHT;
    }


    /**
     * Sets the WEIGHT value for this ProductPRDCPT.
     * 
     * @param WEIGHT
     */
    public void setWEIGHT(java.math.BigDecimal WEIGHT) {
        this.WEIGHT = WEIGHT;
    }


    /**
     * Gets the LOOKD value for this ProductPRDCPT.
     * 
     * @return LOOKD
     */
    public java.lang.String getLOOKD() {
        return LOOKD;
    }


    /**
     * Sets the LOOKD value for this ProductPRDCPT.
     * 
     * @param LOOKD
     */
    public void setLOOKD(java.lang.String LOOKD) {
        this.LOOKD = LOOKD;
    }


    /**
     * Gets the LOOKF value for this ProductPRDCPT.
     * 
     * @return LOOKF
     */
    public java.lang.String getLOOKF() {
        return LOOKF;
    }


    /**
     * Sets the LOOKF value for this ProductPRDCPT.
     * 
     * @param LOOKF
     */
    public void setLOOKF(java.lang.String LOOKF) {
        this.LOOKF = LOOKF;
    }


    /**
     * Gets the IMG2 value for this ProductPRDCPT.
     * 
     * @return IMG2
     */
    public java.lang.Boolean getIMG2() {
        return IMG2;
    }


    /**
     * Sets the IMG2 value for this ProductPRDCPT.
     * 
     * @param IMG2
     */
    public void setIMG2(java.lang.Boolean IMG2) {
        this.IMG2 = IMG2;
    }


    /**
     * Gets the CPTCMP value for this ProductPRDCPT.
     * 
     * @return CPTCMP
     */
    public webservice.hospindex.ProductPRDCPTCPTCMP[] getCPTCMP() {
        return CPTCMP;
    }


    /**
     * Sets the CPTCMP value for this ProductPRDCPT.
     * 
     * @param CPTCMP
     */
    public void setCPTCMP(webservice.hospindex.ProductPRDCPTCPTCMP[] CPTCMP) {
        this.CPTCMP = CPTCMP;
    }

    public webservice.hospindex.ProductPRDCPTCPTCMP getCPTCMP(int i) {
        return this.CPTCMP[i];
    }

    public void setCPTCMP(int i, webservice.hospindex.ProductPRDCPTCPTCMP _value) {
        this.CPTCMP[i] = _value;
    }


    /**
     * Gets the CPTIX value for this ProductPRDCPT.
     * 
     * @return CPTIX
     */
    public webservice.hospindex.ProductPRDCPTCPTIX[] getCPTIX() {
        return CPTIX;
    }


    /**
     * Sets the CPTIX value for this ProductPRDCPT.
     * 
     * @param CPTIX
     */
    public void setCPTIX(webservice.hospindex.ProductPRDCPTCPTIX[] CPTIX) {
        this.CPTIX = CPTIX;
    }

    public webservice.hospindex.ProductPRDCPTCPTIX getCPTIX(int i) {
        return this.CPTIX[i];
    }

    public void setCPTIX(int i, webservice.hospindex.ProductPRDCPTCPTIX _value) {
        this.CPTIX[i] = _value;
    }


    /**
     * Gets the CPTROA value for this ProductPRDCPT.
     * 
     * @return CPTROA
     */
    public webservice.hospindex.ProductPRDCPTCPTROA[] getCPTROA() {
        return CPTROA;
    }


    /**
     * Sets the CPTROA value for this ProductPRDCPT.
     * 
     * @param CPTROA
     */
    public void setCPTROA(webservice.hospindex.ProductPRDCPTCPTROA[] CPTROA) {
        this.CPTROA = CPTROA;
    }

    public webservice.hospindex.ProductPRDCPTCPTROA getCPTROA(int i) {
        return this.CPTROA[i];
    }

    public void setCPTROA(int i, webservice.hospindex.ProductPRDCPTCPTROA _value) {
        this.CPTROA[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPRDCPT)) return false;
        ProductPRDCPT other = (ProductPRDCPT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CPTLNO == other.getCPTLNO() &&
            ((this.CNAMED==null && other.getCNAMED()==null) || 
             (this.CNAMED!=null &&
              this.CNAMED.equals(other.getCNAMED()))) &&
            ((this.CNAMEF==null && other.getCNAMEF()==null) || 
             (this.CNAMEF!=null &&
              this.CNAMEF.equals(other.getCNAMEF()))) &&
            ((this.IDXIND==null && other.getIDXIND()==null) || 
             (this.IDXIND!=null &&
              this.IDXIND.equals(other.getIDXIND()))) &&
            ((this.DDDD==null && other.getDDDD()==null) || 
             (this.DDDD!=null &&
              this.DDDD.equals(other.getDDDD()))) &&
            ((this.DDDU==null && other.getDDDU()==null) || 
             (this.DDDU!=null &&
              this.DDDU.equals(other.getDDDU()))) &&
            ((this.DDDA==null && other.getDDDA()==null) || 
             (this.DDDA!=null &&
              this.DDDA.equals(other.getDDDA()))) &&
            ((this.IDXIA==null && other.getIDXIA()==null) || 
             (this.IDXIA!=null &&
              this.IDXIA.equals(other.getIDXIA()))) &&
            ((this.IXREL==null && other.getIXREL()==null) || 
             (this.IXREL!=null &&
              this.IXREL.equals(other.getIXREL()))) &&
            ((this.GALF==null && other.getGALF()==null) || 
             (this.GALF!=null &&
              this.GALF.equals(other.getGALF()))) &&
            ((this.DRGGRPCD==null && other.getDRGGRPCD()==null) || 
             (this.DRGGRPCD!=null &&
              this.DRGGRPCD.equals(other.getDRGGRPCD()))) &&
            ((this.PRBSUIT==null && other.getPRBSUIT()==null) || 
             (this.PRBSUIT!=null &&
              this.PRBSUIT.equals(other.getPRBSUIT()))) &&
            ((this.CSOLV==null && other.getCSOLV()==null) || 
             (this.CSOLV!=null &&
              this.CSOLV.equals(other.getCSOLV()))) &&
            ((this.SOLVQ==null && other.getSOLVQ()==null) || 
             (this.SOLVQ!=null &&
              this.SOLVQ.equals(other.getSOLVQ()))) &&
            ((this.SOLVQU==null && other.getSOLVQU()==null) || 
             (this.SOLVQU!=null &&
              this.SOLVQU.equals(other.getSOLVQU()))) &&
            ((this.PHVAL==null && other.getPHVAL()==null) || 
             (this.PHVAL!=null &&
              this.PHVAL.equals(other.getPHVAL()))) &&
            ((this.LSPNSOL==null && other.getLSPNSOL()==null) || 
             (this.LSPNSOL!=null &&
              this.LSPNSOL.equals(other.getLSPNSOL()))) &&
            ((this.APDURSOL==null && other.getAPDURSOL()==null) || 
             (this.APDURSOL!=null &&
              this.APDURSOL.equals(other.getAPDURSOL()))) &&
            ((this.EXCIP==null && other.getEXCIP()==null) || 
             (this.EXCIP!=null &&
              this.EXCIP.equals(other.getEXCIP()))) &&
            ((this.EXCIPQ==null && other.getEXCIPQ()==null) || 
             (this.EXCIPQ!=null &&
              this.EXCIPQ.equals(other.getEXCIPQ()))) &&
            ((this.EXCIPCD==null && other.getEXCIPCD()==null) || 
             (this.EXCIPCD!=null &&
              this.EXCIPCD.equals(other.getEXCIPCD()))) &&
            ((this.EXCIPCF==null && other.getEXCIPCF()==null) || 
             (this.EXCIPCF!=null &&
              this.EXCIPCF.equals(other.getEXCIPCF()))) &&
            ((this.PQTY==null && other.getPQTY()==null) || 
             (this.PQTY!=null &&
              this.PQTY.equals(other.getPQTY()))) &&
            ((this.PQTYU==null && other.getPQTYU()==null) || 
             (this.PQTYU!=null &&
              this.PQTYU.equals(other.getPQTYU()))) &&
            ((this.SIZEMM==null && other.getSIZEMM()==null) || 
             (this.SIZEMM!=null &&
              this.SIZEMM.equals(other.getSIZEMM()))) &&
            ((this.WEIGHT==null && other.getWEIGHT()==null) || 
             (this.WEIGHT!=null &&
              this.WEIGHT.equals(other.getWEIGHT()))) &&
            ((this.LOOKD==null && other.getLOOKD()==null) || 
             (this.LOOKD!=null &&
              this.LOOKD.equals(other.getLOOKD()))) &&
            ((this.LOOKF==null && other.getLOOKF()==null) || 
             (this.LOOKF!=null &&
              this.LOOKF.equals(other.getLOOKF()))) &&
            ((this.IMG2==null && other.getIMG2()==null) || 
             (this.IMG2!=null &&
              this.IMG2.equals(other.getIMG2()))) &&
            ((this.CPTCMP==null && other.getCPTCMP()==null) || 
             (this.CPTCMP!=null &&
              java.util.Arrays.equals(this.CPTCMP, other.getCPTCMP()))) &&
            ((this.CPTIX==null && other.getCPTIX()==null) || 
             (this.CPTIX!=null &&
              java.util.Arrays.equals(this.CPTIX, other.getCPTIX()))) &&
            ((this.CPTROA==null && other.getCPTROA()==null) || 
             (this.CPTROA!=null &&
              java.util.Arrays.equals(this.CPTROA, other.getCPTROA())));
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
        _hashCode += getCPTLNO();
        if (getCNAMED() != null) {
            _hashCode += getCNAMED().hashCode();
        }
        if (getCNAMEF() != null) {
            _hashCode += getCNAMEF().hashCode();
        }
        if (getIDXIND() != null) {
            _hashCode += getIDXIND().hashCode();
        }
        if (getDDDD() != null) {
            _hashCode += getDDDD().hashCode();
        }
        if (getDDDU() != null) {
            _hashCode += getDDDU().hashCode();
        }
        if (getDDDA() != null) {
            _hashCode += getDDDA().hashCode();
        }
        if (getIDXIA() != null) {
            _hashCode += getIDXIA().hashCode();
        }
        if (getIXREL() != null) {
            _hashCode += getIXREL().hashCode();
        }
        if (getGALF() != null) {
            _hashCode += getGALF().hashCode();
        }
        if (getDRGGRPCD() != null) {
            _hashCode += getDRGGRPCD().hashCode();
        }
        if (getPRBSUIT() != null) {
            _hashCode += getPRBSUIT().hashCode();
        }
        if (getCSOLV() != null) {
            _hashCode += getCSOLV().hashCode();
        }
        if (getSOLVQ() != null) {
            _hashCode += getSOLVQ().hashCode();
        }
        if (getSOLVQU() != null) {
            _hashCode += getSOLVQU().hashCode();
        }
        if (getPHVAL() != null) {
            _hashCode += getPHVAL().hashCode();
        }
        if (getLSPNSOL() != null) {
            _hashCode += getLSPNSOL().hashCode();
        }
        if (getAPDURSOL() != null) {
            _hashCode += getAPDURSOL().hashCode();
        }
        if (getEXCIP() != null) {
            _hashCode += getEXCIP().hashCode();
        }
        if (getEXCIPQ() != null) {
            _hashCode += getEXCIPQ().hashCode();
        }
        if (getEXCIPCD() != null) {
            _hashCode += getEXCIPCD().hashCode();
        }
        if (getEXCIPCF() != null) {
            _hashCode += getEXCIPCF().hashCode();
        }
        if (getPQTY() != null) {
            _hashCode += getPQTY().hashCode();
        }
        if (getPQTYU() != null) {
            _hashCode += getPQTYU().hashCode();
        }
        if (getSIZEMM() != null) {
            _hashCode += getSIZEMM().hashCode();
        }
        if (getWEIGHT() != null) {
            _hashCode += getWEIGHT().hashCode();
        }
        if (getLOOKD() != null) {
            _hashCode += getLOOKD().hashCode();
        }
        if (getLOOKF() != null) {
            _hashCode += getLOOKF().hashCode();
        }
        if (getIMG2() != null) {
            _hashCode += getIMG2().hashCode();
        }
        if (getCPTCMP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCPTCMP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCPTCMP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCPTIX() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCPTIX());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCPTIX(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCPTROA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCPTROA());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCPTROA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductPRDCPT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>CPT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTLNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTLNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNAMED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CNAMED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNAMEF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CNAMEF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDXIND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IDXIND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDDD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DDDD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDDU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DDDU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDDA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DDDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDXIA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IDXIA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IXREL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IXREL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GALF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GALF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRGGRPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DRGGRPCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>DRGGRPCD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRBSUIT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRBSUIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CSOLV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CSOLV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOLVQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SOLVQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOLVQU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SOLVQU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHVAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PHVAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LSPNSOL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LSPNSOL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APDURSOL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "APDURSOL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "EXCIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCIPQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "EXCIPQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCIPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "EXCIPCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCIPCF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "EXCIPCF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PQTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PQTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PQTYU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PQTYU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIZEMM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIZEMM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WEIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WEIGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOOKD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LOOKD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOOKF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LOOKF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMG2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IMG2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTCMP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTCMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTCMP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTIX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTIX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTIX"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPTROA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPTROA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTROA"));
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
