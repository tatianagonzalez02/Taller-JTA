/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.persistencia;

import co.edu.uptc.sw2.tallermueblesjta.entities.DetalleFactura;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER-LENOVO
 */

@Stateless
public class DetalleFacturaDao {
    @PersistenceContext(unitName="TallerJTA_MueblesFPU2")
    private EntityManager em;
    
    public List<DetalleFactura> listaDetalleFactura(){
    String query="Select e from DetalleFactura e";
    return em.createQuery(query).getResultList();
    }
//    public void calcularValorTotal(DetalleFactura detalleFactura){
//    detalleFactura.calcularTotalProducto();
//    }
    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura){
     em.persist(detalleFactura);
    return detalleFactura;
    }
    
    public DetalleFactura editarDetalleFactura(DetalleFactura detalleFactura) {
        em.merge(detalleFactura);
        return detalleFactura;
    }

    public DetalleFactura eliminarDetalleFactura(DetalleFactura detalleFactura) {
        em.remove(detalleFactura);
        return detalleFactura;
    }
}
