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
import modelo.Formacion;

/**
 *
 * @author bangho
 */
public class ControladorFormacion {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Formacion formacion) {

        try {
            String query = "INSERT INTO formaciones(nivel_formacion, descripcion) VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, formacion.getNivelFormacion());
            stmt.setString(2, formacion.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificar(Formacion formacion) {

        try {
            String query = "UPDATE formaciones SET nivel_formacion=?, descripcion=?\n"
                    + " WHERE id_formacion=?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, formacion.getDescripcion());
            stmt.setString(2, formacion.getNivelFormacion());
            stmt.setLong(3, formacion.getId_formacion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Formacion formacion) {

        try {
            String query = "DELETE FROM formaciones WHERE id_formacion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, formacion.getId_formacion());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Formacion extraer(Long id) {

        Formacion formacion = new Formacion();
        try {

            String query = "SELECT * FROM id_formacion";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    formacion.setId_formacion(rs.getLong("id_formacion"));
                    formacion.setNivelFormacion(rs.getString("nivel_formacion"));
                    formacion.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorFormacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return formacion;
    }

    public ArrayList<Formacion> extraerTodo() {

        ArrayList arrayFormacion = new ArrayList<Formacion>();

        try {

            String query = "SELECT * FROM formacion";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayFormacion;

    }

}
