package casadomoticaVista;

import casadomoticaModelo.ColorLuz;
import casadomoticaModelo.Estancia;
import casadomoticaModelo.Luz;
import casadomoticaModelo.Modelo;
import casadomoticaModelo.Persiana;
import casadomoticaModelo.SistemaCalefaccion;
import java.util.ArrayList;

/**
 * Trata los eventos que le notifica la vista, modifica el modelo y actualiza la vista.
 * 
 * @author abeherr
 * @author hechila
 */
public final class PrincipalVistaCtrl {
    
    private final PrincipalVista vista;
    private final Modelo modelo;
    
    public PrincipalVistaCtrl(PrincipalVista v, Modelo m){
        vista = v;
        modelo = m;
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
                estancia.setSistCalefaccion(new SistemaCalefaccion(22, 28));
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
                estancia.setSistCalefaccion(new SistemaCalefaccion(23, 22.5));
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
                estancia.setSistCalefaccion(new SistemaCalefaccion(20, 22.3));
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
                estancia.setSistCalefaccion(new SistemaCalefaccion(21.3, 22.7));
                break;
        }
        
        if(estancia != null) {
            modelo.setEstancia(estancia);
            GestorUI.getInstancia().mostrarVistaPanel();
        }
    }
    
}
