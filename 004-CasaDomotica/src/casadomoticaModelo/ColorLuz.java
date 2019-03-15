package casadomoticaModelo;

/**
 * Representa un color de la luz.
 * 
 * @author abeherr
 * @author hechila
 */
public class ColorLuz {
    
    // Constantes colores
    public static final int COLOR_AMARILLO = 0;
    public static final int COLOR_AZUL = 1;
    public static final int COLOR_VERDE = 2;
    public static final int COLOR_NARANJA = 3;
    public static final int COLOR_BLANCA = 4;
    
    private static final String[] paths = {
        "/casadomoticaRecursos/bomb_amarilla.jpg",
        "/casadomoticaRecursos/bomb_azul.jpg",
        "/casadomoticaRecursos/bomb_verde.jpg",
        "/casadomoticaRecursos/bomb_naranja.jpg",
        "/casadomoticaRecursos/bomb_blanca.jpg",
    };
    
    private int colorHex;
    private int colorImg;
    
    public ColorLuz(int colorImg){
        this.colorImg = colorImg;
        switch(colorImg){
            case COLOR_AMARILLO:
                colorHex = Long.decode("#f9f230").intValue();
                break;
            case COLOR_AZUL:
                colorHex = Long.decode("#37a8f6").intValue();
                break;
            case COLOR_VERDE:
                colorHex = Long.decode("#38d04a").intValue();
                break;
            case COLOR_NARANJA:
                colorHex = Long.decode("#ff7d3c").intValue();
                break;
            case COLOR_BLANCA:
                colorHex = Long.decode("#fafafa").intValue();
                break;
        }
    }

    public int getColorImg() {
        return colorImg;
    }

    public int getColorHex() {
        return colorHex;
    }
    
    @Override
    public String toString(){
        return Integer.toHexString(colorHex);
    }
    
    public static String getIconoColor(int color){
        return paths[color];
    }
    
}

