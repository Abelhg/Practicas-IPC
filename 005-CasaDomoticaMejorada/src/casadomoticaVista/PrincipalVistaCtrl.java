package casadomoticaVista;

import casadomoticaModelo.ColorLuz;
import casadomoticaModelo.Estancia;
import casadomoticaModelo.Luz;
import casadomoticaModelo.Modelo;
import casadomoticaModelo.Persiana;
import casadomoticaModelo.SistemaTemperatura;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Trata los eventos que le notifica la vista, modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public final class PrincipalVistaCtrl {
    
    private final PrincipalVista vista;
    private final Modelo modelo;
    private boolean mostrarSeg;
    
    public PrincipalVistaCtrl(PrincipalVista v, Modelo m){
        vista = v;
        modelo = m;
        iniciaHiloHora();
        estableceFecha();
    }
    
    public void procesaEstanciaSeleccionada(int nEstancia) {
        Estancia estancia = null;
        ArrayList<Luz> luces;
        ArrayList<Persiana> persianas;
        switch(nEstancia){
            case Estancia.DORMITORIO:
                estancia = new Estancia("Dormitorio");
                luces = new ArrayList<>();
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                estancia.setLuces(luces);
                persianas = new ArrayList<>();
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                estancia.setPersianas(persianas);
                estancia.setSistCalefaccion(new SistemaTemperatura(22, 28));
                break;
            case Estancia.SALON:
                estancia = new Estancia("Salón");
                luces = new ArrayList<>();/*
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));*/
                estancia.setLuces(luces);
                persianas = new ArrayList<>();
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                estancia.setPersianas(persianas);
                estancia.setSistCalefaccion(new SistemaTemperatura(23, 22.5));
                break;
            case Estancia.COCINA:
                estancia = new Estancia("Cocina");
                luces = new ArrayList<>();
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                estancia.setLuces(luces);
                persianas = new ArrayList<>();
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                estancia.setPersianas(persianas);
                estancia.setSistCalefaccion(new SistemaTemperatura(20, 22.3));
                break;
            case Estancia.BANIO:
                estancia = new Estancia("Baño");
                luces = new ArrayList<>();
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                luces.add(new Luz(100, new ColorLuz(ColorLuz.COLOR_BLANCA), true));
                estancia.setLuces(luces);
                persianas = new ArrayList<>();
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                persianas.add(new Persiana(100));
                estancia.setPersianas(persianas);
                estancia.setSistCalefaccion(new SistemaTemperatura(21.3, 22.7));
                break;
        }
        
        if(estancia != null) {
            modelo.setEstancia(estancia);
            GestorUI.getInstancia().mostrarVistaPanel();
        }
    }
    
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
    
    public void procesaClickHora(){
        mostrarSeg = !mostrarSeg;
    }

    private void estableceFecha() {
        Calendar cal = Calendar.getInstance();
        String mes;
        mes = "";
        
        int dia =  cal.get(Calendar.DATE);
        int mesn = cal.get(Calendar.MONTH);
        switch(mesn){
            
            case 0:
                mes = "enero";
                break;
            case 1:
                mes = "febrero";
                break;
            case 2:
                mes = "marzo";
                break;
            case 3:
                mes = "abril";
                break;
            case 4:
                mes = "mayo";
                break;
            case 5:
                mes = "junio";
                break;
            case 6:
                mes = "julio";
                break;
            case 7:
                mes = "agosto";
                break;
            case 8:
                mes = "septiembre";
                break;
            case 9:
                mes = "octubre";
                break;
            case 10:
                mes = "noviembre";
                break;
            case 11:
                mes = "diciembre";
                break;
        }
            
        
        
        int año = cal.get(Calendar.YEAR);
        int ndiaSemana = cal.get(Calendar.DAY_OF_WEEK)-1;
        String diaSemana = null;
        switch(ndiaSemana){
            case 1: 
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
        }
        
        vista.setFechaActual(diaSemana + ", " + dia+" de "+mes+" de "+año);
    }
}
