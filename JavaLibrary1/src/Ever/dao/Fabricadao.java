/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ever.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.exceptions.PersistenceUnitLoadingException;

/**
 *
 * @author Ever
 */
public class Fabricadao {
    private static Fabricadao instancia;
    private static EntityManagerFactory emf;
    
    
    private Fabricadao(){
    
    }
    
    private static Fabricadao getInstancia(){
       if(instancia == null){
           instancia = new Fabricadao();
       } 
       emf = Persistence.createEntityManagerFactory("JavaLibrary1PU");
       return instancia;
    }
    
    public static DaoUsuarios getDaoUsuarios(){
        return new DaoUsuarios(getInstancia().emf);
    }
}
