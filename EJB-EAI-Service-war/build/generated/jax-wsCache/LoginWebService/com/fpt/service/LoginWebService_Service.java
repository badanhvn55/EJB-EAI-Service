
package com.fpt.service;

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
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LoginWebService", targetNamespace = "http://service.fpt.com/", wsdlLocation = "http://localhost:8080/EJB-EAI-Service-war/LoginWebService?WSDL")
public class LoginWebService_Service
    extends Service
{

    private final static URL LOGINWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOGINWEBSERVICE_EXCEPTION;
    private final static QName LOGINWEBSERVICE_QNAME = new QName("http://service.fpt.com/", "LoginWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EJB-EAI-Service-war/LoginWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGINWEBSERVICE_WSDL_LOCATION = url;
        LOGINWEBSERVICE_EXCEPTION = e;
    }

    public LoginWebService_Service() {
        super(__getWsdlLocation(), LOGINWEBSERVICE_QNAME);
    }

    public LoginWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGINWEBSERVICE_QNAME, features);
    }

    public LoginWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGINWEBSERVICE_QNAME);
    }

    public LoginWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGINWEBSERVICE_QNAME, features);
    }

    public LoginWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoginWebService
     */
    @WebEndpoint(name = "LoginWebServicePort")
    public LoginWebService getLoginWebServicePort() {
        return super.getPort(new QName("http://service.fpt.com/", "LoginWebServicePort"), LoginWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginWebService
     */
    @WebEndpoint(name = "LoginWebServicePort")
    public LoginWebService getLoginWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.fpt.com/", "LoginWebServicePort"), LoginWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGINWEBSERVICE_EXCEPTION!= null) {
            throw LOGINWEBSERVICE_EXCEPTION;
        }
        return LOGINWEBSERVICE_WSDL_LOCATION;
    }

}
