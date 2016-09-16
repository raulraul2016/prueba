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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DatoPersonal;

/**
 *
 * @author bangho
 */
public class ControladorDatoPersonal {
    
    private static String url;
    private  static final Conexion conexion = new Conexion();

    public ControladorDatoPersonal() {
    
         
    }
    
    //Metodo agregar tesis3
    public void agregar(DatoPersonal dp){
        
        try {
            
            String query = "insert into personas(apellido_nombre, lugar_nacimiento,estado_civil, "
                    + "domicilio, e_mail, dni, telefono, edad, fecha_nacimiento) VALUES (?, ?, ?, ?,?, ?, ?, ?, ?)";
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, dp.getApeNom());
            stmt.setString(2, dp.getLugNac());
            stmt.setString(3, dp.getEstaCivil());          
            stmt.setString(4, dp.getDomicilio()); 
            stmt.setString(5, dp.getEmail());
            stmt.setInt(6, dp.getDni());
            stmt.setString(7, dp.getTel());
            stmt.setString(8, dp.getEdad());
            stmt.setString(9, dp.getFechaNacimiento());
            
            stmt.execute();
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void modificar(DatoPersonal dp) {

        try {
            
            String query = "UPDATE personas\n"
                    + "SET apellido_nombre=?, lugar_nacimiento=?, estado_civil=?, \n"
                    + "domicilio=?, e_mail=?, telefono=?, edad=?, fecha_nacimiento=?, \n"
                    + "dni=? WHERE id_persona = ?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, dp.getApeNom());
            stmt.setString(2, dp.getLugNac());
            stmt.setString(3, dp.getEstaCivil());
            stmt.setString(4, dp.getDomicilio());
            stmt.setString(5, dp.getEmail());
            stmt.setInt(9, dp.getDni());
            stmt.setString(6, dp.getTel());
            stmt.setString(7, dp.getEdad());
            stmt.setString(8, dp.getFechaNacimiento());
            stmt.setLong(10, dp.getId());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void eliminar(DatoPersonal dp) {

        try {

            String query = "DELETE FROM personas WHERE id_persona = ?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, dp.getId());

            try {
                stmt.execute();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
         
    }
