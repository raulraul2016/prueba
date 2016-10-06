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
    
    public Localidad extraer(){
        
        Localidad localidad = new Localidad();
        
        String query = "SELECT * FROM localidad";
        
        PreparedStatement stmt;
        
        stmt = conexion.getConexion().prepareStatement(query);
        
        stmt.setLong(1, localidad.getId_locaclidad());
        stmt
    }

}
