package micro;

import javax.swing.ImageIcon;

/**
 *
 * @author Zarkrosh
 */
public class Comida {
    static final int COCINADO_BIEN = 0;
    static final int COCINADO_POCO = 1;
    static final int COCINADO_MUCHO = 2;
    
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
     * Devuelve el estado del alimento cocinado. 
     * Se calcula mediante un tiempo ideal y un margen estipulados al crear el objeto.
     * @param tiempo Tiempo empleado
     * @return Ver constantes
     */
    public int bienCocinado(int tiempo){
        int res = 0;
        System.out.println(tiempo);
        if(Math.abs(tiempo - tiempoIdeal) <= margen){
                res = COCINADO_BIEN;
        }else{
            if(tiempo - tiempoIdeal < 0 ){
                res = COCINADO_POCO;
            }else{
                res = COCINADO_MUCHO;
            }
        }
        
        return res;
    }
}
