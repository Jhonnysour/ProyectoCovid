package view;

import SQL.ConexionSQL;
import SQL.Reporte;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tools.Creador;

public class Reporte7 extends javax.swing.JFrame {

    public Reporte7() throws SQLException {
        initComponents();
        Statement st;
        ConexionSQL con = new ConexionSQL();
        st = con.connected().createStatement();
        String [] datos = new String[4];
        DefaultTableModel model = new DefaultTableModel();
        tabla_centros.setModel(model);
        model.addColumn("Nombre del Centro");
        model.addColumn("Tipo de Centro");
        model.addColumn("Cantidad Hospitalizados");
        model.addColumn("Cantidad Vacunados");
        Reporte r = new Reporte();
        ResultSet rs = r.reporte_7();
        while (rs.next()){
            datos[0] = rs.getString(1);
            if(rs.getString(2)==null){
                datos[1] = "Vacunacion";
            }else{
                datos[1] = "Hospitalizacion";
            }
            datos[2] = rs.getString(4);
            datos[3] = rs.getString(5);
            model.addRow(datos);
        }
        st.close();
        con.disconnect();     
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_centros = new javax.swing.JTable();
        title_RegistroSintomas1 = new javax.swing.JLabel();
        title_RegistroSintomas2 = new javax.swing.JLabel();

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
        jPanel1.add(boton_Volver_Sintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 80, 27));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_centros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sintomas "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_centros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_centrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_centros);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 500, 190));

        title_RegistroSintomas1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_RegistroSintomas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_RegistroSintomas1.setText("Cantidad de personas vacunadas o hospitalizadas");
        title_RegistroSintomas1.setAutoscrolls(true);
        title_RegistroSintomas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(title_RegistroSintomas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 530, 40));

        title_RegistroSintomas2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_RegistroSintomas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_RegistroSintomas2.setText("por centro de salud");
        title_RegistroSintomas2.setAutoscrolls(true);
        title_RegistroSintomas2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(title_RegistroSintomas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 530, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 560, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_Volver_SintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_SintomasActionPerformed
        VisualizacionReportes rep = new VisualizacionReportes();
        Creador crea = new Creador();
        crea.InterfazDiferentes(this, rep, 720, 375);
    }//GEN-LAST:event_boton_Volver_SintomasActionPerformed

    private void tabla_centrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_centrosMouseClicked

    }//GEN-LAST:event_tabla_centrosMouseClicked

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
            java.util.logging.Logger.getLogger(Reporte7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Reporte7().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Reporte7.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Volver_Sintomas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_centros;
    private javax.swing.JLabel title_RegistroSintomas1;
    private javax.swing.JLabel title_RegistroSintomas2;
    // End of variables declaration//GEN-END:variables
}
