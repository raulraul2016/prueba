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
import modelo.Comercializacion;

/**
 *
 * @author bangho
 */
public class ControladorComercializacion {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Comercializacion comercializacion) {

        try {
            String query = "INSERT INTO comercializacion(\n"
                    + "            destino_produccion, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, comercializacion.getDescripcion());
            stmt.setString(2, comercializacion.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Comercializacion comercializacion) {

        try {
            String query = "UPDATE comercializacion\n"
                    + "   SET destino_produccion=?, descripcion=?\n"
                    + " WHERE id_comercializacion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, comercializacion.getDestino_produccion());
            stmt.setString(2, comercializacion.getDescripcion());
            stmt.setLong(3, comercializacion.getId_comercializacion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Comercializacion comercializacion) {

        try {
            String query = "DELETE FROM comercializacion\n"
                    + " WHERE id_comercializacion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, Long.valueOf(comercializacion.getId_comercializacion()));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Comercializacion extraer(Long id) {

        PreparedStatement stmt;

        Comercializacion comercializacion = new Comercializacion();

        try {

            String query = "SELECT * FROM comercializacion FROM comercializacion WHERE id_comercializacion = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    comercializacion.setId_comercializacion(rs.getLong("id_comercializacion"));
                    comercializacion.setDestino_produccion(rs.getString("destino_produccion"));
                    comercializacion.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comercializacion;
    }

    public ArrayList<Comercializacion> extraerTodo() {

        Comercializacion aux = new Comercializacion();
        ResultSet rs;
        ArrayList<Comercializacion> arrayComercializacion = new ArrayList<Comercializacion>();

        try {

            String query = "SELECT * FROM comercializacion";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayComercializacion;
    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_comercializacion"
                    + "FROM comercializacion";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    public ArrayList<Comercializacion> extraerTodoTipo(int tipo) {

        Comercializacion aux = new Comercializacion();
        ResultSet rs;
        ArrayList<Comercializacion> arrayComercializacion = new ArrayList<Comercializacion>();

        try {

            String query = "SELECT * FROM comercializacion WHERE id_comercializacion = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, tipo);

            rs = stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayComercializacion;
    }

}
