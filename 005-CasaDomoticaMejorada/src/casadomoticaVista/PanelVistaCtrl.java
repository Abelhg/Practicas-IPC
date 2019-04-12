package casadomoticaVista;

import casadomoticaModelo.Luz;
import casadomoticaModelo.Modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Trata los eventos que le notifica la vista,
 * modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public final class PanelVistaCtrl {
    
    private boolean mostrarSeg;
    
    private final PanelVista vista;
    private final Modelo modelo;
    
    public PanelVistaCtrl(PanelVista v, Modelo m){
        vista = v;
        modelo = m;
        configurarEstancia();
        iniciaHiloHora();
    }
    
            /**************************************** 
             *         CONFIGURACIÓN INICIAL        *
             ****************************************/
    /**
     * Configura la vista con los datos del modelo para la estancia actual.
     */
    private void configurarEstancia() {
        vista.actualizaNombre();
        vista.actualizaTemperaturaActual();
        vista.actualizaTemperaturaDeseada();
        vista.actualizaIndicadorTermostato();
        vista.cargaLuces();
        vista.cargaPersianas();
        // Selecciona la primera luz
        vista.actualizaSelectorLuces();
        vista.muestraConfiguracionLuces();
        vista.actualizaConfiguracionLuces();
        //vista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);               // Quitar comentario en la versión final
        // Centra en la pantalla
        vista.setLocationRelativeTo(null);
    }
    
    
            /**************************************** 
             *             HORA ACTUAL              *
             ****************************************/
    /**
     * Comienza un hilo que actualiza la hora en la vista cada segundo.
     */
    private void iniciaHiloHora() {
        Runnable runnable = () -> {
            while(true) {
                try {
                    modelo.setHoraActual(getHoraActual());
                    vista.actualizaHoraActual();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
        
        new Thread(runnable).start();
    }
    
    /**
     * Devuelve la hora actual en formato hh:mm[:ss]. Mostrar o no los segundos
     * depende de la bandera asociada "mostrarSeg".
     * @return Hora actual
     */
    private String getHoraActual() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        int horas= calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        
        String horaActual;
        if (!mostrarSeg) {
            horaActual = String.format("%02d:%02d", horas, minutos);
        } else {
            horaActual = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        }
        
        return horaActual;
    }
    
    /**
     * Muestra o no los segundos.
     */
    public void procesaClickHora(){
        mostrarSeg = !mostrarSeg;
    }
    
    
            /**************************************** 
             *              TERMOSTATO              *
             ****************************************/
    
    public void procesaClickSubirUnidad(){
        double nTemp = modelo.getTemperaturaDeseadaEstancia() + 1;
        modelo.cambiaTemperaturaDeseada(nTemp);
        vista.actualizaTemperaturaDeseada();
        vista.actualizaIndicadorTermostato();
    }
    
    public void procesaClickSubirDecimal(){
        String nTemp = String.valueOf(modelo.getTemperaturaDeseadaEstancia());
        BigDecimal BcambiaTemp = new BigDecimal(nTemp);
        BigDecimal decimal = new BigDecimal ("0.1");
        BcambiaTemp = BcambiaTemp.add(decimal);
        modelo.cambiaTemperaturaDeseada(BcambiaTemp.doubleValue());
        vista.actualizaTemperaturaDeseada();
        vista.actualizaIndicadorTermostato();
    }
    
    public void procesaClickBajarDecimal(){
        String nTemp = String.valueOf(modelo.getTemperaturaDeseadaEstancia());
        BigDecimal BcambiaTemp = new BigDecimal(nTemp);
        BigDecimal decimal = new BigDecimal ("0.1");
        BcambiaTemp = BcambiaTemp.subtract(decimal);
        modelo.cambiaTemperaturaDeseada(BcambiaTemp.doubleValue());
        vista.actualizaTemperaturaDeseada();
        vista.actualizaIndicadorTermostato();
    }
    
    public void procesaClickBajarUnidad(){
        double nTemp = modelo.getTemperaturaDeseadaEstancia() - 1;
        modelo.cambiaTemperaturaDeseada(nTemp);
        vista.actualizaTemperaturaDeseada();
        vista.actualizaIndicadorTermostato();
    }
    
    
            /**************************************** 
             *       SELECTOR LUCES/PERSIANAS       *
             ****************************************/
    /**
     * Muestra el panel de configuración de luces y selecciona la luz
     * actual en el selector.
     */
    public void procesaClickTabLuces() {
        vista.actualizaConfiguracionLuces();
        vista.muestraConfiguracionLuces();
        vista.actualizaConfiguracionLuces();
    }
    
    /**
     * Muestra el panel de configuración de persianas y selecciona la persiana
     * actual en el selector.
     */
    public void procesaClickTabPersianas() {
        vista.actualizaConfiguracionPersianas();
        vista.muestraConfiguracionPersianas();
        vista.actualizaConfiguracionPersianas();
    }
    
    /**
     * Marca la luz como seleccionada y carga su configuración.
     */
    public void procesaClickLuz() {
        vista.actualizaSelectorLuces();
        vista.actualizaConfiguracionLuces();
    }
    
    
            /**************************************** 
             *      PANEL CONFIGURACION LUCES       *
             ****************************************/
    /**
     * Enciende o apaga la luz seleccionada actual.
     */
    public void procesaClickBotonEncenderApagar() {
        // Obtiene la luz actual y alterna el estado
        Luz l = modelo.getLuzSeleccionadaActual();
        l.setEncendida(!l.estaEncendida());
        vista.actualizaConfiguracionLuces();
    }
    
    /**
     * Apaga todas las luces.
     */
    public void procesaClickApagarTodas() {
        for(Luz l : modelo.getLucesEstancia()) {
            l.setEncendida(false);
        }
        
        vista.actualizaSelectorLuces();
        vista.actualizaConfiguracionLuces();
    }
    
    /**
     * Enciende todas las luces.
     */
    public void procesaClickEncenderTodas() {
        for(Luz l : modelo.getLucesEstancia()) {
            l.setEncendida(true);
        }
        
        vista.actualizaSelectorLuces();
        vista.actualizaConfiguracionLuces();
    }
    
    
    
     /**
     * Vuelve a la pantalla anterior.
     */
    public void procesaCierre() {
        GestorUI.getInstancia().atras();
    }
    
}
