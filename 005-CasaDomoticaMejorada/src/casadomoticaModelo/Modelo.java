package casadomoticaModelo;

import java.util.ArrayList;

/**
 * Contiene la información de la aplicación. 
 * El controlador le modifica y la vista le consulta.
 * 
 * @author abeherr
 * @author hechila
 */
public class Modelo {
    
    private Estancia estancia;
    
    public Modelo(){ }
    
    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }
    
    public String getNombreEstancia() {
        return estancia.getNombre();
    }
    
    public double getTemperaturaActualEstancia() {
        return estancia.getTemperaturaActual();
    }
    
    
    /***** LUCES *****/
    
    /**
     * Devuelve las luces de la estancia actual.
     * @return Lista de luces
     */
    public ArrayList<Luz> getLucesEstancia() {
        return estancia.getLuces();
    }
    
    
    
    /***** PERSIANAS *****/
    
    /**
     * Devuelve las persianas de la estancia actual.
     * @return Lista de persianas
     */
    public ArrayList<Persiana> getPersianasEstancia() {
        return estancia.getPersianas();
    }
    
    
    
}
