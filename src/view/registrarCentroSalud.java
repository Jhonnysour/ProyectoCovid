/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import SQL.Extraer;
import SQL.Guardar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;
import tools.Buscador;
import tools.Creador;
import tools.Verificador;

/**
 *
 * @author Ricardo Fanghella
 */
public class registrarCentroSalud extends javax.swing.JFrame {
        Extraer dataSQL = new Extraer();
        DefaultTableModel model;
        Creador crea = new Creador();
        
        
    
    public registrarCentroSalud() {
        initComponents();
        this.setSize(543,460);
        this.setResizable(false);
        
        ArrayList<String> listas = dataSQL.nombPais(dataSQL.Pais());
        for (int i=0;i<listas.size();i++)
            desplegable_Pais.addItem(listas.get(i));
        
        listas = dataSQL.medicoEncargado();
        for (int i=0;i<listas.size();i++)
            desplegable_MedicoE.addItem(listas.get(i));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        boton_Aceptar = new javax.swing.JButton();
        boton_Volver_RegistroCentro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_Pais = new javax.swing.JLabel();
        label_nombreCentro = new javax.swing.JLabel();
        label_direccionCentro = new javax.swing.JLabel();
        label_TipoCentro = new javax.swing.JLabel();
        label_MedicoE = new javax.swing.JLabel();
        label_Estado = new javax.swing.JLabel();
        desplegable_Pais = new javax.swing.JComboBox<>();
        desplegable_TipoCentro = new javax.swing.JComboBox<>();
        desplegable_MedicoE = new javax.swing.JComboBox<>();
        label_Fecha_Origen = new javax.swing.JLabel();
        desplegable_calendar = new com.toedter.calendar.JDateChooser();
        desplegable_Estado1 = new javax.swing.JComboBox<>();
        field_direccionCentro = new javax.swing.JTextField();
        field_nombreCentro1 = new javax.swing.JTextField();
        title_CentroSalud = new javax.swing.JLabel();

        jButton2.setBackground(new java.awt.Color(235, 235, 235));
        jButton2.setFont(new java.awt.Font("David Libre", 0, 11)); // NOI18N
        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 211, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Aceptar.setBackground(new java.awt.Color(235, 235, 235));
        boton_Aceptar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Aceptar.setText("Aceptar");
        boton_Aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 80, 27));

        boton_Volver_RegistroCentro.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_RegistroCentro.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_RegistroCentro.setText("Volver");
        boton_Volver_RegistroCentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_RegistroCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_RegistroCentroActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Volver_RegistroCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 80, 27));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flo 1.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 154, 110));

        label_Pais.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Pais.setText("País: ");
        jPanel2.add(label_Pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        label_nombreCentro.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_nombreCentro.setText("Nombre:");
        jPanel2.add(label_nombreCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        label_direccionCentro.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_direccionCentro.setText("Dirección:");
        jPanel2.add(label_direccionCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        label_TipoCentro.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_TipoCentro.setText("Tipo de centro:");
        jPanel2.add(label_TipoCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        label_MedicoE.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_MedicoE.setText("Médico encargado: ");
        jPanel2.add(label_MedicoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        label_Estado.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Estado.setText("Estado: ");
        jPanel2.add(label_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        desplegable_Pais.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Pais.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_PaisActionPerformed(evt);
            }
        });
        jPanel2.add(desplegable_Pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, -1));

        desplegable_TipoCentro.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_TipoCentro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacunacion", "Hospitalizacion" }));
        desplegable_TipoCentro.setPreferredSize(new java.awt.Dimension(56, 24));
        jPanel2.add(desplegable_TipoCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 180, -1));

        desplegable_MedicoE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_MedicoE.setPreferredSize(new java.awt.Dimension(56, 24));
        jPanel2.add(desplegable_MedicoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        label_Fecha_Origen.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Fecha_Origen.setText("Fecha de Encargo: ");
        jPanel2.add(label_Fecha_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        desplegable_calendar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jPanel2.add(desplegable_calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 30));

        desplegable_Estado1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Estado1.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_Estado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_Estado1ActionPerformed(evt);
            }
        });
        jPanel2.add(desplegable_Estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        field_direccionCentro.setBackground(new java.awt.Color(235, 235, 235));
        field_direccionCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_direccionCentroActionPerformed(evt);
            }
        });
        field_direccionCentro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_direccionCentroKeyTyped(evt);
            }
        });
        jPanel2.add(field_direccionCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 310, -1));

        field_nombreCentro1.setBackground(new java.awt.Color(235, 235, 235));
        field_nombreCentro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nombreCentro1ActionPerformed(evt);
            }
        });
        field_nombreCentro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                field_nombreCentro1KeyTyped(evt);
            }
        });
        jPanel2.add(field_nombreCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 310, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 57, 470, 310));

        title_CentroSalud.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_CentroSalud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_CentroSalud.setText("Registro centro de salud");
        jPanel1.add(title_CentroSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 470, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_Volver_RegistroCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_RegistroCentroActionPerformed
        RegistroVisualizacionCentroSalud centro = null;
        try {
            centro = new RegistroVisualizacionCentroSalud();
        } catch (SQLException ex) {
            Logger.getLogger(Proceso1.class.getName()).log(Level.SEVERE, null, ex);
        }
        crea.InterfazDiferentes(this, centro, 1008, 550);
    }//GEN-LAST:event_boton_Volver_RegistroCentroActionPerformed

    private void boton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AceptarActionPerformed
        Verificador veri = new Verificador();
        if((veri.dataNB(field_nombreCentro1))&&(veri.dataNB(field_direccionCentro))){
            if((veri.noVacio(field_direccionCentro.getText().toString()))&&(veri.noVacio(field_nombreCentro1.getText().toString()))){
                
                    Guardar insertSQL = new Guardar();

                    if (insertSQL.guardarCentroSalud(desplegable_TipoCentro.getSelectedItem().toString(), field_nombreCentro1,field_direccionCentro, desplegable_Estado1.getSelectedItem().toString(), desplegable_MedicoE.getSelectedItem().toString(),desplegable_calendar)){
                        
                        field_nombreCentro1.setText("");
                        field_direccionCentro.setText("");
                        desplegable_calendar.setDate(new Date(System.currentTimeMillis()));
                        
                    }
               }else{
                JOptionPane.showMessageDialog(null, "No se admiten casillas con unicamente espacios en blanco","Error",ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Se encuentran casillas sin rellenar","Error",ERROR_MESSAGE);
    }//GEN-LAST:event_boton_AceptarActionPerformed

    private void desplegable_Estado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_Estado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desplegable_Estado1ActionPerformed

    private void desplegable_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_PaisActionPerformed
       desplegable_Estado1.removeAllItems();
        String codpais = desplegable_Pais.getSelectedItem().toString();
        Buscador busc = new Buscador();
        ArrayList<String> listas = dataSQL.nombEstado(dataSQL.Estado(busc.codPais(codpais)));
        for (int i=0;i<listas.size();i++)
        desplegable_Estado1.addItem(listas.get(i));
    }//GEN-LAST:event_desplegable_PaisActionPerformed

    private void field_direccionCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_direccionCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_direccionCentroActionPerformed

    private void field_direccionCentroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_direccionCentroKeyTyped

    }//GEN-LAST:event_field_direccionCentroKeyTyped

    private void field_nombreCentro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nombreCentro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nombreCentro1ActionPerformed

    private void field_nombreCentro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field_nombreCentro1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nombreCentro1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrarCentroSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarCentroSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarCentroSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarCentroSalud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarCentroSalud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Aceptar;
    private javax.swing.JButton boton_Volver_RegistroCentro;
    private javax.swing.JComboBox<String> desplegable_Estado1;
    private javax.swing.JComboBox<String> desplegable_MedicoE;
    private javax.swing.JComboBox<String> desplegable_Pais;
    private javax.swing.JComboBox<String> desplegable_TipoCentro;
    private com.toedter.calendar.JDateChooser desplegable_calendar;
    private javax.swing.JTextField field_direccionCentro;
    private javax.swing.JTextField field_nombreCentro1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Fecha_Origen;
    private javax.swing.JLabel label_MedicoE;
    private javax.swing.JLabel label_Pais;
    private javax.swing.JLabel label_TipoCentro;
    private javax.swing.JLabel label_direccionCentro;
    private javax.swing.JLabel label_nombreCentro;
    private javax.swing.JLabel title_CentroSalud;
    // End of variables declaration//GEN-END:variables
}
