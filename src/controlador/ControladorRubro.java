package controlador;

//import static Controladores.ControladorDatoPersonalDatoCarga.url;
import conexion.Conexion;
import modelo.Rubro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ControladorRubro {

    private static String url;
    private static Conexion conexion = new Conexion();
    
    
    
    public ControladorRubro() {
                
    }
    
    public void agregar(Object o) {
          
        try {
              
           
              Rubro Rubro= (Rubro) o;
              String query= "insert into rubros (id_especialidad, id_aprendizaje, tipo_rubro, descripcion) values ((select id_especialidad from especialidades where id_especilidades = ?), (select id_aprendizaje from aprendizajes where id_aprendizaje = ?),?,?)";
              PreparedStatement stmt;
              stmt = conexion.getConexion().prepareStatement(query);
              
              stmt.setLong(1, Rubro.getId_especialidad());
              stmt.setLong(2, Rubro.getId_aprendizaje());
              stmt.setString(3, Rubro.getTipoRubro());
              stmt.setString(4, Rubro.getDescripcionRubro());
        
              
              stmt.execute();
              //stmt.close();
  
              
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
  }
    
    
    public void modificar(Rubro rubro){
        
        try {
            String query = "INSERT INTO rubros(tipo_rubro, descripcion) VALUES (?, ?)";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, rubro.getTipoRubro());
            stmt.setString(2, rubro.getDescripcionRubro());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminar(Rubro rubro){
        
        try {
            String query = "DELETE FROM rubro WHERE id_rubro = ?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, rubro.getId());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
