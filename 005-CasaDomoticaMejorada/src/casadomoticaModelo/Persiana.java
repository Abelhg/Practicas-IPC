package casadomoticaModelo;

/**
 * Representa una persiana con su nivel de apertura.
 * @author abeherr
 * @author hechila
 */
public class Persiana {
    
    public static final int APERTURA_MAX = 100;
    public static final int APERTURA_MIN = 0;
    
    private int apertura;
    
     /**
     * Construye e inicializa una persiana.
     * @param apertura Indica que grado de apertura tiene la persiana
     */
    public Persiana(int apertura) {
        setApertura(apertura);
    }
    
    /**
     * Devuelve el nivel de apertura actual de la persiana.
     * @return Nivel de apertura actual de la persiana
     */
    public int getApertura() {
        return apertura;
    }
    
    /**
     * Asigna un nivel de apertura a la persiana.
     * @param apertura Nuevo nivel de apertura
     */
    public void setApertura(int apertura) {
        if (apertura < APERTURA_MIN)
            this.apertura = APERTURA_MIN;
        else if (this.apertura > APERTURA_MAX)
            this.apertura = APERTURA_MAX;
        else
            this.apertura = apertura;
    }
    
}
