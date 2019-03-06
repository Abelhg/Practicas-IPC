package casadomoticaModelo;

/**
 * Contiene la información de la aplicación. 
 * El controlador le modifica y la vista le consulta.
 * 
 * @author abeherr
 * @author hechila
 */
public class PanelModelo {
    private int porcentaje;
    
    public PanelModelo(int porcentaje){
        this.porcentaje = porcentaje;
    }
    
    public int getPorcentaje(){
        return this.porcentaje;
    }
    public void setPorcentaje(int porcentaje){
        this.porcentaje = porcentaje;
    }
}
