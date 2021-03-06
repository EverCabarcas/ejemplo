
package ever.ws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebServiceUsuario", targetNamespace = "http://ws.Ever/", wsdlLocation = "http://localhost:8084/WebService/WebServiceUsuario?WSDL")
public class WebServiceUsuario_Service
    extends Service
{

    private final static URL WEBSERVICEUSUARIO_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEUSUARIO_EXCEPTION;
    private final static QName WEBSERVICEUSUARIO_QNAME = new QName("http://ws.Ever/", "WebServiceUsuario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/WebService/WebServiceUsuario?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEUSUARIO_WSDL_LOCATION = url;
        WEBSERVICEUSUARIO_EXCEPTION = e;
    }

    public WebServiceUsuario_Service() {
        super(__getWsdlLocation(), WEBSERVICEUSUARIO_QNAME);
    }

    public WebServiceUsuario_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEUSUARIO_QNAME, features);
    }

    public WebServiceUsuario_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEUSUARIO_QNAME);
    }

    public WebServiceUsuario_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEUSUARIO_QNAME, features);
    }

    public WebServiceUsuario_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceUsuario_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceUsuario
     */
    @WebEndpoint(name = "WebServiceUsuarioPort")
    public WebServiceUsuario getWebServiceUsuarioPort() {
        return super.getPort(new QName("http://ws.Ever/", "WebServiceUsuarioPort"), WebServiceUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceUsuario
     */
    @WebEndpoint(name = "WebServiceUsuarioPort")
    public WebServiceUsuario getWebServiceUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.Ever/", "WebServiceUsuarioPort"), WebServiceUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEUSUARIO_EXCEPTION!= null) {
            throw WEBSERVICEUSUARIO_EXCEPTION;
        }
        return WEBSERVICEUSUARIO_WSDL_LOCATION;
    }

}
