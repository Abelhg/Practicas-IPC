package micro;

import javax.swing.ImageIcon;

/**
 *
 * @author Zarkrosh
 */
public class Comida {
    private final String nombre;
    private final int tiempoIdeal;
    private final int margen;
    private final ImageIcon imagen;

    public Comida(String nombre, int tiempoIdeal, int margen, ImageIcon imagen) {
        this.nombre = nombre;
        this.tiempoIdeal = tiempoIdeal;
        this.margen = margen;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }
    
    /**
     * Devuelve true si el tiempo empleado en la cocción es adecuado,
     * false en caso contrario. Se calcula mediante un tiempo ideal y un
     * margen estipulados al crear el objeto.
     * @param tiempo Tiempo empleado
     * @return true si está bien cocinado, false si no
     */
    public boolean bienCocinado(int tiempo){
        boolean res = false;
        
        if(Math.abs(tiempo - tiempoIdeal) <= margen) 
            res = true;
        
        return res;
    }
}
