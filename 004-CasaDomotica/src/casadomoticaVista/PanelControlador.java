package casadomoticaVista;

import casadomoticaModelo.PanelModelo;

/**
 * Trata los eventos que le notifica la vista,
 * modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public class PanelControlador {
    private PanelVista vista;
    private PanelModelo modelo;
    
    public PanelControlador(PanelVista v, PanelModelo m){
        vista = v;
        modelo = m;
    }
    
    /* Funciones para procesar eventos de la vista */
    
    /**
     * Procesa el evento etc de la vista.
     */
    public void cambiaValorSlider(){
       modelo.setPorcentaje(vista.getTextSlider());
       vista.setTextSlider();
    }
    
}
