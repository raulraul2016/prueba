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

    public void modificar(Domicilio domicilio) {

        try {
            String query = "UPDATE domicilio\n"
                    + "   SET calle=?, nro=?, pais=?, provincia=?, observacion=?, \n"
                    + "       id_localidad=?\n"
                    + " WHERE id_domicilio=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, domicilio.getCalle());
            stmt.setInt(2, domicilio.getNro());
            stmt.setString(3, domicilio.getPais());
            stmt.setString(4, domicilio.getProvincia());
            stmt.setString(5, domicilio.getObservacion());
            stmt.setLong(6, domicilio.getLocalidad().getId_locaclidad());
            stmt.setLong(7, domicilio.getId_domicilio());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Domicilio domicilio) {

        try {
            String query = "DELETE FROM domicilio\n"
                    + " WHERE id_domicilio=?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, domicilio.getId_domicilio());
            
            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDomicilio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Domicilio extraer(){
        
        Domicilio domicilio = new Domicilio();
        ControladorLocalidad cl = new ControladorLocalidad();
        String query = "SELECT * FROM domicilio";
        
        PreparedStatement stmt;
        
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            
            domicilio.setCalle(rs.getString("calle"));
            domicilio.setNro(rs.getInt("nro"));
            domicilio.setPais(rs.getString("pais"));
            domicilio.setProvincia(rs.getString("provincia"));
            domicilio.setObservacion(rs.getString("observacion"));
            domicilio.setLocalidad(cl.);
        }
    }

}
