
package controlador;

import conexion.Conexion;
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
    private static final Conexion conexion =  new Conexion();

    public ControladorAprendizaje() {
        
       }
    
    
    public void agregar (Object o){
        
        try {
            
            Aprendizaje a = (Aprendizaje) o;
            String query = "insert into aprendizajes (tipo_aprendizaje) values ( ? )";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, a.getTipoAprendizaje());
            
            stmt.execute();
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
    
}
