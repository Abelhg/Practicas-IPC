package casadomoticaModelo;

/**
 * Representa una luz, con sus respectivos atributos.
 * 
 * @author abeherr
 * @author hechila
 */
public class Luz {
    private String nombre;
    private int intensidad;
    private int color;
    private boolean encendida;

    /**
     * Construye e inicializa una Luz.
     * @param nombre Nombre de la luz
     * @param intensidad Intensidad de la luz
     * @param color Color de la luz
     * @param encendida Si esta encendida o no
     */
    public Luz(String nombre, int intensidad, int color, boolean encendida) {
        this.nombre = nombre;
        this.intensidad = intensidad;
        this.color = color;
        this.encendida = encendida;
    }

    /**
     * @return Nombre actual de la luz
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre Nombre para asignar a la luz
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Intensidad actual de la luz
     */
    public int getIntensidad() {
        return intensidad;
    }
    
    /**
     * @param intensidad Intensidad para asignar a la luz
     */
    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    /**
     * @return Color actual de la luz
     */
    public int getColor() {
        return color;
    }
    
    /**
     * @param color Color para asignar a la luz
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * @return true si la luz está encendida, false si no
     */
    public boolean estaEncendida() {
        return encendida;
    }
    
    /**
     * @param estado true para encender la luz, false para apagarla
     */
    public void setEncendida(boolean estado) {
        this.encendida = estado;
    }
    
    @Override
    public String toString(){
        String res = "[Luz - " + nombre + " | " + intensidad + "% | #" + 
                      Integer.toHexString(color) + " | ";
        if(encendida){
            res += "Encendida]";
        }else{
            res += "Apagada]";
        }
        
        return res;
    }
}
