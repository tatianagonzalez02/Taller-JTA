/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.logica;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteTienda;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.ClienteTiendaDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class ClienteTiendaLogica {
     @EJB
public ClienteTiendaDao clienteTiendaDao;

public List<ClienteTienda> getListaClienteTienda(){
return clienteTiendaDao.listaClienteTienda();
}

public ClienteTienda nuevoClienteTienda(ClienteTienda clienteTienda){
return clienteTiendaDao.guardarClienteTienda(clienteTienda);
}  
}
