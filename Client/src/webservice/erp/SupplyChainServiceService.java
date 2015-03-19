
package webservice.erp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SupplyChainServiceService", targetNamespace = "http://service/", wsdlLocation = "http://supplychain.i4mi.bfh.ch:8080/SupplyChainService/services/SupplyChainService?wsdl")
public class SupplyChainServiceService
    extends Service
{

    private final static URL SUPPLYCHAINSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException SUPPLYCHAINSERVICESERVICE_EXCEPTION;
    private final static QName SUPPLYCHAINSERVICESERVICE_QNAME = new QName("http://service/", "SupplyChainServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://supplychain.i4mi.bfh.ch:8080/SupplyChainService/services/SupplyChainService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUPPLYCHAINSERVICESERVICE_WSDL_LOCATION = url;
        SUPPLYCHAINSERVICESERVICE_EXCEPTION = e;
    }

    public SupplyChainServiceService() {
        super(__getWsdlLocation(), SUPPLYCHAINSERVICESERVICE_QNAME);
    }

    public SupplyChainServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUPPLYCHAINSERVICESERVICE_QNAME, features);
    }

    public SupplyChainServiceService(URL wsdlLocation) {
        super(wsdlLocation, SUPPLYCHAINSERVICESERVICE_QNAME);
    }

    public SupplyChainServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUPPLYCHAINSERVICESERVICE_QNAME, features);
    }

    public SupplyChainServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SupplyChainServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SupplyChainService
     */
    @WebEndpoint(name = "SupplyChainServicePort")
    public SupplyChainService getSupplyChainServicePort() {
        return super.getPort(new QName("http://service/", "SupplyChainServicePort"), SupplyChainService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SupplyChainService
     */
    @WebEndpoint(name = "SupplyChainServicePort")
    public SupplyChainService getSupplyChainServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "SupplyChainServicePort"), SupplyChainService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUPPLYCHAINSERVICESERVICE_EXCEPTION!= null) {
            throw SUPPLYCHAINSERVICESERVICE_EXCEPTION;
        }
        return SUPPLYCHAINSERVICESERVICE_WSDL_LOCATION;
    }

}
