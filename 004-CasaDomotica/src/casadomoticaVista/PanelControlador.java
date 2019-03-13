package casadomoticaVista;

import casadomoticaModelo.PanelModelo;
import casadomoticaModelo.Luz;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * Trata los eventos que le notifica la vista,
 * modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public final class PanelControlador {
    
    private final String PATH_LUCES = "/casadomoticaRecursos/luces.txt";
    
    private final PanelVista vista;
    private final PanelModelo modelo;
    
    public PanelControlador(PanelVista v, PanelModelo m){
        vista = v;
        modelo = m;
        // Inicializa las luces
        initLuces();
    }
    
    /**
     * Inicializa las luces desde fichero en memoria y asigna al modelo.
     */
    public void initLuces(){
        ArrayList<Luz> luces = new ArrayList<>();
        try {
            InputStream is = getClass().getResourceAsStream(PATH_LUCES);
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            
            String linea;
            while(br.ready()){
                // Lee datos de las luces
                String nombre = br.readLine();
                System.out.println("[DEBUG] " + nombre);
                int intensidad = Integer.parseInt(br.readLine());
                int color = (int) Long.parseLong(br.readLine(), 16);
                boolean encendida = Boolean.parseBoolean(br.readLine());
                luces.add(new Luz(nombre, intensidad, color, encendida));
                
                br.readLine(); // Siguiente sección
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("[!] El archivo \"luces.txt\" no existe.");
            System.exit(-1);
        } catch (UnsupportedEncodingException ex) {
            System.out.println("[!] Codificación no soportada. Puede haber problemas.");
        } catch (IOException ex) {
            System.out.println("[!] Error al leer el archivo \"luces.txt\".");
            System.exit(-1);
        } catch (NumberFormatException ex) {
            System.out.println("[!] Error al leer un entero en el archivo \"luces.txt\".");
            System.exit(-1);
        }
        
        modelo.setLuces(luces);
        vista.cargaLuces();
    }
    
    
    /**
     * Procesa el evento de cambio de intensidad.
     */
    public void cambiaValorIntensidad(){
       //modelo.setPorcentaje(vista.getTextSlider());
       vista.setTextSlider();
    }
    
}
