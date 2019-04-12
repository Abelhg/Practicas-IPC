/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casadomoticaModelo;

/**
 * @author abeherr
 * @author hechila
 */
public class SistemaTemperatura {
    // CONSTANTES
    public static final int APAGADA = 0;
    public static final int ENFRIANDO = 1;
    public static final int CALENTANDO = 2;
    
    private static final double MARGEN = 0.5;
    
    private double temperaturaDeseada;
    private double temperaturaActual;
    private int estado;
    
    /**
     * Construye e inicializa un sistema de calefaccion.
     * @param temperaturaDeseada Indica la temperatura objetivo
     * @param temperaturaActual Indica la temperatura de la calefaccion
     * 
     */
    public SistemaTemperatura(double temperaturaDeseada, double temperaturaActual) {
        setTemperaturaDeseada(temperaturaDeseada);
        this.temperaturaActual = temperaturaActual;
        estado = APAGADA;
    }

    /**
     * @return temperatura objetivo de la calefaccion
     */
    public double getTemperaturaDeseada() {
        return temperaturaDeseada;
    }
    
    /**
     * @param temperaturaDeseada Temperatura que queremos.
     */
    public void setTemperaturaDeseada(double temperaturaDeseada) {
        this.temperaturaDeseada = temperaturaDeseada;
        if (this.temperaturaDeseada < 10)
            this.temperaturaDeseada = 10;
        else if (this.temperaturaDeseada > 37.5)
            this.temperaturaDeseada = 37.5;
    }
    
     /**
     * @return temperatura actual de la calefaccion
     */
    public double getTemperaturaActual() {
        return temperaturaActual;
    }
    
    /**
     * @param temperaturaActual Actualiza la temperatura ambiente
     */
    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }
    
    public int getEstado() {
        if(temperaturaActual <= (temperaturaDeseada - MARGEN))
            estado = CALENTANDO;
        else if(temperaturaActual >= (temperaturaDeseada + MARGEN))    
            estado = ENFRIANDO;
        else
            estado = APAGADA;
        
        return estado;
    }
    
}


