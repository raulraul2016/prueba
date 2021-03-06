/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MateriaPrima;

/**
 *
 * @author bangho
 */
public class ControladorMateriaPrima {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(MateriaPrima materiaPrima) {

        try {
            String query = "INSERT INTO materias_prima(nombre_materia_prima, descripcion) VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrima.getNombre_materia_prima());
            stmt.setString(2, materiaPrima.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(MateriaPrima materiaPrima) {

        try {
            String query = "UPDATE materias_prima SET nombre_materia_prima=?, descripcion=?"
                    + " WHERE id_materia_prima=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrima.getNombre_materia_prima());
            stmt.setString(2, materiaPrima.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(MateriaPrima materiaPrima) {

        try {
            String query = "DELETE FROM materias_prima  WHERE id_materia_prima=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, materiaPrima.getId_materia_prima());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public MateriaPrima extraer(Long id) {

        MateriaPrima mp = new MateriaPrima();
        PreparedStatement stmt;

        try {

            String query = "SELECT id_materia_prima, nombre_materia_prima, descripcion\n"
                    + "  FROM materias_prima WHERE id_materia_prima = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                mp.setId_materia_prima(rs.getLong("id_materia_prima"));
                mp.setNombre_materia_prima(rs.getString("nombre_materia_prima"));
                mp.setDescripcion(rs.getString("descripcion"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mp;
    }

    public ArrayList<MateriaPrima> extraerTodo() {

        MateriaPrima aux = new MateriaPrima();
        ResultSet rs;
        ArrayList<MateriaPrima> arrayMateriaPrima = new ArrayList<MateriaPrima>();

        try {

            String query = "SELECT id_materia_prima FROM materias_prima";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();

            while (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayMateriaPrima.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMateriaPrima;
    }

    public ArrayList<MateriaPrima> extraerTodoTipo(int tipo) {

        MateriaPrima aux = new MateriaPrima();
        ResultSet rs;
        ArrayList<MateriaPrima> arrayMateriaPrima = new ArrayList<MateriaPrima>();

        try {

            String query = "SELECT * FROM materias_prima WHERE id_materia_prima = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setInt(1, tipo);

            rs = stmt.executeQuery();

            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayMateriaPrima.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMateriaPrima;
    }

}
