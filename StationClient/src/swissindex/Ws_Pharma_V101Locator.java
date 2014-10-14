/**
 * Ws_Pharma_V101Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package swissindex;

public class Ws_Pharma_V101Locator extends org.apache.axis.client.Service implements swissindex.Ws_Pharma_V101 {

    public Ws_Pharma_V101Locator() {
    }


    public Ws_Pharma_V101Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Ws_Pharma_V101Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ws_Pharma_V101Soap
    private java.lang.String ws_Pharma_V101Soap_address = "https://swissindex.refdata.ch/Swissindex/Pharma/ws_Pharma_V101.asmx";

    public java.lang.String getws_Pharma_V101SoapAddress() {
        return ws_Pharma_V101Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ws_Pharma_V101SoapWSDDServiceName = "ws_Pharma_V101Soap";

    public java.lang.String getws_Pharma_V101SoapWSDDServiceName() {
        return ws_Pharma_V101SoapWSDDServiceName;
    }

    public void setws_Pharma_V101SoapWSDDServiceName(java.lang.String name) {
        ws_Pharma_V101SoapWSDDServiceName = name;
    }

    public swissindex.Ws_Pharma_V101Soap_PortType getws_Pharma_V101Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ws_Pharma_V101Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getws_Pharma_V101Soap(endpoint);
    }

    public swissindex.Ws_Pharma_V101Soap_PortType getws_Pharma_V101Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            swissindex.Ws_Pharma_V101Soap_BindingStub _stub = new swissindex.Ws_Pharma_V101Soap_BindingStub(portAddress, this);
            _stub.setPortName(getws_Pharma_V101SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setws_Pharma_V101SoapEndpointAddress(java.lang.String address) {
        ws_Pharma_V101Soap_address = address;
    }


    // Use to get a proxy class for ws_Pharma_V101Soap12
    private java.lang.String ws_Pharma_V101Soap12_address = "https://swissindex.refdata.ch/Swissindex/Pharma/ws_Pharma_V101.asmx";

    public java.lang.String getws_Pharma_V101Soap12Address() {
        return ws_Pharma_V101Soap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ws_Pharma_V101Soap12WSDDServiceName = "ws_Pharma_V101Soap12";

    public java.lang.String getws_Pharma_V101Soap12WSDDServiceName() {
        return ws_Pharma_V101Soap12WSDDServiceName;
    }

    public void setws_Pharma_V101Soap12WSDDServiceName(java.lang.String name) {
        ws_Pharma_V101Soap12WSDDServiceName = name;
    }

    public swissindex.Ws_Pharma_V101Soap_PortType getws_Pharma_V101Soap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ws_Pharma_V101Soap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getws_Pharma_V101Soap12(endpoint);
    }

    public swissindex.Ws_Pharma_V101Soap_PortType getws_Pharma_V101Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            swissindex.Ws_Pharma_V101Soap12Stub _stub = new swissindex.Ws_Pharma_V101Soap12Stub(portAddress, this);
            _stub.setPortName(getws_Pharma_V101Soap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setws_Pharma_V101Soap12EndpointAddress(java.lang.String address) {
        ws_Pharma_V101Soap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (swissindex.Ws_Pharma_V101Soap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                swissindex.Ws_Pharma_V101Soap_BindingStub _stub = new swissindex.Ws_Pharma_V101Soap_BindingStub(new java.net.URL(ws_Pharma_V101Soap_address), this);
                _stub.setPortName(getws_Pharma_V101SoapWSDDServiceName());
                return _stub;
            }
            if (swissindex.Ws_Pharma_V101Soap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                swissindex.Ws_Pharma_V101Soap12Stub _stub = new swissindex.Ws_Pharma_V101Soap12Stub(new java.net.URL(ws_Pharma_V101Soap12_address), this);
                _stub.setPortName(getws_Pharma_V101Soap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ws_Pharma_V101Soap".equals(inputPortName)) {
            return getws_Pharma_V101Soap();
        }
        else if ("ws_Pharma_V101Soap12".equals(inputPortName)) {
            return getws_Pharma_V101Soap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ws_Pharma_V101");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ws_Pharma_V101Soap"));
            ports.add(new javax.xml.namespace.QName("http://swissindex.e-mediat.net/SwissindexPharma_out_V101", "ws_Pharma_V101Soap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ws_Pharma_V101Soap".equals(portName)) {
            setws_Pharma_V101SoapEndpointAddress(address);
        }
        else 
if ("ws_Pharma_V101Soap12".equals(portName)) {
            setws_Pharma_V101Soap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
