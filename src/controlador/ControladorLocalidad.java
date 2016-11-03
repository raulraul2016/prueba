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
import modelo.Localidad;

/**
 *
 * @author bangho
 */
public class ControladorLocalidad {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Localidad localidad) {

        try {
            String query = "INSERT INTO localidades(localidad, descripcion) VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, localidad.getLocalidad());
            stmt.setString(2, localidad.getDescripcion());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Localidad localidad) {

        try {
            String query = "UPDATE localidades SET localidad=?, descripcion=? WHERE id_localidad=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, localidad.getLocalidad());
            stmt.setString(2, localidad.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Localidad localidad) {

        try {
            String query = "DELETE FROM localidades WHERE id_localidad=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, localidad.getId_locaclidad());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Localidad extraer(Long id) {

        PreparedStatement stmt;
        Localidad localidad = new Localidad();

        try {

            String query = "SELECT id_localidad, nombre_localidad, descripcion FROM localidad WHERE id_localidad = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                localidad.setId_locaclidad(rs.getLong("id_localidad"));
                localidad.setLocalidad(rs.getString("nombre_localidad"));
                localidad.setDescripcion(rs.getString("descripcion"));

            }

            stmt.setLong(1, localidad.getId_locaclidad());
            stmt.setString(2, localidad.getDescripcion());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return localidad;
    }

    public ArrayList<Localidad> extraerTodo() {

        Localidad aux = new Localidad();
        ResultSet rs;
        ArrayList<Localidad> arrayLocalidad = new ArrayList<Localidad>();

        try {

            String query = "SELECT * FROM localidad";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();

            if (rs.next()) {

                aux = extraer(rs.getLong(1));
                arrayLocalidad.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayLocalidad;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_localidad"
                    + " FROM localidades;";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public ArrayList<Localidad> extraerTodoTipo(int tipo) {

        Localidad aux = new Localidad();
        ResultSet rs;
        ArrayList<Localidad> arrayLocalidad = new ArrayList<Localidad>();

        try {

            String query = "SELECT * FROM localidad WHERE id_localidad = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setInt(1, tipo);

            rs = stmt.executeQuery();

            if (rs.next()) {

                aux = extraer(rs.getLong(1));
                arrayLocalidad.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayLocalidad;

    }

}
