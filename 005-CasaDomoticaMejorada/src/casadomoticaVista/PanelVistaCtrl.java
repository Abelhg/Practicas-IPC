package casadomoticaVista;

import casadomoticaModelo.Modelo;

import javax.swing.JFrame;
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
        Runnable runnable = () -> {
            while(true) {
                try { 
                    vista.setHoraActual(getHoraActual());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
    
    private String getHoraActual() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        
        if (!mostrarSeg){
            return String.format("%02d:%02d", hora, minutos);
        }
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }
    
    private void configurarEstancia() {
        vista.setNombre(modelo.getNombreEstancia());
        vista.setTemperaturaActual(modelo.getTemperaturaActualEstancia());
        vista.setTemperaturaDeseada(modelo.getTemperaturaDeseadaEstanciaActual());
        vista.cargaLuces();
        vista.cargaPersianas();
        //vista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Centra en la pantalla
        vista.setLocationRelativeTo(null);
    }
    
    /**
     * Vuelve a la pantalla anterior.
     */
    public void procesaCierre() {
        GestorUI.getInstancia().atras();
    }
    
    /**
     * Muestra o no los segundos
     */
    public void procesaClickHora(){
        mostrarSeg = !mostrarSeg;
    }
    
    /**
     * 
     */
    public void procesaClickSubirUnidad(){
        double cambiaTemp = modelo.getTemperaturaDeseadaEstanciaActual() + 1;
        modelo.cambiaTemperaturaDeseada(cambiaTemp);
        vista.setTemperaturaDeseada(modelo.getTemperaturaDeseadaEstanciaActual());
    }
    
    public void procesaClickSubirDecimal(){
        String cambiaTemp = String.valueOf(modelo.getTemperaturaDeseadaEstanciaActual());
        BigDecimal BcambiaTemp = new BigDecimal(cambiaTemp);
        BigDecimal decimal = new BigDecimal ("0.1");
        BcambiaTemp = BcambiaTemp.add(decimal);
        modelo.cambiaTemperaturaDeseada(BcambiaTemp.doubleValue());
        vista.setTemperaturaDeseada(modelo.getTemperaturaDeseadaEstanciaActual());
    }
    
    public void procesaClickBajarDecimal(){
        String cambiaTemp = String.valueOf(modelo.getTemperaturaDeseadaEstanciaActual());
        BigDecimal BcambiaTemp = new BigDecimal(cambiaTemp);
        BigDecimal decimal = new BigDecimal ("0.1");
        BcambiaTemp = BcambiaTemp.subtract(decimal);
        modelo.cambiaTemperaturaDeseada(BcambiaTemp.doubleValue());
        vista.setTemperaturaDeseada(modelo.getTemperaturaDeseadaEstanciaActual());
    }
    
    public void procesaClickBajarUnidad(){
        double cambiaTemp = modelo.getTemperaturaDeseadaEstanciaActual() - 1;
        modelo.cambiaTemperaturaDeseada(cambiaTemp);
        vista.setTemperaturaDeseada(modelo.getTemperaturaDeseadaEstanciaActual());
    }
}
