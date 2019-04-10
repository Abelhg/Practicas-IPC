package casadomoticaVista;

import casadomotica.Main;
import casadomoticaModelo.Modelo;

/**
 * Trata los eventos que le notifica la vista,
 * modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public final class PanelVistaCtrl {
    
    private final PanelVista vista;
    private final Modelo modelo;
    
    public PanelVistaCtrl(PanelVista v, Modelo m){
        vista = v;
        modelo = m;
        configurarEstancia();
    }
    
    private void configurarEstancia() {
        vista.setNombre(modelo.getNombreEstanciaActual());
        vista.setTemperaturaActual(modelo.getTemperaturaActualEstanciaActual());
    }
    
    
    
    /**
     * Vuelve a la pantalla anterior.
     */
    public void procesaCierre() {
        GestorUI.getInstancia().atras();
    }
    
}
