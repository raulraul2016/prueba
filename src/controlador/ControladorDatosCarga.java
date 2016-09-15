/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
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

    public void agregar(Object o) {
        PreparedStatement stmt;
        String query;
        try {
            
            DatosCarga DatoC = (DatosCarga) o;
            query = "insert into datos_carga (id_personas, fecha_carga, lugar_carga ) "
                    + "VALUES ((SELECT id_persona FROM personas WHERE dni=?), ?, ?)";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, DatoC.getId_personas());
            stmt.setString(2, DatoC.getFecha_carga());
            stmt.setString(3, DatoC.getLugarCarga());

            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
