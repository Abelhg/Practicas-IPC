package casadomoticaVista;

import casadomoticaModelo.Modelo;
import javax.swing.JFrame;


public class PanelVista extends javax.swing.JFrame {

    private final PanelVistaCtrl controlador;
    private final Modelo modelo;
    
    public PanelVista() {
        initComponents();
        modelo = GestorUI.getModelo();
        controlador = new PanelVistaCtrl(this, modelo);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Centra en la pantalla
        setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        nombreEstancia = new javax.swing.JLabel();
        horaActual = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        temperaturaActual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        subeUnidad = new javax.swing.JButton();
        subeDecimal = new javax.swing.JButton();
        bajaUnidad = new javax.swing.JButton();
        bajaDecimal = new javax.swing.JButton();
        temperatura = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nombreEstancia.setFont(new java.awt.Font("Ebrima", 1, 40)); // NOI18N
        nombreEstancia.setText("Dormitorio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(nombreEstancia, gridBagConstraints);

        horaActual.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        horaActual.setText("21:13");
        horaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaActualMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        getContentPane().add(horaActual, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Temperatura Actual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 20;
        jPanel1.add(jLabel1, gridBagConstraints);

        temperaturaActual.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        temperaturaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperaturaActual.setText("25.8º");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 20;
        jPanel1.add(temperaturaActual, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 61;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Temperatura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        jPanel2.add(jLabel3, gridBagConstraints);

        subeUnidad.setText("▲");
        subeUnidad.setAlignmentX(0.5F);
        subeUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subeUnidadMouseClicked(evt);
            }
        });
        subeUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subeUnidadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 5.0;
        jPanel2.add(subeUnidad, gridBagConstraints);

        subeDecimal.setText("△");
        subeDecimal.setAlignmentX(0.5F);
        subeDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subeDecimalMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 5.0;
        jPanel2.add(subeDecimal, gridBagConstraints);

        bajaUnidad.setText("▼");
        bajaUnidad.setAlignmentX(0.5F);
        bajaUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bajaUnidadMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 5.0;
        jPanel2.add(bajaUnidad, gridBagConstraints);

        bajaDecimal.setText("▽");
        bajaDecimal.setAlignmentX(0.5F);
        bajaDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bajaDecimalMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 5.0;
        jPanel2.add(bajaDecimal, gridBagConstraints);

        temperatura.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        temperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperatura.setText("20.4º");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(temperatura, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        getContentPane().add(jPanel2, gridBagConstraints);

        jTabbedPane1.setToolTipText("hola");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 263;
        gridBagConstraints.ipady = 259;
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel3.setToolTipText("Configuración");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 187;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controlador.procesaCierre();
    }//GEN-LAST:event_formWindowClosing

    private void subeUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subeUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subeUnidadActionPerformed

    private void horaActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaActualMouseClicked
        controlador.procesaClickHora();
    }//GEN-LAST:event_horaActualMouseClicked

    private void subeUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subeUnidadMouseClicked
        controlador.procesaClickSubirUnidad();
    }//GEN-LAST:event_subeUnidadMouseClicked

    private void subeDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subeDecimalMouseClicked
        controlador.procesaClickSubirDecimal();
    }//GEN-LAST:event_subeDecimalMouseClicked

    private void bajaUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajaUnidadMouseClicked
        controlador.procesaClickBajarUnidad();
    }//GEN-LAST:event_bajaUnidadMouseClicked

    private void bajaDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajaDecimalMouseClicked
       controlador.procesaClickBajarDecimal();
    }//GEN-LAST:event_bajaDecimalMouseClicked

    /**
     * LLAMADAS DESDE EL CONTROLADOR
     */
    
    public void setNombre(String nombre) {
        nombreEstancia.setText(nombre);
    }
    
    public void setHoraActual(String hora) {
        horaActual.setText(hora);
    }
    
    public void setTemperaturaActual(double temperatura) {
        temperaturaActual.setText(Double.toString(temperatura)+"º");
    }
    public void setTemperaturaDeseada(double temperatura) {
        this.temperatura.setText(Double.toString(temperatura)+"º");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajaDecimal;
    private javax.swing.JButton bajaUnidad;
    private javax.swing.JLabel horaActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nombreEstancia;
    private javax.swing.JButton subeDecimal;
    private javax.swing.JButton subeUnidad;
    private javax.swing.JLabel temperatura;
    private javax.swing.JLabel temperaturaActual;
    // End of variables declaration//GEN-END:variables
}
