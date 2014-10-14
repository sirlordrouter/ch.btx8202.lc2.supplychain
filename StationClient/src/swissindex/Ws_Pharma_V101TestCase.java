/**
 * Ws_Pharma_V101TestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package swissindex;

public class Ws_Pharma_V101TestCase extends junit.framework.TestCase {
    public Ws_Pharma_V101TestCase(java.lang.String name) {
        super(name);
    }

    public void testws_Pharma_V101SoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101SoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new swissindex.Ws_Pharma_V101Locator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ws_Pharma_V101SoapDownloadAll() throws Exception {
        swissindex.Ws_Pharma_V101Soap_BindingStub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap_BindingStub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap();
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
        swissindex.PHARMA value = null;
        value = binding.downloadAll(new java.lang.String());
        // TBD - validate results
    }

    public void test2ws_Pharma_V101SoapDownloadByDate() throws Exception {
        swissindex.Ws_Pharma_V101Soap_BindingStub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap_BindingStub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap();
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
        swissindex.PHARMA value = null;
        value = binding.downloadByDate(java.util.Calendar.getInstance(), new java.lang.String());
        // TBD - validate results
    }

    public void test3ws_Pharma_V101SoapGetByGTIN() throws Exception {
        swissindex.Ws_Pharma_V101Soap_BindingStub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap_BindingStub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap();
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
        swissindex.PHARMA value = null;
        value = binding.getByGTIN(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test4ws_Pharma_V101SoapGetByPharmacode() throws Exception {
        swissindex.Ws_Pharma_V101Soap_BindingStub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap_BindingStub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap();
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
        swissindex.PHARMA value = null;
        value = binding.getByPharmacode(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test5ws_Pharma_V101SoapGetByDescr() throws Exception {
        swissindex.Ws_Pharma_V101Soap_BindingStub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap_BindingStub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap();
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
        swissindex.PHARMA value = null;
        value = binding.getByDescr(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void testws_Pharma_V101Soap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new swissindex.Ws_Pharma_V101Locator().getServiceName());
        assertTrue(service != null);
    }

    public void test6ws_Pharma_V101Soap12DownloadAll() throws Exception {
        swissindex.Ws_Pharma_V101Soap12Stub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap12Stub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap12();
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
        swissindex.PHARMA value = null;
        value = binding.downloadAll(new java.lang.String());
        // TBD - validate results
    }

    public void test7ws_Pharma_V101Soap12DownloadByDate() throws Exception {
        swissindex.Ws_Pharma_V101Soap12Stub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap12Stub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap12();
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
        swissindex.PHARMA value = null;
        value = binding.downloadByDate(java.util.Calendar.getInstance(), new java.lang.String());
        // TBD - validate results
    }

    public void test8ws_Pharma_V101Soap12GetByGTIN() throws Exception {
        swissindex.Ws_Pharma_V101Soap12Stub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap12Stub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap12();
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
        swissindex.PHARMA value = null;
        value = binding.getByGTIN(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test9ws_Pharma_V101Soap12GetByPharmacode() throws Exception {
        swissindex.Ws_Pharma_V101Soap12Stub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap12Stub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap12();
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
        swissindex.PHARMA value = null;
        value = binding.getByPharmacode(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test10ws_Pharma_V101Soap12GetByDescr() throws Exception {
        swissindex.Ws_Pharma_V101Soap12Stub binding;
        try {
            binding = (swissindex.Ws_Pharma_V101Soap12Stub)
                          new swissindex.Ws_Pharma_V101Locator().getws_Pharma_V101Soap12();
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
        swissindex.PHARMA value = null;
        value = binding.getByDescr(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

}
