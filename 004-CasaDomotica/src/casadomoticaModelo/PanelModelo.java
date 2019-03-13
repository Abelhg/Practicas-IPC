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
    
    private ArrayList<Luz> luces;
    
    public PanelModelo(){
        
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
    
    
}
