/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Lorespitia_24
 */
@Entity
public class Factura {
    
    @Id
    private int idFactura;
    private int valorFactura;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private ClienteTienda clienteTienda;
    private Date fecha;
    @OneToMany(mappedBy = "factura",cascade={},fetch=FetchType.LAZY)
    private List<DetalleFactura> listaDetalleF;
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(int valorFactura) {
        this.valorFactura = valorFactura;
    }

    public ClienteTienda getClienteTienda() {
        return clienteTienda;
    }

    public void setClienteTienda(ClienteTienda clienteTienda) {
        this.clienteTienda = clienteTienda;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetalleFactura> getListaDetalleF() {
        return listaDetalleF;
    }

    public void setListaDetalleF(List<DetalleFactura> listaDetalleF) {
        this.listaDetalleF = listaDetalleF;
    }
    
}
