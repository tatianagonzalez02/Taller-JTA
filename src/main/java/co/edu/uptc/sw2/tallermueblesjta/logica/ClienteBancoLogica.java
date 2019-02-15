/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.logica;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteBanco;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.ClienteBancoDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;


/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class ClienteBancoLogica {
     @EJB
public ClienteBancoDao clienteBancoDao;

public List<ClienteBanco> getListaClienteBanco(){
return clienteBancoDao.listaClienteBanco();
}

public ClienteBanco nuevoClienteBanco(ClienteBanco clienteBanco){
return clienteBancoDao.guardarClienteBanco(clienteBanco);
}  
}
