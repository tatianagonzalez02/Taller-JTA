package co.edu.uptc.sw2.tallermueblesjta.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author USER-LENOVO
 */
@Entity
public class ClienteBanco {
    @Id
    private float cedula;
    private String nombre;
    @OneToOne (mappedBy = "clienteBanco")
    private Tarjeta tarjeta;

    public float getCedula() {
        return cedula;
    }

    public void setCedula(float cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
}
