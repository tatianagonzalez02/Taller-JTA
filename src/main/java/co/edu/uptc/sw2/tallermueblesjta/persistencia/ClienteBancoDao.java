/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.persistencia;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteBanco;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class ClienteBancoDao {
    @PersistenceContext(unitName="TallerJTA_MueblesFPU")
    private EntityManager em;
    
    public List<ClienteBanco> listaClienteBanco(){
    String query="Select e from ClienteBanco e";
    return em.createQuery(query).getResultList();
    }
    
    public ClienteBanco guardarClienteBanco(ClienteBanco clienteBanco){
     em.persist(clienteBanco);
    return clienteBanco;
    }
    public ClienteBanco editarClienteBanco(ClienteBanco clienteBanco) {
        em.merge(clienteBanco);
        return clienteBanco;
    }

    public ClienteBanco eliminarClienteBanco(ClienteBanco clienteBanco) {
        em.remove(clienteBanco);
        return clienteBanco;
    }
}
