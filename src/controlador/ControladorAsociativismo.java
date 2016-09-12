
package Controlador;

import java.sql.DriverManager;
import Modelo.Asociativismo;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author bangho
 */
public class ControladorAsociativismo {
    
    public static String url;
    public static Connection conexion;

    public ControladorAsociativismo() {
    
          try {
             Class.forName("org.postgresql.Driver");
             url= "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion= DriverManager.getConnection(url,"postgres", "molina");
            System.out.println("conectado");
        } catch (Exception e) {
        }
    }
    

    
    public void agregar(Object o){
        
        try {
            Asociativismo Asoc = (Asociativismo) o;
            String query = "insert into asociativismos (tipo_asociativismo, descripcion_legal_constituido, descripcion) values (?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
            stmt.setString(1, Asoc.getTipo_asocit());
            stmt.setString(2, Asoc.getDescripcionAciocit());
            stmt.setString(3, Asoc.getDescripLegal());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void modificar (Object o, String id){
        
        try {
            
            Asociativismo Asoc = (Asociativismo) o;
            String query = "update asociat (id_asociativismo, tipo_asociativismo) values (?, ?)";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
            stmt.setLong(1, Asoc.getId_asocit());
            
            stmt.executeQuery();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
        
     public void eliminar(Object o, String id){
         
         try {
             Asociativismo Asoc = (Asociativismo) o;
             String query = "delete from asociat where id = ?";
             PreparedStatement stmt;
             stmt = conexion.prepareStatement(query);
             
             stmt.setLong(1, Asoc.getId_asocit());
             
             stmt.executeQuery();
         } catch (Exception e) {
         }
     }   
        
    }

