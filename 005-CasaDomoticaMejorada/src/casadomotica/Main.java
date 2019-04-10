package casadomotica;

import casadomoticaVista.GestorUI;

/**
 * Se encarga de ejecutar la aplicación.
 * 
 * @author abeherr
 * @author hechila
 */
public class Main {
    
    private static GestorUI gestorUI;

    public static void main(String[] args) {
        gestorUI = GestorUI.getInstancia();
    }
    
}
