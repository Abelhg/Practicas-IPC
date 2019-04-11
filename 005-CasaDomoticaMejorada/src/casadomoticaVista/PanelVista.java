package casadomoticaVista;

import casadomoticaModelo.ColorLuz;
import casadomoticaModelo.Luz;
import casadomoticaModelo.Modelo;
import casadomoticaModelo.Persiana;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class PanelVista extends javax.swing.JFrame {

    private final ArrayList<JButton> botonesLuces;
    private final ArrayList<JButton> botonesPersianas;
    
    private final PanelVistaCtrl controlador;
    private final Modelo modelo;
    
    public PanelVista() {
        initComponents();
        botonesLuces = new ArrayList<>();
        botonesPersianas = new ArrayList<>();
        modelo = GestorUI.getModelo();
        controlador = new PanelVistaCtrl(this, modelo);
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
        tabLuces = new javax.swing.JPanel();
        tabPersianas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nombreEstancia.setFont(new java.awt.Font("Ebrima", 1, 40)); // NOI18N
        nombreEstancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEstancia.setText("Dormitorio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.35;
        gridBagConstraints.weighty = 0.35;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(nombreEstancia, gridBagConstraints);

        horaActual.setFont(new java.awt.Font("Carlito", 1, 40)); // NOI18N
        horaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaActual.setText("21:13");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.15;
        gridBagConstraints.weighty = 0.35;
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.4;
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.4;
        getContentPane().add(jPanel2, gridBagConstraints);

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(300, 300));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        tabLuces.setLayout(new javax.swing.BoxLayout(tabLuces, javax.swing.BoxLayout.Y_AXIS));
        jTabbedPane1.addTab("Luces", tabLuces);

        tabPersianas.setLayout(new javax.swing.BoxLayout(tabPersianas, javax.swing.BoxLayout.Y_AXIS));
        jTabbedPane1.addTab("Persianas", tabPersianas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.65;
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 187;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.6;
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
    
    /**
     * Carga las luces en su panel..
     */
    public void cargaLuces() {
        ArrayList<Luz> listaLuces = modelo.getLucesEstancia();
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
            btnLuz.setText("");
            btnLuz.setVerticalTextPosition(SwingConstants.BOTTOM);
            btnLuz.setHorizontalTextPosition(SwingConstants.CENTER);
            btnLuz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnLuz.setFocusPainted(false);
            btnLuz.setBorder(new LineBorder(new java.awt.Color(102, 102, 102), 4, true));
            btnLuz.setBorderPainted(false);
            btnLuz.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //seleccionaLuz(luz);
                }
            });
            gbl.setConstraints(btnLuz, c);
            botonesLuces.add(btnLuz);
            pan.add(btnLuz);
            
            contadorCols++;
            if(contadorCols == 3){
                contadorCols = 0;
                // Añade la fila actual
                tabLuces.add(pan);
                // Nueva fila
                gbl = new GridBagLayout();
                pan = new JPanel();
                pan.setPreferredSize(null);
                pan.setLayout(gbl);
            }
        }
        
        // Comprueba si el panel tiene hijos para añadir
        if(pan.getComponents().length > 0){
            tabLuces.add(pan);
        }
    }

    
    /**
     * Carga las persianas en su panel.
     */
    public void cargaPersianas() {
        ArrayList<Persiana> listaPersianas = modelo.getPersianasEstancia();
        GridBagLayout gbl = new GridBagLayout();
        JPanel pan = new JPanel();
        pan.setPreferredSize(null);
        pan.setLayout(gbl);
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.333;
        c.gridx = GridBagConstraints.RELATIVE;
        c.gridy = GridBagConstraints.RELATIVE;
        c.anchor = GridBagConstraints.CENTER;
        JButton btnPersiana;
        int contadorCols = 0;
        for(Persiana persiana : listaPersianas){
            ImageIcon resIcon = null;
            resIcon = new ImageIcon(getClass().getResource("/casadomoticaRecursos/persiana.png"));
            btnPersiana = new JButton(resIcon);
            btnPersiana.setText("");
            btnPersiana.setVerticalTextPosition(SwingConstants.BOTTOM);
            btnPersiana.setHorizontalTextPosition(SwingConstants.CENTER);
            btnPersiana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnPersiana.setFocusPainted(false);
            btnPersiana.setBorder(new LineBorder(new java.awt.Color(102, 102, 102), 4, true));
            btnPersiana.setBorderPainted(false);
            btnPersiana.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //seleccionaPersiana(persiana);
                }
            });
            gbl.setConstraints(btnPersiana, c);
            botonesPersianas.add(btnPersiana);
            pan.add(btnPersiana);
            
            contadorCols++;
            if(contadorCols == 3){
                contadorCols = 0;
                // Añade la fila actual
                tabPersianas.add(pan);
                // Nueva fila
                gbl = new GridBagLayout();
                pan = new JPanel();
                pan.setPreferredSize(null);
                pan.setLayout(gbl);
            }
        }
        
        // Comprueba si el panel tiene hijos para añadir
        if(pan.getComponents().length > 0){
            tabPersianas.add(pan);
        }
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
    private javax.swing.JPanel tabLuces;
    private javax.swing.JPanel tabPersianas;
    private javax.swing.JButton subeDecimal;
    private javax.swing.JButton subeUnidad;
    private javax.swing.JLabel temperatura;
    private javax.swing.JLabel temperaturaActual;
    // End of variables declaration//GEN-END:variables
}
