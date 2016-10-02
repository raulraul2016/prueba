/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grilla;

import controlador.ControladorHerramienta;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.table.AbstractTableModel;
import modelo.Herramienta;

/**
 *
 * @author bangho
 */
public class GrillaHerramienta {

    private JDesktopPane desktopPane;
    //Declaro la Grilla de Datos
    public GrillaHerramienta grillaHerramienta;
    public Herramienta herramienta;
    //Declaro e Instancio el Controlador
    ControladorHerramienta che = new ControladorHerramienta();
    
    
    public void setDesktopPane(JDesktopPane desktopPane){
        this.desktopPane=desktopPane;
    }
    public JDesktopPane getDesktopPane(){
        return this.desktopPane;
    }
    /**
     * Creates new form AbmAreaConocimiento
     */
    public GestionAreaConocimiento() {
        initComponents();
        cargarGrilla();
    }
    
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if(jtGrilla.getSelectedRow()<0){
        JOptionPane.showMessageDialog(null,"Falta seleccionar Area de Conocimiento","Error",JOptionPane.ERROR_MESSAGE);
       }else{
        AreaConocimiento ac=grillaAreaConocimiento.getRow(jtGrilla.getSelectedRow());
        
        AbmAreaConocimiento aac=new AbmAreaConocimiento(digesto.util.Util.SIS_OP_MODIFICAR, ac);
        aac.setGac(this);
        this.desktopPane.add(aac);
        aac.setVisible(true);
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
       grillaAreaConocimiento=new GrillaAreaConocimiento((ArrayList<AreaConocimiento>) acc.extraerTodos());
       
       if(jtGrilla.getSelectedRow()<0){
       JOptionPane.showMessageDialog(null,"Falta seleccionar Area de Conocimiento","Error",JOptionPane.ERROR_MESSAGE);
       }else{
       AreaConocimiento ac=grillaAreaConocimiento.getRow(jtGrilla.getSelectedRow());
       acc.borrar(ac);
       cargarGrilla();
       }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
         aac=new AbmAreaConocimiento(digesto.util.Util.SIS_OP_NUEVO, new AreaConocimiento());
            aac.setGac(this);
         this.desktopPane.add(aac);
        aac.setVisible(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    public void cargarGrilla(){
       grillaAreaConocimiento=new GrillaAreaConocimiento((ArrayList<AreaConocimiento>) acc.extraerTodos());
       jtGrilla.setModel(grillaAreaConocimiento);
    }
}
