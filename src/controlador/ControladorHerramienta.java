
package controlador;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import modelo.Herramienta;


public class ControladorHerramienta {
    
    private static String url;
    private Connection conexion;

    public ControladorHerramienta() {
        
         try {
            Class.forName("org.postgresql.Driver");
            url = "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion = DriverManager.getConnection(url, "postgres", "camello");
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void agregar(Object o){
            
            
            PreparedStatement stmt;
        String query;
        try {
            //DatoPersonal Dato = (DatoPersonal) o;
            Herramienta herramienta = (Herramienta) o;
            query = "insert into herramientas (tipo_herramienta, descripcion, id_detalle_herramienta) "
                    + "VALUES (?, ?(SELECT id_detalle_herramienta FROM detalle_herramienta WHERE id_detalle_herramienta = ?))";
            
            
            stmt = conexion.prepareStatement(query);

            
            //stmt.setArray(1, (Array) herramienta.getTipoHerramienta());
            stmt.setArray(1, (Array) herramienta.getdHerramienta());
          //stmt.setString(2, herramienta.getDescripcion());
           

            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
