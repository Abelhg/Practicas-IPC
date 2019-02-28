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
     * Devuelve 1 si el tiempo empleado en la cocción es adecuado,
     * 2 si está frio y 3 si esta caliente. Se calcula mediante un tiempo ideal y un
     * margen estipulados al crear el objeto.
     * @param tiempo Tiempo empleado
     * @return 1 si está bien cocinado, 2 si frio, 3 si caliente
     */
    public int bienCocinado(int tiempo){
        int res = 0;
        System.out.println(tiempo);
        if(Math.abs(tiempo - tiempoIdeal) <= margen){
                res = 1;
        }else{
            if(tiempo - tiempoIdeal < 0 ){
                res = 2;
            }else{
                res = 3;
            }
        }
        return res;
    }
}
