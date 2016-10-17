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
import modelo.DatosCarga;

/**
 *
 * @author bangho
 */
public class ControladorDatosCarga {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(DatosCarga datosCarga) {

        ControladorDatoPersonal cdp = new ControladorDatoPersonal();

        try {
            PreparedStatement stmt;

            String query = "INSERT INTO datos_carga(\n"
                    + "            lugar_carga, id_personas, fecha_carga)\n"
                    + "    VALUES (?, ?, ?);";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, datosCarga.getLugarCarga());
            stmt.setLong(2, datosCarga.getDatoPersonal().getId());
            stmt.setString(3, datosCarga.getFecha_carga());

            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(DatosCarga datosCarga) {

        try {
            ControladorDatoPersonal cdp = new ControladorDatoPersonal();

            String query = "UPDATE datos_carga SET lugar_carga = ?, id_personas=?, fecha_carga = ? \n"
                    + " WHERE id_dato_carga = ?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, datosCarga.getLugarCarga());
            stmt.setLong(3, datosCarga.getDatoPersonal().getId());
            stmt.setString(2, datosCarga.getFecha_carga());
            stmt.setLong(4, datosCarga.getId_dato_carga());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(DatosCarga datosCarga) {

        try {
            String query = "DELETE FROM datos_carga\n"
                    + " WHERE id_dato_carga = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, datosCarga.getId_dato_carga());
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public DatosCarga extraer(Long id) {

        DatosCarga datosCarga = new DatosCarga();
        ControladorDatoPersonal cdp = new ControladorDatoPersonal();

        try {

            String query = "SELECT lugar_carga, id_dato_carga, id_personas, fecha_carga"
                    + " FROM datos_carga";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    datosCarga.setLugarCarga(rs.getString("lugar_carga"));
                    datosCarga.setId_dato_carga(rs.getLong("id_dato_carga"));
                    datosCarga.setDatoPersonal(cdp.extraer(rs.getLong("id_personas")));
                    datosCarga.setFecha_carga(rs.getString("fecha_carga"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datosCarga;

    }

    public ArrayList<DatosCarga> extraerTodo() {

        ArrayList<DatosCarga> arrayDatosCarga = new ArrayList<DatosCarga>();

        try {

            String query = "SELECT lugar_carga, id_dato_carga, id_personas, fecha_carga "
                    + "FROM datos_carga";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayDatosCarga;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_dato_carga"
                    + " FROM datos_carga";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(2);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatosCarga.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
