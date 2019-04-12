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
    
    private String horaActual;
    private Luz luzSeleccionadaActual;
    
    private Estancia estancia;
    
    public Modelo(){ }
    
    /**
     * Asigna una nueva estancia.
     * @param estancia Nueva estancia
     */
    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }
    
    /**
     * Devuelve el nombre de la estancia.
     * @return Nombre de la estancia
     */
    public String getNombreEstancia() {
        return estancia.getNombre();
    }
    
    
            /***** TEMPERATURAS *****/
    /**
     * Devuelve la temperatura actual de la estancia.
     * @return Temperatura actual
     */
    public double getTemperaturaActualEstancia() {
        return estancia.getTemperaturaActual();
    }
    
    /**
     * Devuelve la temperatura deseada de la estancia.
     * @return Temperatura deseada
     */
    public double getTemperaturaDeseadaEstancia(){
        return estancia.getTemperaturaDeseada();
    }

    /**
     * Actualiza la temperatura deseada de la estancia.
     * @param cantidad Nueva temperatura deseada
     */
    public void cambiaTemperaturaDeseada(double cantidad){
       estancia.setTemperaturaDeseada(cantidad);
    }
    
    
            /***** HORA *****/
    /**
     * Asigna la hora actual.
     * @param hora Hora actual
     */
    public void setHoraActual(String hora) {
        horaActual = hora;
    }
    
    /**
     * Devuelve la hora actual.
     * @return Hora actual
     */
    public String getHoraActual() {
        return horaActual;
    }


            /***** LUCES *****/
    /**
     * Devuelve las luces de la estancia actual.
     * @return Lista de luces
     */
    public ArrayList<Luz> getLucesEstancia() {
        return estancia.getLuces();
    }
    
    /**
     * Devuelve la luz seleccionada actualmente.
     * @return Luz actualmente seleccionada
     */
    public Luz getSeleccionadaActual() {
        return luzSeleccionadaActual;
    }
    
    /**
     * Selecciona una nueva luz.
     * @param l Nueva luz seleccionada
     */
    public void setSeleccionadaActual(Luz l) {
        luzSeleccionadaActual = l;
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
