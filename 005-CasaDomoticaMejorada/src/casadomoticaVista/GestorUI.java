package casadomoticaVista;

import casadomoticaModelo.Modelo;
import java.util.Stack;
import javax.swing.JFrame;


public class GestorUI { 
    private Stack<JFrame> anteriores;
    private JFrame actual;
    
    private static GestorUI instancia;
    private static Modelo modelo;
    
    public GestorUI() {
        anteriores = new Stack<>();
        modelo = new Modelo();
        // Muestra la pantalla principal
        mostrarVistaPrincipal();
    }
    
    /**
     * Muestra la ventana principal de la aplicación.
     */
    public void mostrarVistaPrincipal() {
        guardaActual();
        
        java.awt.EventQueue.invokeLater(() -> {
            actual = new PrincipalVista();
            actual.setVisible(true);
        });  
    }
    
    /**
     * Muestra el panel de control.
     */
    public void mostrarVistaPanel(/* TODO */) {
        guardaActual();
        
        java.awt.EventQueue.invokeLater(() -> {
            actual = new PanelVista();
            actual.setVisible(true);
        });  
    }

    
    /**
     * Guarda el estado actual en la pila.
     */
    private void guardaActual() {
        if(actual != null){
            anteriores.push(actual);
            actual.setVisible(false);
        }
    }
    
    /**
     * Vuelve a la vista anterior.
     */
    public void atras() {
       actual.dispose();
       actual = anteriores.pop();
       actual.setVisible(true);
    }
    
    
    /*****     SINGLETON     *****/
    /**
     * Devuelve una instancia única para la clase.
     * @return Instancia única
     */
    public static GestorUI getInstancia() {
        if(instancia == null){
            instancia = new GestorUI();
        }
        
        return instancia;
    }
    
    /**
     * Devuelve una instancia única del modelo.
     * @return Instancia única
     */
    public static Modelo getModelo() {
        if(modelo == null){
            modelo = new Modelo();
        }
        
        return modelo;
    }

}
