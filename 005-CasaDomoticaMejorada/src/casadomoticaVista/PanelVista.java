package casadomoticaVista;

import casadomoticaModelo.ColorLuz;
import casadomoticaModelo.Luz;
import casadomoticaModelo.Modelo;
import casadomoticaModelo.Persiana;
import casadomoticaModelo.SistemaTemperatura;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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

        confLuces = new javax.swing.JPanel();
        lConfigLuz = new javax.swing.JLabel();
        botonEncenderApagar = new javax.swing.JToggleButton();
        lColor = new javax.swing.JLabel();
        selectorColor = new javax.swing.JComboBox<>();
        selectorIntensidad = new javax.swing.JSlider();
        porcentajeLuz = new javax.swing.JLabel();
        botonApagarTodas = new javax.swing.JButton();
        botonEncenderTodas = new javax.swing.JButton();
        confPersianas = new javax.swing.JPanel();
        lConfigPersiana = new javax.swing.JLabel();
        selectorApertura = new javax.swing.JSlider();
        botonSubir = new javax.swing.JButton();
        porcentajePersiana = new javax.swing.JLabel();
        botonBajar = new javax.swing.JButton();
        botonSubirTodas = new javax.swing.JButton();
        botonBajarTodas = new javax.swing.JButton();
        nombreEstancia = new javax.swing.JLabel();
        horaActual = new javax.swing.JLabel();
        pTemperaturaActual = new javax.swing.JPanel();
        lTempActual = new javax.swing.JLabel();
        temperaturaActual = new javax.swing.JLabel();
        pTermostato = new javax.swing.JPanel();
        lTermostato = new javax.swing.JLabel();
        subeUnidad = new javax.swing.JButton();
        subeDecimal = new javax.swing.JButton();
        bajaUnidad = new javax.swing.JButton();
        bajaDecimal = new javax.swing.JButton();
        temperaturaDeseada = new javax.swing.JLabel();
        pSelector = new javax.swing.JTabbedPane();
        tabLuces = new javax.swing.JPanel();
        tabPersianas = new javax.swing.JPanel();
        iconoTemperatura = new javax.swing.JLabel();

        confLuces.setLayout(new java.awt.GridBagLayout());

        lConfigLuz.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lConfigLuz.setText("CONFIGURACIÓN DE LUZ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        confLuces.add(lConfigLuz, gridBagConstraints);

        botonEncenderApagar.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        botonEncenderApagar.setText("APAGADA");
        botonEncenderApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncenderApagarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        confLuces.add(botonEncenderApagar, gridBagConstraints);

        lColor.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lColor.setText("COLOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        confLuces.add(lColor, gridBagConstraints);

        selectorColor.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        selectorColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMARILLO", "AZUL", "VERDE", "NARANJA", "BLANCO" }));
        selectorColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorColorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        confLuces.add(selectorColor, gridBagConstraints);

        selectorIntensidad.setMajorTickSpacing(25);
        selectorIntensidad.setMinorTickSpacing(5);
        selectorIntensidad.setPaintTicks(true);
        selectorIntensidad.setMinimumSize(new java.awt.Dimension(300, 36));
        selectorIntensidad.setPreferredSize(new java.awt.Dimension(300, 36));
        selectorIntensidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                selectorIntensidadStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 20);
        confLuces.add(selectorIntensidad, gridBagConstraints);

        porcentajeLuz.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        porcentajeLuz.setText("50%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        confLuces.add(porcentajeLuz, gridBagConstraints);

        botonApagarTodas.setBackground(new java.awt.Color(255, 255, 153));
        botonApagarTodas.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        botonApagarTodas.setText("<html>\nAPAGAR<br>\nTODAS");
        botonApagarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonApagarTodasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.5;
        confLuces.add(botonApagarTodas, gridBagConstraints);

        botonEncenderTodas.setBackground(new java.awt.Color(255, 255, 153));
        botonEncenderTodas.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        botonEncenderTodas.setText("<html>ENCENDER<br> TODAS");
        botonEncenderTodas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEncenderTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncenderTodasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.5;
        confLuces.add(botonEncenderTodas, gridBagConstraints);

        confPersianas.setLayout(new java.awt.GridBagLayout());

        lConfigPersiana.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lConfigPersiana.setText("CONFIGURACIÓN DE PERSIANA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        confPersianas.add(lConfigPersiana, gridBagConstraints);

        selectorApertura.setOrientation(javax.swing.JSlider.VERTICAL);
        selectorApertura.setMinimumSize(new java.awt.Dimension(10, 200));
        selectorApertura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                selectorAperturaStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        confPersianas.add(selectorApertura, gridBagConstraints);

        botonSubir.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        botonSubir.setText("SUBIR AL COMPLETO");
        botonSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.66;
        gridBagConstraints.weighty = 0.2;
        confPersianas.add(botonSubir, gridBagConstraints);

        porcentajePersiana.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        porcentajePersiana.setText("50%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.2;
        confPersianas.add(porcentajePersiana, gridBagConstraints);

        botonBajar.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        botonBajar.setText("BAJAR AL COMPLETO");
        botonBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.66;
        gridBagConstraints.weighty = 0.2;
        confPersianas.add(botonBajar, gridBagConstraints);

        botonSubirTodas.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        botonSubirTodas.setText("SUBIR TODAS");
        botonSubirTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirTodasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.2;
        confPersianas.add(botonSubirTodas, gridBagConstraints);

        botonBajarTodas.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        botonBajarTodas.setText("BAJAR TODAS");
        botonBajarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajarTodasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.2;
        confPersianas.add(botonBajarTodas, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.15;
        getContentPane().add(nombreEstancia, gridBagConstraints);

        horaActual.setFont(new java.awt.Font("Carlito", 1, 40)); // NOI18N
        horaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horaActual.setText("21:13");
        horaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaActualMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.15;
        getContentPane().add(horaActual, gridBagConstraints);

        pTemperaturaActual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pTemperaturaActual.setLayout(new java.awt.GridBagLayout());

        lTempActual.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lTempActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTempActual.setText("Temperatura Actual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 20;
        pTemperaturaActual.add(lTempActual, gridBagConstraints);

        temperaturaActual.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        temperaturaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperaturaActual.setText("25.8º");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 20;
        pTemperaturaActual.add(temperaturaActual, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.15;
        getContentPane().add(pTemperaturaActual, gridBagConstraints);

        pTermostato.setPreferredSize(new java.awt.Dimension(200, 200));
        pTermostato.setLayout(new java.awt.GridBagLayout());

        lTermostato.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        lTermostato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTermostato.setText("Termostato");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        pTermostato.add(lTermostato, gridBagConstraints);

        subeUnidad.setText("▲");
        subeUnidad.setAlignmentX(0.5F);
        subeUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subeUnidadMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.5;
        pTermostato.add(subeUnidad, gridBagConstraints);

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.5;
        pTermostato.add(subeDecimal, gridBagConstraints);

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.5;
        pTermostato.add(bajaUnidad, gridBagConstraints);

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.5;
        pTermostato.add(bajaDecimal, gridBagConstraints);

        temperaturaDeseada.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        temperaturaDeseada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temperaturaDeseada.setText("20.4º");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        pTermostato.add(temperaturaDeseada, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.15;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        getContentPane().add(pTermostato, gridBagConstraints);

        pSelector.setToolTipText("");
        pSelector.setMinimumSize(new java.awt.Dimension(300, 300));
        pSelector.setPreferredSize(new java.awt.Dimension(300, 300));
        pSelector.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pSelectorStateChanged(evt);
            }
        });

        tabLuces.setLayout(new javax.swing.BoxLayout(tabLuces, javax.swing.BoxLayout.Y_AXIS));
        pSelector.addTab("Luces", tabLuces);

        tabPersianas.setLayout(new javax.swing.BoxLayout(tabPersianas, javax.swing.BoxLayout.Y_AXIS));
        pSelector.addTab("Persianas", tabPersianas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(pSelector, gridBagConstraints);

        iconoTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/calor.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(iconoTemperatura, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cuando el usuario cierra la ventana.
     * @param evt Evento de cierre
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controlador.procesaCierre();
    }//GEN-LAST:event_formWindowClosing

    /**
     * Cuando el usuario hace click en subir unidad del termostato.
     * @param evt Evento de click
     */
    private void subeUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subeUnidadMouseClicked
        controlador.procesaClickSubirUnidad();
    }//GEN-LAST:event_subeUnidadMouseClicked

    /**
     * Cuando el usuario hace click en subir decima del termostato.
     * @param evt Evento de click
     */
    private void subeDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subeDecimalMouseClicked
        controlador.procesaClickSubirDecimal();
    }//GEN-LAST:event_subeDecimalMouseClicked
    
    /**
     * Cuando el usuario hace click en bajar unidad del termostato.
     * @param evt Evento de click
     */
    private void bajaUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajaUnidadMouseClicked
        controlador.procesaClickBajarUnidad();
    }//GEN-LAST:event_bajaUnidadMouseClicked

    /**
     * Cuando el usuario hace click en bajar decima del termostato.
     * @param evt Evento de click
     */
    private void bajaDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bajaDecimalMouseClicked
       controlador.procesaClickBajarDecimal();
    }//GEN-LAST:event_bajaDecimalMouseClicked

    /**
     * Cuando el usuario hace click en el botón de encender/apagar luz.
     * @param evt Evento de click
     */
    private void botonEncenderApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncenderApagarActionPerformed
        controlador.procesaClickBotonEncenderApagar();
    }//GEN-LAST:event_botonEncenderApagarActionPerformed

    /**
     * Cuando el usuario hace click en el botón de apagar todas las luces.
     * @param evt Evento de click
     */
    private void botonApagarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonApagarTodasActionPerformed
        controlador.procesaClickApagarTodas();
    }//GEN-LAST:event_botonApagarTodasActionPerformed

    /**
     * Cuando el usuario hace click en el botón de encender todas las luces.
     * @param evt Evento de click
     */
    private void botonEncenderTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncenderTodasActionPerformed
        controlador.procesaClickEncenderTodas();
    }//GEN-LAST:event_botonEncenderTodasActionPerformed

    /**
     * Cuando el usuario cambia las pestañas del selector de luces/persianas.
     * @param evt Evento de cambio
     */
    private void pSelectorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pSelectorStateChanged
        if(controlador != null) {
            // Para evitar procesar al crearse la vista
            if(pSelector.getSelectedComponent().equals(tabLuces)){
                controlador.procesaClickTabLuces();
            } else if (pSelector.getSelectedComponent().equals(tabPersianas)) {
                controlador.procesaClickTabPersianas();
            }
        }
    }//GEN-LAST:event_pSelectorStateChanged

    /**
     * Cuando el usuario hace click en la hora actual.
     * @param evt Evento de click
     */
    private void horaActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaActualMouseClicked
        controlador.procesaClickHora();
    }//GEN-LAST:event_horaActualMouseClicked

    /**
     * Cuando el usuario modifica el nivel del selector de intensidad de luz.
     * @param evt Evento de cambio
     */
    private void selectorIntensidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_selectorIntensidadStateChanged
        if(controlador != null) {
            controlador.procesaCambioIntensidad();
        }
    }//GEN-LAST:event_selectorIntensidadStateChanged

    /**
     * Cuando el usuario modifica el nivel del selector de apertura de persiana.
     * @param evt Evento de cambio
     */
    private void selectorAperturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_selectorAperturaStateChanged
        if(controlador != null) {
            controlador.procesaCambioApertura();
        }
    }//GEN-LAST:event_selectorAperturaStateChanged

    /**
     * Cuando el usuario hace click en el botón de subir la persiana.
     * @param evt Evento de click
     */
    private void botonSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirActionPerformed
        controlador.procesaClickSubirPersiana();
    }//GEN-LAST:event_botonSubirActionPerformed

    /**
     * Cuando el usuario hace click en el botón de bajar la persiana.
     * @param evt Evento de click
     */
    private void botonBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajarActionPerformed
        controlador.procesaClickBajarPersiana();
    }//GEN-LAST:event_botonBajarActionPerformed

    /**
     * Cuando el usuario hace click en el botón de subir todas las persianas.
     * @param evt Evento de click
     */
    private void botonSubirTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirTodasActionPerformed
        controlador.procesaClickSubirTodas();
    }//GEN-LAST:event_botonSubirTodasActionPerformed

    /**
     * Cuando el usuario hace click en el botón de bajar todas las persianas.
     * @param evt Evento de click
     */
    private void botonBajarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajarTodasActionPerformed
        controlador.procesaClickBajarTodas();
    }//GEN-LAST:event_botonBajarTodasActionPerformed

    /**
     * Cuando el usuario cambia el valor del selector de color de luz.
     * @param evt Evento de cambio
     */
    private void selectorColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorColorActionPerformed
        if(controlador != null) {
            controlador.procesaCambioColor();
        }
    }//GEN-LAST:event_selectorColorActionPerformed

    
    /**
     * Obtiene el nombre de la estancia del modelo y lo muestra.
     */
    public void actualizaNombre() {
        nombreEstancia.setText(modelo.getNombreEstancia());
    }
    
    /**
     * Obtiene la hora del modelo y la muestra.
     */
    public void actualizaHoraActual() {
        horaActual.setText(modelo.getHoraActual());
    }
    
    /**
     * Obtiene la temperatura actual de la estancia y la muestra.
     */
    public void actualizaTemperaturaActual() {
        temperaturaActual.setText(modelo.getTemperaturaActualEstancia() + "º");
    }
    
    /**
     * Obtiene la temperatura deseada de la estancia y la muestra.
     */
    public void actualizaTemperaturaDeseada() {
        temperaturaDeseada.setText(modelo.getTemperaturaDeseadaEstancia() + "º");
    }
    
    /**
     * Actualiza el indicador de estado del sistema de temperatura.
     */
    public void actualizaIndicadorTermostato() {
        int estado = modelo.getEstadoSistemaTemperatura();
        switch(estado){
            case SistemaTemperatura.APAGADO:
                iconoTemperatura.setIcon(null);
                break;
            case SistemaTemperatura.CALENTANDO:
                iconoTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/calor.png")));
                break;
            case SistemaTemperatura.ENFRIANDO:
                iconoTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casadomoticaRecursos/frio.png")));
                break;
        }
    }
    
    

    /**
     * Carga el panel especificado en la zona de configuración.
     * 
     * Nota para Alejandra: es una función utilizada solo por la vista, por eso
     * se le pasa parámetro.
     * 
     * @param panel Nuevo panel de configuración
     */
    private void cargaPanelConfiguracion(JPanel panel) {
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.7;
        getContentPane().add(panel, gridBagConstraints);
        setSize(700, 640);
        validate();
    }
    
    /**
     * Quita de la vista el panel de configuración.
     */
    public void borraPanelConfiguracion() {
        // Cualquiera que pueda haber
        getContentPane().remove(confLuces);
        getContentPane().remove(confPersianas);
    }
    
            /**************************************** 
             *                LUCES                 *
             ****************************************/
    /**
     * Carga las luces en su panel.
     */
    public void cargaLuces() {
        ArrayList<Luz> listaLuces = modelo.getLucesEstancia();
        if(listaLuces.size() > 0) {
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
                ImageIcon resIcon = new ImageIcon(getClass().getResource(
                                            ColorLuz.getIconoLuz(luz)));
                btnLuz = new JButton(resIcon);
                btnLuz.setText("");
                btnLuz.setVerticalTextPosition(SwingConstants.BOTTOM);
                btnLuz.setHorizontalTextPosition(SwingConstants.CENTER);
                btnLuz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnLuz.setFocusPainted(false);
                btnLuz.setBorder(new LineBorder(new java.awt.Color(130, 255, 93), 4, true));
                btnLuz.setBorderPainted(false);
                btnLuz.setBackground(Color.WHITE);
                btnLuz.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        modelo.setLuzSeleccionadaActual(luz);
                        controlador.procesaClickLuz();
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
        } else {
            JLabel lSinLuces = new JLabel();
            lSinLuces.setFont(new java.awt.Font("Ebrima", 1, 18));
            lSinLuces.setText("NO HAY LUCES");
            GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 2;
            tabLuces.add(lSinLuces, gridBagConstraints);
        }
    }

    /**
     * Actualiza la luz seleccionada en el selector de luces.
     */
    public void actualizaSelectorLuces() {
        // Marca la luz actual
        desmarcaLuces();
        ArrayList<Luz> luces = modelo.getLucesEstancia();
        if(luces.size() > 0) {
            int i = luces.indexOf(modelo.getLuzSeleccionadaActual());
            botonesLuces.get(i).setBorderPainted(true);
            // Actualiza los iconos
            i = 0;
            while(i < botonesLuces.size()) {
                ImageIcon resIcon;
                resIcon = new ImageIcon(getClass().getResource(
                                ColorLuz.getIconoLuz(luces.get(i))));
                botonesLuces.get(i).setIcon(resIcon);
                i++;
            }
        }
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
     * Carga el panel de configuración de luces.
     */
    public void muestraConfiguracionLuces() {
        getContentPane().remove(confPersianas);
        cargaPanelConfiguracion(confLuces);
        
    }
    
    /**
     * Actualiza los contenidos de la configuración de luces.
     */
    public void actualizaConfiguracionLuz() {
        Luz actual = modelo.getLuzSeleccionadaActual();
        if(actual != null) {
            // BOTÓN ENCENDIDO/APAGADO
            if(actual.estaEncendida()) {
                // ENCENDIDA
                botonEncenderApagar.setSelected(true);
                botonEncenderApagar.setText("ENCENDIDA");
            } else {
                // APAGADA
                botonEncenderApagar.setSelected(false);
                botonEncenderApagar.setText("APAGADA");
            }

            // SELECTOR COLOR
            selectorColor.setSelectedIndex(actual.getColor().getColorImg());

            // SELECTOR INTENSIDAD
            selectorIntensidad.setValue(actual.getIntensidad());
            porcentajeLuz.setText(actual.getIntensidad() + "%");
        }
    }
    
    /**
     * Devuelve el nivel de intensidad del selector.
     * @return Nivel de intensidad
     */
    public int getNivelIntensidad() {
        return selectorIntensidad.getValue();
    }
    
    /**
     * Devuelve el índice actual del selector de color.
     * @return Indice seleccionado
     */
    public int getColorSeleccionado() {
        return selectorColor.getSelectedIndex();
    }
    
    
            /**************************************** 
             *              PERSIANAS               *
             ****************************************/
    /**
     * Carga las persianas en su panel.
     */
    public void cargaPersianas() {
        ArrayList<Persiana> listaPersianas = modelo.getPersianasEstancia();
        if(listaPersianas.size() > 0){
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
                ImageIcon resIcon;  
                switch (persiana.getApertura()) {
                    case Persiana.APERTURA_MAX:
                        resIcon = new ImageIcon(getClass().getResource(Persiana.ICONO_ABIERTA));
                        break;
                    case Persiana.APERTURA_MIN:
                        resIcon = new ImageIcon(getClass().getResource(Persiana.ICONO_CERRADA));
                        break;
                    default:
                        resIcon = new ImageIcon(getClass().getResource(Persiana.ICONO_SEMI));
                        break;
                }
                btnPersiana = new JButton(resIcon);
                btnPersiana.setText("");
                btnPersiana.setVerticalTextPosition(SwingConstants.BOTTOM);
                btnPersiana.setHorizontalTextPosition(SwingConstants.CENTER);
                btnPersiana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnPersiana.setFocusPainted(false);
                btnPersiana.setBorder(new LineBorder(new java.awt.Color(130, 255, 93), 4, true));
                btnPersiana.setBorderPainted(false);
                btnPersiana.setBackground(Color.WHITE);
                btnPersiana.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        modelo.setPersianaSeleccionadaActual(persiana);
                        controlador.procesaClickPersiana();
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
        } else {
            JLabel lSinPersianas = new JLabel();
            lSinPersianas.setFont(new java.awt.Font("Ebrima", 1, 18));
            lSinPersianas.setText("NO HAY PERSIANAS");
            GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 2;
            tabPersianas.add(lSinPersianas, gridBagConstraints);
        }
    }
    
    /**
     * Actualiza el selector de persianas.
     * 
     * TODO: Buscar optimizaciones
     */
    public void actualizaSelectorPersianas() {
        // Marca la persiana actual
        desmarcaPersianas();
        ArrayList<Persiana> persianas = modelo.getPersianasEstancia();
        if(persianas.size() > 0) {
            int i = persianas.indexOf(modelo.getPersianaSeleccionadaActual());
            botonesPersianas.get(i).setBorderPainted(true);
            // Actualiza los iconos
            i = 0;
            while(i < botonesPersianas.size()) {
                ImageIcon resIcon;  
                switch (persianas.get(i).getApertura()) {
                    case Persiana.APERTURA_MAX:
                        resIcon = new ImageIcon(getClass().getResource(Persiana.ICONO_ABIERTA));
                        break;
                    case Persiana.APERTURA_MIN:
                        resIcon = new ImageIcon(getClass().getResource(Persiana.ICONO_CERRADA));
                        break;
                    default:
                        resIcon = new ImageIcon(getClass().getResource(Persiana.ICONO_SEMI));
                        break;
                }
                botonesPersianas.get(i).setIcon(resIcon);
                i++;
            }
        }
    }
    
    /**
     * Desmarca todas las persianas del panel de selección de oersianas.
     */
    private void desmarcaPersianas(){
        for(JButton b : botonesPersianas){
            b.setBorderPainted(false);
        }
    }
    
    /**
     * Carga el panel de configuración de persianas.
     */
    public void muestraConfiguracionPersianas() {
        getContentPane().remove(confLuces);
        cargaPanelConfiguracion(confPersianas);
    }
    
    /**
     * Actualiza los contenidos de la configuración de persianas.
     */
    public void actualizaConfiguracionPersiana() {
        Persiana actual = modelo.getPersianaSeleccionadaActual();
        selectorApertura.setValue(actual.getApertura());
        porcentajePersiana.setText(actual.getApertura() + "%");
        
        botonSubir.setEnabled(true);
        botonBajar.setEnabled(true);
        if(actual.getApertura() == 0) {
            botonBajar.setEnabled(false);
        } else if(actual.getApertura() == 100) {
            botonSubir.setEnabled(false);
        }
        
        // Comprueba botones generales
        botonSubirTodas.setEnabled(false);
        botonBajarTodas.setEnabled(false);
        for(Persiana p : modelo.getPersianasEstancia()) {
            if(p.getApertura() > Persiana.APERTURA_MIN) {
                // Al menos hay una algo abierta
                botonBajarTodas.setEnabled(true);
            } else if (p.getApertura() < Persiana.APERTURA_MAX) {
                // Al menos hay una algo cerrada
                botonSubirTodas.setEnabled(true);
            }
        }
    }
    
    /**
     * Devuelve el nivel de apertura del selector.
     * @return Nivel de apertura
     */
    public int getNivelApertura() {
        return selectorApertura.getValue();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajaDecimal;
    private javax.swing.JButton bajaUnidad;
    private javax.swing.JButton botonApagarTodas;
    private javax.swing.JButton botonBajar;
    private javax.swing.JButton botonBajarTodas;
    private javax.swing.JToggleButton botonEncenderApagar;
    private javax.swing.JButton botonEncenderTodas;
    private javax.swing.JButton botonSubir;
    private javax.swing.JButton botonSubirTodas;
    private javax.swing.JPanel confLuces;
    private javax.swing.JPanel confPersianas;
    private javax.swing.JLabel horaActual;
    private javax.swing.JLabel iconoTemperatura;
    private javax.swing.JLabel lColor;
    private javax.swing.JLabel lConfigLuz;
    private javax.swing.JLabel lConfigPersiana;
    private javax.swing.JLabel lTempActual;
    private javax.swing.JLabel lTermostato;
    private javax.swing.JLabel nombreEstancia;
    private javax.swing.JTabbedPane pSelector;
    private javax.swing.JPanel pTemperaturaActual;
    private javax.swing.JPanel pTermostato;
    private javax.swing.JLabel porcentajeLuz;
    private javax.swing.JLabel porcentajePersiana;
    private javax.swing.JSlider selectorApertura;
    private javax.swing.JComboBox<String> selectorColor;
    private javax.swing.JSlider selectorIntensidad;
    private javax.swing.JButton subeDecimal;
    private javax.swing.JButton subeUnidad;
    private javax.swing.JPanel tabLuces;
    private javax.swing.JPanel tabPersianas;
    private javax.swing.JLabel temperaturaActual;
    private javax.swing.JLabel temperaturaDeseada;
    // End of variables declaration//GEN-END:variables
}
