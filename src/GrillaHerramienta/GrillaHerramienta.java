package GrillaHerramienta;

import controlador.ControladorHerramienta;
import controlador.ControladorTipoHerramienta;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;
import modelo.Herramienta;

/**
 *
 * @author bangho
 */
public class GrillaHerramienta extends AbstractTableModel {

    public ArrayList<Herramienta> arrayHerramientas;
    public boolean cellEditable = false;
    public int[] columEditable = null;
    ArrayList<String> columIdentifiers;
    String[] columNames;
    ArrayList header;

    //get
    public ArrayList<Herramienta> getArrayHerramientas() {
        return arrayHerramientas;
    }

    //set
    public void setArrayHerramientas(ArrayList<Herramienta> arrayHerramientas) {
        this.arrayHerramientas = arrayHerramientas;
    }

    public GrillaHerramienta(ArrayList<Herramienta> arrayHerramientas) {
        this.arrayHerramientas = arrayHerramientas;
        columNames = new String[2];
        columNames[0] = "id";
        columNames[1] = "Nombre";

        header = new ArrayList();
        header.addAll(Arrays.asList(columNames));
        columIdentifiers = header;
    }

    @Override
    public int getRowCount() {
        return arrayHerramientas.size();
    }

    @Override
    public int getColumnCount() {
        return columIdentifiers.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return arrayHerramientas.get(rowIndex).getId();
            case 1:
                return arrayHerramientas.get(rowIndex).getNombreHerramienta();
            default:
                return null;
        }
    }

    public void removeRow(int row) {

        arrayHerramientas.remove(row);
        fireTableRowsDeleted(row, row);

    }

    public void addRow(Herramienta herramienta) {

        arrayHerramientas.add(herramienta);
        fireTableDataChanged();
    }

    public Herramienta getRow(int index) {
        return arrayHerramientas.get(index);
    }

    public String getColumnName(int rowIndex) {
        return columIdentifiers.get(rowIndex);

    }

    public void deleteRow(int selectRow) {

        Herramienta her = new Herramienta();
        ControladorHerramienta ch = new ControladorHerramienta();
        her.setId(arrayHerramientas.get(selectRow).getId());

        ch.eliminar(her);
        arrayHerramientas.remove(selectRow);
        this.fireTableRowsDeleted(selectRow, selectRow);

    }

}
