/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.logica;

import co.edu.uptc.sw2.tallermueblesjta.entities.Factura;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.DetalleFacturaDao;
//import co.edu.uptc.sw2.tallermueblesjta.persistencia.DetalleFacturaDao;
import co.edu.uptc.sw2.tallermueblesjta.persistencia.FacturaDao;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author USER-LENOVO
 */
@Stateless
public class FacturaLogica {

    @EJB
    public FacturaDao facturaDao;
    private DetalleFacturaDao detalleFacturaDao;

    public List<Factura> getListafactura() {
        return facturaDao.listaFactura();
    }

    public Factura nuevaFactura(Factura factura) {
        
        facturaDao.guardarFactura(factura);

        return factura;
    }

}
