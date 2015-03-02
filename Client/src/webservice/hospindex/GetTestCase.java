/**
 * GetTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice.hospindex;

public class GetTestCase extends junit.framework.TestCase {
    public GetTestCase(java.lang.String name) {
        super(name);
    }

    public void testgetSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new webservice.hospindex.GetLocator().getgetSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new webservice.hospindex.GetLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1getSoapGetArticle() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Article value = null;
        value = binding.getArticle(new webservice.hospindex.GetArticleInput());
        // TBD - validate results
    }

    public void test2getSoapGetArticle_Proprietary_Quantity() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Article_Proprietary_Quantity value = null;
        value = binding.getArticle_Proprietary_Quantity(new webservice.hospindex.GetArticle_Proprietary_QuantityInput());
        // TBD - validate results
    }

    public void test3getSoapGetArticle_Wholesaler() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Article_Wholesaler value = null;
        value = binding.getArticle_Wholesaler(new webservice.hospindex.GetArticle_WholesalerInput());
        // TBD - validate results
    }

    public void test4getSoapGetBrevier() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Brevier value = null;
        value = binding.getBrevier(new webservice.hospindex.GetBrevierInput());
        // TBD - validate results
    }

    public void test5getSoapGetCDS() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.CDS value = null;
        value = binding.getCDS(new webservice.hospindex.GetCDSInput());
        // TBD - validate results
    }

    public void test6getSoapGetCDSCode() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.CDSCode value = null;
        value = binding.getCDSCode(new webservice.hospindex.GetCDSCodeInput());
        // TBD - validate results
    }

    public void test7getSoapGetCDSDSP() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.CDSDSP value = null;
        value = binding.getCDSDSP(new webservice.hospindex.GetCDSDSPInput());
        // TBD - validate results
    }

    public void test8getSoapGetCode() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Code value = null;
        value = binding.getCode(new webservice.hospindex.GetCodeInput());
        // TBD - validate results
    }

    public void test9getSoapGetCodex() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Codex value = null;
        value = binding.getCodex(new webservice.hospindex.GetCodexInput());
        // TBD - validate results
    }

    public void test10getSoapGetCompany() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Company value = null;
        value = binding.getCompany(new webservice.hospindex.GetCompanyInput());
        // TBD - validate results
    }

    public void test11getSoapGetCompendium() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.COMPENDIUM value = null;
        value = binding.getCompendium(new webservice.hospindex.GetCompendiumInput());
        // TBD - validate results
    }

    public void test12getSoapGetInsurance() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Insurance value = null;
        value = binding.getInsurance(new webservice.hospindex.GetInsuranceInput());
        // TBD - validate results
    }

    public void test13getSoapGetInteraction() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Interaction value = null;
        value = binding.getInteraction(new webservice.hospindex.GetInteractionInput());
        // TBD - validate results
    }

    public void test14getSoapGetKompendium_Image() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Kompendium_Image value = null;
        value = binding.getKompendium_Image(new webservice.hospindex.GetKompendium_ImageInput());
        // TBD - validate results
    }

    public void test15getSoapGetKompendium_Product() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Kompendium_Product value = null;
        value = binding.getKompendium_Product(new webservice.hospindex.GetKompendium_ProductInput());
        // TBD - validate results
    }

    public void test16getSoapGetLimitation() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Limitation value = null;
        value = binding.getLimitation(new webservice.hospindex.GetLimitationInput());
        // TBD - validate results
    }

    public void test17getSoapGetProduct() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Product value = null;
        value = binding.getProduct(new webservice.hospindex.GetProductInput());
        // TBD - validate results
    }

    public void test18getSoapGetProduct_Proprietary_Quantity() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Product_Proprietary_Quantity value = null;
        value = binding.getProduct_Proprietary_Quantity(new webservice.hospindex.GetProduct_Proprietary_QuantityInput());
        // TBD - validate results
    }

    public void test19getSoapGetProduct_Substance_Alternative_Quantity() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Product_Substance_Alternative_Quantity value = null;
        value = binding.getProduct_Substance_Alternative_Quantity(new webservice.hospindex.GetProduct_Substance_Alternative_QuantityInput());
        // TBD - validate results
    }

    public void test20getSoapGetServiceProvider() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.ServiceProvider value = null;
        value = binding.getServiceProvider(new webservice.hospindex.GetServiceProviderInput());
        // TBD - validate results
    }

    public void test21getSoapGetSubstance() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Substance value = null;
        value = binding.getSubstance(new webservice.hospindex.GetSubstanceInput());
        // TBD - validate results
    }

    public void test22getSoapGetWholesaler() throws Exception {
        webservice.hospindex.GetSoap_BindingStub binding;
        try {
            binding = (webservice.hospindex.GetSoap_BindingStub)
                          new webservice.hospindex.GetLocator().getgetSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Wholesaler value = null;
        value = binding.getWholesaler(new webservice.hospindex.GetWholesalerInput());
        // TBD - validate results
    }

    public void testgetSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new webservice.hospindex.GetLocator().getgetSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new webservice.hospindex.GetLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test23getSoap12GetArticle() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Article value = null;
        value = binding.getArticle(new webservice.hospindex.GetArticleInput());
        // TBD - validate results
    }

    public void test24getSoap12GetArticle_Proprietary_Quantity() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Article_Proprietary_Quantity value = null;
        value = binding.getArticle_Proprietary_Quantity(new webservice.hospindex.GetArticle_Proprietary_QuantityInput());
        // TBD - validate results
    }

    public void test25getSoap12GetArticle_Wholesaler() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Article_Wholesaler value = null;
        value = binding.getArticle_Wholesaler(new webservice.hospindex.GetArticle_WholesalerInput());
        // TBD - validate results
    }

    public void test26getSoap12GetBrevier() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Brevier value = null;
        value = binding.getBrevier(new webservice.hospindex.GetBrevierInput());
        // TBD - validate results
    }

    public void test27getSoap12GetCDS() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.CDS value = null;
        value = binding.getCDS(new webservice.hospindex.GetCDSInput());
        // TBD - validate results
    }

    public void test28getSoap12GetCDSCode() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.CDSCode value = null;
        value = binding.getCDSCode(new webservice.hospindex.GetCDSCodeInput());
        // TBD - validate results
    }

    public void test29getSoap12GetCDSDSP() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.CDSDSP value = null;
        value = binding.getCDSDSP(new webservice.hospindex.GetCDSDSPInput());
        // TBD - validate results
    }

    public void test30getSoap12GetCode() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Code value = null;
        value = binding.getCode(new webservice.hospindex.GetCodeInput());
        // TBD - validate results
    }

    public void test31getSoap12GetCodex() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Codex value = null;
        value = binding.getCodex(new webservice.hospindex.GetCodexInput());
        // TBD - validate results
    }

    public void test32getSoap12GetCompany() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Company value = null;
        value = binding.getCompany(new webservice.hospindex.GetCompanyInput());
        // TBD - validate results
    }

    public void test33getSoap12GetCompendium() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.COMPENDIUM value = null;
        value = binding.getCompendium(new webservice.hospindex.GetCompendiumInput());
        // TBD - validate results
    }

    public void test34getSoap12GetInsurance() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Insurance value = null;
        value = binding.getInsurance(new webservice.hospindex.GetInsuranceInput());
        // TBD - validate results
    }

    public void test35getSoap12GetInteraction() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Interaction value = null;
        value = binding.getInteraction(new webservice.hospindex.GetInteractionInput());
        // TBD - validate results
    }

    public void test36getSoap12GetKompendium_Image() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Kompendium_Image value = null;
        value = binding.getKompendium_Image(new webservice.hospindex.GetKompendium_ImageInput());
        // TBD - validate results
    }

    public void test37getSoap12GetKompendium_Product() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Kompendium_Product value = null;
        value = binding.getKompendium_Product(new webservice.hospindex.GetKompendium_ProductInput());
        // TBD - validate results
    }

    public void test38getSoap12GetLimitation() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Limitation value = null;
        value = binding.getLimitation(new webservice.hospindex.GetLimitationInput());
        // TBD - validate results
    }

    public void test39getSoap12GetProduct() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Product value = null;
        value = binding.getProduct(new webservice.hospindex.GetProductInput());
        // TBD - validate results
    }

    public void test40getSoap12GetProduct_Proprietary_Quantity() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Product_Proprietary_Quantity value = null;
        value = binding.getProduct_Proprietary_Quantity(new webservice.hospindex.GetProduct_Proprietary_QuantityInput());
        // TBD - validate results
    }

    public void test41getSoap12GetProduct_Substance_Alternative_Quantity() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Product_Substance_Alternative_Quantity value = null;
        value = binding.getProduct_Substance_Alternative_Quantity(new webservice.hospindex.GetProduct_Substance_Alternative_QuantityInput());
        // TBD - validate results
    }

    public void test42getSoap12GetServiceProvider() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.ServiceProvider value = null;
        value = binding.getServiceProvider(new webservice.hospindex.GetServiceProviderInput());
        // TBD - validate results
    }

    public void test43getSoap12GetSubstance() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Substance value = null;
        value = binding.getSubstance(new webservice.hospindex.GetSubstanceInput());
        // TBD - validate results
    }

    public void test44getSoap12GetWholesaler() throws Exception {
        webservice.hospindex.GetSoap12Stub binding;
        try {
            binding = (webservice.hospindex.GetSoap12Stub)
                          new webservice.hospindex.GetLocator().getgetSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        webservice.hospindex.Wholesaler value = null;
        value = binding.getWholesaler(new webservice.hospindex.GetWholesalerInput());
        // TBD - validate results
    }

}
