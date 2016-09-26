
package controlador;

import conexion.Conexion;
import modelo.Asociativismo;
import java.sql.PreparedStatement;
/**
 *
 * @author bangho
 */
public class ControladorAsociativismo {
    
    private static String url;
    private static final Conexion conexion = new Conexion();

    public ControladorAsociativismo() {
    }

    public void agregar(Asociativismo asociativismo){
        
        try {
            
            String query = "insert into asociativismos (tipo_asociativismo, descripcion_legal_constituido, "
                         + "descripcion) values (?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, asociativismo.getTipo_asocit());
            stmt.setString(2, asociativismo.getDescripcionAciocit());
            stmt.setString(3, asociativismo.getDescripLegal());
            
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void modificar (Asociativismo asociativismo){
        
        try {
            
            
            String query = "UPDATE asociativismos SET tipo_asociativismo = ?, descripcion_legal_constituido = ?, \n" +
                           "descripcion = ? WHERE id_asociativismo = ?";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, asociativismo.getTipo_asocit());
            stmt.setString(2, asociativismo.getDescripcionAciocit());
            stmt.setString(3, asociativismo.getDescripLegal());
            
            stmt.executeQuery();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
        
     public void eliminar(Asociativismo asociativismo){
         
         try {
             
             String query = "delete from asociat where id_asociativismo = ?";
             PreparedStatement stmt;
             stmt = conexion.getConexion().prepareStatement(query);
             
             stmt.setLong(1, asociativismo.getId_asocit());
             
             stmt.executeQuery();
         } catch (Exception e) {
         }
     }   
        
    }

