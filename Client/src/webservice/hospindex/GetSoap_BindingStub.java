/**
 * GetSoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class GetSoap_BindingStub extends org.apache.axis.client.Stub implements webservice.hospindex.GetSoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[22];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetArticle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetArticleInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetArticleInput"), webservice.hospindex.GetArticleInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Article"));
        oper.setReturnClass(webservice.hospindex.Article.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Article"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetArticle_Proprietary_Quantity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetArticle_Proprietary_QuantityInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetArticle_Proprietary_QuantityInput"), webservice.hospindex.GetArticle_Proprietary_QuantityInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Article_Proprietary_Quantity"));
        oper.setReturnClass(webservice.hospindex.Article_Proprietary_Quantity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Article_Proprietary_Quantity"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetArticle_Wholesaler");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetArticle_WholesalerInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetArticle_WholesalerInput"), webservice.hospindex.GetArticle_WholesalerInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Article_Wholesaler"));
        oper.setReturnClass(webservice.hospindex.Article_Wholesaler.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Article_Wholesaler"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBrevier");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetBrevierInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetBrevierInput"), webservice.hospindex.GetBrevierInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Brevier"));
        oper.setReturnClass(webservice.hospindex.Brevier.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Brevier"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCDS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCDSInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCDSInput"), webservice.hospindex.GetCDSInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">CDS"));
        oper.setReturnClass(webservice.hospindex.CDS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDS"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCDSCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCDSCodeInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCDSCodeInput"), webservice.hospindex.GetCDSCodeInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">CDSCode"));
        oper.setReturnClass(webservice.hospindex.CDSCode.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDSCode"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCDSDSP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCDSDSPInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCDSDSPInput"), webservice.hospindex.GetCDSDSPInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">CDSDSP"));
        oper.setReturnClass(webservice.hospindex.CDSDSP.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "CDSDSP"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCodeInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCodeInput"), webservice.hospindex.GetCodeInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Code"));
        oper.setReturnClass(webservice.hospindex.Code.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Code"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCodex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCodexInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCodexInput"), webservice.hospindex.GetCodexInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Codex"));
        oper.setReturnClass(webservice.hospindex.Codex.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Codex"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCompany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCompanyInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCompanyInput"), webservice.hospindex.GetCompanyInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Company"));
        oper.setReturnClass(webservice.hospindex.Company.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Company"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCompendium");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetCompendiumInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCompendiumInput"), webservice.hospindex.GetCompendiumInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">COMPENDIUM"));
        oper.setReturnClass(webservice.hospindex.COMPENDIUM.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "COMPENDIUM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInsurance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetInsuranceInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetInsuranceInput"), webservice.hospindex.GetInsuranceInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Insurance"));
        oper.setReturnClass(webservice.hospindex.Insurance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Insurance"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInteraction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetInteractionInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetInteractionInput"), webservice.hospindex.GetInteractionInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Interaction"));
        oper.setReturnClass(webservice.hospindex.Interaction.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Interaction"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKompendium_Image");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetKompendium_ImageInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetKompendium_ImageInput"), webservice.hospindex.GetKompendium_ImageInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Kompendium_Image"));
        oper.setReturnClass(webservice.hospindex.Kompendium_Image.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Kompendium_Image"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetKompendium_Product");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetKompendium_ProductInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetKompendium_ProductInput"), webservice.hospindex.GetKompendium_ProductInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Kompendium_Product"));
        oper.setReturnClass(webservice.hospindex.Kompendium_Product.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Kompendium_Product"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLimitation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetLimitationInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetLimitationInput"), webservice.hospindex.GetLimitationInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Limitation"));
        oper.setReturnClass(webservice.hospindex.Limitation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Limitation"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetProductInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetProductInput"), webservice.hospindex.GetProductInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product"));
        oper.setReturnClass(webservice.hospindex.Product.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Product"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProduct_Proprietary_Quantity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetProduct_Proprietary_QuantityInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetProduct_Proprietary_QuantityInput"), webservice.hospindex.GetProduct_Proprietary_QuantityInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product_Proprietary_Quantity"));
        oper.setReturnClass(webservice.hospindex.Product_Proprietary_Quantity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Product_Proprietary_Quantity"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProduct_Substance_Alternative_Quantity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetProduct_Substance_Alternative_QuantityInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetProduct_Substance_Alternative_QuantityInput"), webservice.hospindex.GetProduct_Substance_Alternative_QuantityInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product_Substance_Alternative_Quantity"));
        oper.setReturnClass(webservice.hospindex.Product_Substance_Alternative_Quantity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Product_Substance_Alternative_Quantity"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceProvider");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetServiceProviderInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetServiceProviderInput"), webservice.hospindex.GetServiceProviderInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">ServiceProvider"));
        oper.setReturnClass(webservice.hospindex.ServiceProvider.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "ServiceProvider"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubstance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetSubstanceInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetSubstanceInput"), webservice.hospindex.GetSubstanceInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Substance"));
        oper.setReturnClass(webservice.hospindex.Substance.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Substance"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWholesaler");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "GetWholesalerInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetWholesalerInput"), webservice.hospindex.GetWholesalerInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Wholesaler"));
        oper.setReturnClass(webservice.hospindex.Wholesaler.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.e-mediat.ch/index", "Wholesaler"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

    }

    public GetSoap_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GetSoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GetSoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>CDS>CDSPRD>PRDDSM>DSMDOS>DOSDSP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSDSP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>CDS>CDSPRD>PRDDSM>DSMDOS>DOSUNIT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDDSMDSMDOSDOSUNIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_COM>CAT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRADDR_COMCAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_COM>TYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRADDR_COMTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_ECOM>CAT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRADDR_ECOMCAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>>ServiceProvider>SP>ADDR>ADDR_ECOM>TYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRADDR_ECOMTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Article>ART>ARTBAR>CDTYP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTBARCDTYP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Article>ART>ARTCH>CHTYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTCHCHTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDCCH>CCHDSP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDCCHCCHDSP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDDSK>DSKDSP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDDSKDSKDSP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>CDS>CDSPRD>PRDDSM>DSMDOS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDDSMDSMDOS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>COMPENDIUM>CP>PARAGRAPHS>TITLE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMCPPARAGRAPHSTITLE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>ADDR>TYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSADDRTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>COM>ART");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSCOMART.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>COM>CTYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSCOMCTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>E_COM>ART");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSE_COMART.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Insurance>INS>E_COM>TYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSE_COMTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTCMP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDCPTCPTCMP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTIX");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDCPTCPTIX.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>CPTROA");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDCPTCPTROA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>CPT>DRGGRPCD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDCPTDRGGRPCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>PRDICD>RSIG");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDPRDICDRSIG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>Product>PRD>PRDICD>RTYP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDPRDICDRTYP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>ADDR_COM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRADDR_COM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>ADDR_ECOM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRADDR_ECOM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>>ServiceProvider>SP>ADDR>CAT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDRCAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTADR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTADR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTBAR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTBAR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTCH");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTCOMP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTCOMP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTDAN");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTDAN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTINS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTINS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTLIM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTLIM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTMIG");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTMIG.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTPRI");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTPRI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>ARTTYP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTARTTYP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>DEPCD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTDEPCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>GGL");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTGGL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>GRDFR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTGRDFR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>GRPCD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTGRPCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>HSCD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTHSCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>INSLIM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTINSLIM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>LOACD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTLOACD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>NOTI");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTNOTI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>PIC");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTPIC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SALECD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTSALECD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SIZE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTSIZE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>ART>SMCAT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleARTSMCAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Proprietary_Quantity>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_Proprietary_QuantityRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>AW>WHSACT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_WholesalerAWWHSACT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>AW>WHSPRI");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_WholesalerAWWHSPRI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Article_Wholesaler>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_WholesalerRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Brevier>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.BrevierRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDCCH");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDCCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDDSK");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDDSK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>CDSPRD>PRDDSM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRDPRDDSM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDS>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSCode>CCH>CCHCCH");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCodeCCHCCHCCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSCode>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCodeRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPDOC");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSPDSPDSPDOC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPLNK");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSPDSPDSPLNK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>DSP>DSPTXT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSPDSPDSPTXT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>CDSDSP>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSPRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Code>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CodeRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Codex>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CodexRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Company>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CompanyRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>CONTENT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMCPCONTENT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>NAME");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMCPNAME.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>CP>PARAGRAPHS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMCPPARAGRAPHS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>COMPENDIUM>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>ADDR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSADDR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>COM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSCOM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>E_COM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSE_COM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>REFNO");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSREFNO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>INS>ROLE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINSROLE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Insurance>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Interaction>IX>IXMCH");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InteractionIXIXMCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Interaction>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InteractionRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Kompendium_Image>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_ImageRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Kompendium_Product>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_ProductRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Limitation>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.LimitationRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>BIOSIM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDBIOSIM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>CPT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDCPT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>PRD>PRDICD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRDPRDICD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product_Proprietary_Quantity>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Proprietary_QuantityRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Product_Substance_Alternative_Quantity>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Substance_Alternative_QuantityRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>ADDR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPADDR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>NDA");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPNDA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>REFNO");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPREFNO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>ROLES");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPROLES.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>SPTYPE");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPSPTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>ServiceProvider>SP>STATUS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSPSTATUS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Substance>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.SubstanceRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>>Wholesaler>RESULT>OK_ERROR");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.WholesalerRESULTOK_ERROR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article>ART");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleART.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ArticleRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article_Proprietary_Quantity>APQ");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_Proprietary_QuantityAPQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article_Proprietary_Quantity>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_Proprietary_QuantityRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article_Wholesaler>AW");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_WholesalerAW.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Article_Wholesaler>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_WholesalerRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Brevier>BRV");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.BrevierBRV.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Brevier>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.BrevierRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDS>CDSPRD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCDSPRD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDS>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDSCode>CCH");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCodeCCH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDSCode>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCodeRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDSDSP>DSP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSPDSP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>CDSDSP>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSPRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Code>CD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CodeCD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Code>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CodeRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Codex>CDX");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CodexCDX.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Codex>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CodexRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Company>CP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CompanyCP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Company>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CompanyRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>COMPENDIUM>CP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMCP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>COMPENDIUM>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUMRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Insurance>INS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceINS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Insurance>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InsuranceRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Interaction>IX");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InteractionIX.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Interaction>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.InteractionRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Kompendium_Image>KI");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_ImageKI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Kompendium_Image>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_ImageRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Kompendium_Product>KP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_ProductKP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Kompendium_Product>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_ProductRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Limitation>LIM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.LimitationLIM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Limitation>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.LimitationRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product>PRD");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductPRD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ProductRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Proprietary_Quantity>PQ");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Proprietary_QuantityPQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Proprietary_Quantity>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Proprietary_QuantityRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Substance_Alternative_Quantity>PAQ");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Substance_Alternative_QuantityPAQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Product_Substance_Alternative_Quantity>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Substance_Alternative_QuantityRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>ServiceProvider>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>ServiceProvider>SP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProviderSP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Substance>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.SubstanceRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Substance>SB");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.SubstanceSB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Wholesaler>RESULT");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.WholesalerRESULT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">>Wholesaler>WHS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.WholesalerWHS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Article");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Article_Proprietary_Quantity");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_Proprietary_Quantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Article_Wholesaler");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Article_Wholesaler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Brevier");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Brevier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">CDS");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">CDSCode");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">CDSDSP");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.CDSDSP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Code");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Code.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Codex");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Codex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Company");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Company.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">COMPENDIUM");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.COMPENDIUM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetArticle_Proprietary_QuantityInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetArticle_Proprietary_QuantityInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetArticle_WholesalerInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetArticle_WholesalerInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetArticleInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetArticleInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetBrevierInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetBrevierInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCDSCodeInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCDSCodeInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCDSDSPInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCDSDSPInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCDSInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCDSInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCodeInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCodeInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCodexInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCodexInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCompanyInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCompanyInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetCompendiumInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetCompendiumInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetInsuranceInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetInsuranceInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetInteractionInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetInteractionInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetKompendium_ImageInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetKompendium_ImageInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetKompendium_ProductInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetKompendium_ProductInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetLimitationInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetLimitationInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetProduct_Proprietary_QuantityInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetProduct_Proprietary_QuantityInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetProduct_Substance_Alternative_QuantityInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetProduct_Substance_Alternative_QuantityInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetProductInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetProductInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetServiceProviderInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetServiceProviderInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetSubstanceInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetSubstanceInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">GetWholesalerInput");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.GetWholesalerInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Insurance");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Insurance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Interaction");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Interaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Kompendium_Image");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Kompendium_Product");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Kompendium_Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Limitation");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Limitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product_Proprietary_Quantity");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Proprietary_Quantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Product_Substance_Alternative_Quantity");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Product_Substance_Alternative_Quantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">ServiceProvider");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.ServiceProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Substance");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Substance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.e-mediat.ch/index", ">Wholesaler");
            cachedSerQNames.add(qName);
            cls = webservice.hospindex.Wholesaler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public webservice.hospindex.Article getArticle(webservice.hospindex.GetArticleInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetArticle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetArticle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Article) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Article) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Article.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Article_Proprietary_Quantity getArticle_Proprietary_Quantity(webservice.hospindex.GetArticle_Proprietary_QuantityInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetArticle_Proprietary_Quantity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetArticle_Proprietary_Quantity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Article_Proprietary_Quantity) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Article_Proprietary_Quantity) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Article_Proprietary_Quantity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Article_Wholesaler getArticle_Wholesaler(webservice.hospindex.GetArticle_WholesalerInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetArticle_Wholesaler");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetArticle_Wholesaler"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Article_Wholesaler) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Article_Wholesaler) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Article_Wholesaler.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Brevier getBrevier(webservice.hospindex.GetBrevierInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetBrevier");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBrevier"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Brevier) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Brevier) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Brevier.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.CDS getCDS(webservice.hospindex.GetCDSInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCDS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCDS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.CDS) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.CDS) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.CDS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.CDSCode getCDSCode(webservice.hospindex.GetCDSCodeInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCDSCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCDSCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.CDSCode) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.CDSCode) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.CDSCode.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.CDSDSP getCDSDSP(webservice.hospindex.GetCDSDSPInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCDSDSP");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCDSDSP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.CDSDSP) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.CDSDSP) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.CDSDSP.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Code getCode(webservice.hospindex.GetCodeInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Code) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Code) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Code.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Codex getCodex(webservice.hospindex.GetCodexInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCodex");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCodex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Codex) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Codex) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Codex.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Company getCompany(webservice.hospindex.GetCompanyInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCompany");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCompany"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Company) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Company) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Company.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.COMPENDIUM getCompendium(webservice.hospindex.GetCompendiumInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetCompendium");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCompendium"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.COMPENDIUM) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.COMPENDIUM) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.COMPENDIUM.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Insurance getInsurance(webservice.hospindex.GetInsuranceInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetInsurance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetInsurance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Insurance) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Insurance) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Insurance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Interaction getInteraction(webservice.hospindex.GetInteractionInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetInteraction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetInteraction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Interaction) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Interaction) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Interaction.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Kompendium_Image getKompendium_Image(webservice.hospindex.GetKompendium_ImageInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetKompendium_Image");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKompendium_Image"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Kompendium_Image) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Kompendium_Image) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Kompendium_Image.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Kompendium_Product getKompendium_Product(webservice.hospindex.GetKompendium_ProductInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetKompendium_Product");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetKompendium_Product"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Kompendium_Product) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Kompendium_Product) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Kompendium_Product.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Limitation getLimitation(webservice.hospindex.GetLimitationInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetLimitation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLimitation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Limitation) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Limitation) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Limitation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Product getProduct(webservice.hospindex.GetProductInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetProduct");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Product) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Product) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Product.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Product_Proprietary_Quantity getProduct_Proprietary_Quantity(webservice.hospindex.GetProduct_Proprietary_QuantityInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetProduct_Proprietary_Quantity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProduct_Proprietary_Quantity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Product_Proprietary_Quantity) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Product_Proprietary_Quantity) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Product_Proprietary_Quantity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Product_Substance_Alternative_Quantity getProduct_Substance_Alternative_Quantity(webservice.hospindex.GetProduct_Substance_Alternative_QuantityInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetProduct_Substance_Alternative_Quantity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProduct_Substance_Alternative_Quantity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Product_Substance_Alternative_Quantity) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Product_Substance_Alternative_Quantity) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Product_Substance_Alternative_Quantity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.ServiceProvider getServiceProvider(webservice.hospindex.GetServiceProviderInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetServiceProvider");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetServiceProvider"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.ServiceProvider) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.ServiceProvider) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.ServiceProvider.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Substance getSubstance(webservice.hospindex.GetSubstanceInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetSubstance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSubstance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Substance) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Substance) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Substance.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public webservice.hospindex.Wholesaler getWholesaler(webservice.hospindex.GetWholesalerInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.e-mediat.ch/index/GetWholesaler");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWholesaler"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (webservice.hospindex.Wholesaler) _resp;
            } catch (java.lang.Exception _exception) {
                return (webservice.hospindex.Wholesaler) org.apache.axis.utils.JavaUtils.convert(_resp, webservice.hospindex.Wholesaler.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
