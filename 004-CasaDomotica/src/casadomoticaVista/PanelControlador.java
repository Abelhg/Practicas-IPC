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
    public void procesaEventoEtc(){
        /**
         * Sí Héctor, se pueden pasar como argumentos las cosas
         * en vez de acceder a ellos usando vista.getEtc(), pero
         * piensa que si puedes acceder a ellos directamente desde
         * aquí, te ahorras llenar el código con más variables.
         */
        // Ejemplo
        // float num = Float.parseFloat(vista.getNumero());
        // vista.setNumero(num + 5);
    }
    
    // ...
    
}
