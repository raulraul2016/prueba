/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            String query = "INSERT INTO materias_prima(tipo_materia_prima, descripcion) VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrima.getTipo_materia_prima());
            stmt.setString(2, materiaPrima.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMateriaPrima.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(MateriaPrima materiaPrima) {

        try {
            String query = "UPDATE materias_prima SET tipo_materia_prima=?, descripcion=? WHERE id_materia_prima=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrima.getTipo_materia_prima());
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

}
