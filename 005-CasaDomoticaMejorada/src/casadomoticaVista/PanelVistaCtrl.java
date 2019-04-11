package casadomoticaVista;

import casadomoticaModelo.Modelo;
import javax.swing.JFrame;

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
        vista.setNombre(modelo.getNombreEstancia());
        vista.setTemperaturaActual(modelo.getTemperaturaActualEstancia());
        vista.cargaLuces();
        vista.cargaPersianas();
        //vista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Centra en la pantalla
        vista.setLocationRelativeTo(null);
    }
    
    
    
    /**
     * Vuelve a la pantalla anterior.
     */
    public void procesaCierre() {
        GestorUI.getInstancia().atras();
    }
    
}
