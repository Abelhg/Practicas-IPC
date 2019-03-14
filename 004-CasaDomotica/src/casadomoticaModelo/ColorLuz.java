package casadomoticaModelo;

import javax.annotation.Resources;
import javax.swing.ImageIcon;

/**
 *
 * @author Zarkrosh
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
    
    public ColorLuz(int colorHex, int colorImg){
        this.colorHex = colorHex;
        this.colorImg = colorImg;
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
