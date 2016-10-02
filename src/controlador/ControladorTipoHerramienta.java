/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TipoHerramienta;

/**
 *
 * @author bangho
 */
public class ControladorTipoHerramienta {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(TipoHerramienta tipoHerramienta) {

        try {

            String query = "INSERT INTO tipo_herramienta(\n"
                    + "            nombre_tipo_herramienta)\n"
                    + "    VALUES (?);";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, tipoHerramienta.getNombre_tipo_herramienta());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTipoHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(TipoHerramienta tipoHerramienta) {

        try {
            String query = "UPDATE tipo_herramienta\n"
                    + "   SET nombre_tipo_herramienta=?\n"
                    + " WHERE id_tipo_herramienta=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, tipoHerramienta.getNombre_tipo_herramienta());
            stmt.setLong(2, tipoHerramienta.getTipo_herramienta());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorTipoHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(TipoHerramienta tipoHerramienta) {

        try {
            String query = "DELETE FROM tipo_herramienta\n"
                    + " WHERE id_tipo_herramienta=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, tipoHerramienta.getTipo_herramienta());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTipoHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public TipoHerramienta extraer(Long id) {

        TipoHerramienta th = new TipoHerramienta();
        try {
            String query = "SELECT id_tipo_herramienta, nombre_tipo_herramienta\n"
                    + "  FROM tipo_herramienta WHERE id_tipo_herramienta = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                th.setTipo_herramienta(rs.getLong(1));
                th.setNombre_tipo_herramienta(rs.getString(2));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorTipoHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return th;

    }

//    public List<TipoHerramienta> extraerTodos() {
//
//        ArrayList<TipoHerramienta> arrayTipoHerramienta = new ArrayList<TipoHerramienta>();
//        try {
//
//            String query = "Select * from tipo_herramienta";
//
//            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);
//
//            ResultSet rs = stmt.executeQuery();
//
//            while (rs.next()) {
//
//                TipoHerramienta th = new TipoHerramienta();
//                th.setTipo_herramienta(Long.valueOf(rs.getLong(1)));
//                th.setNombre_tipo_herramienta(rs.getString(2));
//                arrayTipoHerramienta.add(th);
//            }
//            conexion.cerrarConexion();
//
//            return null;
//        } catch (SQLException ex) {
//            Logger.getLogger(ControladorTipoHerramienta.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return arrayTipoHerramienta;
//
//    }
}
