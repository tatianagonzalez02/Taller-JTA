/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.persistencia;

import co.edu.uptc.sw2.tallermueblesjta.entities.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class ProductoDao {
    @PersistenceContext(unitName="TallerJTA_MueblesFPU2")
    private EntityManager em;
    
    public List<Producto> listaProducto(){
    String query="Select e from Producto e";
    return em.createQuery(query).getResultList();
    }
    
    public Producto guardarProducto(Producto producto){
     em.persist(producto);
    return producto;
    }
     public Producto editarProducto(Producto producto) {
        em.merge(producto);
        return producto;
    }

    public Producto eliminarProducto(Producto producto) {
        em.remove(producto);
        return producto;
    }
}
