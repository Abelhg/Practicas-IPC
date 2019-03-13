package casadomoticaVista;

import casadomoticaModelo.Luz;
import casadomoticaModelo.PanelModelo;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

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
        // Centra en la pantalla
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel5 = new javax.swing.JLabel();
        modosSeleccion = new javax.swing.JPanel();
        tituloModos = new javax.swing.JLabel();
        botonesModos = new javax.swing.JPanel();
        btnTodasEnc = new javax.swing.JButton();
        btnTodasApa = new javax.swing.JButton();
        btnAmbiente = new javax.swing.JButton();
        btnLectura = new javax.swing.JButton();
        luces = new javax.swing.JPanel();
        controles = new javax.swing.JPanel();
        tituloLuz = new javax.swing.JLabel();
        nombreLuz = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        slider = new javax.swing.JSlider();
        tituloLuz1 = new javax.swing.JLabel();
        tituloLuz2 = new javax.swing.JLabel();
        tituloLuz3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        modosSeleccion.setBackground(new java.awt.Color(204, 255, 255));
        modosSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        modosSeleccion.setLayout(new java.awt.GridBagLayout());

        tituloModos.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        tituloModos.setText("MODOS DE SELECCIÓN");
        tituloModos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        tituloModos.setPreferredSize(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        modosSeleccion.add(tituloModos, gridBagConstraints);

        botonesModos.setBackground(new java.awt.Color(204, 255, 255));
        botonesModos.setLayout(new java.awt.GridLayout(1, 4, 2, 0));

        btnTodasEnc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTodasEnc.setText("Todas encendidas");
        btnTodasEnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodasEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasEncActionPerformed(evt);
            }
        });
        botonesModos.add(btnTodasEnc);

        btnTodasApa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTodasApa.setText("Todas apagadas");
        btnTodasApa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodasApa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasApaActionPerformed(evt);
            }
        });
        botonesModos.add(btnTodasApa);

        btnAmbiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAmbiente.setText("Ambiente");
        btnAmbiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbienteActionPerformed(evt);
            }
        });
        botonesModos.add(btnAmbiente);

        btnLectura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLectura.setText("Lectura");
        btnLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturaActionPerformed(evt);
            }
        });
        botonesModos.add(btnLectura);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 15, 15);
        modosSeleccion.add(botonesModos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        getContentPane().add(modosSeleccion, gridBagConstraints);

        luces.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Selección de luz", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24))); // NOI18N
        luces.setToolTipText("");
        luces.setPreferredSize(new java.awt.Dimension(420, 348));
        luces.setLayout(new javax.swing.BoxLayout(luces, javax.swing.BoxLayout.Y_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(luces, gridBagConstraints);

        controles.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Configuración", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 24))); // NOI18N
        controles.setToolTipText("");

        tituloLuz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloLuz.setText("Nombre de luz:");

        nombreLuz.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nombreLuz.setText("Nombre Luz");
        nombreLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreLuzActionPerformed(evt);
            }
        });

        jLabel3.setText("Encendido/Apagado");

        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setMargin(null);
        jCheckBox1.setMaximumSize(new java.awt.Dimension(33, 33));
        jCheckBox1.setMinimumSize(new java.awt.Dimension(33, 33));
        jCheckBox1.setName(""); // NOI18N
        jCheckBox1.setPreferredSize(new java.awt.Dimension(33, 33));

        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        tituloLuz1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloLuz1.setText("Estado:");

        tituloLuz2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloLuz2.setText("Intensidad");

        tituloLuz3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloLuz3.setText("Color");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Blanco", "Naranja", "Verde" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlesLayout = new javax.swing.GroupLayout(controles);
        controles.setLayout(controlesLayout);
        controlesLayout.setHorizontalGroup(
            controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlesLayout.createSequentialGroup()
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlesLayout.createSequentialGroup()
                        .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(controlesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlesLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(tituloLuz2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(controlesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLuz3)
                            .addComponent(tituloLuz1)
                            .addComponent(tituloLuz))
                        .addGap(34, 34, 34)
                        .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlesLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombreLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        controlesLayout.setVerticalGroup(
            controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLuz)
                    .addComponent(nombreLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tituloLuz1))
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLuz3))
                .addGap(34, 34, 34)
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlesLayout.createSequentialGroup()
                        .addComponent(tituloLuz2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(controles, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        controlador.cambiaValorIntensidad();
    }//GEN-LAST:event_sliderStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void nombreLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLuzActionPerformed

    
    /**********************************************
     *              MODOS DE SELECCIÓN            *
     **********************************************/
    private void btnTodasEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasEncActionPerformed
        //controlador.procesaSeleccion()
    }//GEN-LAST:event_btnTodasEncActionPerformed

    private void btnTodasApaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasApaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTodasApaActionPerformed

    private void btnAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAmbienteActionPerformed

    private void btnLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLecturaActionPerformed
    
    /**********************************************
     *          LLAMADAS DEL CONTROLADOR          *
     **********************************************/
    /**
     * Llena dinámicamente el panel selector de luces de la aplicación.
     */
    public void cargaLuces(){
        System.out.println("Cargando luces...");
        ArrayList<Luz> listaLuces = modelo.getLuces();
        GridBagLayout gbl = new GridBagLayout();
        JPanel pan = new JPanel();
        pan.setPreferredSize(null);
        pan.setLayout(gbl);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.333;
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridy = GridBagConstraints.RELATIVE;
        c.anchor = GridBagConstraints.CENTER;
        JButton btnLuz;
        int contadorCols = 0;
        for(Luz luz : listaLuces){
            System.out.println("Cargando luz: " + luz.getNombre());
            ImageIcon resIcon;
            if(luz.estaEncendida()){
                resIcon = new ImageIcon(getClass().getResource("/casadomoticaRecursos/bomb_amarilla.jpg"));
            }else{
                resIcon = new ImageIcon(getClass().getResource("/casadomoticaRecursos/bomb_apagada.jpg"));
            }
            btnLuz = new JButton(resIcon);
            btnLuz.setText(luz.getNombre());
            gbl.setConstraints(btnLuz, c);
            pan.add(btnLuz);
            
            contadorCols++;
            if(contadorCols == 3){
                contadorCols = 0;
                // Añade la fila actual
                luces.add(pan);
                // Nueva fila
                gbl = new GridBagLayout();
                pan = new JPanel();
                pan.setPreferredSize(null);
                pan.setLayout(gbl);
            }
        }
        
        // Comprueba si el panel tiene hijos para añadir
        if(pan.getComponents().length > 0){
            System.out.println("Añadiendo!");
            luces.add(pan);
        }
        
        pack();
        setVisible(true);
    }
    
    
    
    
    
    
    public void setTextSlider(){
        //textSlider.setText(String.valueOf(modelo.getPorcentaje()));
    }
    public int getTextSlider(){
        return slider.getValue();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonesModos;
    private javax.swing.JButton btnAmbiente;
    private javax.swing.JButton btnLectura;
    private javax.swing.JButton btnTodasApa;
    private javax.swing.JButton btnTodasEnc;
    private javax.swing.JPanel controles;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel luces;
    private javax.swing.JPanel modosSeleccion;
    private javax.swing.JTextField nombreLuz;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel tituloLuz;
    private javax.swing.JLabel tituloLuz1;
    private javax.swing.JLabel tituloLuz2;
    private javax.swing.JLabel tituloLuz3;
    private javax.swing.JLabel tituloModos;
    // End of variables declaration//GEN-END:variables
}
