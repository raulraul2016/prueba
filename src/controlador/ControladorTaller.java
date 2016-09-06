
package controlador;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Taller;


public class ControladorTaller {
    
    private static String url;
    private Connection conexion;

    public ControladorTaller() {
        
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
        Long id_recuperado;
        ResultSet rs;
        
        try {
            //DatoPersonal Dato = (DatoPersonal) o;
            Taller taller = (Taller) o;
            
//            query = "insert into talleres (id_herramientas, lugar_produccion, descripcion, estado_taller )"
//                    + " VALUES (?, ?, ?, ?)";
               
            /*Probar agregando ademas en el insrt into el id de la tabla para luego poder recuperarlo de 
            manera mas facil...*/           
            
      /*Util    query = "insert into talleres (lugar_produccion, descripcion, id_herramientas, estado_taller )"
                    + " VALUES (?, ?, (SELECT id_taller FROM talleres WHERE id_taller = ?), ?)";
                */    
//            query = "insert into talleres (id_taller, lugar_produccion, descripcion, id_herramientas, estado_taller )"
//                    + " VALUES (null, ?, ?, (SELECT id_taller FROM talleres WHERE id_taller = ?), ?)";
//                
            query = "insert into talleres (lugar_produccion, descripcion, id_herramienta, estado_taller)"
                    + "values (?, ?, (select id_herramienta from herramientas))";
            
            
//            stmt = conexion.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
//
//            rs = stmt.getGeneratedKeys();
//            while(rs.next());
//            System.out.println("Clave generada: "+rs.getLong(1));
//            stmt.setString(1, taller.getLugarProduccion());
//            stmt.setString(2, taller.getDescripcion());
 //           stmt.setString(3, taller.getEstadoTaller());
 //           stmt.setLong(4, taller.getId_herramienta());
            
            /* declarar la forma de recuperar el Id de PreparedStatement ultimo agregado...-
             */
            /*rs = PreparedStatement.getGeneratedKeys;
            id_recuperado = rs.getLong(1);
            rs = stmt.getGeneratedKeys();           // Retrieve the automatically       2 
                                                    // generated key values in a ResultSet.
                                                    // Two rows are returned.
                                                    // Create ResultSet for query
            while (rs.next()) {
            int idColVar = rs.getInt(1);     
                                                    // Get automatically generated key
                                                    // values
            System.out.println("automatically generated key value = " + idColVar);
            */
           
            // stmt.setArray(5, (Array) taller.getHerramienta());
//            stmt = conexion.prepareStatement(query);
//            stmt.setString(1, taller.getLugarProduccion());
//            stmt.setString(2, taller.getDescripcion());
//            stmt.setString(3, taller.getEstadoTaller());
//            stmt.setInt(4, taller.getIdHerramienta());
                
//            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
            
        }
    
    
    

