package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bangho
 */
public class Conexion {

    private Connection conexion;

    public Conexion() {

        try {

            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion = DriverManager.getConnection(url, "postgres", "camello");
            System.out.println("conectado");

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConexion() {
        return conexion;
    }
    
    public void cerrarConexion(){
        
        try {
            this.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}