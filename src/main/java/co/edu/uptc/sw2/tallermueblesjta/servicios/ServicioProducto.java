/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.Producto;
import co.edu.uptc.sw2.tallermueblesjta.logica.ProductoLogica;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
@Path("ServicioProducto")
public class ServicioProducto {
    @EJB
    private ProductoLogica productoLogica;
    
    @GET
    public List<Producto> consultarProducto(){
    return productoLogica.getListaProducto();
    }
    @POST
    public Producto guardarProducto(Producto producto){
        producto.setIdProducto(productoLogica.getListaProducto().size() + 1);
    return productoLogica.nuevoProducto(producto);
    }   
}
