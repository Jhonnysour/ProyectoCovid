
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tools.Creador;


public class VisualizacionReportes extends javax.swing.JFrame {
    Creador crea = new Creador();

    public VisualizacionReportes() {
        initComponents();
        crea.Interfaz(this, 730, 350);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_Volver_Sintomas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttom_reporte1 = new javax.swing.JButton();
        buttom_reporte2 = new javax.swing.JButton();
        buttom_reporte3 = new javax.swing.JButton();
        buttom_reporte4 = new javax.swing.JButton();
        buttom_reporte5 = new javax.swing.JButton();
        buttom_reporte6 = new javax.swing.JButton();
        buttom_reporte7 = new javax.swing.JButton();
        buttom_reporte8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 211, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Volver_Sintomas.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_Sintomas.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_Sintomas.setText("Volver");
        boton_Volver_Sintomas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_Sintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_SintomasActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Volver_Sintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 80, 27));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flo 1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 130, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flo 1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 160, 120, 100));

        buttom_reporte1.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte1.setText("1. Cantidad de pacientes contagiados más de una vez, y tipo de reposo");
        buttom_reporte1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 490, 30));

        buttom_reporte2.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte2.setText("2. Porcentaje de personas vacunadas por centro, contagiados luego de la vacuna");
        buttom_reporte2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 490, 30));

        buttom_reporte3.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte3.setText("3. Valor de la eficacia de cada vacuna con respecto al nivel de contagio");
        buttom_reporte3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte3ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 490, 30));

        buttom_reporte4.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte4.setText("4. Tratamientos aplicados a pacientes, virus y sus características.");
        buttom_reporte4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte4ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 490, 30));

        buttom_reporte5.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte5.setText("5. Países donde viven más personas contagiadas por cada variante.");
        buttom_reporte5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte5ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 490, 30));

        buttom_reporte6.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte6.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte6.setText("6. Top 3 de variantes con más personas contagiadas.");
        buttom_reporte6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte6ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 490, 30));

        buttom_reporte7.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte7.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte7.setText("7. Por centro, indicar tipo y por cada uno, cantidad de vacunados o pacientes.");
        buttom_reporte7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte7ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 490, 30));

        buttom_reporte8.setBackground(new java.awt.Color(235, 235, 235));
        buttom_reporte8.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        buttom_reporte8.setText("8. Reporte detallado de todos los síntomas de cada virus, y vacuna más eficaz");
        buttom_reporte8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttom_reporte8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttom_reporte8ActionPerformed(evt);
            }
        });
        jPanel2.add(buttom_reporte8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 490, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 640, 260));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_Volver_SintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_SintomasActionPerformed
        SistemaOMS Sis = new SistemaOMS();
        crea.InterfazDiferentes(this, Sis, 717, 325);
    }//GEN-LAST:event_boton_Volver_SintomasActionPerformed

    private void buttom_reporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte1ActionPerformed
        Reporte1 r = new Reporte1();
        crea.InterfazDiferentes(this, r, 560, 560);
    }//GEN-LAST:event_buttom_reporte1ActionPerformed

    private void buttom_reporte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte2ActionPerformed
        Reporte2 rep = new Reporte2();
        crea.InterfazDiferentes(this, rep, 890, 330);
    }//GEN-LAST:event_buttom_reporte2ActionPerformed

    private void buttom_reporte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte3ActionPerformed
        Reporte3 rep = new Reporte3();
        crea.InterfazDiferentes(this, rep, 890, 370);
    }//GEN-LAST:event_buttom_reporte3ActionPerformed

    private void buttom_reporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte4ActionPerformed
        Reporte4 rep = new Reporte4();
        crea.InterfazDiferentes(this, rep, 865, 414);
    }//GEN-LAST:event_buttom_reporte4ActionPerformed

    private void buttom_reporte5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte5ActionPerformed
        Reporte5 rep;
        rep = new Reporte5();
        crea.InterfazDiferentes(this, rep, 890, 320);
    }//GEN-LAST:event_buttom_reporte5ActionPerformed

    private void buttom_reporte6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte6ActionPerformed
        Reporte6 rep;
        try {
            rep = new Reporte6();
            crea.InterfazDiferentes(this, rep, 630, 412);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_buttom_reporte6ActionPerformed

    private void buttom_reporte7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte7ActionPerformed
        Reporte7 rep;
        try {
            rep = new Reporte7();
            crea.InterfazDiferentes(this, rep, 650, 415);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_buttom_reporte7ActionPerformed

    private void buttom_reporte8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttom_reporte8ActionPerformed
        Reporte8 rep = new Reporte8();
        crea.InterfazDiferentes(this, rep, 560, 560);
    }//GEN-LAST:event_buttom_reporte8ActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizacionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizacionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizacionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizacionReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizacionReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Volver_Sintomas;
    private javax.swing.JButton buttom_reporte1;
    private javax.swing.JButton buttom_reporte2;
    private javax.swing.JButton buttom_reporte3;
    private javax.swing.JButton buttom_reporte4;
    private javax.swing.JButton buttom_reporte5;
    private javax.swing.JButton buttom_reporte6;
    private javax.swing.JButton buttom_reporte7;
    private javax.swing.JButton buttom_reporte8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
