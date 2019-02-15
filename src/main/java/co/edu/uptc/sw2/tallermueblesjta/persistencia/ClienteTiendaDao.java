/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.persistencia;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteTienda;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class ClienteTiendaDao {
    @PersistenceContext(unitName="TallerJTA_MueblesFPU2")
    private EntityManager em;
    
    public List<ClienteTienda> listaClienteTienda(){
    String query="Select e from ClienteTienda e";
    return em.createQuery(query).getResultList();
    }
    
    public ClienteTienda guardarClienteTienda(ClienteTienda clienteTienda){
     em.persist(clienteTienda);
    return clienteTienda;
    }
    public ClienteTienda editarClienteTienda(ClienteTienda clienteTienda) {
        em.merge(clienteTienda);
        return clienteTienda;
    }

    public ClienteTienda eliminarClienteTienda(ClienteTienda clienteTienda) {
        em.remove(clienteTienda);
        return clienteTienda;
    }
}
