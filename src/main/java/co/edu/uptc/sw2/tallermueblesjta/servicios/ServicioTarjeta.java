/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.Producto;
import co.edu.uptc.sw2.tallermueblesjta.entities.Tarjeta;
import co.edu.uptc.sw2.tallermueblesjta.logica.TarjetaLogica;
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
@Path("ServicioTarjeta")
public class ServicioTarjeta {
    @EJB
    private TarjetaLogica tarjetaLogica;
    
    @GET
    public List<Tarjeta> consultarProducto(){
    return tarjetaLogica.getListaTarjeta();
    }
    @POST
    public Tarjeta guardarTarjeta(Tarjeta tarjeta){
    return tarjetaLogica.nuevaTarjeta(tarjeta);
    }   
}
