/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.Factura;
import co.edu.uptc.sw2.tallermueblesjta.logica.FacturaLogica;
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
@Path("ServicioFactura")
public class ServicioFactura {
    @EJB
    private FacturaLogica facturaLogica;
    
    @GET
    public List<Factura> consultarFactura(){
    return facturaLogica.getListafactura();
    }
    @POST
    public Factura guardarFactura(Factura factura){
        System.out.println("entre al ser+++++++++++++++++++++++++++++" + factura.getListaDetalleF().size());
    return facturaLogica.nuevaFactura(factura);
    }   
}
