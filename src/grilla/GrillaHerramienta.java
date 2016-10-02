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
import modelo.TipoHerramienta;

/**
 *
 * @author bangho
 */
public class GrillaHerramienta extends AbstractTableModel {

    ArrayList<Herramienta> herramientas;
    String titulos[] = {"Nombre de Herramienta"};

    public ArrayList<Herramienta> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(ArrayList<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }

    public GrillaHerramienta(ArrayList<Herramienta> herramientas) {
        this.herramientas = herramientas;
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return herramientas.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex){
            
            case 0: return herramientas.get(rowIndex).getId();
            case 1: return herramientas.get(rowIndex).getNombreHerramienta();
            default:return null;
        }
    }

    @Override
    public String toString() {
        return "GrillaHerramienta{" + "titulos=" + titulos + '}';
    }
     
}
