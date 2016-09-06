package controlador;




//import static Controladores.ControladorAsociativismo.url;
import modelo.Especialidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ControladorEspecialidad {
    
    
public static String url; 
public static Connection conexion;

    public ControladorEspecialidad() {
        
        
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
            Especialidad Espec = (Especialidad) o;
            String query = "insert into especialidades (tipo_especialidad, descripcion) values (?, ?)";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
            stmt.setString(1, Espec.getTipoEspecialidad());
            stmt.setString(2, Espec.getDescripcionEspecialidad());
            
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


public void modificar (Object o, String id){
        
        try {
            
            Especialidad Espec = (Especialidad) o;
            String query = "update especialidades (id_especialidad, tipo_especialidad) values (?, ?)";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
            stmt.setLong(1, Espec.getIdEspecialidad());
            
            stmt.executeQuery();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
        
     public void eliminar(Object o, String id){
         
         try {
             Especialidad Espec = (Especialidad) o;
             String query = "delete from especialidades where id = ?";
             PreparedStatement stmt;
             stmt = conexion.prepareStatement(query);
             
             stmt.setLong(1, Espec.getIdEspecialidad());
             
             stmt.executeQuery();
         } catch (Exception e) {
         }
     }   
        
}
