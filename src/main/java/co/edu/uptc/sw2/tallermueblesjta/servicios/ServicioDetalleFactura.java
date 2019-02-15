/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.DetalleFactura;
import co.edu.uptc.sw2.tallermueblesjta.logica.DetalleFacturaLogica;
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
@Path("ServicioDetalleFactura")
public class ServicioDetalleFactura {
    @EJB
    private DetalleFacturaLogica detalleFacturaLogica;
    
    @GET
    public List<DetalleFactura> consultarDetalleFactura(){
      return detalleFacturaLogica.getListaDetalleFactura();
    }
    @POST
    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura){
          detalleFactura.setIdDetalle(detalleFacturaLogica.getListaDetalleFactura().size() + 1);
          return detalleFacturaLogica.nuevoDetalleFactura(detalleFactura);
    }   
}
