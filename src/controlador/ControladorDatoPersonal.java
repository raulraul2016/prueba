/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import modelo.DatoPersonal;

/**
 *
 * @author bangho
 */
public class ControladorDatoPersonal {
    
    private static String url;
    private static Connection conexion;

    public ControladorDatoPersonal() {
    
         try {
             Class.forName("org.postgresql.Driver");
             url= "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion= DriverManager.getConnection(url,"postgres", "camello");
            System.out.println("conectado");
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
    
    //Metodo agregar tesis3
    public void agregar(Object o){
        
        try {
            DatoPersonal Dato = (DatoPersonal) o;
            String query = "insert into personas(apellido_nombre, lugar_nacimiento,estado_civil, domicilio, e_mail, dni, telefono, edad, fecha_nacimiento) VALUES (?, ?, ?, ?,?, ?, ?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
            stmt.setString(1, Dato.getApeNom());
            stmt.setString(2, Dato.getLugNac());
            stmt.setString(3, Dato.getEstaCivil());          
            stmt.setString(4, Dato.getDomicilio()); 
            stmt.setString(5, Dato.getEmail());
            stmt.setInt(6, Dato.getDni());
            stmt.setString(7, Dato.getTel());
            stmt.setString(8, Dato.getEdad());
            stmt.setString(9, Dato.getFechaNacimiento());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
         
         
    }
