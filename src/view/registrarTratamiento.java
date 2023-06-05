/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import SQL.Extraer;
import SQL.Guardar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import tools.Buscador;
import tools.Creador;
import tools.Verificador;

/**
 *
 * @author Ricardo Fanghella
 */
public class registrarTratamiento extends javax.swing.JFrame {

    /**
     * Creates new form registrarMedicamento
     */
    Extraer dataSQL = new Extraer();
    Buscador bus = new Buscador();
    DefaultTableModel model;
    Creador crea = new Creador();
    public registrarTratamiento() {
        initComponents();
        desplegable_Medicamento.removeAllItems();
        ArrayList<String> listas = dataSQL.nombMedicamento(dataSQL.Medicamento());
        for (int i=0;i<listas.size();i++)
        desplegable_Medicamento.addItem(listas.get(i));
        
        this.setSize(561, 390);
        this.setResizable(false);
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
        regisMedicamento = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        boton_Volver_Variante1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        label_Denominacion1 = new javax.swing.JLabel();
        field_CantDias = new javax.swing.JTextField();
        label_CantDias = new javax.swing.JLabel();
        desplegable_Medicamento = new javax.swing.JComboBox<>();
        boton_EliminarMedicamento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableMedicamento = new javax.swing.JTable();
        boton_AgregarMedicamento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        label_Frecuencia = new javax.swing.JLabel();
        field_Frecuencia = new javax.swing.JTextField();
        label_Dosis = new javax.swing.JLabel();
        field_Dosis = new javax.swing.JTextField();
        title_RegistroVariante1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_Volver_RegistroT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label_imagen = new javax.swing.JLabel();
        label_Medicamentos = new javax.swing.JLabel();
        label_Fecha_Contagio = new javax.swing.JLabel();
        boton_VerMed = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        field_Tratamiento = new javax.swing.JTextArea();
        title_Tratamiento = new javax.swing.JLabel();
        boton_Siguiente_RegistroT = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(235, 235, 235));
        jButton2.setFont(new java.awt.Font("David Libre", 0, 11)); // NOI18N
        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(159, 211, 241));
        jPanel3.setPreferredSize(new java.awt.Dimension(470, 364));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Volver_Variante1.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_Variante1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_Variante1.setText("Volver");
        boton_Volver_Variante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_Variante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_Variante1ActionPerformed(evt);
            }
        });
        jPanel3.add(boton_Volver_Variante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 80, 27));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Denominacion1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Denominacion1.setText("Medicamento");
        jPanel4.add(label_Denominacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        field_CantDias.setBackground(new java.awt.Color(235, 235, 235));
        field_CantDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_CantDiasActionPerformed(evt);
            }
        });
        jPanel4.add(field_CantDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 30));

        label_CantDias.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_CantDias.setText("Cantidad de días:");
        jPanel4.add(label_CantDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        desplegable_Medicamento.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Medicamento.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_Medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_MedicamentoActionPerformed(evt);
            }
        });
        jPanel4.add(desplegable_Medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 420, -1));

        boton_EliminarMedicamento.setBackground(new java.awt.Color(235, 235, 235));
        boton_EliminarMedicamento.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_EliminarMedicamento.setText("Eliminar");
        boton_EliminarMedicamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_EliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EliminarMedicamentoActionPerformed(evt);
            }
        });
        jPanel4.add(boton_EliminarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, 27));

        TableMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mediamentos", "Dosis", "Cantidad Dias", "Frecuencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableMedicamento);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 450, 110));

        boton_AgregarMedicamento.setBackground(new java.awt.Color(235, 235, 235));
        boton_AgregarMedicamento.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_AgregarMedicamento.setText("Agregar");
        boton_AgregarMedicamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_AgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AgregarMedicamentoActionPerformed(evt);
            }
        });
        jPanel4.add(boton_AgregarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 27));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flo 1.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 120, 110));

        label_Frecuencia.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Frecuencia.setText("Frecuencia:");
        jPanel4.add(label_Frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        field_Frecuencia.setBackground(new java.awt.Color(235, 235, 235));
        field_Frecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_FrecuenciaActionPerformed(evt);
            }
        });
        jPanel4.add(field_Frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 80, 30));

        label_Dosis.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Dosis.setText("Dosis:");
        jPanel4.add(label_Dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        field_Dosis.setBackground(new java.awt.Color(235, 235, 235));
        field_Dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_DosisActionPerformed(evt);
            }
        });
        jPanel4.add(field_Dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 600, 340));

        title_RegistroVariante1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_RegistroVariante1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_RegistroVariante1.setText("Registro de medicamentos");
        jPanel3.add(title_RegistroVariante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 470, 40));

        regisMedicamento.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 211, 241));
        jPanel1.setMinimumSize(new java.awt.Dimension(561, 359));
        jPanel1.setPreferredSize(new java.awt.Dimension(561, 359));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Volver_RegistroT.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_RegistroT.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_RegistroT.setText("Volver");
        boton_Volver_RegistroT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_RegistroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_RegistroTActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Volver_RegistroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 80, 27));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flo 1.png"))); // NOI18N
        jPanel2.add(label_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 154, 110));

        label_Medicamentos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Medicamentos.setText("Medicamentos:");
        jPanel2.add(label_Medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        label_Fecha_Contagio.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Fecha_Contagio.setText("Descripción del tratamiento: ");
        jPanel2.add(label_Fecha_Contagio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        boton_VerMed.setBackground(new java.awt.Color(235, 235, 235));
        boton_VerMed.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_VerMed.setText("Agregar medicamentos");
        boton_VerMed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_VerMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VerMedActionPerformed(evt);
            }
        });
        jPanel2.add(boton_VerMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, 27));

        field_Tratamiento.setBackground(new java.awt.Color(235, 235, 235));
        field_Tratamiento.setColumns(17);
        field_Tratamiento.setRows(5);
        jScrollPane1.setViewportView(field_Tratamiento);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 230, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 240));

        title_Tratamiento.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_Tratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_Tratamiento.setText("Registro de Tratamiento");
        jPanel1.add(title_Tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 470, 40));

        boton_Siguiente_RegistroT.setBackground(new java.awt.Color(235, 235, 235));
        boton_Siguiente_RegistroT.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Siguiente_RegistroT.setText("Aceptar");
        boton_Siguiente_RegistroT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Siguiente_RegistroT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Siguiente_RegistroTActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Siguiente_RegistroT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 80, 27));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_Volver_RegistroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_RegistroTActionPerformed
        // TODO add your handling code here:
         RegistroVisualizacionTratamiento RVT = new RegistroVisualizacionTratamiento();
         crea.InterfazDiferentes(this, RVT, 1008, 550); 
    }//GEN-LAST:event_boton_Volver_RegistroTActionPerformed

    private void boton_VerMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VerMedActionPerformed
        // TODO add your handling code here:
       // model.removeRow(TableMedicamento.getSelectedRow());
        crea.InterfazIguales(this, regisMedicamento, 667, 494);
    }//GEN-LAST:event_boton_VerMedActionPerformed

    private void boton_Siguiente_RegistroTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Siguiente_RegistroTActionPerformed
        // TODO add your handling code here:
        Verificador veri = new Verificador();
        if(veri.dataTA (field_Tratamiento)){
            if((veri.noVacio(field_Tratamiento.getText().toString()))){
                //if((field_NTelefono.getText().toString().matches("-?\\d+"))&&(field_Numero_Doc1.getText().toString().matches("-?\\d+"))){
                    Guardar insertSQL = new Guardar();
                    if (insertSQL.guardadoTratamiento(field_Tratamiento)){
                        insertSQL.iteGuardarTratMed(TableMedicamento, field_Tratamiento);
                        field_Tratamiento.setText(""); 
                        bus.limpiarTabla(TableMedicamento);
                        field_Dosis.setText("");
                        field_CantDias.setText("");
                        field_Frecuencia.setText("");   
                    }   
            }else{
                
                 model.removeRow(TableMedicamento.getSelectedRow());
                JOptionPane.showMessageDialog(null, "No se admiten casillas con unicamente espacios en blanco","Error",ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Se encuentran casillas sin rellenar","Error",ERROR_MESSAGE);
        
    }//GEN-LAST:event_boton_Siguiente_RegistroTActionPerformed

    private void field_CantDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_CantDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_CantDiasActionPerformed

    private void field_FrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_FrecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_FrecuenciaActionPerformed

    private void field_DosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_DosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_DosisActionPerformed

    private void boton_Volver_Variante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_Variante1ActionPerformed
        // TODO add your handling code here:
        crea.InterfazIguales(regisMedicamento, this,561, 390);
    }//GEN-LAST:event_boton_Volver_Variante1ActionPerformed

    private void desplegable_MedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_MedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desplegable_MedicamentoActionPerformed

    private void boton_EliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EliminarMedicamentoActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) TableMedicamento.getModel();
        System.out.println(TableMedicamento.getSelectedRow());
        if (TableMedicamento.getSelectedRow() != -1)
        model.removeRow(TableMedicamento.getSelectedRow());
        else
        JOptionPane.showMessageDialog(null, "No ha seleccionado un Medicamento para eliminar","Warning",WARNING_MESSAGE);
    }//GEN-LAST:event_boton_EliminarMedicamentoActionPerformed

    private void boton_AgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AgregarMedicamentoActionPerformed
        // TODO add your handling code here:
        Verificador veri = new Verificador();
        model = (DefaultTableModel) TableMedicamento.getModel();
        String dato; 
        String Dosis; 
        String CantDias; 
        String Frecuencia;
        dato = desplegable_Medicamento.getSelectedItem().toString();
        if (veri.dataNB(field_Dosis)) {
            if (field_Dosis.getText().toString().matches("-?\\d+")){
                if (veri.dataNB(field_CantDias)) {
                    if (field_CantDias.getText().toString().matches("-?\\d+")){
                        if (veri.dataNB(field_Frecuencia)) {
                            if (field_Frecuencia.getText().toString().matches("-?\\d+")){
                                Dosis = field_Dosis.getText().toString();
                                CantDias = field_CantDias.getText().toString();
                                Frecuencia = field_Frecuencia.getText().toString();
                                if(!veri.existenciaTable(model, dato)){
                                    model.addRow(new Object[]{dato, Dosis, CantDias, Frecuencia});   
                                    field_Dosis.setText("");
                                    field_CantDias.setText("");
                                    field_Frecuencia.setText("");   
                                }
                            }else
                                  JOptionPane.showMessageDialog(null, "La frecuencia debe ser un valor entero","Error",ERROR_MESSAGE);
                        }  
                 }else
                     JOptionPane.showMessageDialog(null, "La cantidad de dias debe ser un valor entero","Error",ERROR_MESSAGE);
                }   
            }else
                JOptionPane.showMessageDialog(null, "La dosis debe ser un valor entero","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_AgregarMedicamentoActionPerformed

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
            java.util.logging.Logger.getLogger(registrarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new registrarTratamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMedicamento;
    private javax.swing.JButton boton_AgregarMedicamento;
    private javax.swing.JButton boton_EliminarMedicamento;
    private javax.swing.JButton boton_Siguiente_RegistroT;
    private javax.swing.JButton boton_VerMed;
    private javax.swing.JButton boton_Volver_RegistroT;
    private javax.swing.JButton boton_Volver_Variante1;
    private javax.swing.JComboBox<String> desplegable_Medicamento;
    private javax.swing.JTextField field_CantDias;
    private javax.swing.JTextField field_Dosis;
    private javax.swing.JTextField field_Frecuencia;
    private javax.swing.JTextArea field_Tratamiento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_CantDias;
    private javax.swing.JLabel label_Denominacion1;
    private javax.swing.JLabel label_Dosis;
    private javax.swing.JLabel label_Fecha_Contagio;
    private javax.swing.JLabel label_Frecuencia;
    private javax.swing.JLabel label_Medicamentos;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JFrame regisMedicamento;
    private javax.swing.JLabel title_RegistroVariante1;
    private javax.swing.JLabel title_Tratamiento;
    // End of variables declaration//GEN-END:variables
}