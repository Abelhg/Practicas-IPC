package casadomoticaVista;

import casadomoticaModelo.ColorLuz;
import casadomoticaModelo.Luz;
import casadomoticaModelo.PanelModelo;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


/**
 * Se encarga de mostrar los datos al usuario.
 * 
 * @author abeherr
 * @author hechila
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private final PanelControlador controlador;
    private final PanelModelo modelo;
    
    private final ArrayList<JButton> botonesLuces;
    
    private int MODO_SELECCION_ACTUAL = -1;
    private Luz LUZ_SELECCIONADA_ACTUAL;
    
    public VistaPrincipal() {
        initComponents();
        botonesLuces = new ArrayList<>();
        modelo = new PanelModelo();
        controlador = new PanelControlador(this, modelo);
        // Centra en la pantalla
        setLocationRelativeTo(null);
        actualizaConfiguracion(); // Carga la luz por defecto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Salon = new javax.swing.JToggleButton();
        Cocina = new javax.swing.JToggleButton();
        Bano = new javax.swing.JToggleButton();
        Dormitorio = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        Hora = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Salon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/640px-Stafford_livingroom.jpg"))); // NOI18N
        Salon.setToolTipText("");
        Salon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salon.setIconTextGap(0);
        Salon.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Salon.setMaximumSize(new java.awt.Dimension(427, 427));
        Salon.setMinimumSize(new java.awt.Dimension(0, 0));
        Salon.setPreferredSize(new java.awt.Dimension(640, 427));
        Salon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(Salon, gridBagConstraints);

        Cocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/studio-brunstrum-kitchen-renovation-2-640x427.jpg"))); // NOI18N
        Cocina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cocina.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CocinaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(Cocina, gridBagConstraints);

        Bano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/Highgrove-Bathrooms-landscape-2-640x427.jpg"))); // NOI18N
        Bano.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Bano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(Bano, gridBagConstraints);

        Dormitorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/640px-Bedroom_Mitcham.jpg"))); // NOI18N
        Dormitorio.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Dormitorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DormitorioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(Dormitorio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 192;
        gridBagConstraints.ipady = 258;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 50));

        Hora.setText("Hora");

        jButton1.setText("Ajustes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1430, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Hora)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BanoActionPerformed

    private void DormitorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DormitorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DormitorioActionPerformed

    private void SalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalonActionPerformed

    private void CocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CocinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CocinaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    /**********************************************
     *          LLAMADAS DEL CONTROLADOR          *
     **********************************************/
    /**
     * Llena dinámicamente el panel selector de luces de la aplicación.
     */
    public void cargaLuces(){
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
            ImageIcon resIcon = null;
            if(luz.estaEncendida()){
                resIcon = new ImageIcon(getClass().getResource(
                          ColorLuz.getIconoColor(luz.getColor().getColorImg())));
            }else{
                resIcon = new ImageIcon(getClass().getResource("/casadomoticaRecursos/bomb_apagada.jpg"));
            }
            btnLuz = new JButton(resIcon);
            btnLuz.setText(luz.getNombre());
            btnLuz.setVerticalTextPosition(SwingConstants.BOTTOM);
            btnLuz.setHorizontalTextPosition(SwingConstants.CENTER);
            btnLuz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnLuz.setFocusPainted(false);
            btnLuz.setBorder(new LineBorder(new java.awt.Color(102, 102, 102), 4, true));
            btnLuz.setBorderPainted(false);
            btnLuz.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    seleccionaLuz(luz);
                }
            });
            gbl.setConstraints(btnLuz, c);
            botonesLuces.add(btnLuz);
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
    
    
    /********** PANEL DE SELECCIÓN DE MODOS **********/
    /**
     * Devuelve el modo de selección actual.
     * @return Modo actual
     */
    public int getSeleccion(){
        return MODO_SELECCION_ACTUAL;
    }
    
    /********** PANEL DE SELECCIÓN DE LUZ **********/    
    /**
     * Actualiza el nombre de la luz deseada en el panel de botones de luces.
     * @param l Luz a actualizar
     */
    public void actualizaNombreLuz(Luz l){
        int i = modelo.getLuces().indexOf(l);
        botonesLuces.get(i).setText(l.getNombre());
    }
    
    /**
     * Actualiza el icono de la luz deseada en el panel de botones de luces.
     * @param l Luz a actualizar
     */
    public void actualizaIconoLuz(Luz l) {
        int i = modelo.getLuces().indexOf(l);
        JButton btn = botonesLuces.get(i);
        if(l.estaEncendida()){
            btn.setIcon(new ImageIcon(getClass().getResource(
                          ColorLuz.getIconoColor(l.getColor().getColorImg()))));
        }else{
            btn.setIcon(new ImageIcon(getClass().getResource("/casadomoticaRecursos/bomb_apagada.jpg")));
        }
    }
    
    /**
     * Una luz ha sido marcada por el usuario y notifica al controlador.
     * @param l Luz seleccionada
     */
    private void seleccionaLuz(Luz l){
        LUZ_SELECCIONADA_ACTUAL = l;
        controlador.seleccionaLuz();
    }
    
    /**
     * Desmarca todas las luces del panel de selección de luz.
     */
    private void desmarcaLuces(){
        for(JButton b : botonesLuces){
            b.setBorderPainted(false);
        }
    }
    
    /**
     * Marca la luz actual en el panel de selección de luz.
     */
    public void marcaLuz(){
        desmarcaLuces();
        int i = modelo.getLuces().indexOf(modelo.getSeleccionadaActual());
        botonesLuces.get(i).setBorderPainted(true);
    }
    
    /**
     * Devuelve la Luz que ha sido seleccionada en el panel de selección
     * de luces.
     * @return Luz seleccionada
     */
    public Luz getSeleccionadaActual(){
        return LUZ_SELECCIONADA_ACTUAL;
    }
    
    /**
     * Actualiza los valores y aspectos de todas las luces.
     */
    public void actualizaLuces() {
        for(Luz l : modelo.getLuces()){
            int i = modelo.getLuces().indexOf(l);
            // Actualiza el icono
            actualizaIconoLuz(l);
            actualizaNivelIntensidad(l);
        }
        
        actualizaConfiguracion();
    }
    
    /********** PANEL DE CONFIGURACIÓN **********/
    /**
     * Actualiza la configuración de la luz actualmente seleccionada, en el
     * panel de configuración.
     */
    public void actualizaConfiguracion(){
        Luz actual = modelo.getSeleccionadaActual();
        nombreLuz.setText(actual.getNombre());
        casillaEstado.setSelected(actual.estaEncendida());
        selectorColor.setSelectedIndex(actual.getColor().getColorImg());
        actualizaNivelIntensidad(actual);
    }
    
    /**
     * Devuelve el contenido del editor de nombre del panel de configuración.
     * @return Nombre actual
     */
    public String getNombreLuz(){
        return nombreLuz.getText();
    }
    
    /**
     * Devuelve el estado de la casilla de encendido/apagado en el panel
     * de configuración.
     * @return true si está marcado
     */
    public boolean getEstadoLuz(){
        return casillaEstado.isSelected();
    }
    
    /**
     * Devuelve el índice de la opción seleccionada en el selector de colores
     * del panel de configuración.
     * @return Indice de la opción seleccionada
     */
    public int getColorLuz(){
        return selectorColor.getSelectedIndex();
    }
    
    /**
     * Actualiza el color de la luz en el previsualizador.
     * @param l Luz deseada
     */
    public void actualizaColorLuz(Luz l){
        // Muestra la previsualización del color
        /**
         * IMPORTANTE
         * 
         * Como te comentamos en el laboratorio, quisimos implementar una
         * previsualización teniendo en cuenta el alpha del fondo para mostrar
         * el nivel de la intensidad de la luz a mayores.
         * 
         * No conseguimos hacerlo, pues como viste ocurría un error extraño.
         */
        previsColor.setBackground(new Color(l.getColor().getColorHex()));
    }
    
    /**
     * Actualiza el nivel de intensidad del deslizador.
     * @param l Luz deseada
     */
    public void actualizaNivelIntensidad(Luz l){
        int intensidad = l.getIntensidad();
        deslizadorIntensidad.setValue(intensidad);
        actualizaColorLuz(l);
    }
    
    /**
     * Devuelve el nivel de intensidad que marca el deslizador.
     * @return Nivel de intensidad del deslizador
     */
    public int getNivelIntensidad(){
        return deslizadorIntensidad.getValue();
    }
    
    /**
     * Desmarca el borde de todas los botones de modo.
     */
    public void desmarcarTodas(){
        btnTodasEnc.setBorderPainted(false);
        btnTodasApa.setBorderPainted(false);
        btnAmbiente.setBorderPainted(false);
        btnLectura.setBorderPainted(false);
    }
    
    /**
     * Marca el botón de "Todas encendidas".
     */
    public void marcarTodasEncendidas(){
        btnTodasEnc.setBorderPainted(true);
    }
    
    /**
     * Marca el botón de "Todas apagadas".
     */
    public void marcarTodasApagadas(){
        btnTodasApa.setBorderPainted(true);
    }
    
    /**
     * Marca el botón de "Ambiente".
     */
    public void marcarAmbiente(){
        btnAmbiente.setBorderPainted(true);
    }
    
    /**
     * Marca el botón de "Lectura".
     */
    public void marcarLectura(){
        btnLectura.setBorderPainted(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Bano;
    private javax.swing.JToggleButton Cocina;
    private javax.swing.JToggleButton Dormitorio;
    private javax.swing.JLabel Hora;
    private javax.swing.JToggleButton Salon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
