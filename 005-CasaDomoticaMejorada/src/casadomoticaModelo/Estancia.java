package casadomoticaModelo;

import java.util.ArrayList;


public class Estancia {
    // Constantes de instancias
    public static final int DORMITORIO = 0;
    public static final int SALON = 1;
    public static final int COCINA = 2;
    public static final int BANIO = 3;
    
    private final String nombre;
    private ArrayList<Luz> luces;
    private ArrayList<Persiana> persianas;
    private SistemaTemperatura sistCalefaccion;
    
    public Estancia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Luz> getLuces() {
        return luces;
    }
    
    public Luz getLuz(int i) {
        return luces.get(i);
    }

    public void setLuces(ArrayList<Luz> luces) {
        this.luces = luces;
    }

    public ArrayList<Persiana> getPersianas() {
        return persianas;
    }

    public void setPersianas(ArrayList<Persiana> persianas) {
        this.persianas = persianas;
    }
    /*
    public SistemaCalefaccion getSistCalefaccion() {
        return sistCalefaccion;
    }
    */
    public void setSistCalefaccion(SistemaTemperatura sistCalefaccion) {
        this.sistCalefaccion = sistCalefaccion;
    }
    
    public double getTemperaturaActual() {
        return sistCalefaccion.getTemperaturaActual();
    }
    
    public double getTemperaturaDeseada() {
        return sistCalefaccion.getTemperaturaDeseada();
    }
    
    public void setTemperaturaDeseada(double cantidad){
        this.sistCalefaccion.setTemperaturaDeseada(cantidad);
    }
    
    public int getEstadoSistemaTemperatura(){
        return sistCalefaccion.getEstado();
    }
}
