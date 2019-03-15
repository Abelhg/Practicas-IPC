package casadomoticaModelo;

import java.util.ArrayList;

/**
 * Contiene la información de la aplicación. 
 * El controlador le modifica y la vista le consulta.
 * 
 * @author abeherr
 * @author hechila
 */
public class PanelModelo {
    
    /* CONSTANTES DE CONFIGURACIONES PREDETERMINADAS */
    public static final int CONFIG_TODAS_ENCENDIDAS = 0;
    public static final int CONFIG_TODAS_APAGADAS = 1;
    public static final int CONFIG_AMBIENTE = 2;
    public static final int CONFIG_LECTURA = 3;
    
    private ArrayList<Luz> luces;
    
    private Luz seleccionadaActual;
    
    public PanelModelo(){
        luces = new ArrayList<>();
    }
    
    
    /**
     * Devuelve las luces de la aplicación.
     * @return Lista de luces
     */
    public ArrayList<Luz> getLuces(){
        return luces;
    }
    
    /**
     * Asigna las luces de la aplicación.
     * @param luces Lista de luces
     */
    public void setLuces(ArrayList<Luz> luces){
        this.luces = luces;
    }
    
    /**
     * Devuelve la luz que está seleccionada actualmente en el panel de selección.
     * @return Luz actualmente seleccionada
     */
    public Luz getSeleccionadaActual(){
        return seleccionadaActual;
    }
    
    /**
     * Asigna la luz que acaba de ser seleccionada en el panel de selección.
     * @param act Nueva luz actual
     */
    public void setSeleccionadaActual(Luz act){
        seleccionadaActual = act;
    }
    
}
