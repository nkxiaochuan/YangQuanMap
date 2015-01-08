/**
 * CheckInterServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.cis.claim.car.interf.check.service.facade;

import java.util.Properties;

import cn.com.sinosoft.mobileplat.common.util.PubTools;

public class CheckInterServiceLocator extends org.apache.axis.client.Service implements cn.com.cis.claim.car.interf.check.service.facade.CheckInterService {

	private static Properties properties;
	// Use to get a proxy class for InterfaceForPadHttpPort
    private java.lang.String CheckInterServiceHttpPort_address;
	static{
		properties =new PubTools().getProperties("WebServiceURL.properties");
	}
	{
		CheckInterServiceHttpPort_address = properties.getProperty("claim") + "/claim/service/moblieCheck";
	}
	
    public CheckInterServiceLocator() {
    }


    public CheckInterServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CheckInterServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CheckInterServiceHttpPort
//    private java.lang.String CheckInterServiceHttpPort_address = "http://localhost:7001/claim/service/moblieCheck";

    public java.lang.String getCheckInterServiceHttpPortAddress() {
        return CheckInterServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CheckInterServiceHttpPortWSDDServiceName = "CheckInterServiceHttpPort";

    public java.lang.String getCheckInterServiceHttpPortWSDDServiceName() {
        return CheckInterServiceHttpPortWSDDServiceName;
    }

    public void setCheckInterServiceHttpPortWSDDServiceName(java.lang.String name) {
        CheckInterServiceHttpPortWSDDServiceName = name;
    }

    public cn.com.cis.claim.car.interf.check.service.facade.CheckInterServicePortType getCheckInterServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CheckInterServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCheckInterServiceHttpPort(endpoint);
    }

    public cn.com.cis.claim.car.interf.check.service.facade.CheckInterServicePortType getCheckInterServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.cis.claim.car.interf.check.service.facade.CheckInterServiceHttpBindingStub _stub = new cn.com.cis.claim.car.interf.check.service.facade.CheckInterServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getCheckInterServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCheckInterServiceHttpPortEndpointAddress(java.lang.String address) {
        CheckInterServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.cis.claim.car.interf.check.service.facade.CheckInterServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.cis.claim.car.interf.check.service.facade.CheckInterServiceHttpBindingStub _stub = new cn.com.cis.claim.car.interf.check.service.facade.CheckInterServiceHttpBindingStub(new java.net.URL(CheckInterServiceHttpPort_address), this);
                _stub.setPortName(getCheckInterServiceHttpPortWSDDServiceName());
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
        if ("CheckInterServiceHttpPort".equals(inputPortName)) {
            return getCheckInterServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "CheckInterService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://facade.service.check.interf.car.claim.cis.com.cn", "CheckInterServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CheckInterServiceHttpPort".equals(portName)) {
            setCheckInterServiceHttpPortEndpointAddress(address);
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
