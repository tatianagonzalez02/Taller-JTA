/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.logica;

import co.edu.uptc.sw2.tallermueblesjta.entities.DetalleFactura;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.DetalleFacturaDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class DetalleFacturaLogica {
     @EJB
public DetalleFacturaDao detalleFacturaDao;

public List<DetalleFactura> getListaDetalleFactura(){
return detalleFacturaDao.listaDetalleFactura();
}

public DetalleFactura nuevoDetalleFactura(DetalleFactura detalleFactura){
//detalleFacturaDao.calcularValorTotal(detalleFactura);
    System.out.println("calcule el total");
    return detalleFacturaDao.guardarDetalleFactura(detalleFactura);
}  
}
