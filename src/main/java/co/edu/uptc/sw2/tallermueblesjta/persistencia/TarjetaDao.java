/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.persistencia;

import co.edu.uptc.sw2.tallermueblesjta.entities.Tarjeta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class TarjetaDao {
    @PersistenceContext(unitName="TallerJTA_MueblesFPU")
    private EntityManager em;
    
    public List<Tarjeta> listaTarjetas(){
    String query="Select e from Tarjeta e";
    return em.createQuery(query).getResultList();
    }
    
    public Tarjeta guardarTarjeta(Tarjeta tarjeta){
     em.persist(tarjeta);
    return tarjeta;
    }
     public Tarjeta editarEstudiante(Tarjeta tarjeta) {
        em.merge(tarjeta);
        return tarjeta;
    }

    public Tarjeta eliminarTarjeta(Tarjeta tarjeta) {
        em.remove(tarjeta);
        return tarjeta;
    }
}
