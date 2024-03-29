package tools;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Creador {
    public void addTableHeaderEnfer(DefaultTableModel model,JTable Table) {
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Enfermedades"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderCentroAsignado(DefaultTableModel model,JTable Centros) {
        model = (DefaultTableModel) Centros.getModel();
        Object[] newIdentifiers = new Object[]{"Centros de Salud", "Fecha de asignación"};
        model.setColumnIdentifiers(newIdentifiers);
        Centros.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Centros.getColumnCount(); x++) {
            Centros.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderCentroSalud(DefaultTableModel model,JTable Centros) {
        model = (DefaultTableModel) Centros.getModel();
        Object[] newIdentifiers = new Object[]{"Codigo","Centro de salud","Dirección","Encargado","Fecha encargado","Estado","Tipo"};
        model.setColumnIdentifiers(newIdentifiers);
        Centros.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Centros.getColumnCount(); x++) {
            Centros.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderRep2(DefaultTableModel model,JTable Centros) {
        model = (DefaultTableModel) Centros.getModel();
        Object[] newIdentifiers = new Object[]{"Vacuna", "Porcentaje contagios pos vacuna"};
        model.setColumnIdentifiers(newIdentifiers);
        Centros.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Centros.getColumnCount(); x++) {
            Centros.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderRep3(DefaultTableModel model,JTable Centros) {
        model = (DefaultTableModel) Centros.getModel();
        Object[] newIdentifiers = new Object[]{"Centro de vacunacion", "Porcentaje contagios pos vacuna"};
        model.setColumnIdentifiers(newIdentifiers);
        Centros.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Centros.getColumnCount(); x++) {
            Centros.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderRep5(DefaultTableModel model,JTable Centros) {
        model = (DefaultTableModel) Centros.getModel();
        Object[] newIdentifiers = new Object[]{"Variante", "País", "Cantidad contagiados"};
        model.setColumnIdentifiers(newIdentifiers);
        Centros.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Centros.getColumnCount(); x++) {
            Centros.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderPer(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Documento","Nombre","Apellido","F.Nac","Sexo","Direccion","Teléfono","Alto riesgo","Ocupacion"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderPerRes(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Estado","Fecha reside"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderVarSint(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Síntomas"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    
    public void addTableHeaderVar(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Denominación","Linaje","F.Org","Clasificación","País"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderMedicamento(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Código","Nombre","Compuesto","Concentracion"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void Interfaz( JFrame nueva, int ancho, int largo){
        nueva.setResizable(false); 
        nueva.setVisible(true);
        nueva.setSize(ancho,largo);     
        nueva.setLocationRelativeTo(null); 
    }
    public void InterfazIguales(JFrame actual, JFrame nueva, int ancho, int largo){
        actual.setVisible(false);
        nueva.setResizable(false); 
        nueva.setVisible(true);
        nueva.setSize(ancho,largo);     
        nueva.setLocationRelativeTo(null); 
    }
    
    public void InterfazDiferentes(JFrame actual, JFrame nueva, int ancho, int largo){
        nueva.setResizable(false); 
        nueva.setSize(ancho, largo);   
        nueva.setVisible(true);   
        nueva.setLocationRelativeTo(null);
        actual.dispose();
    }
    
    //yerlin
    public void addTableHeaderPersonalSalud(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Documento","Correo","Ocupación"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    //nuevo nuevo
    public void addTableHeaderPersonaVacunada(DefaultTableModel model,JTable personaV) {
        model = (DefaultTableModel) personaV.getModel();
        Object[] newIdentifiers = new Object[]{"N° Documento", "Vacuna", "Centro Salud", "Personal de Salud", "F. Vacunación", "Dosis"};
        model.setColumnIdentifiers(newIdentifiers);
        personaV.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < personaV.getColumnCount(); x++) {
            personaV.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderVac(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"IdVacuna","Lote","Nombre","Dosis","Laboratorio","Tipo","País"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
     public void addTableHeaderVacEfec(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Síntomas"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
     
    public void addTableHeaderMed(DefaultTableModel model,JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"nombremedicamento","dosis","cantdias","frecuencia"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    } 

      public void addTableHeaderTrat(DefaultTableModel model, JTable Table){
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Codigo","Tratamiento"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
      
        public void addTableHeaderMedic(DefaultTableModel model,JTable Table) {
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Medicamentos","Dosis","Cantidad dias","Frecuencia" };
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
        
     
    //newwww
     public void addTableHeaderPersonaContagiada(DefaultTableModel model,JTable personaC) {
        model = (DefaultTableModel) personaC.getModel();
        Object[] newIdentifiers = new Object[]{"Denominación", "N° documento", "F. Contagio", "Tiempo de reposo", "Tipo de reposo"};
        model.setColumnIdentifiers(newIdentifiers);
        personaC.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < personaC.getColumnCount(); x++) {
            personaC.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
     
    public void addTableHeaderTratamientoPersonaC(DefaultTableModel model,JTable trata) {
        model = (DefaultTableModel) trata.getModel();
        Object[] newIdentifiers = new Object[]{"Codigo", "Tratamiento", "Estado"};
        model.setColumnIdentifiers(newIdentifiers);
        trata.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < trata.getColumnCount(); x++) {
            trata.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderHospitalPersonaC(DefaultTableModel model,JTable hos) {
        model = (DefaultTableModel) hos.getModel();
        Object[] newIdentifiers = new Object[]{"Codigo", "Centro Salud"};
        model.setColumnIdentifiers(newIdentifiers);
        hos.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < hos.getColumnCount(); x++) {
            hos.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
    
    public void addTableHeaderTrataPaciente(DefaultTableModel model,JTable Table) {
        model = (DefaultTableModel) Table.getModel();
        Object[] newIdentifiers = new Object[]{"Codigo", "Descripcion"};
        model.setColumnIdentifiers(newIdentifiers);
        Table.setFillsViewportHeight(true);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < Table.getColumnCount(); x++) {
            Table.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);            
        }
    }
}
