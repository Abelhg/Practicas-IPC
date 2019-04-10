package casadomoticaModelo;

/**
 * Representa una persiana.
 * @author abeherr
 * @author hechila
 */
public class Persiana {
    
    private int apertura;
    
     /**
     * Construye e inicializa una persiana.
     * @param apertura Indica que grado de apertura tiene la persiana
     */
    public Persiana(int apertura) {
        if (apertura < 0)
            this.apertura = 0;
        else if (this.apertura > 100)
            this.apertura = 100;
        else
            this.apertura = apertura;
    }
    
    /**
     * @return Apertura actual de la persiana
     */
    public int getApertura() {
        return apertura;
    }
    
    /**
     * @param apertura Nombre para asignar a la luz
     */
    public void setApertura(int apertura) {
        this.apertura = apertura;
    }
    
}
