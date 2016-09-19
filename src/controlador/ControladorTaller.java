
package controlador;

import conexion.Conexion;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Taller;


public class ControladorTaller {
    
    private static String url;
    private Conexion conexion = new Conexion();

    public ControladorTaller() {
        
    }

    public void agregar(Taller taller){
            
        try {
            String query = "INSERT INTO talleres(lugar_produccion, descripcion, estado_taller)\n" +
                           "VALUES (?, ?, ?)) ";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, taller.getLugarProduccion());
            stmt.setString(2, taller.getDescripcion());
            stmt.setString(3, taller.getEstadoTaller());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
}
    
    

