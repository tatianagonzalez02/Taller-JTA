/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteTienda;
import co.edu.uptc.sw2.tallermueblesjta.logica.ClienteTiendaLogica;
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
@Path("ServicioClienteTienda")
public class ServicioClienteTienda {
    @EJB
    private ClienteTiendaLogica clienteTiendaLogica;
    
    @GET
    public List<ClienteTienda> consultarClienteTienda(){
    return clienteTiendaLogica.getListaClienteTienda();
    }
    @POST
    public ClienteTienda guardarClienteBanco(ClienteTienda clienteTienda){
    return clienteTiendaLogica.nuevoClienteTienda(clienteTienda);
    }  
}
