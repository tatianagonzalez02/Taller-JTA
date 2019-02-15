/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.tallermueblesjta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author USER-LENOVO
 */
@Entity
public class Tarjeta {
    @Id
    private float numeroTarjeta;
    private double cupoTarjeta;
    @OneToOne
    private ClienteBanco clienteBanco;

    public float getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(float numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getCupoTarjeta() {
        return cupoTarjeta;
    }

    public void setCupoTarjeta(double cupoTarjeta) {
        this.cupoTarjeta = cupoTarjeta;
    }
    
}
