/**
 * ValidarLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.everis.tallerjava.webServices;

public class ValidarLoginServiceLocator extends org.apache.axis.client.Service implements mx.com.everis.tallerjava.webServices.ValidarLoginService {

    public ValidarLoginServiceLocator() {
    }


    public ValidarLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ValidarLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ValidarLoginPort
    private java.lang.String ValidarLoginPort_address = "http://localhost:9998/TareaLoginWS/ValidarLoginService";

    public java.lang.String getValidarLoginPortAddress() {
        return ValidarLoginPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ValidarLoginPortWSDDServiceName = "ValidarLoginPort";

    public java.lang.String getValidarLoginPortWSDDServiceName() {
        return ValidarLoginPortWSDDServiceName;
    }

    public void setValidarLoginPortWSDDServiceName(java.lang.String name) {
        ValidarLoginPortWSDDServiceName = name;
    }

    public mx.com.everis.tallerjava.webServices.ValidarLogin getValidarLoginPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ValidarLoginPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getValidarLoginPort(endpoint);
    }

    public mx.com.everis.tallerjava.webServices.ValidarLogin getValidarLoginPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mx.com.everis.tallerjava.webServices.ValidarLoginPortBindingStub _stub = new mx.com.everis.tallerjava.webServices.ValidarLoginPortBindingStub(portAddress, this);
            _stub.setPortName(getValidarLoginPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setValidarLoginPortEndpointAddress(java.lang.String address) {
        ValidarLoginPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mx.com.everis.tallerjava.webServices.ValidarLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                mx.com.everis.tallerjava.webServices.ValidarLoginPortBindingStub _stub = new mx.com.everis.tallerjava.webServices.ValidarLoginPortBindingStub(new java.net.URL(ValidarLoginPort_address), this);
                _stub.setPortName(getValidarLoginPortWSDDServiceName());
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
        if ("ValidarLoginPort".equals(inputPortName)) {
            return getValidarLoginPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webServices.tallerjava.everis.com.mx/", "ValidarLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webServices.tallerjava.everis.com.mx/", "ValidarLoginPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ValidarLoginPort".equals(portName)) {
            setValidarLoginPortEndpointAddress(address);
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
