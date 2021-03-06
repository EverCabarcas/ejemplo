
package ever.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceUsuario", targetNamespace = "http://ws.Ever/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceUsuario {


    /**
     * 
     * @param password
     * @param nombre
     */
    @WebMethod(operationName = "AgregarUsuario")
    @RequestWrapper(localName = "AgregarUsuario", targetNamespace = "http://ws.Ever/", className = "ever.ws.AgregarUsuario")
    @ResponseWrapper(localName = "AgregarUsuarioResponse", targetNamespace = "http://ws.Ever/", className = "ever.ws.AgregarUsuarioResponse")
    @Action(input = "http://ws.Ever/WebServiceUsuario/AgregarUsuarioRequest", output = "http://ws.Ever/WebServiceUsuario/AgregarUsuarioResponse")
    public void agregarUsuario(
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

}
