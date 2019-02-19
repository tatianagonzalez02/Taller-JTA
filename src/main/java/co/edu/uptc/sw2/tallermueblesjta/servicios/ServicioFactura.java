/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.servicios;

import co.edu.uptc.sw2.tallermueblesjta.entities.ClienteTienda;
import co.edu.uptc.sw2.tallermueblesjta.entities.DetalleFactura;
import co.edu.uptc.sw2.tallermueblesjta.entities.Factura;
import static co.edu.uptc.sw2.tallermueblesjta.entities.Factura_.listaDetalleF;
import co.edu.uptc.sw2.tallermueblesjta.entities.Producto;
import co.edu.uptc.sw2.tallermueblesjta.logica.FacturaLogica;
import java.util.Date;
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
    private ServicioDetalleFactura detalleFactura;
    
    @GET
    public List<Factura> consultarFactura(){
    return facturaLogica.getListafactura();
    }
    @POST
    public Factura guardarFactura(Factura factura){
      ClienteTienda cliente=new ClienteTienda();
      cliente.setCedula(1045938933);
      cliente.setNombre( "Roberto patiño");
      Producto p=new Producto();
      p.setIdProducto(6);
      p.setNombre("Librero");
      p.setValor(150000);
        DetalleFactura detalleFactura= new DetalleFactura();
        detalleFactura.setIdDetalle(1);
        detalleFactura.setProducto(p);
        detalleFactura.setCantidad(2);
        detalleFactura.setTotalProducto(p.getValor()*detalleFactura.getCantidad());
              
      Factura factura1= new Factura();
      factura1.setIdFactura(1);
      factura1.setClienteTienda(cliente);
      factura1.setValorFactura(780000);
      factura1.setFecha(new Date());
      List<DetalleFactura> list=null;
      list.add(detalleFactura);
      factura1.setListaDetalleF(list);
     System.out.println("entre al ser+++++++++++++++++++++++++++++" + factura1.getListaDetalleF().size());
      facturaLogica.nuevaFactura(factura1);
      
//    return facturaLogica.nuevaFactura(factura);
return facturaLogica.nuevaFactura(factura1);
    }   
}
