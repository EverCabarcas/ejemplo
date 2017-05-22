/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ever.ws;

import Ever.dao.DaoUsuarios;
import Ever.dao.Fabricadao;
import Ever.entidades.Usuarios;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ever
 */
@WebService(serviceName = "WebServiceUsuario")
public class WebServiceUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AgregarUsuario")
    public void AgregarUsuario(@WebParam(name = "password") String password, @WebParam(name = "nombre") String nombre) {
       Usuarios al = new Usuarios();
       al.setPassword(password);
       al.setNombre(nombre);
       DaoUsuarios dao = Fabricadao.getDaoUsuarios();
       dao.create(al);
    }
}
