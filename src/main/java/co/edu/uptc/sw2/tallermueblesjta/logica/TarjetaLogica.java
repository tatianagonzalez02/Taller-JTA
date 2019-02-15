/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.logica;

import co.edu.uptc.sw2.tallermueblesjta.entities.Tarjeta;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.TarjetaDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class TarjetaLogica {
     @EJB
public TarjetaDao tarjetaDao;

public List<Tarjeta> getListaTarjeta(){
return tarjetaDao.listaTarjetas();
}

public Tarjeta nuevaTarjeta(Tarjeta tarjeta){
return tarjetaDao.guardarTarjeta(tarjeta);
}  
}
