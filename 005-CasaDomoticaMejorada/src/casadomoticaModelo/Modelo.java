package casadomoticaModelo;


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
    
    public String getNombreEstanciaActual() {
        return estancia.getNombre();
    }
    
    public double getTemperaturaActualEstanciaActual() {
        return estancia.getTemperaturaActual();
    }
    
    
    
    public void enciendeLuz(int i) {
        estancia.getLuz(i).setEncendida(true);
    }
    
    public void apagaLuz(int i) {
        estancia.getLuz(i).setEncendida(false);
    }
    
}
