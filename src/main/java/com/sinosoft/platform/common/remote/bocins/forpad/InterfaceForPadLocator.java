/**
 * InterfaceForPadLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sinosoft.platform.common.remote.bocins.forpad;

import java.util.Properties;

import cn.com.sinosoft.mobileplat.common.util.PubTools;

public class InterfaceForPadLocator extends org.apache.axis.client.Service implements com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPad {
	private static Properties properties;
	// Use to get a proxy class for InterfaceForPadHttpPort
    private java.lang.String InterfaceForPadHttpPort_address;
	static{
		properties =new PubTools().getProperties("WebServiceURL.properties");
	}
	{
		InterfaceForPadHttpPort_address = properties.getProperty("cds");
	}
    public InterfaceForPadLocator() {
    }


    public InterfaceForPadLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InterfaceForPadLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    

    public java.lang.String getInterfaceForPadHttpPortAddress() {
        return InterfaceForPadHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InterfaceForPadHttpPortWSDDServiceName = "InterfaceForPadHttpPort";

    public java.lang.String getInterfaceForPadHttpPortWSDDServiceName() {
        return InterfaceForPadHttpPortWSDDServiceName;
    }

    public void setInterfaceForPadHttpPortWSDDServiceName(java.lang.String name) {
        InterfaceForPadHttpPortWSDDServiceName = name;
    }

    public com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadPortType getInterfaceForPadHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InterfaceForPadHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInterfaceForPadHttpPort(endpoint);
    }

    public com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadPortType getInterfaceForPadHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadHttpBindingStub _stub = new com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadHttpBindingStub(portAddress, this);
            _stub.setPortName(getInterfaceForPadHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInterfaceForPadHttpPortEndpointAddress(java.lang.String address) {
        InterfaceForPadHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadHttpBindingStub _stub = new com.sinosoft.platform.common.remote.bocins.forpad.InterfaceForPadHttpBindingStub(new java.net.URL(InterfaceForPadHttpPort_address), this);
                _stub.setPortName(getInterfaceForPadHttpPortWSDDServiceName());
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
        if ("InterfaceForPadHttpPort".equals(inputPortName)) {
            return getInterfaceForPadHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://forpad.bocins.remote.common.platform.sinosoft.com", "InterfaceForPad");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://forpad.bocins.remote.common.platform.sinosoft.com", "InterfaceForPadHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InterfaceForPadHttpPort".equals(portName)) {
            setInterfaceForPadHttpPortEndpointAddress(address);
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
