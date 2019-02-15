/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.logica;

import co.edu.uptc.sw2.tallermueblesjta.entities.Producto;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.ProductoDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class ProductoLogica {
     @EJB
public ProductoDao productoDao;

public List<Producto> getListaProducto(){
return productoDao.listaProducto();
}

public Producto nuevoProducto(Producto producto){
return productoDao.guardarProducto(producto);
}  
}
