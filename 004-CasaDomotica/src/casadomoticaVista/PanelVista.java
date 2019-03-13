package casadomoticaVista;

import casadomoticaModelo.Luz;
import casadomoticaModelo.PanelModelo;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.awt.Color;
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
        tituloEstado = new javax.swing.JLabel();
        textoEncApa = new javax.swing.JLabel();
        casillaEstado = new javax.swing.JCheckBox();
        tituloColor = new javax.swing.JLabel();
        selectorColor = new javax.swing.JComboBox<>();
        tituloIntensidad = new javax.swing.JLabel();
        deslizadorIntensidad = new javax.swing.JSlider();
        previsColor = new javax.swing.JPanel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        nombreLuz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreLuzActionPerformed(evt);
            }
        });

        tituloEstado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloEstado.setText("Estado:");

        textoEncApa.setText("Encendido/Apagado");

        casillaEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        casillaEstado.setMargin(null);
        casillaEstado.setMaximumSize(new java.awt.Dimension(33, 33));
        casillaEstado.setMinimumSize(new java.awt.Dimension(33, 33));
        casillaEstado.setName(""); // NOI18N
        casillaEstado.setPreferredSize(new java.awt.Dimension(33, 33));

        tituloColor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloColor.setText("Color");

        selectorColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Blanco", "Naranja", "Verde" }));
        selectorColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectorColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorColorActionPerformed(evt);
            }
        });

        tituloIntensidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloIntensidad.setText("Intensidad");

        deslizadorIntensidad.setMajorTickSpacing(10);
        deslizadorIntensidad.setMinorTickSpacing(10);
        deslizadorIntensidad.setPaintLabels(true);
        deslizadorIntensidad.setPaintTicks(true);
        deslizadorIntensidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deslizadorIntensidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deslizadorIntensidadStateChanged(evt);
            }
        });

        previsColor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout previsColorLayout = new javax.swing.GroupLayout(previsColor);
        previsColor.setLayout(previsColorLayout);
        previsColorLayout.setHorizontalGroup(
            previsColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        previsColorLayout.setVerticalGroup(
            previsColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout controlesLayout = new javax.swing.GroupLayout(controles);
        controles.setLayout(controlesLayout);
        controlesLayout.setHorizontalGroup(
            controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlesLayout.createSequentialGroup()
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tituloIntensidad)
                            .addComponent(deslizadorIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(previsColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloColor)
                            .addComponent(tituloEstado)
                            .addComponent(tituloLuz))
                        .addGap(34, 34, 34)
                        .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlesLayout.createSequentialGroup()
                                .addComponent(textoEncApa)
                                .addGap(18, 18, 18)
                                .addComponent(casillaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombreLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectorColor, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(textoEncApa)
                        .addComponent(tituloEstado))
                    .addComponent(casillaEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectorColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloColor))
                .addGap(34, 34, 34)
                .addGroup(controlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(controlesLayout.createSequentialGroup()
                        .addComponent(tituloIntensidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deslizadorIntensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(previsColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(controles, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deslizadorIntensidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deslizadorIntensidadStateChanged
        controlador.cambiaValorIntensidad();
    }//GEN-LAST:event_deslizadorIntensidadStateChanged

    private void selectorColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorColorActionPerformed

    private void nombreLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLuzActionPerformed

    
    /**********************************************
     *              MODOS DE SELECCIÓN            *
     **********************************************/
    private void btnTodasEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasEncActionPerformed
        controlador.procesaSeleccion(PanelModelo.CONFIG_TODAS_ENCENDIDAS);
    }//GEN-LAST:event_btnTodasEncActionPerformed

    private void btnTodasApaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasApaActionPerformed
        controlador.procesaSeleccion(PanelModelo.CONFIG_TODAS_APAGADAS);
    }//GEN-LAST:event_btnTodasApaActionPerformed

    private void btnAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbienteActionPerformed
        controlador.procesaSeleccion(PanelModelo.CONFIG_AMBIENTE);
    }//GEN-LAST:event_btnAmbienteActionPerformed

    private void btnLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturaActionPerformed
        controlador.procesaSeleccion(PanelModelo.CONFIG_LECTURA);
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
            ImageIcon resIcon;
            if(luz.estaEncendida()){
                resIcon = new ImageIcon(getClass().getResource("/casadomoticaRecursos/bomb_amarilla.jpg"));
            }else{
                resIcon = new ImageIcon(getClass().getResource("/casadomoticaRecursos/bomb_apagada.jpg"));
            }
            btnLuz = new JButton(resIcon);
            btnLuz.setText(luz.getNombre());
            btnLuz.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    controlador.seleccionaLuz(luz);
                }
            });
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
            luces.add(pan);
        }
    }
    
    
    /********** PANEL DE SELECCIÓN DE LUZ **********/
    public void marcarSeleccionada(Luz l){
        
    }
    
    /********** PANEL DE CONFIGURACIÓN **********/
    public void actualizaConfiguracion(){
        Luz actual = modelo.getSeleccionadaActual();
        nombreLuz.setText(actual.getNombre());
        casillaEstado.setSelected(actual.estaEncendida());
        // color
        setNivelIntensidad();
    }
    
    
    public void setNivelIntensidad(){
        Luz actual = modelo.getSeleccionadaActual();
        Color c = new Color(actual.getColor());
        int intensidad = actual.getIntensidad();
        deslizadorIntensidad.setValue(intensidad);
        // Muestra la previsualización del color
        previsColor.setBackground(new Color(c.getRed(), c.getGreen(), 
                        c.getBlue(), (intensidad * 255 / 100)));
    }
    
    public int getNivelIntensidad(){
        return deslizadorIntensidad.getValue();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonesModos;
    private javax.swing.JButton btnAmbiente;
    private javax.swing.JButton btnLectura;
    private javax.swing.JButton btnTodasApa;
    private javax.swing.JButton btnTodasEnc;
    private javax.swing.JCheckBox casillaEstado;
    private javax.swing.JPanel controles;
    private javax.swing.JSlider deslizadorIntensidad;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel luces;
    private javax.swing.JPanel modosSeleccion;
    private javax.swing.JTextField nombreLuz;
    private javax.swing.JPanel previsColor;
    private javax.swing.JComboBox<String> selectorColor;
    private javax.swing.JLabel textoEncApa;
    private javax.swing.JLabel tituloColor;
    private javax.swing.JLabel tituloEstado;
    private javax.swing.JLabel tituloIntensidad;
    private javax.swing.JLabel tituloLuz;
    private javax.swing.JLabel tituloModos;
    // End of variables declaration//GEN-END:variables
}
