package casadomotica.vista;

import casadomotica.modelo.PanelModelo;

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
}
