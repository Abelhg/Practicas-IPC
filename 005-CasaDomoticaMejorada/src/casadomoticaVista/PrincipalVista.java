package casadomoticaVista;

import casadomoticaModelo.Estancia;
import casadomoticaModelo.Modelo;

/**
 * Vista inicial de la aplicación. 4 estancias, con hora y fecha en la parte inferior.
 * 
 * @author abeherr
 * @author hechila
 */
public class PrincipalVista extends javax.swing.JFrame {

    private final PrincipalVistaCtrl controlador;
    private final Modelo modelo;
    
    public PrincipalVista() {
        initComponents();
        modelo = GestorUI.getModelo();
        controlador = new PrincipalVistaCtrl(this, modelo);
        // Centra en la pantalla
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        botonDormitorio = new javax.swing.JButton();
        botonSalon = new javax.swing.JButton();
        botonCocina = new javax.swing.JButton();
        botonBanio = new javax.swing.JButton();
        horaActual = new javax.swing.JLabel();
        fechaActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        botonDormitorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/dormitorio.jpg"))); // NOI18N
        botonDormitorio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonDormitorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDormitorioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.45;
        getContentPane().add(botonDormitorio, gridBagConstraints);

        botonSalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/salon.jpg"))); // NOI18N
        botonSalon.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.45;
        getContentPane().add(botonSalon, gridBagConstraints);

        botonCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/cocina.jpg"))); // NOI18N
        botonCocina.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCocinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.45;
        getContentPane().add(botonCocina, gridBagConstraints);

        botonBanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/banio.jpg"))); // NOI18N
        botonBanio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonBanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBanioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.45;
        getContentPane().add(botonBanio, gridBagConstraints);

        horaActual.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        horaActual.setText("18:30");
        horaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaActualMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(horaActual, gridBagConstraints);

        fechaActual.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        fechaActual.setText("Miércoles, 10 de abril");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(fechaActual, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDormitorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDormitorioActionPerformed
        controlador.procesaEstanciaSeleccionada(Estancia.DORMITORIO);
    }//GEN-LAST:event_botonDormitorioActionPerformed

    private void botonSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalonActionPerformed
        controlador.procesaEstanciaSeleccionada(Estancia.SALON);
    }//GEN-LAST:event_botonSalonActionPerformed

    private void botonCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCocinaActionPerformed
        controlador.procesaEstanciaSeleccionada(Estancia.COCINA);
    }//GEN-LAST:event_botonCocinaActionPerformed

    private void botonBanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBanioActionPerformed
        controlador.procesaEstanciaSeleccionada(Estancia.BANIO);
    }//GEN-LAST:event_botonBanioActionPerformed

    private void horaActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaActualMouseClicked
       controlador.procesaClickHora();
    }//GEN-LAST:event_horaActualMouseClicked

    /**
     * LLAMADAS DESDE EL CONTROLADOR
     */
    
    public void setFechaActual(String fecha) {
        fechaActual.setText(fecha);
    }
    
    public void actualizaHoraActual() {
        horaActual.setText(modelo.getHoraActual());
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBanio;
    private javax.swing.JButton botonCocina;
    private javax.swing.JButton botonDormitorio;
    private javax.swing.JButton botonSalon;
    private javax.swing.JLabel fechaActual;
    private javax.swing.JLabel horaActual;
    // End of variables declaration//GEN-END:variables
}
