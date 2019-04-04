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
public class SistemaCalefaccion {
    
    private String nombre;
    private double temperaturaDeseada;
    private boolean encendida;
    private double temperaturaActual;
    
    /**
     * Construye e inicializa una persiana.
     * @param nombre Nombre de la persiana
     * @param temperaturaDeseada Indica la temperatura objetivo
     * @param encendida Indica si la calefaccion esta encendida o no
     * @param temperaturaActual Indica la temperatura de la calefaccion
     * 
     */
    
    public SistemaCalefaccion(String nombre, int temperaturaActual, boolean encendida, double temperaturaDeseada) {
        this.nombre = nombre;
        this.temperaturaDeseada = temperaturaDeseada;
        if (this.temperaturaDeseada<10)
            this.temperaturaDeseada = 10;
        else if (this.temperaturaDeseada >37.5)
            this.temperaturaDeseada = 37.5;
        this.encendida = encendida;
        this.temperaturaActual = temperaturaActual;
    }
    
    /**
     * @return Nombre actual de la calefaccion
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre Nombre para asignar a la calefaccion
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return temperatura objetivo de la calefaccion
     */
    public double getTemperaturaDeseada() {
        return temperaturaDeseada;
    }
    
    /**
     * @param temperaturaDeseada Temperatura que queremos
     */
    public void setTemperaturaDeseada(double temperaturaDeseada) {
        this.temperaturaDeseada = temperaturaDeseada;
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
    
     /**
     * @return Si la calefaccion esta encendida
     */
    public boolean getEncendida() {
        return encendida;
    }
    
    /**
     * @param encendida Enciende o apaga la calefaccion
     */
    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
}


