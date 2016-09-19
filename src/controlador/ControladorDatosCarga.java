/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.DatosCarga;

/**
 *
 * @author bangho
 */
public class ControladorDatosCarga {

    private static String url;
    private  static final Conexion conexion = new Conexion();

    public void agregar(DatosCarga datosCarga) {
        PreparedStatement stmt;
        
        try {
            
            String query = "insert into datos_carga (id_personas, fecha_carga, lugar_carga ) "
                    + "VALUES ((SELECT id_persona FROM personas WHERE dni=?), ?, ?)";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, datosCarga.getId_personas());
            stmt.setString(2, datosCarga.getFecha_carga());
            stmt.setString(3, datosCarga.getLugarCarga());

            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    
    public void modificar (DatosCarga datosCarga){
        
        try {
                        
            String query = "UPDATE datos_carga SET lugar_carga = ?, fecha_carga = ? \n" +
                           " WHERE id_dato_carga = ?";
            
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, datosCarga.getLugarCarga());
            stmt.setDate(2, Date.valueOf(datosCarga.getFecha_carga()));
            
            stmt.execute();
        } catch (Exception e) {
        }
    }
}
