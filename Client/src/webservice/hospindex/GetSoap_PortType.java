/**
 * GetSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public interface GetSoap_PortType extends java.rmi.Remote {

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetArticle: PHAR (=), PRDNO (=), DSCRD (LIKE), DSCRF
     * (LIKE), ARTBAR (= / GTIN only)</p></p><p><b>Schema Output:</b> Click
     * <a href='Schemas/OUT/DownloadArticle_out.xsd'>here</a> to open the
     * XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Article getArticle(webservice.hospindex.GetArticleInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetArticle_Proprietary_Quantity: PHAR (=)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadArticle_Proprietary_Quantity_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Article_Proprietary_Quantity getArticle_Proprietary_Quantity(webservice.hospindex.GetArticle_Proprietary_QuantityInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetArticle_Wholesaler: PHAR (=)</p></p><p><b>Schema Output:</b>
     * Click <a href='Schemas/OUT/DownloadArticle_Wholesaler_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Article_Wholesaler getArticle_Wholesaler(webservice.hospindex.GetArticle_WholesalerInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetBrevier: MONO (=), TITD (LIKE), TITF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadBrevier_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Brevier getBrevier(webservice.hospindex.GetBrevierInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCDS: PRDNO (=)</p></p><p><b>Schema Output:</b> Click
     * <a href='Schemas/OUT/DownloadCDS_out.xsd'>here</a> to open the XML
     * Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.CDS getCDS(webservice.hospindex.GetCDSInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCDSCode: CCHKEY (=), TITD (LIKE), TITF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadCDSCode_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.CDSCode getCDSCode(webservice.hospindex.GetCDSCodeInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCDSDSP: DSPNO (=), TITLED (LIKE), TITLEF (LIKE), TITLEE
     * (LIKE)</p></p><p><b>Schema Output:</b> Click <a href='Schemas/OUT/DownloadCDSDSP_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.CDSDSP getCDSDSP(webservice.hospindex.GetCDSDSPInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCode: CDTYP (=), CDVAL (=)</p></p><p><b>Schema Output:</b>
     * Click <a href='Schemas/OUT/DownloadCode_out.xsd'>here</a> to open
     * the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Code getCode(webservice.hospindex.GetCodeInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCodex: MONO (=), TITD (LIKE), TITF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadCodex_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Codex getCodex(webservice.hospindex.GetCodexInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCompany: GLN (=), NAMS (LIKE), NAML (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadCompany_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Company getCompany(webservice.hospindex.GetCompanyInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetCompendium: monidlang (=), monid (=), name (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadCOMPENDIUM_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.COMPENDIUM getCompendium(webservice.hospindex.GetCompendiumInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetInsurance: GLN (=), DESCR1 (LIKE), DESCR2 (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadInsurance_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Insurance getInsurance(webservice.hospindex.GetInsuranceInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetInteraction: IXNO (=), TITD (LIKE), TITF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadInteraction_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Interaction getInteraction(webservice.hospindex.GetInteractionInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetKompendium_Image: IMAGENAME (=)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadKompendium_Image_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Kompendium_Image getKompendium_Image(webservice.hospindex.GetKompendium_ImageInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetKompendium_Product: PRDNO (=), MONID (=)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadKompendium_Product_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Kompendium_Product getKompendium_Product(webservice.hospindex.GetKompendium_ProductInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetLimitation: LIMCD (=), DSCRD (LIKE), DSCRF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadLimitation_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Limitation getLimitation(webservice.hospindex.GetLimitationInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetProduct: PRDNO (=), DSCRD (LIKE), DSCRF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadProduct_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Product getProduct(webservice.hospindex.GetProductInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetProduct_Proprietary_Quantity: PRDNO (=)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadProduct_Proprietary_Quantity_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Product_Proprietary_Quantity getProduct_Proprietary_Quantity(webservice.hospindex.GetProduct_Proprietary_QuantityInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetProduct_Substance_Alternative_Quantity: PRDNO (=)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadProduct_Substance_Alternative_Quantity_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Product_Substance_Alternative_Quantity getProduct_Substance_Alternative_Quantity(webservice.hospindex.GetProduct_Substance_Alternative_QuantityInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetServiceProvider: GLN (=), DESCR1 (LIKE), DESCR2 (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadServiceProvider_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.ServiceProvider getServiceProvider(webservice.hospindex.GetServiceProviderInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetSubstance: SUBNO (=), NAMD (LIKE), NAMF (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadSubstance_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Substance getSubstance(webservice.hospindex.GetSubstanceInput input) throws java.rmi.RemoteException;

    /**
     * <p></p><p><b>Schema Input:</b> Click <a href='Schemas/IN/Get_in.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Input Data.</p><p><p>Possible
     * KeyTypes for GetWholesaler: WHSNO (=), WHSNAME (LIKE)</p></p><p><b>Schema
     * Output:</b> Click <a href='Schemas/OUT/DownloadWholesaler_out.xsd'>here</a>
     * to open the XML Schema (XSD) validation file for the Output Data.</p>
     */
    public webservice.hospindex.Wholesaler getWholesaler(webservice.hospindex.GetWholesalerInput input) throws java.rmi.RemoteException;
}
