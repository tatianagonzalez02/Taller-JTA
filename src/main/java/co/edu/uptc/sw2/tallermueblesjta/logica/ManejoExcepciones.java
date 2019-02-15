
package co.edu.uptc.sw2.tallermueblesjta.logica;

/**
 *
 * @author USER-LENOVO
 */
@javax.ejb.ApplicationException(rollback = true)
public class ManejoExcepciones extends RuntimeException{
    public ManejoExcepciones(String mensaje) {
        super(mensaje);
    }
}
