package co.edu.uptc.sw2.tallermueblesjta.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Lorespitia_24
 */
@Entity
public class ClienteTienda {
    @Id
    private float cedula;
    private String nombre;
    @OneToMany (cascade = {}, fetch = FetchType.LAZY, mappedBy = "clienteTienda")
    private List<Factura> listaFacturas;

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
    
    
    
}
