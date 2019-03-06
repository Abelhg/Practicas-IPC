package casadomoticaVista;

import casadomoticaModelo.PanelModelo;

/**
 * Se encarga de mostrar los datos al usuario.
 * 
 * @author abeherr
 * @author hechila
 */
public class PanelVista extends javax.swing.JFrame {
    private PanelControlador controlador;
    private PanelModelo modelo;
    
    public PanelVista() {
        initComponents();
        modelo = new PanelModelo();
        controlador = new PanelControlador(this, modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
