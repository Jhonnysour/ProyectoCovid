/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import SQL.Extraer;
import tools.Creador;
import tools.Buscador;
import java.util.ArrayList;
import tools.Verificador;
import SQL.Guardar;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
/**
 *
 * @author Ricardo Fanghella
 */
public class registrarPersonaContagiada extends javax.swing.JFrame {
    Extraer dataSQL = new Extraer();
    Creador crea = new Creador();
    DefaultTableModel model;
    Boolean veric;
    /**
     * Creates new form registrarMedicamento
     */
    public registrarPersonaContagiada() {
        initComponents();
        veric = false;
        crea.addTableHeaderTrataPaciente(model,TableTrata);
        ArrayList<String> listas = dataSQL.denom_oms(dataSQL.variante());
        for (int i=0;i<listas.size();i++)
            desplegable_Variantes.addItem(listas.get(i));
        listas = dataSQL.codigoTratamientos(dataSQL.TratamientoPaciente());
        for (int i=0;i<listas.size();i++)
            desplegable_Tratamientos.addItem(listas.get(i));
        listas = dataSQL.nombCentro(dataSQL.CentroSaludHos());;
        for (int i=0;i<listas.size();i++)
            desplegable_hospitales.addItem(listas.get(i));
        if(!desplegable_Tipo1.getSelectedItem().toString().equals("Hospitalizado")){
            boton_AggCentro.setEnabled(false);
        }else{
            boton_AggCentro.setEnabled(true);
        }
        desplegable_calendar.getDateEditor().setEnabled(false);
        desplegable_calendar.getJCalendar().setMaxSelectableDate(new Date());
        desplegable_calendar.setDate(new Date(System.currentTimeMillis()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regisTratamiento = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        boton_Volver_TrataPac = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        label_Denominacion = new javax.swing.JLabel();
        desplegable_Tratamientos = new javax.swing.JComboBox<>();
        boton_EliTrataPac = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTrata = new javax.swing.JTable();
        boton_AggTrataPaciente = new javax.swing.JButton();
        title_RegistroVariante = new javax.swing.JLabel();
        regisHospital = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        boton_Volver_HospitalPaciente = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        label_Denominacion1 = new javax.swing.JLabel();
        desplegable_hospitales = new javax.swing.JComboBox<>();
        title_RegistroVariante1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boton_Volver_RegistroDPC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        label_imagen = new javax.swing.JLabel();
        label_TiempoReposo = new javax.swing.JLabel();
        label_Doc = new javax.swing.JLabel();
        desplegable_calendar = new com.toedter.calendar.JDateChooser();
        label_TipoReposo = new javax.swing.JLabel();
        label_Numero_Variante2 = new javax.swing.JLabel();
        desplegable_Variantes = new javax.swing.JComboBox<>();
        label_Fecha_Contagio1 = new javax.swing.JLabel();
        field_TiempoReposo = new javax.swing.JTextField();
        textField_NDocumento = new javax.swing.JTextField();
        desplegable_Nacionalidad = new javax.swing.JComboBox<>();
        label_CentroHos = new javax.swing.JLabel();
        boton_AggTrata = new javax.swing.JButton();
        label_Tratamiento = new javax.swing.JLabel();
        desplegable_Tipo1 = new javax.swing.JComboBox<>();
        boton_AggCentro = new javax.swing.JButton();
        title_personacontagio = new javax.swing.JLabel();
        boton_Siguiente_RegistroDPC = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(159, 211, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Volver_TrataPac.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_TrataPac.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_TrataPac.setText("Volver");
        boton_Volver_TrataPac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_TrataPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_TrataPacActionPerformed(evt);
            }
        });
        jPanel3.add(boton_Volver_TrataPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 80, 27));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Denominacion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Denominacion.setText("Tratamientos:");
        jPanel4.add(label_Denominacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        desplegable_Tratamientos.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Tratamientos.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_Tratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_TratamientosActionPerformed(evt);
            }
        });
        jPanel4.add(desplegable_Tratamientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, -1));

        boton_EliTrataPac.setBackground(new java.awt.Color(235, 235, 235));
        boton_EliTrataPac.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_EliTrataPac.setText("Eliminar");
        boton_EliTrataPac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_EliTrataPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_EliTrataPacActionPerformed(evt);
            }
        });
        jPanel4.add(boton_EliTrataPac, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 90, 27));

        TableTrata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableTrata);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 270, 110));

        boton_AggTrataPaciente.setBackground(new java.awt.Color(235, 235, 235));
        boton_AggTrataPaciente.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_AggTrataPaciente.setText("Agregar");
        boton_AggTrataPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_AggTrataPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AggTrataPacienteActionPerformed(evt);
            }
        });
        jPanel4.add(boton_AggTrataPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 27));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 57, 410, 250));

        title_RegistroVariante.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_RegistroVariante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_RegistroVariante.setText("Registro de tratamiento a paciente");
        jPanel3.add(title_RegistroVariante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 40));

        regisTratamiento.getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(159, 211, 241));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Volver_HospitalPaciente.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_HospitalPaciente.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_HospitalPaciente.setText("Volver");
        boton_Volver_HospitalPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_HospitalPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_HospitalPacienteActionPerformed(evt);
            }
        });
        jPanel5.add(boton_Volver_HospitalPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 80, 27));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Denominacion1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Denominacion1.setText("Centros:");
        jPanel6.add(label_Denominacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        desplegable_hospitales.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_hospitales.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_hospitales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desplegable_hospitalesMouseClicked(evt);
            }
        });
        desplegable_hospitales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_hospitalesActionPerformed(evt);
            }
        });
        jPanel6.add(desplegable_hospitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 240, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 57, 410, 90));

        title_RegistroVariante1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_RegistroVariante1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_RegistroVariante1.setText("Registro de centro de hospitalización");
        jPanel5.add(title_RegistroVariante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 40));

        regisHospital.getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_START);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(159, 211, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Volver_RegistroDPC.setBackground(new java.awt.Color(235, 235, 235));
        boton_Volver_RegistroDPC.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Volver_RegistroDPC.setText("Volver");
        boton_Volver_RegistroDPC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Volver_RegistroDPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Volver_RegistroDPCActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Volver_RegistroDPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 80, 27));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flo 1.png"))); // NOI18N
        jPanel2.add(label_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 154, 110));

        label_TiempoReposo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_TiempoReposo.setText("Tiempo de reposo: ");
        jPanel2.add(label_TiempoReposo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        label_Doc.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Doc.setText("Documento de identidad: ");
        jPanel2.add(label_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        desplegable_calendar.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_calendar.setPreferredSize(new java.awt.Dimension(87, 24));
        jPanel2.add(desplegable_calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 180, -1));

        label_TipoReposo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_TipoReposo.setText("Tipo de reposo:");
        jPanel2.add(label_TipoReposo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        label_Numero_Variante2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Numero_Variante2.setText("Nombre de la variante:");
        jPanel2.add(label_Numero_Variante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        desplegable_Variantes.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Variantes.setPreferredSize(new java.awt.Dimension(56, 24));
        jPanel2.add(desplegable_Variantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 180, -1));

        label_Fecha_Contagio1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Fecha_Contagio1.setText("Fecha de contagio: ");
        jPanel2.add(label_Fecha_Contagio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        field_TiempoReposo.setBackground(new java.awt.Color(235, 235, 235));
        field_TiempoReposo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_TiempoReposoActionPerformed(evt);
            }
        });
        jPanel2.add(field_TiempoReposo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 140, -1));

        textField_NDocumento.setBackground(new java.awt.Color(235, 235, 235));
        textField_NDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_NDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(textField_NDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 160, -1));

        desplegable_Nacionalidad.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "E" }));
        desplegable_Nacionalidad.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_Nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_NacionalidadActionPerformed(evt);
            }
        });
        jPanel2.add(desplegable_Nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, -1));

        label_CentroHos.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_CentroHos.setText("Centro de hospitalización:");
        jPanel2.add(label_CentroHos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        boton_AggTrata.setBackground(new java.awt.Color(235, 235, 235));
        boton_AggTrata.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_AggTrata.setText("Agregar");
        boton_AggTrata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_AggTrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AggTrataActionPerformed(evt);
            }
        });
        jPanel2.add(boton_AggTrata, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, 27));

        label_Tratamiento.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        label_Tratamiento.setText("Tratamientos: ");
        jPanel2.add(label_Tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        desplegable_Tipo1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        desplegable_Tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Hospitalizado" }));
        desplegable_Tipo1.setPreferredSize(new java.awt.Dimension(56, 24));
        desplegable_Tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegable_Tipo1ActionPerformed(evt);
            }
        });
        jPanel2.add(desplegable_Tipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, -1));

        boton_AggCentro.setBackground(new java.awt.Color(235, 235, 235));
        boton_AggCentro.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_AggCentro.setText("Agregar");
        boton_AggCentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_AggCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_AggCentroActionPerformed(evt);
            }
        });
        jPanel2.add(boton_AggCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 80, 27));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 57, 470, 300));

        title_personacontagio.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        title_personacontagio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_personacontagio.setText("Registro de contagios");
        jPanel1.add(title_personacontagio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 470, 40));

        boton_Siguiente_RegistroDPC.setBackground(new java.awt.Color(235, 235, 235));
        boton_Siguiente_RegistroDPC.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        boton_Siguiente_RegistroDPC.setText("Siguiente");
        boton_Siguiente_RegistroDPC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boton_Siguiente_RegistroDPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_Siguiente_RegistroDPCActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Siguiente_RegistroDPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 80, 27));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_Volver_RegistroDPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_RegistroDPCActionPerformed
        RegistroVisualizacionPersonasContagiadas persona= new RegistroVisualizacionPersonasContagiadas();
        crea.InterfazDiferentes(this, persona,  942, 616);
    }//GEN-LAST:event_boton_Volver_RegistroDPCActionPerformed

    private void boton_Siguiente_RegistroDPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Siguiente_RegistroDPCActionPerformed
        Verificador veri = new Verificador();
        model = (DefaultTableModel) TableTrata.getModel();
        if(veri.dataNB(textField_NDocumento) && veri.dataNB(field_TiempoReposo)){
            if((veri.noVacio(textField_NDocumento.getText().toString())) &&  (veri.noVacio(field_TiempoReposo.getText().toString()))){
                if((field_TiempoReposo.getText().toString().matches("-?\\d+"))&&(textField_NDocumento.getText().toString().matches("-?\\d+"))){
                    Guardar insertSQL = new Guardar();
                    Buscador bus = new Buscador();
                    if(desplegable_Tipo1.getSelectedItem().toString().equals("Casa") || (desplegable_Tipo1.getSelectedItem().toString().equals("Hospitalizado") && (model.getRowCount() != 0) && veric)){
                        if((insertSQL.contagio(desplegable_Variantes.getSelectedItem().toString(), desplegable_Nacionalidad.getSelectedItem().toString() + textField_NDocumento.getText().toString(), desplegable_calendar, field_TiempoReposo.getText().toString(), desplegable_Tipo1.getSelectedItem().toString())) && (insertSQL.guardarPaciente(desplegable_Nacionalidad.getSelectedItem().toString() + textField_NDocumento.getText().toString()))){
                            Date date = desplegable_calendar.getDate();
                            long da = date.getTime();
                            java.sql.Date fecha = new java.sql.Date(da);
                            insertSQL.iteGuardarTrataPac(TableTrata, desplegable_Nacionalidad.getSelectedItem().toString() + textField_NDocumento.getText().toString(), fecha.toString(), "En curso");
                            if(desplegable_Tipo1.getSelectedItem().toString().equals("Hospitalizado"))
                                insertSQL.hospitalizado(desplegable_Nacionalidad.getSelectedItem().toString() + textField_NDocumento.getText().toString(), bus.codCentro(desplegable_hospitales.getSelectedItem().toString()), fecha.toString());
                            JOptionPane.showMessageDialog(null, "La persona contagiada fue registrada exitosamente");
                            RegistroVisualizacionPersonasContagiadas persona= new RegistroVisualizacionPersonasContagiadas();
                            crea.InterfazDiferentes(this, persona,  942, 616);
                        }
                        else{
                            textField_NDocumento.setText("");
                            field_TiempoReposo.setText("");
                            bus.limpiarTabla(TableTrata);
                            veric = false;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Como estuvo hospitalizado, debe registrar los tratamientos correspondientes, y el centro de hospitalización","Error",ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"La informacion en los campos numericos no es valida","Error",ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se admiten casillas con unicamente espacios en blanco","Error",ERROR_MESSAGE);
            }
        }else
            JOptionPane.showMessageDialog(null, "Se encuentran casillas sin rellenar","Error",ERROR_MESSAGE);
    }//GEN-LAST:event_boton_Siguiente_RegistroDPCActionPerformed

    private void field_TiempoReposoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_TiempoReposoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_TiempoReposoActionPerformed

    private void textField_NDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_NDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_NDocumentoActionPerformed

    private void desplegable_NacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_NacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desplegable_NacionalidadActionPerformed

    private void boton_AggTrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AggTrataActionPerformed
        crea.InterfazIguales(this, regisTratamiento, 482, 396);
    }//GEN-LAST:event_boton_AggTrataActionPerformed

    private void boton_AggCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AggCentroActionPerformed
        crea.InterfazIguales(this, regisHospital, 484, 236);
    }//GEN-LAST:event_boton_AggCentroActionPerformed

    private void boton_Volver_TrataPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_TrataPacActionPerformed
        crea.InterfazIguales(regisTratamiento, this, 542, 448);
    }//GEN-LAST:event_boton_Volver_TrataPacActionPerformed

    private void desplegable_TratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_TratamientosActionPerformed

    }//GEN-LAST:event_desplegable_TratamientosActionPerformed

    private void boton_EliTrataPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_EliTrataPacActionPerformed
        model = (DefaultTableModel) TableTrata.getModel();
        if (TableTrata.getSelectedRow() != -1)
            model.removeRow(TableTrata.getSelectedRow());
        else
            JOptionPane.showMessageDialog(null, "No ha seleccionado un tratamiento a eliminar","Warning",WARNING_MESSAGE);
    }//GEN-LAST:event_boton_EliTrataPacActionPerformed

    private void boton_AggTrataPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_AggTrataPacienteActionPerformed
        Verificador veri = new Verificador();
        Buscador bus = new Buscador();
        ArrayList<String> descrip = new ArrayList<String>();       
        model = (DefaultTableModel) TableTrata.getModel();
        String dato = desplegable_Tratamientos.getSelectedItem().toString();
        descrip = bus.DescripTrataPac(dato);
        String descripcion = descrip.get(0);
        if(!veri.existenciaTable(model, dato)){
            model.addRow(new Object[]{dato,descripcion});
        }
    }//GEN-LAST:event_boton_AggTrataPacienteActionPerformed

    private void desplegable_Tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_Tipo1ActionPerformed
        if(!desplegable_Tipo1.getSelectedItem().toString().equals("Hospitalizado")){
            boton_AggCentro.setEnabled(false);
        }else{
            boton_AggCentro.setEnabled(true);
        }
    }//GEN-LAST:event_desplegable_Tipo1ActionPerformed

    private void boton_Volver_HospitalPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_Volver_HospitalPacienteActionPerformed
        crea.InterfazIguales(regisHospital, this, 542, 448);
    }//GEN-LAST:event_boton_Volver_HospitalPacienteActionPerformed

    private void desplegable_hospitalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegable_hospitalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desplegable_hospitalesActionPerformed

    private void desplegable_hospitalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desplegable_hospitalesMouseClicked
        veric = true;
    }//GEN-LAST:event_desplegable_hospitalesMouseClicked

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
            java.util.logging.Logger.getLogger(registrarPersonaContagiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarPersonaContagiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarPersonaContagiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarPersonaContagiada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new registrarPersonaContagiada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTrata;
    private javax.swing.JButton boton_AggCentro;
    private javax.swing.JButton boton_AggTrata;
    private javax.swing.JButton boton_AggTrataPaciente;
    private javax.swing.JButton boton_EliTrataPac;
    private javax.swing.JButton boton_Siguiente_RegistroDPC;
    private javax.swing.JButton boton_Volver_HospitalPaciente;
    private javax.swing.JButton boton_Volver_RegistroDPC;
    private javax.swing.JButton boton_Volver_TrataPac;
    private javax.swing.JComboBox<String> desplegable_Nacionalidad;
    private javax.swing.JComboBox<String> desplegable_Tipo1;
    private javax.swing.JComboBox<String> desplegable_Tratamientos;
    private javax.swing.JComboBox<String> desplegable_Variantes;
    private com.toedter.calendar.JDateChooser desplegable_calendar;
    private javax.swing.JComboBox<String> desplegable_hospitales;
    private javax.swing.JTextField field_TiempoReposo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_CentroHos;
    private javax.swing.JLabel label_Denominacion;
    private javax.swing.JLabel label_Denominacion1;
    private javax.swing.JLabel label_Doc;
    private javax.swing.JLabel label_Fecha_Contagio1;
    private javax.swing.JLabel label_Numero_Variante2;
    private javax.swing.JLabel label_TiempoReposo;
    private javax.swing.JLabel label_TipoReposo;
    private javax.swing.JLabel label_Tratamiento;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JFrame regisHospital;
    private javax.swing.JFrame regisTratamiento;
    private javax.swing.JTextField textField_NDocumento;
    private javax.swing.JLabel title_RegistroVariante;
    private javax.swing.JLabel title_RegistroVariante1;
    private javax.swing.JLabel title_personacontagio;
    // End of variables declaration//GEN-END:variables
}
