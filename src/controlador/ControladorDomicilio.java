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
import modelo.Domicilio;

/**
 *
 * @author bangho
 */
public class ControladorDomicilio {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public ControladorDomicilio() {
    }

    public void agregar(Domicilio domicilio) {

        try {
            String query = "INSERT INTO domicilio(\n"
                    + "            calle, nro, pais, provincia, observacion, id_localidad)\n"
                    + "    VALUES (?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, domicilio.getCalle());
            stmt.setInt(2, domicilio.getNro());
            stmt.setString(3, domicilio.getPais());
            stmt.setString(4, domicilio.getProvincia());
            stmt.setString(5, domicilio.getObservacion());
            stmt.setLong(6, domicilio.getLocalidad().getId_locaclidad());
            
            stmt.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
