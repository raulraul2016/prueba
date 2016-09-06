/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.ControladorEspecialidad.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import modelo.Aprendizaje;

/**
 *
 * @author bangho
 */
public class ControladorAprendizaje {
    
    private static String url;
    private static Connection conexion;

    public ControladorAprendizaje() {
        
          try {
             Class.forName("org.postgresql.Driver");
             url= "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion= DriverManager.getConnection(url,"postgres", "molina");
            System.out.println("conectado");
        } catch (Exception e) {
        }
    }
    
    
    public void agregar (Object o){
        
        try {
            
            Aprendizaje a = (Aprendizaje) o;
            String query = "insert into aprendizajes (tipo_aprendizaje) values ( ? )";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
            stmt.setString(1, a.getTipoAprendizaje());
            
            stmt.execute();
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
    
}
