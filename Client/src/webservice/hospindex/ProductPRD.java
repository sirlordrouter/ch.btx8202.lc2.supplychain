/**
 * ProductPRD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class ProductPRD  implements java.io.Serializable {
    private int PRDNO;

    private java.lang.String DSCRD;

    private java.lang.String DSCRF;

    private java.lang.String DSCRLONGD;

    private java.lang.String DSCRLONGF;

    private java.lang.String BNAMD;

    private java.lang.String BNAMF;

    private java.lang.String BNAMLONGD;

    private java.lang.String BNAMLONGF;

    private java.lang.String ADNAMD;

    private java.lang.String ADNAMF;

    private java.lang.String ADNAMLONGD;

    private java.lang.String ADNAMLONGF;

    private java.lang.String SIZE;

    private java.lang.String ADINFD;

    private java.lang.String ADINFF;

    private java.lang.String ADINFLONGD;

    private java.lang.String ADINFLONGF;

    private java.lang.String DSCRSWISSMEDICD;

    private java.lang.String DSCRSWISSMEDICF;

    private java.lang.String GENCD;

    private java.lang.String GENGRP;

    private java.lang.String ATC;

    private java.lang.String IT;

    private java.lang.String ITBAG;

    private java.lang.Integer KONO;

    private java.lang.String TRADE;

    private java.lang.String CDBRAND;

    private java.lang.String CDBRANDSUB;

    private java.lang.Integer PRTNO;

    private java.lang.Integer PRTNO2;

    private java.lang.Integer MONO;

    private java.lang.String CDGALD;

    private java.lang.String CDGALF;

    private java.lang.String FORMD;

    private java.lang.String FORMF;

    private java.lang.Double DOSE;

    private java.lang.String DOSEU;

    private java.lang.String DRGFD;

    private java.lang.String DRGFF;

    private java.lang.Boolean ORPH;

    private java.lang.Boolean BIOPHA;

    private webservice.hospindex.ProductPRDBIOSIM BIOSIM;

    private java.lang.Boolean BFS;

    private java.lang.Boolean BLOOD;

    private java.lang.String MSCD;

    private java.lang.Integer PRDIXREL;

    private java.lang.Integer CDS;

    private java.lang.String SYND;

    private java.lang.String SYNF;

    private java.lang.String KP;

    private java.lang.String BFSDATA;

    private java.lang.Boolean DRGPRICEY;

    private java.lang.Integer QAP;

    private java.util.Calendar BFSDAT;

    private java.util.Calendar BFSCDAT;

    private java.util.Calendar DRGPRICEYDAT;

    private java.util.Calendar DRGPRICEYCDAT;

    private java.lang.String MDCLASS;

    private java.lang.String MDNB;

    private java.lang.String CDSMODULES;

    private java.math.BigInteger SMNR;

    private java.lang.String SMCAT;

    private boolean DEL;

    private webservice.hospindex.ProductPRDCPT[] CPT;

    private webservice.hospindex.ProductPRDPRDICD[] PRDICD;

    private java.util.Calendar DT;  // attribute

    public ProductPRD() {
    }

    public ProductPRD(
           int PRDNO,
           java.lang.String DSCRD,
           java.lang.String DSCRF,
           java.lang.String DSCRLONGD,
           java.lang.String DSCRLONGF,
           java.lang.String BNAMD,
           java.lang.String BNAMF,
           java.lang.String BNAMLONGD,
           java.lang.String BNAMLONGF,
           java.lang.String ADNAMD,
           java.lang.String ADNAMF,
           java.lang.String ADNAMLONGD,
           java.lang.String ADNAMLONGF,
           java.lang.String SIZE,
           java.lang.String ADINFD,
           java.lang.String ADINFF,
           java.lang.String ADINFLONGD,
           java.lang.String ADINFLONGF,
           java.lang.String DSCRSWISSMEDICD,
           java.lang.String DSCRSWISSMEDICF,
           java.lang.String GENCD,
           java.lang.String GENGRP,
           java.lang.String ATC,
           java.lang.String IT,
           java.lang.String ITBAG,
           java.lang.Integer KONO,
           java.lang.String TRADE,
           java.lang.String CDBRAND,
           java.lang.String CDBRANDSUB,
           java.lang.Integer PRTNO,
           java.lang.Integer PRTNO2,
           java.lang.Integer MONO,
           java.lang.String CDGALD,
           java.lang.String CDGALF,
           java.lang.String FORMD,
           java.lang.String FORMF,
           java.lang.Double DOSE,
           java.lang.String DOSEU,
           java.lang.String DRGFD,
           java.lang.String DRGFF,
           java.lang.Boolean ORPH,
           java.lang.Boolean BIOPHA,
           webservice.hospindex.ProductPRDBIOSIM BIOSIM,
           java.lang.Boolean BFS,
           java.lang.Boolean BLOOD,
           java.lang.String MSCD,
           java.lang.Integer PRDIXREL,
           java.lang.Integer CDS,
           java.lang.String SYND,
           java.lang.String SYNF,
           java.lang.String KP,
           java.lang.String BFSDATA,
           java.lang.Boolean DRGPRICEY,
           java.lang.Integer QAP,
           java.util.Calendar BFSDAT,
           java.util.Calendar BFSCDAT,
           java.util.Calendar DRGPRICEYDAT,
           java.util.Calendar DRGPRICEYCDAT,
           java.lang.String MDCLASS,
           java.lang.String MDNB,
           java.lang.String CDSMODULES,
           java.math.BigInteger SMNR,
           java.lang.String SMCAT,
           boolean DEL,
           webservice.hospindex.ProductPRDCPT[] CPT,
           webservice.hospindex.ProductPRDPRDICD[] PRDICD,
           java.util.Calendar DT) {
           this.PRDNO = PRDNO;
           this.DSCRD = DSCRD;
           this.DSCRF = DSCRF;
           this.DSCRLONGD = DSCRLONGD;
           this.DSCRLONGF = DSCRLONGF;
           this.BNAMD = BNAMD;
           this.BNAMF = BNAMF;
           this.BNAMLONGD = BNAMLONGD;
           this.BNAMLONGF = BNAMLONGF;
           this.ADNAMD = ADNAMD;
           this.ADNAMF = ADNAMF;
           this.ADNAMLONGD = ADNAMLONGD;
           this.ADNAMLONGF = ADNAMLONGF;
           this.SIZE = SIZE;
           this.ADINFD = ADINFD;
           this.ADINFF = ADINFF;
           this.ADINFLONGD = ADINFLONGD;
           this.ADINFLONGF = ADINFLONGF;
           this.DSCRSWISSMEDICD = DSCRSWISSMEDICD;
           this.DSCRSWISSMEDICF = DSCRSWISSMEDICF;
           this.GENCD = GENCD;
           this.GENGRP = GENGRP;
           this.ATC = ATC;
           this.IT = IT;
           this.ITBAG = ITBAG;
           this.KONO = KONO;
           this.TRADE = TRADE;
           this.CDBRAND = CDBRAND;
           this.CDBRANDSUB = CDBRANDSUB;
           this.PRTNO = PRTNO;
           this.PRTNO2 = PRTNO2;
           this.MONO = MONO;
           this.CDGALD = CDGALD;
           this.CDGALF = CDGALF;
           this.FORMD = FORMD;
           this.FORMF = FORMF;
           this.DOSE = DOSE;
           this.DOSEU = DOSEU;
           this.DRGFD = DRGFD;
           this.DRGFF = DRGFF;
           this.ORPH = ORPH;
           this.BIOPHA = BIOPHA;
           this.BIOSIM = BIOSIM;
           this.BFS = BFS;
           this.BLOOD = BLOOD;
           this.MSCD = MSCD;
           this.PRDIXREL = PRDIXREL;
           this.CDS = CDS;
           this.SYND = SYND;
           this.SYNF = SYNF;
           this.KP = KP;
           this.BFSDATA = BFSDATA;
           this.DRGPRICEY = DRGPRICEY;
           this.QAP = QAP;
           this.BFSDAT = BFSDAT;
           this.BFSCDAT = BFSCDAT;
           this.DRGPRICEYDAT = DRGPRICEYDAT;
           this.DRGPRICEYCDAT = DRGPRICEYCDAT;
           this.MDCLASS = MDCLASS;
           this.MDNB = MDNB;
           this.CDSMODULES = CDSMODULES;
           this.SMNR = SMNR;
           this.SMCAT = SMCAT;
           this.DEL = DEL;
           this.CPT = CPT;
           this.PRDICD = PRDICD;
           this.DT = DT;
    }


    /**
     * Gets the PRDNO value for this ProductPRD.
     * 
     * @return PRDNO
     */
    public int getPRDNO() {
        return PRDNO;
    }


    /**
     * Sets the PRDNO value for this ProductPRD.
     * 
     * @param PRDNO
     */
    public void setPRDNO(int PRDNO) {
        this.PRDNO = PRDNO;
    }


    /**
     * Gets the DSCRD value for this ProductPRD.
     * 
     * @return DSCRD
     */
    public java.lang.String getDSCRD() {
        return DSCRD;
    }


    /**
     * Sets the DSCRD value for this ProductPRD.
     * 
     * @param DSCRD
     */
    public void setDSCRD(java.lang.String DSCRD) {
        this.DSCRD = DSCRD;
    }


    /**
     * Gets the DSCRF value for this ProductPRD.
     * 
     * @return DSCRF
     */
    public java.lang.String getDSCRF() {
        return DSCRF;
    }


    /**
     * Sets the DSCRF value for this ProductPRD.
     * 
     * @param DSCRF
     */
    public void setDSCRF(java.lang.String DSCRF) {
        this.DSCRF = DSCRF;
    }


    /**
     * Gets the DSCRLONGD value for this ProductPRD.
     * 
     * @return DSCRLONGD
     */
    public java.lang.String getDSCRLONGD() {
        return DSCRLONGD;
    }


    /**
     * Sets the DSCRLONGD value for this ProductPRD.
     * 
     * @param DSCRLONGD
     */
    public void setDSCRLONGD(java.lang.String DSCRLONGD) {
        this.DSCRLONGD = DSCRLONGD;
    }


    /**
     * Gets the DSCRLONGF value for this ProductPRD.
     * 
     * @return DSCRLONGF
     */
    public java.lang.String getDSCRLONGF() {
        return DSCRLONGF;
    }


    /**
     * Sets the DSCRLONGF value for this ProductPRD.
     * 
     * @param DSCRLONGF
     */
    public void setDSCRLONGF(java.lang.String DSCRLONGF) {
        this.DSCRLONGF = DSCRLONGF;
    }


    /**
     * Gets the BNAMD value for this ProductPRD.
     * 
     * @return BNAMD
     */
    public java.lang.String getBNAMD() {
        return BNAMD;
    }


    /**
     * Sets the BNAMD value for this ProductPRD.
     * 
     * @param BNAMD
     */
    public void setBNAMD(java.lang.String BNAMD) {
        this.BNAMD = BNAMD;
    }


    /**
     * Gets the BNAMF value for this ProductPRD.
     * 
     * @return BNAMF
     */
    public java.lang.String getBNAMF() {
        return BNAMF;
    }


    /**
     * Sets the BNAMF value for this ProductPRD.
     * 
     * @param BNAMF
     */
    public void setBNAMF(java.lang.String BNAMF) {
        this.BNAMF = BNAMF;
    }


    /**
     * Gets the BNAMLONGD value for this ProductPRD.
     * 
     * @return BNAMLONGD
     */
    public java.lang.String getBNAMLONGD() {
        return BNAMLONGD;
    }


    /**
     * Sets the BNAMLONGD value for this ProductPRD.
     * 
     * @param BNAMLONGD
     */
    public void setBNAMLONGD(java.lang.String BNAMLONGD) {
        this.BNAMLONGD = BNAMLONGD;
    }


    /**
     * Gets the BNAMLONGF value for this ProductPRD.
     * 
     * @return BNAMLONGF
     */
    public java.lang.String getBNAMLONGF() {
        return BNAMLONGF;
    }


    /**
     * Sets the BNAMLONGF value for this ProductPRD.
     * 
     * @param BNAMLONGF
     */
    public void setBNAMLONGF(java.lang.String BNAMLONGF) {
        this.BNAMLONGF = BNAMLONGF;
    }


    /**
     * Gets the ADNAMD value for this ProductPRD.
     * 
     * @return ADNAMD
     */
    public java.lang.String getADNAMD() {
        return ADNAMD;
    }


    /**
     * Sets the ADNAMD value for this ProductPRD.
     * 
     * @param ADNAMD
     */
    public void setADNAMD(java.lang.String ADNAMD) {
        this.ADNAMD = ADNAMD;
    }


    /**
     * Gets the ADNAMF value for this ProductPRD.
     * 
     * @return ADNAMF
     */
    public java.lang.String getADNAMF() {
        return ADNAMF;
    }


    /**
     * Sets the ADNAMF value for this ProductPRD.
     * 
     * @param ADNAMF
     */
    public void setADNAMF(java.lang.String ADNAMF) {
        this.ADNAMF = ADNAMF;
    }


    /**
     * Gets the ADNAMLONGD value for this ProductPRD.
     * 
     * @return ADNAMLONGD
     */
    public java.lang.String getADNAMLONGD() {
        return ADNAMLONGD;
    }


    /**
     * Sets the ADNAMLONGD value for this ProductPRD.
     * 
     * @param ADNAMLONGD
     */
    public void setADNAMLONGD(java.lang.String ADNAMLONGD) {
        this.ADNAMLONGD = ADNAMLONGD;
    }


    /**
     * Gets the ADNAMLONGF value for this ProductPRD.
     * 
     * @return ADNAMLONGF
     */
    public java.lang.String getADNAMLONGF() {
        return ADNAMLONGF;
    }


    /**
     * Sets the ADNAMLONGF value for this ProductPRD.
     * 
     * @param ADNAMLONGF
     */
    public void setADNAMLONGF(java.lang.String ADNAMLONGF) {
        this.ADNAMLONGF = ADNAMLONGF;
    }


    /**
     * Gets the SIZE value for this ProductPRD.
     * 
     * @return SIZE
     */
    public java.lang.String getSIZE() {
        return SIZE;
    }


    /**
     * Sets the SIZE value for this ProductPRD.
     * 
     * @param SIZE
     */
    public void setSIZE(java.lang.String SIZE) {
        this.SIZE = SIZE;
    }


    /**
     * Gets the ADINFD value for this ProductPRD.
     * 
     * @return ADINFD
     */
    public java.lang.String getADINFD() {
        return ADINFD;
    }


    /**
     * Sets the ADINFD value for this ProductPRD.
     * 
     * @param ADINFD
     */
    public void setADINFD(java.lang.String ADINFD) {
        this.ADINFD = ADINFD;
    }


    /**
     * Gets the ADINFF value for this ProductPRD.
     * 
     * @return ADINFF
     */
    public java.lang.String getADINFF() {
        return ADINFF;
    }


    /**
     * Sets the ADINFF value for this ProductPRD.
     * 
     * @param ADINFF
     */
    public void setADINFF(java.lang.String ADINFF) {
        this.ADINFF = ADINFF;
    }


    /**
     * Gets the ADINFLONGD value for this ProductPRD.
     * 
     * @return ADINFLONGD
     */
    public java.lang.String getADINFLONGD() {
        return ADINFLONGD;
    }


    /**
     * Sets the ADINFLONGD value for this ProductPRD.
     * 
     * @param ADINFLONGD
     */
    public void setADINFLONGD(java.lang.String ADINFLONGD) {
        this.ADINFLONGD = ADINFLONGD;
    }


    /**
     * Gets the ADINFLONGF value for this ProductPRD.
     * 
     * @return ADINFLONGF
     */
    public java.lang.String getADINFLONGF() {
        return ADINFLONGF;
    }


    /**
     * Sets the ADINFLONGF value for this ProductPRD.
     * 
     * @param ADINFLONGF
     */
    public void setADINFLONGF(java.lang.String ADINFLONGF) {
        this.ADINFLONGF = ADINFLONGF;
    }


    /**
     * Gets the DSCRSWISSMEDICD value for this ProductPRD.
     * 
     * @return DSCRSWISSMEDICD
     */
    public java.lang.String getDSCRSWISSMEDICD() {
        return DSCRSWISSMEDICD;
    }


    /**
     * Sets the DSCRSWISSMEDICD value for this ProductPRD.
     * 
     * @param DSCRSWISSMEDICD
     */
    public void setDSCRSWISSMEDICD(java.lang.String DSCRSWISSMEDICD) {
        this.DSCRSWISSMEDICD = DSCRSWISSMEDICD;
    }


    /**
     * Gets the DSCRSWISSMEDICF value for this ProductPRD.
     * 
     * @return DSCRSWISSMEDICF
     */
    public java.lang.String getDSCRSWISSMEDICF() {
        return DSCRSWISSMEDICF;
    }


    /**
     * Sets the DSCRSWISSMEDICF value for this ProductPRD.
     * 
     * @param DSCRSWISSMEDICF
     */
    public void setDSCRSWISSMEDICF(java.lang.String DSCRSWISSMEDICF) {
        this.DSCRSWISSMEDICF = DSCRSWISSMEDICF;
    }


    /**
     * Gets the GENCD value for this ProductPRD.
     * 
     * @return GENCD
     */
    public java.lang.String getGENCD() {
        return GENCD;
    }


    /**
     * Sets the GENCD value for this ProductPRD.
     * 
     * @param GENCD
     */
    public void setGENCD(java.lang.String GENCD) {
        this.GENCD = GENCD;
    }


    /**
     * Gets the GENGRP value for this ProductPRD.
     * 
     * @return GENGRP
     */
    public java.lang.String getGENGRP() {
        return GENGRP;
    }


    /**
     * Sets the GENGRP value for this ProductPRD.
     * 
     * @param GENGRP
     */
    public void setGENGRP(java.lang.String GENGRP) {
        this.GENGRP = GENGRP;
    }


    /**
     * Gets the ATC value for this ProductPRD.
     * 
     * @return ATC
     */
    public java.lang.String getATC() {
        return ATC;
    }


    /**
     * Sets the ATC value for this ProductPRD.
     * 
     * @param ATC
     */
    public void setATC(java.lang.String ATC) {
        this.ATC = ATC;
    }


    /**
     * Gets the IT value for this ProductPRD.
     * 
     * @return IT
     */
    public java.lang.String getIT() {
        return IT;
    }


    /**
     * Sets the IT value for this ProductPRD.
     * 
     * @param IT
     */
    public void setIT(java.lang.String IT) {
        this.IT = IT;
    }


    /**
     * Gets the ITBAG value for this ProductPRD.
     * 
     * @return ITBAG
     */
    public java.lang.String getITBAG() {
        return ITBAG;
    }


    /**
     * Sets the ITBAG value for this ProductPRD.
     * 
     * @param ITBAG
     */
    public void setITBAG(java.lang.String ITBAG) {
        this.ITBAG = ITBAG;
    }


    /**
     * Gets the KONO value for this ProductPRD.
     * 
     * @return KONO
     */
    public java.lang.Integer getKONO() {
        return KONO;
    }


    /**
     * Sets the KONO value for this ProductPRD.
     * 
     * @param KONO
     */
    public void setKONO(java.lang.Integer KONO) {
        this.KONO = KONO;
    }


    /**
     * Gets the TRADE value for this ProductPRD.
     * 
     * @return TRADE
     */
    public java.lang.String getTRADE() {
        return TRADE;
    }


    /**
     * Sets the TRADE value for this ProductPRD.
     * 
     * @param TRADE
     */
    public void setTRADE(java.lang.String TRADE) {
        this.TRADE = TRADE;
    }


    /**
     * Gets the CDBRAND value for this ProductPRD.
     * 
     * @return CDBRAND
     */
    public java.lang.String getCDBRAND() {
        return CDBRAND;
    }


    /**
     * Sets the CDBRAND value for this ProductPRD.
     * 
     * @param CDBRAND
     */
    public void setCDBRAND(java.lang.String CDBRAND) {
        this.CDBRAND = CDBRAND;
    }


    /**
     * Gets the CDBRANDSUB value for this ProductPRD.
     * 
     * @return CDBRANDSUB
     */
    public java.lang.String getCDBRANDSUB() {
        return CDBRANDSUB;
    }


    /**
     * Sets the CDBRANDSUB value for this ProductPRD.
     * 
     * @param CDBRANDSUB
     */
    public void setCDBRANDSUB(java.lang.String CDBRANDSUB) {
        this.CDBRANDSUB = CDBRANDSUB;
    }


    /**
     * Gets the PRTNO value for this ProductPRD.
     * 
     * @return PRTNO
     */
    public java.lang.Integer getPRTNO() {
        return PRTNO;
    }


    /**
     * Sets the PRTNO value for this ProductPRD.
     * 
     * @param PRTNO
     */
    public void setPRTNO(java.lang.Integer PRTNO) {
        this.PRTNO = PRTNO;
    }


    /**
     * Gets the PRTNO2 value for this ProductPRD.
     * 
     * @return PRTNO2
     */
    public java.lang.Integer getPRTNO2() {
        return PRTNO2;
    }


    /**
     * Sets the PRTNO2 value for this ProductPRD.
     * 
     * @param PRTNO2
     */
    public void setPRTNO2(java.lang.Integer PRTNO2) {
        this.PRTNO2 = PRTNO2;
    }


    /**
     * Gets the MONO value for this ProductPRD.
     * 
     * @return MONO
     */
    public java.lang.Integer getMONO() {
        return MONO;
    }


    /**
     * Sets the MONO value for this ProductPRD.
     * 
     * @param MONO
     */
    public void setMONO(java.lang.Integer MONO) {
        this.MONO = MONO;
    }


    /**
     * Gets the CDGALD value for this ProductPRD.
     * 
     * @return CDGALD
     */
    public java.lang.String getCDGALD() {
        return CDGALD;
    }


    /**
     * Sets the CDGALD value for this ProductPRD.
     * 
     * @param CDGALD
     */
    public void setCDGALD(java.lang.String CDGALD) {
        this.CDGALD = CDGALD;
    }


    /**
     * Gets the CDGALF value for this ProductPRD.
     * 
     * @return CDGALF
     */
    public java.lang.String getCDGALF() {
        return CDGALF;
    }


    /**
     * Sets the CDGALF value for this ProductPRD.
     * 
     * @param CDGALF
     */
    public void setCDGALF(java.lang.String CDGALF) {
        this.CDGALF = CDGALF;
    }


    /**
     * Gets the FORMD value for this ProductPRD.
     * 
     * @return FORMD
     */
    public java.lang.String getFORMD() {
        return FORMD;
    }


    /**
     * Sets the FORMD value for this ProductPRD.
     * 
     * @param FORMD
     */
    public void setFORMD(java.lang.String FORMD) {
        this.FORMD = FORMD;
    }


    /**
     * Gets the FORMF value for this ProductPRD.
     * 
     * @return FORMF
     */
    public java.lang.String getFORMF() {
        return FORMF;
    }


    /**
     * Sets the FORMF value for this ProductPRD.
     * 
     * @param FORMF
     */
    public void setFORMF(java.lang.String FORMF) {
        this.FORMF = FORMF;
    }


    /**
     * Gets the DOSE value for this ProductPRD.
     * 
     * @return DOSE
     */
    public java.lang.Double getDOSE() {
        return DOSE;
    }


    /**
     * Sets the DOSE value for this ProductPRD.
     * 
     * @param DOSE
     */
    public void setDOSE(java.lang.Double DOSE) {
        this.DOSE = DOSE;
    }


    /**
     * Gets the DOSEU value for this ProductPRD.
     * 
     * @return DOSEU
     */
    public java.lang.String getDOSEU() {
        return DOSEU;
    }


    /**
     * Sets the DOSEU value for this ProductPRD.
     * 
     * @param DOSEU
     */
    public void setDOSEU(java.lang.String DOSEU) {
        this.DOSEU = DOSEU;
    }


    /**
     * Gets the DRGFD value for this ProductPRD.
     * 
     * @return DRGFD
     */
    public java.lang.String getDRGFD() {
        return DRGFD;
    }


    /**
     * Sets the DRGFD value for this ProductPRD.
     * 
     * @param DRGFD
     */
    public void setDRGFD(java.lang.String DRGFD) {
        this.DRGFD = DRGFD;
    }


    /**
     * Gets the DRGFF value for this ProductPRD.
     * 
     * @return DRGFF
     */
    public java.lang.String getDRGFF() {
        return DRGFF;
    }


    /**
     * Sets the DRGFF value for this ProductPRD.
     * 
     * @param DRGFF
     */
    public void setDRGFF(java.lang.String DRGFF) {
        this.DRGFF = DRGFF;
    }


    /**
     * Gets the ORPH value for this ProductPRD.
     * 
     * @return ORPH
     */
    public java.lang.Boolean getORPH() {
        return ORPH;
    }


    /**
     * Sets the ORPH value for this ProductPRD.
     * 
     * @param ORPH
     */
    public void setORPH(java.lang.Boolean ORPH) {
        this.ORPH = ORPH;
    }


    /**
     * Gets the BIOPHA value for this ProductPRD.
     * 
     * @return BIOPHA
     */
    public java.lang.Boolean getBIOPHA() {
        return BIOPHA;
    }


    /**
     * Sets the BIOPHA value for this ProductPRD.
     * 
     * @param BIOPHA
     */
    public void setBIOPHA(java.lang.Boolean BIOPHA) {
        this.BIOPHA = BIOPHA;
    }


    /**
     * Gets the BIOSIM value for this ProductPRD.
     * 
     * @return BIOSIM
     */
    public webservice.hospindex.ProductPRDBIOSIM getBIOSIM() {
        return BIOSIM;
    }


    /**
     * Sets the BIOSIM value for this ProductPRD.
     * 
     * @param BIOSIM
     */
    public void setBIOSIM(webservice.hospindex.ProductPRDBIOSIM BIOSIM) {
        this.BIOSIM = BIOSIM;
    }


    /**
     * Gets the BFS value for this ProductPRD.
     * 
     * @return BFS
     */
    public java.lang.Boolean getBFS() {
        return BFS;
    }


    /**
     * Sets the BFS value for this ProductPRD.
     * 
     * @param BFS
     */
    public void setBFS(java.lang.Boolean BFS) {
        this.BFS = BFS;
    }


    /**
     * Gets the BLOOD value for this ProductPRD.
     * 
     * @return BLOOD
     */
    public java.lang.Boolean getBLOOD() {
        return BLOOD;
    }


    /**
     * Sets the BLOOD value for this ProductPRD.
     * 
     * @param BLOOD
     */
    public void setBLOOD(java.lang.Boolean BLOOD) {
        this.BLOOD = BLOOD;
    }


    /**
     * Gets the MSCD value for this ProductPRD.
     * 
     * @return MSCD
     */
    public java.lang.String getMSCD() {
        return MSCD;
    }


    /**
     * Sets the MSCD value for this ProductPRD.
     * 
     * @param MSCD
     */
    public void setMSCD(java.lang.String MSCD) {
        this.MSCD = MSCD;
    }


    /**
     * Gets the PRDIXREL value for this ProductPRD.
     * 
     * @return PRDIXREL
     */
    public java.lang.Integer getPRDIXREL() {
        return PRDIXREL;
    }


    /**
     * Sets the PRDIXREL value for this ProductPRD.
     * 
     * @param PRDIXREL
     */
    public void setPRDIXREL(java.lang.Integer PRDIXREL) {
        this.PRDIXREL = PRDIXREL;
    }


    /**
     * Gets the CDS value for this ProductPRD.
     * 
     * @return CDS
     */
    public java.lang.Integer getCDS() {
        return CDS;
    }


    /**
     * Sets the CDS value for this ProductPRD.
     * 
     * @param CDS
     */
    public void setCDS(java.lang.Integer CDS) {
        this.CDS = CDS;
    }


    /**
     * Gets the SYND value for this ProductPRD.
     * 
     * @return SYND
     */
    public java.lang.String getSYND() {
        return SYND;
    }


    /**
     * Sets the SYND value for this ProductPRD.
     * 
     * @param SYND
     */
    public void setSYND(java.lang.String SYND) {
        this.SYND = SYND;
    }


    /**
     * Gets the SYNF value for this ProductPRD.
     * 
     * @return SYNF
     */
    public java.lang.String getSYNF() {
        return SYNF;
    }


    /**
     * Sets the SYNF value for this ProductPRD.
     * 
     * @param SYNF
     */
    public void setSYNF(java.lang.String SYNF) {
        this.SYNF = SYNF;
    }


    /**
     * Gets the KP value for this ProductPRD.
     * 
     * @return KP
     */
    public java.lang.String getKP() {
        return KP;
    }


    /**
     * Sets the KP value for this ProductPRD.
     * 
     * @param KP
     */
    public void setKP(java.lang.String KP) {
        this.KP = KP;
    }


    /**
     * Gets the BFSDATA value for this ProductPRD.
     * 
     * @return BFSDATA
     */
    public java.lang.String getBFSDATA() {
        return BFSDATA;
    }


    /**
     * Sets the BFSDATA value for this ProductPRD.
     * 
     * @param BFSDATA
     */
    public void setBFSDATA(java.lang.String BFSDATA) {
        this.BFSDATA = BFSDATA;
    }


    /**
     * Gets the DRGPRICEY value for this ProductPRD.
     * 
     * @return DRGPRICEY
     */
    public java.lang.Boolean getDRGPRICEY() {
        return DRGPRICEY;
    }


    /**
     * Sets the DRGPRICEY value for this ProductPRD.
     * 
     * @param DRGPRICEY
     */
    public void setDRGPRICEY(java.lang.Boolean DRGPRICEY) {
        this.DRGPRICEY = DRGPRICEY;
    }


    /**
     * Gets the QAP value for this ProductPRD.
     * 
     * @return QAP
     */
    public java.lang.Integer getQAP() {
        return QAP;
    }


    /**
     * Sets the QAP value for this ProductPRD.
     * 
     * @param QAP
     */
    public void setQAP(java.lang.Integer QAP) {
        this.QAP = QAP;
    }


    /**
     * Gets the BFSDAT value for this ProductPRD.
     * 
     * @return BFSDAT
     */
    public java.util.Calendar getBFSDAT() {
        return BFSDAT;
    }


    /**
     * Sets the BFSDAT value for this ProductPRD.
     * 
     * @param BFSDAT
     */
    public void setBFSDAT(java.util.Calendar BFSDAT) {
        this.BFSDAT = BFSDAT;
    }


    /**
     * Gets the BFSCDAT value for this ProductPRD.
     * 
     * @return BFSCDAT
     */
    public java.util.Calendar getBFSCDAT() {
        return BFSCDAT;
    }


    /**
     * Sets the BFSCDAT value for this ProductPRD.
     * 
     * @param BFSCDAT
     */
    public void setBFSCDAT(java.util.Calendar BFSCDAT) {
        this.BFSCDAT = BFSCDAT;
    }


    /**
     * Gets the DRGPRICEYDAT value for this ProductPRD.
     * 
     * @return DRGPRICEYDAT
     */
    public java.util.Calendar getDRGPRICEYDAT() {
        return DRGPRICEYDAT;
    }


    /**
     * Sets the DRGPRICEYDAT value for this ProductPRD.
     * 
     * @param DRGPRICEYDAT
     */
    public void setDRGPRICEYDAT(java.util.Calendar DRGPRICEYDAT) {
        this.DRGPRICEYDAT = DRGPRICEYDAT;
    }


    /**
     * Gets the DRGPRICEYCDAT value for this ProductPRD.
     * 
     * @return DRGPRICEYCDAT
     */
    public java.util.Calendar getDRGPRICEYCDAT() {
        return DRGPRICEYCDAT;
    }


    /**
     * Sets the DRGPRICEYCDAT value for this ProductPRD.
     * 
     * @param DRGPRICEYCDAT
     */
    public void setDRGPRICEYCDAT(java.util.Calendar DRGPRICEYCDAT) {
        this.DRGPRICEYCDAT = DRGPRICEYCDAT;
    }


    /**
     * Gets the MDCLASS value for this ProductPRD.
     * 
     * @return MDCLASS
     */
    public java.lang.String getMDCLASS() {
        return MDCLASS;
    }


    /**
     * Sets the MDCLASS value for this ProductPRD.
     * 
     * @param MDCLASS
     */
    public void setMDCLASS(java.lang.String MDCLASS) {
        this.MDCLASS = MDCLASS;
    }


    /**
     * Gets the MDNB value for this ProductPRD.
     * 
     * @return MDNB
     */
    public java.lang.String getMDNB() {
        return MDNB;
    }


    /**
     * Sets the MDNB value for this ProductPRD.
     * 
     * @param MDNB
     */
    public void setMDNB(java.lang.String MDNB) {
        this.MDNB = MDNB;
    }


    /**
     * Gets the CDSMODULES value for this ProductPRD.
     * 
     * @return CDSMODULES
     */
    public java.lang.String getCDSMODULES() {
        return CDSMODULES;
    }


    /**
     * Sets the CDSMODULES value for this ProductPRD.
     * 
     * @param CDSMODULES
     */
    public void setCDSMODULES(java.lang.String CDSMODULES) {
        this.CDSMODULES = CDSMODULES;
    }


    /**
     * Gets the SMNR value for this ProductPRD.
     * 
     * @return SMNR
     */
    public java.math.BigInteger getSMNR() {
        return SMNR;
    }


    /**
     * Sets the SMNR value for this ProductPRD.
     * 
     * @param SMNR
     */
    public void setSMNR(java.math.BigInteger SMNR) {
        this.SMNR = SMNR;
    }


    /**
     * Gets the SMCAT value for this ProductPRD.
     * 
     * @return SMCAT
     */
    public java.lang.String getSMCAT() {
        return SMCAT;
    }


    /**
     * Sets the SMCAT value for this ProductPRD.
     * 
     * @param SMCAT
     */
    public void setSMCAT(java.lang.String SMCAT) {
        this.SMCAT = SMCAT;
    }


    /**
     * Gets the DEL value for this ProductPRD.
     * 
     * @return DEL
     */
    public boolean isDEL() {
        return DEL;
    }


    /**
     * Sets the DEL value for this ProductPRD.
     * 
     * @param DEL
     */
    public void setDEL(boolean DEL) {
        this.DEL = DEL;
    }


    /**
     * Gets the CPT value for this ProductPRD.
     * 
     * @return CPT
     */
    public webservice.hospindex.ProductPRDCPT[] getCPT() {
        return CPT;
    }


    /**
     * Sets the CPT value for this ProductPRD.
     * 
     * @param CPT
     */
    public void setCPT(webservice.hospindex.ProductPRDCPT[] CPT) {
        this.CPT = CPT;
    }

    public webservice.hospindex.ProductPRDCPT getCPT(int i) {
        return this.CPT[i];
    }

    public void setCPT(int i, webservice.hospindex.ProductPRDCPT _value) {
        this.CPT[i] = _value;
    }


    /**
     * Gets the PRDICD value for this ProductPRD.
     * 
     * @return PRDICD
     */
    public webservice.hospindex.ProductPRDPRDICD[] getPRDICD() {
        return PRDICD;
    }


    /**
     * Sets the PRDICD value for this ProductPRD.
     * 
     * @param PRDICD
     */
    public void setPRDICD(webservice.hospindex.ProductPRDPRDICD[] PRDICD) {
        this.PRDICD = PRDICD;
    }

    public webservice.hospindex.ProductPRDPRDICD getPRDICD(int i) {
        return this.PRDICD[i];
    }

    public void setPRDICD(int i, webservice.hospindex.ProductPRDPRDICD _value) {
        this.PRDICD[i] = _value;
    }


    /**
     * Gets the DT value for this ProductPRD.
     * 
     * @return DT
     */
    public java.util.Calendar getDT() {
        return DT;
    }


    /**
     * Sets the DT value for this ProductPRD.
     * 
     * @param DT
     */
    public void setDT(java.util.Calendar DT) {
        this.DT = DT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductPRD)) return false;
        ProductPRD other = (ProductPRD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.PRDNO == other.getPRDNO() &&
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
            ((this.BNAMD==null && other.getBNAMD()==null) || 
             (this.BNAMD!=null &&
              this.BNAMD.equals(other.getBNAMD()))) &&
            ((this.BNAMF==null && other.getBNAMF()==null) || 
             (this.BNAMF!=null &&
              this.BNAMF.equals(other.getBNAMF()))) &&
            ((this.BNAMLONGD==null && other.getBNAMLONGD()==null) || 
             (this.BNAMLONGD!=null &&
              this.BNAMLONGD.equals(other.getBNAMLONGD()))) &&
            ((this.BNAMLONGF==null && other.getBNAMLONGF()==null) || 
             (this.BNAMLONGF!=null &&
              this.BNAMLONGF.equals(other.getBNAMLONGF()))) &&
            ((this.ADNAMD==null && other.getADNAMD()==null) || 
             (this.ADNAMD!=null &&
              this.ADNAMD.equals(other.getADNAMD()))) &&
            ((this.ADNAMF==null && other.getADNAMF()==null) || 
             (this.ADNAMF!=null &&
              this.ADNAMF.equals(other.getADNAMF()))) &&
            ((this.ADNAMLONGD==null && other.getADNAMLONGD()==null) || 
             (this.ADNAMLONGD!=null &&
              this.ADNAMLONGD.equals(other.getADNAMLONGD()))) &&
            ((this.ADNAMLONGF==null && other.getADNAMLONGF()==null) || 
             (this.ADNAMLONGF!=null &&
              this.ADNAMLONGF.equals(other.getADNAMLONGF()))) &&
            ((this.SIZE==null && other.getSIZE()==null) || 
             (this.SIZE!=null &&
              this.SIZE.equals(other.getSIZE()))) &&
            ((this.ADINFD==null && other.getADINFD()==null) || 
             (this.ADINFD!=null &&
              this.ADINFD.equals(other.getADINFD()))) &&
            ((this.ADINFF==null && other.getADINFF()==null) || 
             (this.ADINFF!=null &&
              this.ADINFF.equals(other.getADINFF()))) &&
            ((this.ADINFLONGD==null && other.getADINFLONGD()==null) || 
             (this.ADINFLONGD!=null &&
              this.ADINFLONGD.equals(other.getADINFLONGD()))) &&
            ((this.ADINFLONGF==null && other.getADINFLONGF()==null) || 
             (this.ADINFLONGF!=null &&
              this.ADINFLONGF.equals(other.getADINFLONGF()))) &&
            ((this.DSCRSWISSMEDICD==null && other.getDSCRSWISSMEDICD()==null) || 
             (this.DSCRSWISSMEDICD!=null &&
              this.DSCRSWISSMEDICD.equals(other.getDSCRSWISSMEDICD()))) &&
            ((this.DSCRSWISSMEDICF==null && other.getDSCRSWISSMEDICF()==null) || 
             (this.DSCRSWISSMEDICF!=null &&
              this.DSCRSWISSMEDICF.equals(other.getDSCRSWISSMEDICF()))) &&
            ((this.GENCD==null && other.getGENCD()==null) || 
             (this.GENCD!=null &&
              this.GENCD.equals(other.getGENCD()))) &&
            ((this.GENGRP==null && other.getGENGRP()==null) || 
             (this.GENGRP!=null &&
              this.GENGRP.equals(other.getGENGRP()))) &&
            ((this.ATC==null && other.getATC()==null) || 
             (this.ATC!=null &&
              this.ATC.equals(other.getATC()))) &&
            ((this.IT==null && other.getIT()==null) || 
             (this.IT!=null &&
              this.IT.equals(other.getIT()))) &&
            ((this.ITBAG==null && other.getITBAG()==null) || 
             (this.ITBAG!=null &&
              this.ITBAG.equals(other.getITBAG()))) &&
            ((this.KONO==null && other.getKONO()==null) || 
             (this.KONO!=null &&
              this.KONO.equals(other.getKONO()))) &&
            ((this.TRADE==null && other.getTRADE()==null) || 
             (this.TRADE!=null &&
              this.TRADE.equals(other.getTRADE()))) &&
            ((this.CDBRAND==null && other.getCDBRAND()==null) || 
             (this.CDBRAND!=null &&
              this.CDBRAND.equals(other.getCDBRAND()))) &&
            ((this.CDBRANDSUB==null && other.getCDBRANDSUB()==null) || 
             (this.CDBRANDSUB!=null &&
              this.CDBRANDSUB.equals(other.getCDBRANDSUB()))) &&
            ((this.PRTNO==null && other.getPRTNO()==null) || 
             (this.PRTNO!=null &&
              this.PRTNO.equals(other.getPRTNO()))) &&
            ((this.PRTNO2==null && other.getPRTNO2()==null) || 
             (this.PRTNO2!=null &&
              this.PRTNO2.equals(other.getPRTNO2()))) &&
            ((this.MONO==null && other.getMONO()==null) || 
             (this.MONO!=null &&
              this.MONO.equals(other.getMONO()))) &&
            ((this.CDGALD==null && other.getCDGALD()==null) || 
             (this.CDGALD!=null &&
              this.CDGALD.equals(other.getCDGALD()))) &&
            ((this.CDGALF==null && other.getCDGALF()==null) || 
             (this.CDGALF!=null &&
              this.CDGALF.equals(other.getCDGALF()))) &&
            ((this.FORMD==null && other.getFORMD()==null) || 
             (this.FORMD!=null &&
              this.FORMD.equals(other.getFORMD()))) &&
            ((this.FORMF==null && other.getFORMF()==null) || 
             (this.FORMF!=null &&
              this.FORMF.equals(other.getFORMF()))) &&
            ((this.DOSE==null && other.getDOSE()==null) || 
             (this.DOSE!=null &&
              this.DOSE.equals(other.getDOSE()))) &&
            ((this.DOSEU==null && other.getDOSEU()==null) || 
             (this.DOSEU!=null &&
              this.DOSEU.equals(other.getDOSEU()))) &&
            ((this.DRGFD==null && other.getDRGFD()==null) || 
             (this.DRGFD!=null &&
              this.DRGFD.equals(other.getDRGFD()))) &&
            ((this.DRGFF==null && other.getDRGFF()==null) || 
             (this.DRGFF!=null &&
              this.DRGFF.equals(other.getDRGFF()))) &&
            ((this.ORPH==null && other.getORPH()==null) || 
             (this.ORPH!=null &&
              this.ORPH.equals(other.getORPH()))) &&
            ((this.BIOPHA==null && other.getBIOPHA()==null) || 
             (this.BIOPHA!=null &&
              this.BIOPHA.equals(other.getBIOPHA()))) &&
            ((this.BIOSIM==null && other.getBIOSIM()==null) || 
             (this.BIOSIM!=null &&
              this.BIOSIM.equals(other.getBIOSIM()))) &&
            ((this.BFS==null && other.getBFS()==null) || 
             (this.BFS!=null &&
              this.BFS.equals(other.getBFS()))) &&
            ((this.BLOOD==null && other.getBLOOD()==null) || 
             (this.BLOOD!=null &&
              this.BLOOD.equals(other.getBLOOD()))) &&
            ((this.MSCD==null && other.getMSCD()==null) || 
             (this.MSCD!=null &&
              this.MSCD.equals(other.getMSCD()))) &&
            ((this.PRDIXREL==null && other.getPRDIXREL()==null) || 
             (this.PRDIXREL!=null &&
              this.PRDIXREL.equals(other.getPRDIXREL()))) &&
            ((this.CDS==null && other.getCDS()==null) || 
             (this.CDS!=null &&
              this.CDS.equals(other.getCDS()))) &&
            ((this.SYND==null && other.getSYND()==null) || 
             (this.SYND!=null &&
              this.SYND.equals(other.getSYND()))) &&
            ((this.SYNF==null && other.getSYNF()==null) || 
             (this.SYNF!=null &&
              this.SYNF.equals(other.getSYNF()))) &&
            ((this.KP==null && other.getKP()==null) || 
             (this.KP!=null &&
              this.KP.equals(other.getKP()))) &&
            ((this.BFSDATA==null && other.getBFSDATA()==null) || 
             (this.BFSDATA!=null &&
              this.BFSDATA.equals(other.getBFSDATA()))) &&
            ((this.DRGPRICEY==null && other.getDRGPRICEY()==null) || 
             (this.DRGPRICEY!=null &&
              this.DRGPRICEY.equals(other.getDRGPRICEY()))) &&
            ((this.QAP==null && other.getQAP()==null) || 
             (this.QAP!=null &&
              this.QAP.equals(other.getQAP()))) &&
            ((this.BFSDAT==null && other.getBFSDAT()==null) || 
             (this.BFSDAT!=null &&
              this.BFSDAT.equals(other.getBFSDAT()))) &&
            ((this.BFSCDAT==null && other.getBFSCDAT()==null) || 
             (this.BFSCDAT!=null &&
              this.BFSCDAT.equals(other.getBFSCDAT()))) &&
            ((this.DRGPRICEYDAT==null && other.getDRGPRICEYDAT()==null) || 
             (this.DRGPRICEYDAT!=null &&
              this.DRGPRICEYDAT.equals(other.getDRGPRICEYDAT()))) &&
            ((this.DRGPRICEYCDAT==null && other.getDRGPRICEYCDAT()==null) || 
             (this.DRGPRICEYCDAT!=null &&
              this.DRGPRICEYCDAT.equals(other.getDRGPRICEYCDAT()))) &&
            ((this.MDCLASS==null && other.getMDCLASS()==null) || 
             (this.MDCLASS!=null &&
              this.MDCLASS.equals(other.getMDCLASS()))) &&
            ((this.MDNB==null && other.getMDNB()==null) || 
             (this.MDNB!=null &&
              this.MDNB.equals(other.getMDNB()))) &&
            ((this.CDSMODULES==null && other.getCDSMODULES()==null) || 
             (this.CDSMODULES!=null &&
              this.CDSMODULES.equals(other.getCDSMODULES()))) &&
            ((this.SMNR==null && other.getSMNR()==null) || 
             (this.SMNR!=null &&
              this.SMNR.equals(other.getSMNR()))) &&
            ((this.SMCAT==null && other.getSMCAT()==null) || 
             (this.SMCAT!=null &&
              this.SMCAT.equals(other.getSMCAT()))) &&
            this.DEL == other.isDEL() &&
            ((this.CPT==null && other.getCPT()==null) || 
             (this.CPT!=null &&
              java.util.Arrays.equals(this.CPT, other.getCPT()))) &&
            ((this.PRDICD==null && other.getPRDICD()==null) || 
             (this.PRDICD!=null &&
              java.util.Arrays.equals(this.PRDICD, other.getPRDICD()))) &&
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
        if (getBNAMD() != null) {
            _hashCode += getBNAMD().hashCode();
        }
        if (getBNAMF() != null) {
            _hashCode += getBNAMF().hashCode();
        }
        if (getBNAMLONGD() != null) {
            _hashCode += getBNAMLONGD().hashCode();
        }
        if (getBNAMLONGF() != null) {
            _hashCode += getBNAMLONGF().hashCode();
        }
        if (getADNAMD() != null) {
            _hashCode += getADNAMD().hashCode();
        }
        if (getADNAMF() != null) {
            _hashCode += getADNAMF().hashCode();
        }
        if (getADNAMLONGD() != null) {
            _hashCode += getADNAMLONGD().hashCode();
        }
        if (getADNAMLONGF() != null) {
            _hashCode += getADNAMLONGF().hashCode();
        }
        if (getSIZE() != null) {
            _hashCode += getSIZE().hashCode();
        }
        if (getADINFD() != null) {
            _hashCode += getADINFD().hashCode();
        }
        if (getADINFF() != null) {
            _hashCode += getADINFF().hashCode();
        }
        if (getADINFLONGD() != null) {
            _hashCode += getADINFLONGD().hashCode();
        }
        if (getADINFLONGF() != null) {
            _hashCode += getADINFLONGF().hashCode();
        }
        if (getDSCRSWISSMEDICD() != null) {
            _hashCode += getDSCRSWISSMEDICD().hashCode();
        }
        if (getDSCRSWISSMEDICF() != null) {
            _hashCode += getDSCRSWISSMEDICF().hashCode();
        }
        if (getGENCD() != null) {
            _hashCode += getGENCD().hashCode();
        }
        if (getGENGRP() != null) {
            _hashCode += getGENGRP().hashCode();
        }
        if (getATC() != null) {
            _hashCode += getATC().hashCode();
        }
        if (getIT() != null) {
            _hashCode += getIT().hashCode();
        }
        if (getITBAG() != null) {
            _hashCode += getITBAG().hashCode();
        }
        if (getKONO() != null) {
            _hashCode += getKONO().hashCode();
        }
        if (getTRADE() != null) {
            _hashCode += getTRADE().hashCode();
        }
        if (getCDBRAND() != null) {
            _hashCode += getCDBRAND().hashCode();
        }
        if (getCDBRANDSUB() != null) {
            _hashCode += getCDBRANDSUB().hashCode();
        }
        if (getPRTNO() != null) {
            _hashCode += getPRTNO().hashCode();
        }
        if (getPRTNO2() != null) {
            _hashCode += getPRTNO2().hashCode();
        }
        if (getMONO() != null) {
            _hashCode += getMONO().hashCode();
        }
        if (getCDGALD() != null) {
            _hashCode += getCDGALD().hashCode();
        }
        if (getCDGALF() != null) {
            _hashCode += getCDGALF().hashCode();
        }
        if (getFORMD() != null) {
            _hashCode += getFORMD().hashCode();
        }
        if (getFORMF() != null) {
            _hashCode += getFORMF().hashCode();
        }
        if (getDOSE() != null) {
            _hashCode += getDOSE().hashCode();
        }
        if (getDOSEU() != null) {
            _hashCode += getDOSEU().hashCode();
        }
        if (getDRGFD() != null) {
            _hashCode += getDRGFD().hashCode();
        }
        if (getDRGFF() != null) {
            _hashCode += getDRGFF().hashCode();
        }
        if (getORPH() != null) {
            _hashCode += getORPH().hashCode();
        }
        if (getBIOPHA() != null) {
            _hashCode += getBIOPHA().hashCode();
        }
        if (getBIOSIM() != null) {
            _hashCode += getBIOSIM().hashCode();
        }
        if (getBFS() != null) {
            _hashCode += getBFS().hashCode();
        }
        if (getBLOOD() != null) {
            _hashCode += getBLOOD().hashCode();
        }
        if (getMSCD() != null) {
            _hashCode += getMSCD().hashCode();
        }
        if (getPRDIXREL() != null) {
            _hashCode += getPRDIXREL().hashCode();
        }
        if (getCDS() != null) {
            _hashCode += getCDS().hashCode();
        }
        if (getSYND() != null) {
            _hashCode += getSYND().hashCode();
        }
        if (getSYNF() != null) {
            _hashCode += getSYNF().hashCode();
        }
        if (getKP() != null) {
            _hashCode += getKP().hashCode();
        }
        if (getBFSDATA() != null) {
            _hashCode += getBFSDATA().hashCode();
        }
        if (getDRGPRICEY() != null) {
            _hashCode += getDRGPRICEY().hashCode();
        }
        if (getQAP() != null) {
            _hashCode += getQAP().hashCode();
        }
        if (getBFSDAT() != null) {
            _hashCode += getBFSDAT().hashCode();
        }
        if (getBFSCDAT() != null) {
            _hashCode += getBFSCDAT().hashCode();
        }
        if (getDRGPRICEYDAT() != null) {
            _hashCode += getDRGPRICEYDAT().hashCode();
        }
        if (getDRGPRICEYCDAT() != null) {
            _hashCode += getDRGPRICEYCDAT().hashCode();
        }
        if (getMDCLASS() != null) {
            _hashCode += getMDCLASS().hashCode();
        }
        if (getMDNB() != null) {
            _hashCode += getMDNB().hashCode();
        }
        if (getCDSMODULES() != null) {
            _hashCode += getCDSMODULES().hashCode();
        }
        if (getSMNR() != null) {
            _hashCode += getSMNR().hashCode();
        }
        if (getSMCAT() != null) {
            _hashCode += getSMCAT().hashCode();
        }
        _hashCode += (isDEL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCPT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCPT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCPT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPRDICD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPRDICD());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPRDICD(), i);
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
        new org.apache.axis.description.TypeDesc(ProductPRD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product>PRD"));
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
        elemField.setFieldName("BNAMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BNAMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BNAMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BNAMF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BNAMLONGD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BNAMLONGD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BNAMLONGF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BNAMLONGF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADNAMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADNAMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADNAMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADNAMF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADNAMLONGD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADNAMLONGD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADNAMLONGF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADNAMLONGF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIZE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SIZE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADINFD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADINFD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADINFF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADINFF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADINFLONGD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADINFLONGD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADINFLONGF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ADINFLONGF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRSWISSMEDICD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRSWISSMEDICD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DSCRSWISSMEDICF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DSCRSWISSMEDICF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GENCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GENGRP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GENGRP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ATC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "IT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITBAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ITBAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KONO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "KONO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRADE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "TRADE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDBRAND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDBRAND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDBRANDSUB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDBRANDSUB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRTNO2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRTNO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MONO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDGALD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDGALD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDGALF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDGALF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FORMD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "FORMD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FORMF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "FORMF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOSE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOSE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOSEU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DOSEU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRGFD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DRGFD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRGFF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DRGFF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORPH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ORPH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIOPHA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BIOPHA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BIOSIM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BIOSIM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>BIOSIM"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BFS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BFS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BLOOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BLOOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MSCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDIXREL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDIXREL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYND");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SYND"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYNF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SYNF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "KP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BFSDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BFSDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRGPRICEY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DRGPRICEY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QAP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "QAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BFSDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BFSDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BFSCDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "BFSCDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRGPRICEYDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DRGPRICEYDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DRGPRICEYCDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "DRGPRICEYCDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDCLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MDCLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDNB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "MDNB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDSMODULES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDSMODULES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMNR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SMNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMCAT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "SMCAT"));
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
        elemField.setFieldName("CPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>CPT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRDICD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "PRDICD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>PRDICD"));
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
