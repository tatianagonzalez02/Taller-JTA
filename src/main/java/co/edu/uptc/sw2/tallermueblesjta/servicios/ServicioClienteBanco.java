/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteBanco;
import co.edu.uptc.sw2.tallermueblesjta.logica.ClienteBancoLogica;
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
@Path("ServicioClienteBanco")
public class ServicioClienteBanco {
    @EJB
    private ClienteBancoLogica clienteBancoLogica;
    
    @GET
    public List<ClienteBanco> consultarClienteBanco(){
    return clienteBancoLogica.getListaClienteBanco();
    }
    @POST
    public ClienteBanco guardarClienteBanco(ClienteBanco clienteBanco){
    return clienteBancoLogica.nuevoClienteBanco(clienteBanco);
    }   
}
