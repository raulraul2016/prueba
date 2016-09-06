package controlador;

//import static Controladores.ControladorDatoPersonalDatoCarga.url;
import modelo.Rubro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class ControladorRubro {

    public static String url;
    public static Connection conexion;
    
    
    
    public ControladorRubro() {
        
         try {
             Class.forName("org.postgresql.Driver");
             url= "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion= DriverManager.getConnection(url,"postgres", "camello");
            System.out.println("conectado");
        } catch (Exception e) {
        }
        
    }
    
    public void agregar(Object o) {
          
        try {
              
           
              Rubro Rubro= (Rubro) o;
              String query= "insert into rubros (id_especialidad, id_aprendizaje, tipo_rubro, descripcion) values ((select id_especialidad from especialidades where id_especilidades = ?), (select id_aprendizaje from aprendizajes where id_aprendizaje = ?),?,?)";
              PreparedStatement stmt;
              stmt = conexion.prepareStatement(query);
              
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
    
}
