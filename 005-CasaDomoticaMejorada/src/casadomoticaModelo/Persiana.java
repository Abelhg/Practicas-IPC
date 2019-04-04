/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadomoticaModelo;

/**
 *
 * @author abeherr
 * @author hechila
 */
public class Persiana {
    
    private String nombre;
    private int apertura;
    
     /**
     * Construye e inicializa una persiana.
     * @param nombre Nombre de la persiana
     * @param apertura Indica que grado de apertura tiene la persiana
     */
    public Persiana(String nombre, int apertura) {
        this.nombre = nombre;
        this.apertura = apertura;
        if (this.apertura<0)
            this.apertura = 0;
        else if (this.apertura > 100)
            this.apertura = 100;
    }
    
    /**
     * @return Nombre actual de la persiana
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre Nombre para asignar a la persiana
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
