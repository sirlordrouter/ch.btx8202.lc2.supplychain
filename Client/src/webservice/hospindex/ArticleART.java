/**
 * ArticleART.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ArticleART  implements java.io.Serializable {
    private java.lang.String PHAR;

    private webservice.hospindex.ArticleARTGRPCD GRPCD;

    private java.lang.String CDSO1;

    private java.lang.String CDSO2;

    private int PRDNO;

    private webservice.hospindex.ArticleARTSMCAT SMCAT;

    private java.lang.Long SMNO;

    private java.lang.String HOSPCD;

    private java.lang.String CLINCD;

    private webservice.hospindex.ArticleARTARTTYP ARTTYP;

    private java.lang.Integer VAT;

    private webservice.hospindex.ArticleARTSALECD SALECD;

    private webservice.hospindex.ArticleARTINSLIM INSLIM;

    private java.lang.Double LIMPTS;

    private webservice.hospindex.ArticleARTGRDFR GRDFR;

    private java.lang.String COOL;

    private java.lang.String TEMP;

    private java.lang.String CDBG;

    private java.lang.String BG;

    private java.lang.Integer EXP;

    private java.lang.Double QTY;

    private java.lang.String DSCRD;

    private java.lang.String DSCRF;

    private java.lang.String DSCRLONGD;

    private java.lang.String DSCRLONGF;

    private java.lang.String SORTD;

    private java.lang.String SORTF;

    private java.lang.String QTYUD;

    private java.lang.String QTYUF;

    private java.lang.String IMG;

    private java.lang.Boolean IMG2;

    private java.lang.String DSCRPACKD;

    private java.lang.String DSCRPACKF;

    private java.lang.String PCKTYPD;

    private java.lang.String PCKTYPF;

    private java.lang.String MULT;

    private java.lang.String SYN1D;

    private java.lang.String SYN1F;

    private java.lang.Integer SLOPLUS;

    private java.lang.Integer NOPCS;

    private webservice.hospindex.ArticleARTHSCD HSCD;

    private java.lang.Integer MINI;

    private webservice.hospindex.ArticleARTDEPCD DEPCD;

    private java.lang.String DEPOT;

    private java.util.Calendar BAGSL;

    private java.util.Calendar BAGSLC;

    private webservice.hospindex.ArticleARTLOACD LOACD;

    private java.util.Calendar OUTSAL;

    private java.lang.String STTOX;

    private webservice.hospindex.ArticleARTNOTI NOTI;

    private webservice.hospindex.ArticleARTGGL GGL;

    private java.lang.String CE;

    private java.util.Calendar SMDAT;

    private java.util.Calendar SMCDAT;

    private java.util.Calendar SIST;

    private java.util.Calendar ESIST;

    private java.lang.Boolean BIOCID;

    private java.lang.String BAGNO;

    private java.lang.Boolean LIGHT;

    private java.lang.Integer BAGDOSSIER;

    private java.lang.String TRADEABLE;

    private java.lang.Double WEIGHT;

    private boolean DEL;

    private webservice.hospindex.ArticleARTARTCOMP[] ARTCOMP;

    private webservice.hospindex.ArticleARTARTBAR[] ARTBAR;

    private webservice.hospindex.ArticleARTARTCH[] ARTCH;

    private webservice.hospindex.ArticleARTARTPRI[] ARTPRI;

    private webservice.hospindex.ArticleARTARTMIG[] ARTMIG;

    private webservice.hospindex.ArticleARTARTDAN[] ARTDAN;

    private webservice.hospindex.ArticleARTARTLIM[] ARTLIM;

    private webservice.hospindex.ArticleARTARTINS[] ARTINS;

    private webservice.hospindex.ArticleARTARTADR[] ARTADR;

    private webservice.hospindex.ArticleARTSIZE SIZE;

    private webservice.hospindex.ArticleARTPIC[] PIC;

    private java.util.Calendar DT;  // attribute

    public ArticleART() {
    }

    public ArticleART(
           java.lang.String PHAR,
           webservice.hospindex.ArticleARTGRPCD GRPCD,
           java.lang.String CDSO1,
           java.lang.String CDSO2,
           int PRDNO,
           webservice.hospindex.ArticleARTSMCAT SMCAT,
           java.lang.Long SMNO,
           java.lang.String HOSPCD,
           java.lang.String CLINCD,
           webservice.hospindex.ArticleARTARTTYP ARTTYP,
           java.lang.Integer VAT,
           webservice.hospindex.ArticleARTSALECD SALECD,
           webservice.hospindex.ArticleARTINSLIM INSLIM,
           java.lang.Double LIMPTS,
           webservice.hospindex.ArticleARTGRDFR GRDFR,
           java.lang.String COOL,
           java.lang.String TEMP,
           java.lang.String CDBG,
           java.lang.String BG,
           java.lang.Integer EXP,
           java.lang.Double QTY,
           java.lang.String DSCRD,
           java.lang.String DSCRF,
           java.lang.String DSCRLONGD,
           java.lang.String DSCRLONGF,
           java.lang.String SORTD,
           java.lang.String SORTF,
           java.lang.String QTYUD,
           java.lang.String QTYUF,
           java.lang.String IMG,
           java.lang.Boolean IMG2,
           java.lang.String DSCRPACKD,
           java.lang.String DSCRPACKF,
           java.lang.String PCKTYPD,
           java.lang.String PCKTYPF,
           java.lang.String MULT,
           java.lang.String SYN1D,
           java.lang.String SYN1F,
           java.lang.Integer SLOPLUS,
           java.lang.Integer NOPCS,
           webservice.hospindex.ArticleARTHSCD HSCD,
           java.lang.Integer MINI,
           webservice.hospindex.ArticleARTDEPCD DEPCD,
           java.lang.String DEPOT,
           java.util.Calendar BAGSL,
           java.util.Calendar BAGSLC,
           webservice.hospindex.ArticleARTLOACD LOACD,
           java.util.Calendar OUTSAL,
           java.lang.String STTOX,
           webservice.hospindex.ArticleARTNOTI NOTI,
           webservice.hospindex.ArticleARTGGL GGL,
           java.lang.String CE,
           java.util.Calendar SMDAT,
           java.util.Calendar SMCDAT,
           java.util.Calendar SIST,
           java.util.Calendar ESIST,
           java.lang.Boolean BIOCID,
           java.lang.String BAGNO,
           java.lang.Boolean LIGHT,
           java.lang.Integer BAGDOSSIER,
           java.lang.String TRADEABLE,
           java.lang.Double WEIGHT,
           boolean DEL,
           webservice.hospindex.ArticleARTARTCOMP[] ARTCOMP,
           webservice.hospindex.ArticleARTARTBAR[] ARTBAR,
           webservice.hospindex.ArticleARTARTCH[] ARTCH,
           webservice.hospindex.ArticleARTARTPRI[] ARTPRI,
           webservice.hospindex.ArticleARTARTMIG[] ARTMIG,
           webservice.hospindex.ArticleARTARTDAN[] ARTDAN,
           webservice.hospindex.ArticleARTARTLIM[] ARTLIM,
           webservice.hospindex.ArticleARTARTINS[] ARTINS,
           webservice.hospindex.ArticleARTARTADR[] ARTADR,
           webservice.hospindex.ArticleARTSIZE SIZE,
           webservice.hospindex.ArticleARTPIC[] PIC,
           java.util.Calendar DT) {
           this.PHAR = PHAR;
           this.GRPCD = GRPCD;
           this.CDSO1 = CDSO1;
           this.CDSO2 = CDSO2;
           this.PRDNO = PRDNO;
           this.SMCAT = SMCAT;
           this.SMNO = SMNO;
           this.HOSPCD = HOSPCD;
           this.CLINCD = CLINCD;
           this.ARTTYP = ARTTYP;
           this.VAT = VAT;
           this.SALECD = SALECD;
           this.INSLIM = INSLIM;
           this.LIMPTS = LIMPTS;
           this.GRDFR = GRDFR;
           this.COOL = COOL;
           this.TEMP = TEMP;
           this.CDBG = CDBG;
           this.BG = BG;
           this.EXP = EXP;
           this.QTY = QTY;
           this.DSCRD = DSCRD;
           this.DSCRF = DSCRF;
           this.DSCRLONGD = DSCRLONGD;
           this.DSCRLONGF = DSCRLONGF;
           this.SORTD = SORTD;
           this.SORTF = SORTF;
           this.QTYUD = QTYUD;
           this.QTYUF = QTYUF;
           this.IMG = IMG;
           this.IMG2 = IMG2;
           this.DSCRPACKD = DSCRPACKD;
           this.DSCRPACKF = DSCRPACKF;
           this.PCKTYPD = PCKTYPD;
           this.PCKTYPF = PCKTYPF;
           this.MULT = MULT;
           this.SYN1D = SYN1D;
           this.SYN1F = SYN1F;
           this.SLOPLUS = SLOPLUS;
           this.NOPCS = NOPCS;
           this.HSCD = HSCD;
           this.MINI = MINI;
           this.DEPCD = DEPCD;
           this.DEPOT = DEPOT;
           this.BAGSL = BAGSL;
           this.BAGSLC = BAGSLC;
           this.LOACD = LOACD;
           this.OUTSAL = OUTSAL;
           this.STTOX = STTOX;
           this.NOTI = NOTI;
           this.GGL = GGL;
           this.CE = CE;
           this.SMDAT = SMDAT;
           this.SMCDAT = SMCDAT;
           this.SIST = SIST;
           this.ESIST = ESIST;
           this.BIOCID = BIOCID;
           this.BAGNO = BAGNO;
           this.LIGHT = LIGHT;
           this.BAGDOSSIER = BAGDOSSIER;
           this.TRADEABLE = TRADEABLE;
           this.WEIGHT = WEIGHT;
           this.DEL = DEL;
           this.ARTCOMP = ARTCOMP;
           this.ARTBAR = ARTBAR;
           this.ARTCH = ARTCH;
           this.ARTPRI = ARTPRI;
           this.ARTMIG = ARTMIG;
           this.ARTDAN = ARTDAN;
           this.ARTLIM = ARTLIM;
           this.ARTINS = ARTINS;
           this.ARTADR = ARTADR;
           this.SIZE = SIZE;
           this.PIC = PIC;
           this.DT = DT;
    }


    /**
     * Gets the PHAR value for this ArticleART.
     * 
     * @return PHAR
     */
    public java.lang.String getPHAR() {
        return PHAR;
    }


    /**
     * Sets the PHAR value for this ArticleART.
     * 
     * @param PHAR
     */
    public void setPHAR(java.lang.String PHAR) {
        this.PHAR = PHAR;
    }


    /**
     * Gets the GRPCD value for this ArticleART.
     * 
     * @return GRPCD
     */
    public webservice.hospindex.ArticleARTGRPCD getGRPCD() {
        return GRPCD;
    }


    /**
     * Sets the GRPCD value for this ArticleART.
     * 
     * @param GRPCD
     */
    public void setGRPCD(webservice.hospindex.ArticleARTGRPCD GRPCD) {
        this.GRPCD = GRPCD;
    }


    /**
     * Gets the CDSO1 value for this ArticleART.
     * 
     * @return CDSO1
     */
    public java.lang.String getCDSO1() {
        return CDSO1;
    }


    /**
     * Sets the CDSO1 value for this ArticleART.
     * 
     * @param CDSO1
     */
    public void setCDSO1(java.lang.String CDSO1) {
        this.CDSO1 = CDSO1;
    }


    /**
     * Gets the CDSO2 value for this ArticleART.
     * 
     * @return CDSO2
     */
    public java.lang.String getCDSO2() {
        return CDSO2;
    }


    /**
     * Sets the CDSO2 value for this ArticleART.
     * 
     * @param CDSO2
     */
    public void setCDSO2(java.lang.String CDSO2) {
        this.CDSO2 = CDSO2;
    }


    /**
     * Gets the PRDNO value for this ArticleART.
     * 
     * @return PRDNO
     */
    public int getPRDNO() {
        return PRDNO;
    }


    /**
     * Sets the PRDNO value for this ArticleART.
     * 
     * @param PRDNO
     */
    public void setPRDNO(int PRDNO) {
        this.PRDNO = PRDNO;
    }


    /**
     * Gets the SMCAT value for this ArticleART.
     * 
     * @return SMCAT
     */
    public webservice.hospindex.ArticleARTSMCAT getSMCAT() {
        return SMCAT;
    }


    /**
     * Sets the SMCAT value for this ArticleART.
     * 
     * @param SMCAT
     */
    public void setSMCAT(webservice.hospindex.ArticleARTSMCAT SMCAT) {
        this.SMCAT = SMCAT;
    }


    /**
     * Gets the SMNO value for this ArticleART.
     * 
     * @return SMNO
     */
    public java.lang.Long getSMNO() {
        return SMNO;
    }


    /**
     * Sets the SMNO value for this ArticleART.
     * 
     * @param SMNO
     */
    public void setSMNO(java.lang.Long SMNO) {
        this.SMNO = SMNO;
    }


    /**
     * Gets the HOSPCD value for this ArticleART.
     * 
     * @return HOSPCD
     */
    public java.lang.String getHOSPCD() {
        return HOSPCD;
    }


    /**
     * Sets the HOSPCD value for this ArticleART.
     * 
     * @param HOSPCD
     */
    public void setHOSPCD(java.lang.String HOSPCD) {
        this.HOSPCD = HOSPCD;
    }


    /**
     * Gets the CLINCD value for this ArticleART.
     * 
     * @return CLINCD
     */
    public java.lang.String getCLINCD() {
        return CLINCD;
    }


    /**
     * Sets the CLINCD value for this ArticleART.
     * 
     * @param CLINCD
     */
    public void setCLINCD(java.lang.String CLINCD) {
        this.CLINCD = CLINCD;
    }


    /**
     * Gets the ARTTYP value for this ArticleART.
     * 
     * @return ARTTYP
     */
    public webservice.hospindex.ArticleARTARTTYP getARTTYP() {
        return ARTTYP;
    }


    /**
     * Sets the ARTTYP value for this ArticleART.
     * 
     * @param ARTTYP
     */
    public void setARTTYP(webservice.hospindex.ArticleARTARTTYP ARTTYP) {
        this.ARTTYP = ARTTYP;
    }


    /**
     * Gets the VAT value for this ArticleART.
     * 
     * @return VAT
     */
    public java.lang.Integer getVAT() {
        return VAT;
    }


    /**
     * Sets the VAT value for this ArticleART.
     * 
     * @param VAT
     */
    public void setVAT(java.lang.Integer VAT) {
        this.VAT = VAT;
    }


    /**
     * Gets the SALECD value for this ArticleART.
     * 
     * @return SALECD
     */
    public webservice.hospindex.ArticleARTSALECD getSALECD() {
        return SALECD;
    }


    /**
     * Sets the SALECD value for this ArticleART.
     * 
     * @param SALECD
     */
    public void setSALECD(webservice.hospindex.ArticleARTSALECD SALECD) {
        this.SALECD = SALECD;
    }


    /**
     * Gets the INSLIM value for this ArticleART.
     * 
     * @return INSLIM
     */
    public webservice.hospindex.ArticleARTINSLIM getINSLIM() {
        return INSLIM;
    }


    /**
     * Sets the INSLIM value for this ArticleART.
     * 
     * @param INSLIM
     */
    public void setINSLIM(webservice.hospindex.ArticleARTINSLIM INSLIM) {
        this.INSLIM = INSLIM;
    }


    /**
     * Gets the LIMPTS value for this ArticleART.
     * 
     * @return LIMPTS
     */
    public java.lang.Double getLIMPTS() {
        return LIMPTS;
    }


    /**
     * Sets the LIMPTS value for this ArticleART.
     * 
     * @param LIMPTS
     */
    public void setLIMPTS(java.lang.Double LIMPTS) {
        this.LIMPTS = LIMPTS;
    }


    /**
     * Gets the GRDFR value for this ArticleART.
     * 
     * @return GRDFR
     */
    public webservice.hospindex.ArticleARTGRDFR getGRDFR() {
        return GRDFR;
    }


    /**
     * Sets the GRDFR value for this ArticleART.
     * 
     * @param GRDFR
     */
    public void setGRDFR(webservice.hospindex.ArticleARTGRDFR GRDFR) {
        this.GRDFR = GRDFR;
    }


    /**
     * Gets the COOL value for this ArticleART.
     * 
     * @return COOL
     */
    public java.lang.String getCOOL() {
        return COOL;
    }


    /**
     * Sets the COOL value for this ArticleART.
     * 
     * @param COOL
     */
    public void setCOOL(java.lang.String COOL) {
        this.COOL = COOL;
    }


    /**
     * Gets the TEMP value for this ArticleART.
     * 
     * @return TEMP
     */
    public java.lang.String getTEMP() {
        return TEMP;
    }


    /**
     * Sets the TEMP value for this ArticleART.
     * 
     * @param TEMP
     */
    public void setTEMP(java.lang.String TEMP) {
        this.TEMP = TEMP;
    }


    /**
     * Gets the CDBG value for this ArticleART.
     * 
     * @return CDBG
     */
    public java.lang.String getCDBG() {
        return CDBG;
    }


    /**
     * Sets the CDBG value for this ArticleART.
     * 
     * @param CDBG
     */
    public void setCDBG(java.lang.String CDBG) {
        this.CDBG = CDBG;
    }


    /**
     * Gets the BG value for this ArticleART.
     * 
     * @return BG
     */
    public java.lang.String getBG() {
        return BG;
    }


    /**
     * Sets the BG value for this ArticleART.
     * 
     * @param BG
     */
    public void setBG(java.lang.String BG) {
        this.BG = BG;
    }


    /**
     * Gets the EXP value for this ArticleART.
     * 
     * @return EXP
     */
    public java.lang.Integer getEXP() {
        return EXP;
    }


    /**
     * Sets the EXP value for this ArticleART.
     * 
     * @param EXP
     */
    public void setEXP(java.lang.Integer EXP) {
        this.EXP = EXP;
    }


    /**
     * Gets the QTY value for this ArticleART.
     * 
     * @return QTY
     */
    public java.lang.Double getQTY() {
        return QTY;
    }


    /**
     * Sets the QTY value for this ArticleART.
     * 
     * @param QTY
     */
    public void setQTY(java.lang.Double QTY) {
        this.QTY = QTY;
    }


    /**
     * Gets the DSCRD value for this ArticleART.
     * 
     * @return DSCRD
     */
    public java.lang.String getDSCRD() {
        return DSCRD;
    }


    /**
     * Sets the DSCRD value for this ArticleART.
     * 
     * @param DSCRD
     */
    public void setDSCRD(java.lang.String DSCRD) {
        this.DSCRD = DSCRD;
    }


    /**
     * Gets the DSCRF value for this ArticleART.
     * 
     * @return DSCRF
     */
    public java.lang.String getDSCRF() {
        return DSCRF;
    }


    /**
     * Sets the DSCRF value for this ArticleART.
     * 
     * @param DSCRF
     */
    public void setDSCRF(java.lang.String DSCRF) {
        this.DSCRF = DSCRF;
    }


    /**
     * Gets the DSCRLONGD value for this ArticleART.
     * 
     * @return DSCRLONGD
     */
    public java.lang.String getDSCRLONGD() {
        return DSCRLONGD;
    }


    /**
     * Sets the DSCRLONGD value for this ArticleART.
     * 
     * @param DSCRLONGD
     */
    public void setDSCRLONGD(java.lang.String DSCRLONGD) {
        this.DSCRLONGD = DSCRLONGD;
    }


    /**
     * Gets the DSCRLONGF value for this ArticleART.
     * 
     * @return DSCRLONGF
     */
    public java.lang.String getDSCRLONGF() {
        return DSCRLONGF;
    }


    /**
     * Sets the DSCRLONGF value for this ArticleART.
     * 
     * @param DSCRLONGF
     */
    public void setDSCRLONGF(java.lang.String DSCRLONGF) {
        this.DSCRLONGF = DSCRLONGF;
    }


    /**
     * Gets the SORTD value for this ArticleART.
     * 
     * @return SORTD
     */
    public java.lang.String getSORTD() {
        return SORTD;
    }


    /**
     * Sets the SORTD value for this ArticleART.
     * 
     * @param SORTD
     */
    public void setSORTD(java.lang.String SORTD) {
        this.SORTD = SORTD;
    }


    /**
     * Gets the SORTF value for this ArticleART.
     * 
     * @return SORTF
     */
    public java.lang.String getSORTF() {
        return SORTF;
    }


    /**
     * Sets the SORTF value for this ArticleART.
     * 
     * @param SORTF
     */
    public void setSORTF(java.lang.String SORTF) {
        this.SORTF = SORTF;
    }


    /**
     * Gets the QTYUD value for this ArticleART.
     * 
     * @return QTYUD
     */
    public java.lang.String getQTYUD() {
        return QTYUD;
    }


    /**
     * Sets the QTYUD value for this ArticleART.
     * 
     * @param QTYUD
     */
    public void setQTYUD(java.lang.String QTYUD) {
        this.QTYUD = QTYUD;
    }


    /**
     * Gets the QTYUF value for this ArticleART.
     * 
     * @return QTYUF
     */
    public java.lang.String getQTYUF() {
        return QTYUF;
    }


    /**
     * Sets the QTYUF value for this ArticleART.
     * 
     * @param QTYUF
     */
    public void setQTYUF(java.lang.String QTYUF) {
        this.QTYUF = QTYUF;
    }


    /**
     * Gets the IMG value for this ArticleART.
     * 
     * @return IMG
     */
    public java.lang.String getIMG() {
        return IMG;
    }


    /**
     * Sets the IMG value for this ArticleART.
     * 
     * @param IMG
     */
    public void setIMG(java.lang.String IMG) {
        this.IMG = IMG;
    }


    /**
     * Gets the IMG2 value for this ArticleART.
     * 
     * @return IMG2
     */
    public java.lang.Boolean getIMG2() {
        return IMG2;
    }


    /**
     * Sets the IMG2 value for this ArticleART.
     * 
     * @param IMG2
     */
    public void setIMG2(java.lang.Boolean IMG2) {
        this.IMG2 = IMG2;
    }


    /**
     * Gets the DSCRPACKD value for this ArticleART.
     * 
     * @return DSCRPACKD
     */
    public java.lang.String getDSCRPACKD() {
        return DSCRPACKD;
    }


    /**
     * Sets the DSCRPACKD value for this ArticleART.
     * 
     * @param DSCRPACKD
     */
    public void setDSCRPACKD(java.lang.String DSCRPACKD) {
        this.DSCRPACKD = DSCRPACKD;
    }


    /**
     * Gets the DSCRPACKF value for this ArticleART.
     * 
     * @return DSCRPACKF
     */
    public java.lang.String getDSCRPACKF() {
        return DSCRPACKF;
    }


    /**
     * Sets the DSCRPACKF value for this ArticleART.
     * 
     * @param DSCRPACKF
     */
    public void setDSCRPACKF(java.lang.String DSCRPACKF) {
        this.DSCRPACKF = DSCRPACKF;
    }


    /**
     * Gets the PCKTYPD value for this ArticleART.
     * 
     * @return PCKTYPD
     */
    public java.lang.String getPCKTYPD() {
        return PCKTYPD;
    }


    /**
     * Sets the PCKTYPD value for this ArticleART.
     * 
     * @param PCKTYPD
     */
    public void setPCKTYPD(java.lang.String PCKTYPD) {
        this.PCKTYPD = PCKTYPD;
    }


    /**
     * Gets the PCKTYPF value for this ArticleART.
     * 
     * @return PCKTYPF
     */
    public java.lang.String getPCKTYPF() {
        return PCKTYPF;
    }


    /**
     * Sets the PCKTYPF value for this ArticleART.
     * 
     * @param PCKTYPF
     */
    public void setPCKTYPF(java.lang.String PCKTYPF) {
        this.PCKTYPF = PCKTYPF;
    }


    /**
     * Gets the MULT value for this ArticleART.
     * 
     * @return MULT
     */
    public java.lang.String getMULT() {
        return MULT;
    }


    /**
     * Sets the MULT value for this ArticleART.
     * 
     * @param MULT
     */
    public void setMULT(java.lang.String MULT) {
        this.MULT = MULT;
    }


    /**
     * Gets the SYN1D value for this ArticleART.
     * 
     * @return SYN1D
     */
    public java.lang.String getSYN1D() {
        return SYN1D;
    }


    /**
     * Sets the SYN1D value for this ArticleART.
     * 
     * @param SYN1D
     */
    public void setSYN1D(java.lang.String SYN1D) {
        this.SYN1D = SYN1D;
    }


    /**
     * Gets the SYN1F value for this ArticleART.
     * 
     * @return SYN1F
     */
    public java.lang.String getSYN1F() {
        return SYN1F;
    }


    /**
     * Sets the SYN1F value for this ArticleART.
     * 
     * @param SYN1F
     */
    public void setSYN1F(java.lang.String SYN1F) {
        this.SYN1F = SYN1F;
    }


    /**
     * Gets the SLOPLUS value for this ArticleART.
     * 
     * @return SLOPLUS
     */
    public java.lang.Integer getSLOPLUS() {
        return SLOPLUS;
    }


    /**
     * Sets the SLOPLUS value for this ArticleART.
     * 
     * @param SLOPLUS
     */
    public void setSLOPLUS(java.lang.Integer SLOPLUS) {
        this.SLOPLUS = SLOPLUS;
    }


    /**
     * Gets the NOPCS value for this ArticleART.
     * 
     * @return NOPCS
     */
    public java.lang.Integer getNOPCS() {
        return NOPCS;
    }


    /**
     * Sets the NOPCS value for this ArticleART.
     * 
     * @param NOPCS
     */
    public void setNOPCS(java.lang.Integer NOPCS) {
        this.NOPCS = NOPCS;
    }


    /**
     * Gets the HSCD value for this ArticleART.
     * 
     * @return HSCD
     */
    public webservice.hospindex.ArticleARTHSCD getHSCD() {
        return HSCD;
    }


    /**
     * Sets the HSCD value for this ArticleART.
     * 
     * @param HSCD
     */
    public void setHSCD(webservice.hospindex.ArticleARTHSCD HSCD) {
        this.HSCD = HSCD;
    }


    /**
     * Gets the MINI value for this ArticleART.
     * 
     * @return MINI
     */
    public java.lang.Integer getMINI() {
        return MINI;
    }


    /**
     * Sets the MINI value for this ArticleART.
     * 
     * @param MINI
     */
    public void setMINI(java.lang.Integer MINI) {
        this.MINI = MINI;
    }


    /**
     * Gets the DEPCD value for this ArticleART.
     * 
     * @return DEPCD
     */
    public webservice.hospindex.ArticleARTDEPCD getDEPCD() {
        return DEPCD;
    }


    /**
     * Sets the DEPCD value for this ArticleART.
     * 
     * @param DEPCD
     */
    public void setDEPCD(webservice.hospindex.ArticleARTDEPCD DEPCD) {
        this.DEPCD = DEPCD;
    }


    /**
     * Gets the DEPOT value for this ArticleART.
     * 
     * @return DEPOT
     */
    public java.lang.String getDEPOT() {
        return DEPOT;
    }


    /**
     * Sets the DEPOT value for this ArticleART.
     * 
     * @param DEPOT
     */
    public void setDEPOT(java.lang.String DEPOT) {
        this.DEPOT = DEPOT;
    }


    /**
     * Gets the BAGSL value for this ArticleART.
     * 
     * @return BAGSL
     */
    public java.util.Calendar getBAGSL() {
        return BAGSL;
    }


    /**
     * Sets the BAGSL value for this ArticleART.
     * 
     * @param BAGSL
     */
    public void setBAGSL(java.util.Calendar BAGSL) {
        this.BAGSL = BAGSL;
    }


    /**
     * Gets the BAGSLC value for this ArticleART.
     * 
     * @return BAGSLC
     */
    public java.util.Calendar getBAGSLC() {
        return BAGSLC;
    }


    /**
     * Sets the BAGSLC value for this ArticleART.
     * 
     * @param BAGSLC
     */
    public void setBAGSLC(java.util.Calendar BAGSLC) {
        this.BAGSLC = BAGSLC;
    }


    /**
     * Gets the LOACD value for this ArticleART.
     * 
     * @return LOACD
     */
    public webservice.hospindex.ArticleARTLOACD getLOACD() {
        return LOACD;
    }


    /**
     * Sets the LOACD value for this ArticleART.
     * 
     * @param LOACD
     */
    public void setLOACD(webservice.hospindex.ArticleARTLOACD LOACD) {
        this.LOACD = LOACD;
    }


    /**
     * Gets the OUTSAL value for this ArticleART.
     * 
     * @return OUTSAL
     */
    public java.util.Calendar getOUTSAL() {
        return OUTSAL;
    }


    /**
     * Sets the OUTSAL value for this ArticleART.
     * 
     * @param OUTSAL
     */
    public void setOUTSAL(java.util.Calendar OUTSAL) {
        this.OUTSAL = OUTSAL;
    }


    /**
     * Gets the STTOX value for this ArticleART.
     * 
     * @return STTOX
     */
    public java.lang.String getSTTOX() {
        return STTOX;
    }


    /**
     * Sets the STTOX value for this ArticleART.
     * 
     * @param STTOX
     */
    public void setSTTOX(java.lang.String STTOX) {
        this.STTOX = STTOX;
    }


    /**
     * Gets the NOTI value for this ArticleART.
     * 
     * @return NOTI
     */
    public webservice.hospindex.ArticleARTNOTI getNOTI() {
        return NOTI;
    }


    /**
     * Sets the NOTI value for this ArticleART.
     * 
     * @param NOTI
     */
    public void setNOTI(webservice.hospindex.ArticleARTNOTI NOTI) {
        this.NOTI = NOTI;
    }


    /**
     * Gets the GGL value for this ArticleART.
     * 
     * @return GGL
     */
    public webservice.hospindex.ArticleARTGGL getGGL() {
        return GGL;
    }


    /**
     * Sets the GGL value for this ArticleART.
     * 
     * @param GGL
     */
    public void setGGL(webservice.hospindex.ArticleARTGGL GGL) {
        this.GGL = GGL;
    }


    /**
     * Gets the CE value for this ArticleART.
     * 
     * @return CE
     */
    public java.lang.String getCE() {
        return CE;
    }


    /**
     * Sets the CE value for this ArticleART.
     * 
     * @param CE
     */
    public void setCE(java.lang.String CE) {
        this.CE = CE;
    }


    /**
     * Gets the SMDAT value for this ArticleART.
     * 
     * @return SMDAT
     */
    public java.util.Calendar getSMDAT() {
        return SMDAT;
    }


    /**
     * Sets the SMDAT value for this ArticleART.
     * 
     * @param SMDAT
     */
    public void setSMDAT(java.util.Calendar SMDAT) {
        this.SMDAT = SMDAT;
    }


    /**
     * Gets the SMCDAT value for this ArticleART.
     * 
     * @return SMCDAT
     */
    public java.util.Calendar getSMCDAT() {
        return SMCDAT;
    }


    /**
     * Sets the SMCDAT value for this ArticleART.
     * 
     * @param SMCDAT
     */
    public void setSMCDAT(java.util.Calendar SMCDAT) {
        this.SMCDAT = SMCDAT;
    }


    /**
     * Gets the SIST value for this ArticleART.
     * 
     * @return SIST
     */
    public java.util.Calendar getSIST() {
        return SIST;
    }


    /**
     * Sets the SIST value for this ArticleART.
     * 
     * @param SIST
     */
    public void setSIST(java.util.Calendar SIST) {
        this.SIST = SIST;
    }


    /**
     * Gets the ESIST value for this ArticleART.
     * 
     * @return ESIST
     */
    public java.util.Calendar getESIST() {
        return ESIST;
    }


    /**
     * Sets the ESIST value for this ArticleART.
     * 
     * @param ESIST
     */
    public void setESIST(java.util.Calendar ESIST) {
        this.ESIST = ESIST;
    }


    /**
     * Gets the BIOCID value for this ArticleART.
     * 
     * @return BIOCID
     */
    public java.lang.Boolean getBIOCID() {
        return BIOCID;
    }


    /**
     * Sets the BIOCID value for this ArticleART.
     * 
     * @param BIOCID
     */
    public void setBIOCID(java.lang.Boolean BIOCID) {
        this.BIOCID = BIOCID;
    }


    /**
     * Gets the BAGNO value for this ArticleART.
     * 
     * @return BAGNO
     */
    public java.lang.String getBAGNO() {
        return BAGNO;
    }


    /**
     * Sets the BAGNO value for this ArticleART.
     * 
     * @param BAGNO
     */
    public void setBAGNO(java.lang.String BAGNO) {
        this.BAGNO = BAGNO;
    }


    /**
     * Gets the LIGHT value for this ArticleART.
     * 
     * @return LIGHT
     */
    public java.lang.Boolean getLIGHT() {
        return LIGHT;
    }


    /**
     * Sets the LIGHT value for this ArticleART.
     * 
     * @param LIGHT
     */
    public void setLIGHT(java.lang.Boolean LIGHT) {
        this.LIGHT = LIGHT;
    }


    /**
     * Gets the BAGDOSSIER value for this ArticleART.
     * 
     * @return BAGDOSSIER
     */
    public java.lang.Integer getBAGDOSSIER() {
        return BAGDOSSIER;
    }


    /**
     * Sets the BAGDOSSIER value for this ArticleART.
     * 
     * @param BAGDOSSIER
     */
    public void setBAGDOSSIER(java.lang.Integer BAGDOSSIER) {
        this.BAGDOSSIER = BAGDOSSIER;
    }


    /**
     * Gets the TRADEABLE value for this ArticleART.
     * 
     * @return TRADEABLE
     */
    public java.lang.String getTRADEABLE() {
        return TRADEABLE;
    }


    /**
     * Sets the TRADEABLE value for this ArticleART.
     * 
     * @param TRADEABLE
     */
    public void setTRADEABLE(java.lang.String TRADEABLE) {
        this.TRADEABLE = TRADEABLE;
    }


    /**
     * Gets the WEIGHT value for this ArticleART.
     * 
     * @return WEIGHT
     */
    public java.lang.Double getWEIGHT() {
        return WEIGHT;
    }


    /**
     * Sets the WEIGHT value for this ArticleART.
     * 
     * @param WEIGHT
     */
    public void setWEIGHT(java.lang.Double WEIGHT) {
        this.WEIGHT = WEIGHT;
    }


    /**
     * Gets the DEL value for this ArticleART.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this ArticleART.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the ARTCOMP value for this ArticleART.
     * 
     * @return ARTCOMP
     */
    public webservice.hospindex.ArticleARTARTCOMP[] getARTCOMP() {
        return ARTCOMP;
    }


    /**
     * Sets the ARTCOMP value for this ArticleART.
     * 
     * @param ARTCOMP
     */
    public void setARTCOMP(webservice.hospindex.ArticleARTARTCOMP[] ARTCOMP) {
        this.ARTCOMP = ARTCOMP;
    }

    public webservice.hospindex.ArticleARTARTCOMP getARTCOMP(int i) {
        return this.ARTCOMP[i];
    }

    public void setARTCOMP(int i, webservice.hospindex.ArticleARTARTCOMP _value) {
        this.ARTCOMP[i] = _value;
    }


    /**
     * Gets the ARTBAR value for this ArticleART.
     * 
     * @return ARTBAR
     */
    public webservice.hospindex.ArticleARTARTBAR[] getARTBAR() {
        return ARTBAR;
    }


    /**
     * Sets the ARTBAR value for this ArticleART.
     * 
     * @param ARTBAR
     */
    public void setARTBAR(webservice.hospindex.ArticleARTARTBAR[] ARTBAR) {
        this.ARTBAR = ARTBAR;
    }

    public webservice.hospindex.ArticleARTARTBAR getARTBAR(int i) {
        return this.ARTBAR[i];
    }

    public void setARTBAR(int i, webservice.hospindex.ArticleARTARTBAR _value) {
        this.ARTBAR[i] = _value;
    }


    /**
     * Gets the ARTCH value for this ArticleART.
     * 
     * @return ARTCH
     */
    public webservice.hospindex.ArticleARTARTCH[] getARTCH() {
        return ARTCH;
    }


    /**
     * Sets the ARTCH value for this ArticleART.
     * 
     * @param ARTCH
     */
    public void setARTCH(webservice.hospindex.ArticleARTARTCH[] ARTCH) {
        this.ARTCH = ARTCH;
    }

    public webservice.hospindex.ArticleARTARTCH getARTCH(int i) {
        return this.ARTCH[i];
    }

    public void setARTCH(int i, webservice.hospindex.ArticleARTARTCH _value) {
        this.ARTCH[i] = _value;
    }


    /**
     * Gets the ARTPRI value for this ArticleART.
     * 
     * @return ARTPRI
     */
    public webservice.hospindex.ArticleARTARTPRI[] getARTPRI() {
        return ARTPRI;
    }


    /**
     * Sets the ARTPRI value for this ArticleART.
     * 
     * @param ARTPRI
     */
    public void setARTPRI(webservice.hospindex.ArticleARTARTPRI[] ARTPRI) {
        this.ARTPRI = ARTPRI;
    }

    public webservice.hospindex.ArticleARTARTPRI getARTPRI(int i) {
        return this.ARTPRI[i];
    }

    public void setARTPRI(int i, webservice.hospindex.ArticleARTARTPRI _value) {
        this.ARTPRI[i] = _value;
    }


    /**
     * Gets the ARTMIG value for this ArticleART.
     * 
     * @return ARTMIG
     */
    public webservice.hospindex.ArticleARTARTMIG[] getARTMIG() {
        return ARTMIG;
    }


    /**
     * Sets the ARTMIG value for this ArticleART.
     * 
     * @param ARTMIG
     */
    public void setARTMIG(webservice.hospindex.ArticleARTARTMIG[] ARTMIG) {
        this.ARTMIG = ARTMIG;
    }

    public webservice.hospindex.ArticleARTARTMIG getARTMIG(int i) {
        return this.ARTMIG[i];
    }

    public void setARTMIG(int i, webservice.hospindex.ArticleARTARTMIG _value) {
        this.ARTMIG[i] = _value;
    }


    /**
     * Gets the ARTDAN value for this ArticleART.
     * 
     * @return ARTDAN
     */
    public webservice.hospindex.ArticleARTARTDAN[] getARTDAN() {
        return ARTDAN;
    }


    /**
     * Sets the ARTDAN value for this ArticleART.
     * 
     * @param ARTDAN
     */
    public void setARTDAN(webservice.hospindex.ArticleARTARTDAN[] ARTDAN) {
        this.ARTDAN = ARTDAN;
    }

    public webservice.hospindex.ArticleARTARTDAN getARTDAN(int i) {
        return this.ARTDAN[i];
    }

    public void setARTDAN(int i, webservice.hospindex.ArticleARTARTDAN _value) {
        this.ARTDAN[i] = _value;
    }


    /**
     * Gets the ARTLIM value for this ArticleART.
     * 
     * @return ARTLIM
     */
    public webservice.hospindex.ArticleARTARTLIM[] getARTLIM() {
        return ARTLIM;
    }


    /**
     * Sets the ARTLIM value for this ArticleART.
     * 
     * @param ARTLIM
     */
    public void setARTLIM(webservice.hospindex.ArticleARTARTLIM[] ARTLIM) {
        this.ARTLIM = ARTLIM;
    }

    public webservice.hospindex.ArticleARTARTLIM getARTLIM(int i) {
        return this.ARTLIM[i];
    }

    public void setARTLIM(int i, webservice.hospindex.ArticleARTARTLIM _value) {
        this.ARTLIM[i] = _value;
    }


    /**
     * Gets the ARTINS value for this ArticleART.
     * 
     * @return ARTINS
     */
    public webservice.hospindex.ArticleARTARTINS[] getARTINS() {
        return ARTINS;
    }


    /**
     * Sets the ARTINS value for this ArticleART.
     * 
     * @param ARTINS
     */
    public void setARTINS(webservice.hospindex.ArticleARTARTINS[] ARTINS) {
        this.ARTINS = ARTINS;
    }

    public webservice.hospindex.ArticleARTARTINS getARTINS(int i) {
        return this.ARTINS[i];
    }

    public void setARTINS(int i, webservice.hospindex.ArticleARTARTINS _value) {
        this.ARTINS[i] = _value;
    }


    /**
     * Gets the ARTADR value for this ArticleART.
     * 
     * @return ARTADR
     */
    public webservice.hospindex.ArticleARTARTADR[] getARTADR() {
        return ARTADR;
    }


    /**
     * Sets the ARTADR value for this ArticleART.
     * 
     * @param ARTADR
     */
    public void setARTADR(webservice.hospindex.ArticleARTARTADR[] ARTADR) {
        this.ARTADR = ARTADR;
    }

    public webservice.hospindex.ArticleARTARTADR getARTADR(int i) {
        return this.ARTADR[i];
    }

    public void setARTADR(int i, webservice.hospindex.ArticleARTARTADR _value) {
        this.ARTADR[i] = _value;
    }


    /**
     * Gets the SIZE value for this ArticleART.
     * 
     * @return SIZE
     */
    public webservice.hospindex.ArticleARTSIZE getSIZE() {
        return SIZE;
    }


    /**
     * Sets the SIZE value for this ArticleART.
     * 
     * @param SIZE
     */
    public void setSIZE(webservice.hospindex.ArticleARTSIZE SIZE) {
        this.SIZE = SIZE;
    }


    /**
     * Gets the PIC value for this ArticleART.
     * 
     * @return PIC
     */
    public webservice.hospindex.ArticleARTPIC[] getPIC() {
        return PIC;
    }


    /**
     * Sets the PIC value for this ArticleART.
     * 
     * @param PIC
     */
    public void setPIC(webservice.hospindex.ArticleARTPIC[] PIC) {
        this.PIC = PIC;
    }

    public webservice.hospindex.ArticleARTPIC getPIC(int i) {
        return this.PIC[i];
    }

    public void setPIC(int i, webservice.hospindex.ArticleARTPIC _value) {
        this.PIC[i] = _value;
    }


    /**
     * Gets the DT value for this ArticleART.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this ArticleART.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArticleART)) return false;
        ArticleART other = (ArticleART) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PHAR==null && other.getPHAR()==null) || 
             (this.PHAR!=null &&
              this.PHAR.equals(other.getPHAR()))) &&
            ((this.GRPCD==null && other.getGRPCD()==null) || 
             (this.GRPCD!=null &&
              this.GRPCD.equals(other.getGRPCD()))) &&
            ((this.CDSO1==null && other.getCDSO1()==null) || 
             (this.CDSO1!=null &&
              this.CDSO1.equals(other.getCDSO1()))) &&
            ((this.CDSO2==null && other.getCDSO2()==null) || 
             (this.CDSO2!=null &&
              this.CDSO2.equals(other.getCDSO2()))) &&
            this.PRDNO == other.getPRDNO() &&
            ((this.SMCAT==null && other.getSMCAT()==null) || 
             (this.SMCAT!=null &&
              this.SMCAT.equals(other.getSMCAT()))) &&
            ((this.SMNO==null && other.getSMNO()==null) || 
             (this.SMNO!=null &&
              this.SMNO.equals(other.getSMNO()))) &&
            ((this.HOSPCD==null && other.getHOSPCD()==null) || 
             (this.HOSPCD!=null &&
              this.HOSPCD.equals(other.getHOSPCD()))) &&
            ((this.CLINCD==null && other.getCLINCD()==null) || 
             (this.CLINCD!=null &&
              this.CLINCD.equals(other.getCLINCD()))) &&
            ((this.ARTTYP==null && other.getARTTYP()==null) || 
             (this.ARTTYP!=null &&
              this.ARTTYP.equals(other.getARTTYP()))) &&
            ((this.VAT==null && other.getVAT()==null) || 
             (this.VAT!=null &&
              this.VAT.equals(other.getVAT()))) &&
            ((this.SALECD==null && other.getSALECD()==null) || 
             (this.SALECD!=null &&
              this.SALECD.equals(other.getSALECD()))) &&
            ((this.INSLIM==null && other.getINSLIM()==null) || 
             (this.INSLIM!=null &&
              this.INSLIM.equals(other.getINSLIM()))) &&
            ((this.LIMPTS==null && other.getLIMPTS()==null) || 
             (this.LIMPTS!=null &&
              this.LIMPTS.equals(other.getLIMPTS()))) &&
            ((this.GRDFR==null && other.getGRDFR()==null) || 
             (this.GRDFR!=null &&
              this.GRDFR.equals(other.getGRDFR()))) &&
            ((this.COOL==null && other.getCOOL()==null) || 
             (this.COOL!=null &&
              this.COOL.equals(other.getCOOL()))) &&
            ((this.TEMP==null && other.getTEMP()==null) || 
             (this.TEMP!=null &&
              this.TEMP.equals(other.getTEMP()))) &&
            ((this.CDBG==null && other.getCDBG()==null) || 
             (this.CDBG!=null &&
              this.CDBG.equals(other.getCDBG()))) &&
            ((this.BG==null && other.getBG()==null) || 
             (this.BG!=null &&
              this.BG.equals(other.getBG()))) &&
            ((this.EXP==null && other.getEXP()==null) || 
             (this.EXP!=null &&
              this.EXP.equals(other.getEXP()))) &&
            ((this.QTY==null && other.getQTY()==null) || 
             (this.QTY!=null &&
              this.QTY.equals(other.getQTY()))) &&
            ((this.DSCRD==null && other.getDSCRD()==null) || 
             (this.DSCRD!=null &&
              this.DSCRD.equals(other.getDSCRD()))) &&
            ((this.DSCRF==null && other.getDSCRF()==null) || 
             (this.DSCRF!=null &&
              this.DSCRF.equals(other.getDSCRF()))) &&
            ((this.DSCRLONGD==null && other.getDSCRLONGD()==null) || 
             (this.DSCRLONGD!=null &&
              this.DSCRLONGD.equals(other.getDSCRLONGD()))) &&
            ((this.DSCRLONGF==null && other.getDSCRLONGF()==null) || 
             (this.DSCRLONGF!=null &&
              this.DSCRLONGF.equals(other.getDSCRLONGF()))) &&
            ((this.SORTD==null && other.getSORTD()==null) || 
             (this.SORTD!=null &&
              this.SORTD.equals(other.getSORTD()))) &&
            ((this.SORTF==null && other.getSORTF()==null) || 
             (this.SORTF!=null &&
              this.SORTF.equals(other.getSORTF()))) &&
            ((this.QTYUD==null && other.getQTYUD()==null) || 
             (this.QTYUD!=null &&
              this.QTYUD.equals(other.getQTYUD()))) &&
            ((this.QTYUF==null && other.getQTYUF()==null) || 
             (this.QTYUF!=null &&
              this.QTYUF.equals(other.getQTYUF()))) &&
            ((this.IMG==null && other.getIMG()==null) || 
             (this.IMG!=null &&
              this.IMG.equals(other.getIMG()))) &&
            ((this.IMG2==null && other.getIMG2()==null) || 
             (this.IMG2!=null &&
              this.IMG2.equals(other.getIMG2()))) &&
            ((this.DSCRPACKD==null && other.getDSCRPACKD()==null) || 
             (this.DSCRPACKD!=null &&
              this.DSCRPACKD.equals(other.getDSCRPACKD()))) &&
            ((this.DSCRPACKF==null && other.getDSCRPACKF()==null) || 
             (this.DSCRPACKF!=null &&
              this.DSCRPACKF.equals(other.getDSCRPACKF()))) &&
            ((this.PCKTYPD==null && other.getPCKTYPD()==null) || 
             (this.PCKTYPD!=null &&
              this.PCKTYPD.equals(other.getPCKTYPD()))) &&
            ((this.PCKTYPF==null && other.getPCKTYPF()==null) || 
             (this.PCKTYPF!=null &&
              this.PCKTYPF.equals(other.getPCKTYPF()))) &&
            ((this.MULT==null && other.getMULT()==null) || 
             (this.MULT!=null &&
              this.MULT.equals(other.getMULT()))) &&
            ((this.SYN1D==null && other.getSYN1D()==null) || 
             (this.SYN1D!=null &&
              this.SYN1D.equals(other.getSYN1D()))) &&
            ((this.SYN1F==null && other.getSYN1F()==null) || 
             (this.SYN1F!=null &&
              this.SYN1F.equals(other.getSYN1F()))) &&
            ((this.SLOPLUS==null && other.getSLOPLUS()==null) || 
             (this.SLOPLUS!=null &&
              this.SLOPLUS.equals(other.getSLOPLUS()))) &&
            ((this.NOPCS==null && other.getNOPCS()==null) || 
             (this.NOPCS!=null &&
              this.NOPCS.equals(other.getNOPCS()))) &&
            ((this.HSCD==null && other.getHSCD()==null) || 
             (this.HSCD!=null &&
              this.HSCD.equals(other.getHSCD()))) &&
            ((this.MINI==null && other.getMINI()==null) || 
             (this.MINI!=null &&
              this.MINI.equals(other.getMINI()))) &&
            ((this.DEPCD==null && other.getDEPCD()==null) || 
             (this.DEPCD!=null &&
              this.DEPCD.equals(other.getDEPCD()))) &&
            ((this.DEPOT==null && other.getDEPOT()==null) || 
             (this.DEPOT!=null &&
              this.DEPOT.equals(other.getDEPOT()))) &&
            ((this.BAGSL==null && other.getBAGSL()==null) || 
             (this.BAGSL!=null &&
              this.BAGSL.equals(other.getBAGSL()))) &&
            ((this.BAGSLC==null && other.getBAGSLC()==null) || 
             (this.BAGSLC!=null &&
              this.BAGSLC.equals(other.getBAGSLC()))) &&
            ((this.LOACD==null && other.getLOACD()==null) || 
             (this.LOACD!=null &&
              this.LOACD.equals(other.getLOACD()))) &&
            ((this.OUTSAL==null && other.getOUTSAL()==null) || 
             (this.OUTSAL!=null &&
              this.OUTSAL.equals(other.getOUTSAL()))) &&
            ((this.STTOX==null && other.getSTTOX()==null) || 
             (this.STTOX!=null &&
              this.STTOX.equals(other.getSTTOX()))) &&
            ((this.NOTI==null && other.getNOTI()==null) || 
             (this.NOTI!=null &&
              this.NOTI.equals(other.getNOTI()))) &&
            ((this.GGL==null && other.getGGL()==null) || 
             (this.GGL!=null &&
              this.GGL.equals(other.getGGL()))) &&
            ((this.CE==null && other.getCE()==null) || 
             (this.CE!=null &&
              this.CE.equals(other.getCE()))) &&
            ((this.SMDAT==null && other.getSMDAT()==null) || 
             (this.SMDAT!=null &&
              this.SMDAT.equals(other.getSMDAT()))) &&
            ((this.SMCDAT==null && other.getSMCDAT()==null) || 
             (this.SMCDAT!=null &&
              this.SMCDAT.equals(other.getSMCDAT()))) &&
            ((this.SIST==null && other.getSIST()==null) || 
             (this.SIST!=null &&
              this.SIST.equals(other.getSIST()))) &&
            ((this.ESIST==null && other.getESIST()==null) || 
             (this.ESIST!=null &&
              this.ESIST.equals(other.getESIST()))) &&
            ((this.BIOCID==null && other.getBIOCID()==null) || 
             (this.BIOCID!=null &&
              this.BIOCID.equals(other.getBIOCID()))) &&
            ((this.BAGNO==null && other.getBAGNO()==null) || 
             (this.BAGNO!=null &&
              this.BAGNO.equals(other.getBAGNO()))) &&
            ((this.LIGHT==null && other.getLIGHT()==null) || 
             (this.LIGHT!=null &&
              this.LIGHT.equals(other.getLIGHT()))) &&
            ((this.BAGDOSSIER==null && other.getBAGDOSSIER()==null) || 
             (this.BAGDOSSIER!=null &&
              this.BAGDOSSIER.equals(other.getBAGDOSSIER()))) &&
            ((this.TRADEABLE==null && other.getTRADEABLE()==null) || 
             (this.TRADEABLE!=null &&
              this.TRADEABLE.equals(other.getTRADEABLE()))) &&
            ((this.WEIGHT==null && other.getWEIGHT()==null) || 
             (this.WEIGHT!=null &&
              this.WEIGHT.equals(other.getWEIGHT()))) &&
            this.DEL == other.isDEL() &&
            ((this.ARTCOMP==null && other.getARTCOMP()==null) || 
             (this.ARTCOMP!=null &&
              java.util.Arrays.equals(this.ARTCOMP, other.getARTCOMP()))) &&
            ((this.ARTBAR==null && other.getARTBAR()==null) || 
             (this.ARTBAR!=null &&
              java.util.Arrays.equals(this.ARTBAR, other.getARTBAR()))) &&
            ((this.ARTCH==null && other.getARTCH()==null) || 
             (this.ARTCH!=null &&
              java.util.Arrays.equals(this.ARTCH, other.getARTCH()))) &&
            ((this.ARTPRI==null && other.getARTPRI()==null) || 
             (this.ARTPRI!=null &&
              java.util.Arrays.equals(this.ARTPRI, other.getARTPRI()))) &&
            ((this.ARTMIG==null && other.getARTMIG()==null) || 
             (this.ARTMIG!=null &&
              java.util.Arrays.equals(this.ARTMIG, other.getARTMIG()))) &&
            ((this.ARTDAN==null && other.getARTDAN()==null) || 
             (this.ARTDAN!=null &&
              java.util.Arrays.equals(this.ARTDAN, other.getARTDAN()))) &&
            ((this.ARTLIM==null && other.getARTLIM()==null) || 
             (this.ARTLIM!=null &&
              java.util.Arrays.equals(this.ARTLIM, other.getARTLIM()))) &&
            ((this.ARTINS==null && other.getARTINS()==null) || 
             (this.ARTINS!=null &&
              java.util.Arrays.equals(this.ARTINS, other.getARTINS()))) &&
            ((this.ARTADR==null && other.getARTADR()==null) || 
             (this.ARTADR!=null &&
              java.util.Arrays.equals(this.ARTADR, other.getARTADR()))) &&
            ((this.SIZE==null && other.getSIZE()==null) || 
             (this.SIZE!=null &&
              this.SIZE.equals(other.getSIZE()))) &&
            ((this.PIC==null && other.getPIC()==null) || 
             (this.PIC!=null &&
              java.util.Arrays.equals(this.PIC, other.getPIC()))) &&
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
        if (getPHAR() != null) {
            _hashCode += getPHAR().hashCode();
        }
        if (getGRPCD() != null) {
            _hashCode += getGRPCD().hashCode();
        }
        if (getCDSO1() != null) {
            _hashCode += getCDSO1().hashCode();
        }
        if (getCDSO2() != null) {
            _hashCode += getCDSO2().hashCode();
        }
        _hashCode += getPRDNO();
        if (getSMCAT() != null) {
            _hashCode += getSMCAT().hashCode();
        }
        if (getSMNO() != null) {
            _hashCode += getSMNO().hashCode();
        }
        if (getHOSPCD() != null) {
            _hashCode += getHOSPCD().hashCode();
        }
        if (getCLINCD() != null) {
            _hashCode += getCLINCD().hashCode();
        }
        if (getARTTYP() != null) {
            _hashCode += getARTTYP().hashCode();
        }
        if (getVAT() != null) {
            _hashCode += getVAT().hashCode();
        }
        if (getSALECD() != null) {
            _hashCode += getSALECD().hashCode();
        }
        if (getINSLIM() != null) {
            _hashCode += getINSLIM().hashCode();
        }
        if (getLIMPTS() != null) {
            _hashCode += getLIMPTS().hashCode();
        }
        if (getGRDFR() != null) {
            _hashCode += getGRDFR().hashCode();
        }
        if (getCOOL() != null) {
            _hashCode += getCOOL().hashCode();
        }
        if (getTEMP() != null) {
            _hashCode += getTEMP().hashCode();
        }
        if (getCDBG() != null) {
            _hashCode += getCDBG().hashCode();
        }
        if (getBG() != null) {
            _hashCode += getBG().hashCode();
        }
        if (getEXP() != null) {
            _hashCode += getEXP().hashCode();
        }
        if (getQTY() != null) {
            _hashCode += getQTY().hashCode();
        }
        if (getDSCRD() != null) {
            _hashCode += getDSCRD().hashCode();
        }
        if (getDSCRF() != null) {
            _hashCode += getDSCRF().hashCode();
        }
        if (getDSCRLONGD() != null) {
            _hashCode += getDSCRLONGD().hashCode();
        }
        if (getDSCRLONGF() != null) {
            _hashCode += getDSCRLONGF().hashCode();
        }
        if (getSORTD() != null) {
            _hashCode += getSORTD().hashCode();
        }
        if (getSORTF() != null) {
            _hashCode += getSORTF().hashCode();
        }
        if (getQTYUD() != null) {
            _hashCode += getQTYUD().hashCode();
        }
        if (getQTYUF() != null) {
            _hashCode += getQTYUF().hashCode();
        }
        if (getIMG() != null) {
            _hashCode += getIMG().hashCode();
        }
        if (getIMG2() != null) {
            _hashCode += getIMG2().hashCode();
        }
        if (getDSCRPACKD() != null) {
            _hashCode += getDSCRPACKD().hashCode();
        }
        if (getDSCRPACKF() != null) {
            _hashCode += getDSCRPACKF().hashCode();
        }
        if (getPCKTYPD() != null) {
            _hashCode += getPCKTYPD().hashCode();
        }
        if (getPCKTYPF() != null) {
            _hashCode += getPCKTYPF().hashCode();
        }
        if (getMULT() != null) {
            _hashCode += getMULT().hashCode();
        }
        if (getSYN1D() != null) {
            _hashCode += getSYN1D().hashCode();
        }
        if (getSYN1F() != null) {
            _hashCode += getSYN1F().hashCode();
        }
        if (getSLOPLUS() != null) {
            _hashCode += getSLOPLUS().hashCode();
        }
        if (getNOPCS() != null) {
            _hashCode += getNOPCS().hashCode();
        }
        if (getHSCD() != null) {
            _hashCode += getHSCD().hashCode();
        }
        if (getMINI() != null) {
            _hashCode += getMINI().hashCode();
        }
        if (getDEPCD() != null) {
            _hashCode += getDEPCD().hashCode();
        }
        if (getDEPOT() != null) {
            _hashCode += getDEPOT().hashCode();
        }
        if (getBAGSL() != null) {
            _hashCode += getBAGSL().hashCode();
        }
        if (getBAGSLC() != null) {
            _hashCode += getBAGSLC().hashCode();
        }
        if (getLOACD() != null) {
            _hashCode += getLOACD().hashCode();
        }
        if (getOUTSAL() != null) {
            _hashCode += getOUTSAL().hashCode();
        }
        if (getSTTOX() != null) {
            _hashCode += getSTTOX().hashCode();
        }
        if (getNOTI() != null) {
            _hashCode += getNOTI().hashCode();
        }
        if (getGGL() != null) {
            _hashCode += getGGL().hashCode();
        }
        if (getCE() != null) {
            _hashCode += getCE().hashCode();
        }
        if (getSMDAT() != null) {
            _hashCode += getSMDAT().hashCode();
        }
        if (getSMCDAT() != null) {
            _hashCode += getSMCDAT().hashCode();
        }
        if (getSIST() != null) {
            _hashCode += getSIST().hashCode();
        }
        if (getESIST() != null) {
            _hashCode += getESIST().hashCode();
        }
        if (getBIOCID() != null) {
            _hashCode += getBIOCID().hashCode();
        }
        if (getBAGNO() != null) {
            _hashCode += getBAGNO().hashCode();
        }
        if (getLIGHT() != null) {
            _hashCode += getLIGHT().hashCode();
        }
        if (getBAGDOSSIER() != null) {
            _hashCode += getBAGDOSSIER().hashCode();
        }
        if (getTRADEABLE() != null) {
            _hashCode += getTRADEABLE().hashCode();
        }
        if (getWEIGHT() != null) {
            _hashCode += getWEIGHT().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getARTCOMP() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTCOMP());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTCOMP(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTBAR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTBAR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTBAR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTCH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTCH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTCH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTPRI() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTPRI());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTPRI(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTMIG() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTMIG());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTMIG(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTDAN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTDAN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTDAN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTLIM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTLIM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTLIM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTINS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTINS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTINS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getARTADR() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getARTADR());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getARTADR(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSIZE() != null) {
            _hashCode += getSIZE().hashCode();
        }
        if (getPIC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPIC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPIC(), i);
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
        new org.apache.axis.description.TypeDesc(ArticleART.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article>ART"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DT");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DT"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PHAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PHAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GRPCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>GRPCD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDSO1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDSO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDSO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDSO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMCAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SMCAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SMCAT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SMNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HOSPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "HOSPCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CLINCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTTYP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "VAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SALECD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SALECD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SALECD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSLIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "INSLIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>INSLIM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIMPTS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LIMPTS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRDFR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GRDFR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>GRDFR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COOL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "COOL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEMP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TEMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDBG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDBG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "EXP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRLONGD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRLONGD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRLONGF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRLONGF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SORTD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SORTD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SORTF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SORTF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTYUD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTYUD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QTYUF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QTYUF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IMG"));
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
        elemField.setFieldName("DSCRPACKD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRPACKD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRPACKF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRPACKF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCKTYPD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PCKTYPD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCKTYPF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PCKTYPF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MULT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MULT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYN1D");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SYN1D"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYN1F");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SYN1F"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLOPLUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SLOPLUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOPCS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NOPCS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HSCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "HSCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>HSCD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MINI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MINI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEPCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>DEPCD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPOT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DEPOT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAGSL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BAGSL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAGSLC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BAGSLC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOACD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LOACD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>LOACD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTSAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "OUTSAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STTOX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "STTOX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "NOTI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>NOTI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GGL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GGL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>GGL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SMDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMCDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SMCDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESIST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ESIST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIOCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BIOCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAGNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BAGNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "LIGHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAGDOSSIER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BAGDOSSIER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRADEABLE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TRADEABLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WEIGHT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "WEIGHT"));
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
        elemField.setFieldName("ARTCOMP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTCOMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTCOMP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTBAR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTBAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTBAR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTCH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTCH"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTPRI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTPRI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTPRI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTMIG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTMIG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTMIG"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTDAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTDAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTDAN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTLIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTLIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTLIM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTINS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTINS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ARTADR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ARTADR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTADR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIZE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIZE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SIZE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>PIC"));
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
