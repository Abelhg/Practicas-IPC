package casadomoticaVista;

import casadomoticaModelo.ColorLuz;
import casadomoticaModelo.PanelModelo;
import casadomoticaModelo.Luz;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Trata los eventos que le notifica la vista,
 * modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public final class PanelControlador {
    
    private final String PATH_LUCES = "/casadomoticaRecursos/luces.txt";
    
    private final VistaPrincipal vista;
    private final PanelModelo modelo;
    
    public PanelControlador(VistaPrincipal v, PanelModelo m){
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
            try (BufferedReader br = new BufferedReader(isr)) {
                while(br.ready()){
                    // Lee datos de las luces
                    String nombre = br.readLine();
                    int intensidad = Integer.parseInt(br.readLine());
                    int colorImg = Integer.parseInt(br.readLine());
                    boolean encendida = Boolean.parseBoolean(br.readLine());
                    luces.add(new Luz(nombre, intensidad, new ColorLuz(colorImg), encendida));
                    br.readLine(); // Siguiente sección
                }
            }
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
        modelo.setSeleccionadaActual(luces.get(0)); // CARGA LA PRIMERA LUZ
        vista.marcaLuz();
    }
    
    /**
     * Cambia la configuración de las luces según unas selecciones predeterminadas.
     * 
     * 1) Todas las luces encendidas: todas a 100% de intensidad y color blanco.
     * 2) Todas las luces apagadas.
     * 3) Luz ambiental: todas encendidas al 30% de intensidad y color amarillo.
     * 4) Luz de lectura: la primera y la tercera luz están encendidas al 60%
     *     de intensidad y color blanco. El resto están apagadas.
     */
    public void procesaSeleccion(){
        switch(vista.getSeleccion()){
            case PanelModelo.CONFIG_TODAS_ENCENDIDAS:
                for(Luz l : modelo.getLuces()){
                    l.setEncendida(true);
                    l.setIntensidad(100);
                    l.setColor(new ColorLuz(ColorLuz.COLOR_BLANCA));
                }
                break;
            case PanelModelo.CONFIG_TODAS_APAGADAS:
                for(Luz l : modelo.getLuces()){
                    l.setEncendida(false);
                }
                break;
            case PanelModelo.CONFIG_AMBIENTE:
                for(Luz l : modelo.getLuces()){
                    l.setEncendida(true);
                    l.setIntensidad(30);
                    l.setColor(new ColorLuz(ColorLuz.COLOR_AMARILLO));
                }
                break;
            case PanelModelo.CONFIG_LECTURA:
                Set<Integer> indices = new HashSet<>();
                // Luces a encender: primera y tercera
                indices.add(0);
                indices.add(2);
                for(int i = 0; i < modelo.getLuces().size(); i++){
                    if(indices.contains(i)){
                        // Se enciende con la configuración deseada
                        modelo.getLuces().get(i).setEncendida(true);
                        modelo.getLuces().get(i).setIntensidad(60);
                        modelo.getLuces().get(i).setColor(new ColorLuz(ColorLuz.COLOR_BLANCA));
                    }else{
                        // Se apagan
                        modelo.getLuces().get(i).setEncendida(false);
                    }
                }
                break;
        }
        
        vista.actualizaLuces();
    }
    
    /**
     * Procesa el evento de selección de luz individual.
     */
    public void seleccionaLuz(){
        modelo.setSeleccionadaActual(vista.getSeleccionadaActual());
        vista.marcaLuz();
        vista.actualizaConfiguracion();
    }
    
    /**
     * Comprueba si la configuración actual de las luces se corresponde
     * con alguna de las predeterminadas, en cuyo caso lo hace notar
     * en la vista.
     */
    private void compruebaSiEsSeleccion(){
        vista.desmarcarTodas();
        if(modoTodasEncendidas())    vista.marcarTodasEncendidas();
        else if(modoTodasApagadas()) vista.marcarTodasApagadas();
        else if(modoAmbiente())      vista.marcarAmbiente();
        else if(modoLectura())       vista.marcarLectura();
    }
    
    /**
     * Procesa el evento de cambio de intensidad.
     */
    public void cambiaValorIntensidad(){
        modelo.getSeleccionadaActual().setIntensidad(vista.getNivelIntensidad());
        vista.actualizaNivelIntensidad(modelo.getSeleccionadaActual());
        compruebaSiEsSeleccion();
    }

    /**
     * Procesa el evento de cambio de nombre.
     */
    void procesaNombreCambiado() {
        modelo.getSeleccionadaActual().setNombre(vista.getNombreLuz());
        vista.actualizaNombreLuz(modelo.getSeleccionadaActual());
    }

    /**
     * Procesa el evento de cambio de estado de la luz (apagada/encendida).
     */
    void procesaCambioEstado() {
        modelo.getSeleccionadaActual().setEncendida(vista.getEstadoLuz());
        vista.actualizaIconoLuz(modelo.getSeleccionadaActual());
        compruebaSiEsSeleccion();
    }
    
    /**
     * Procesa el evento de cambio de color de la luz.
     */
    void procesaColorCambiado() {
        modelo.getSeleccionadaActual().setColor(new ColorLuz(vista.getColorLuz()));
        vista.actualizaColorLuz(modelo.getSeleccionadaActual());
        vista.actualizaIconoLuz(modelo.getSeleccionadaActual());
        compruebaSiEsSeleccion();
    }
    
    /**
     * Comprueba si la configuración actual de las luces se corresponde con
     * la predeterminada de "Todas encendidas", en la que todas las luces 
     * están encendidas, son de color blanco y brillan al 100% de intensidad.
     * @return true si es la configuración
     */
    public boolean modoTodasEncendidas(){
        boolean res = true;
        int i = 0;
        while(res && i < modelo.getLuces().size()){
            Luz l = modelo.getLuces().get(i);
            if(l.getColor().getColorImg() != ColorLuz.COLOR_BLANCA) res = false;
            if(l.getIntensidad() != 100) res = false;
            if(!l.estaEncendida()) res = false;
            i++;
        }
        
        return res;
    }
    
    /**
     * Comprueba si la configuración actual de las luces se corresponde con
     * la predeterminada de "Todas apagadas", en la que todas las luces 
     * están apagadas, sin importar colores ni intensidades.
     * @return true si es la configuración
     */
    public boolean modoTodasApagadas(){
        boolean res = true;
        
        int i = 0;
        while(res && i < modelo.getLuces().size()){
            if(modelo.getLuces().get(i).estaEncendida()) res = false;
            i++;
        }
        
        return res;
    }
    
    /**
     * Comprueba si la configuración actual de las luces se corresponde con
     * la predeterminada de "Ambiente", en la que todas las luces 
     * están encendidas, son de color amarillo y brillan al 30% de intensidad.
     * @return true si es la configuración
     */
    public boolean modoAmbiente(){
        boolean res = true;
        int i = 0;
        while(res && i < modelo.getLuces().size()){
            Luz l = modelo.getLuces().get(i);
            if(l.getColor().getColorImg() != ColorLuz.COLOR_AMARILLO) res = false;
            if(l.getIntensidad() != 30) res = false;
            if(!l.estaEncendida()) res = false;
            i++;
        }
        
        return res;
    }
    
    /**
     * Comprueba si la configuración actual de las luces se corresponde con
     * la predeterminada de "Ambiente", en la que solo la primera y la tercera
     * luz están encendidas, son de color blanco y brillan al 60% de intensidad.
     * @return true si es la configuración
     */
    public boolean modoLectura(){
        boolean res = true;
        Set<Integer> indices = new HashSet<>();
        // Luces que tienen que estar encendidas: primera y tercera
        indices.add(0);
        indices.add(2);
        for(int i = 0; res && i < modelo.getLuces().size(); i++){
            Luz l = modelo.getLuces().get(i);
            if(indices.contains(i)){
                if(l.getColor().getColorImg() != ColorLuz.COLOR_BLANCA) res = false;
                if(l.getIntensidad() != 60) res = false;
                if(!l.estaEncendida()) res = false;
            }else{
                // Las demás tienen que estar apagadas
                if(l.estaEncendida()) res = false;
            }
        }
        
        return res;
    }
    
}
