package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Metodologia;

/**
 *
 * @author bgh007
 */
public class ControladorMetodologia {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Metodologia metodologia) {

        try {
            String query = "INSERT INTO public.metodologias(\n"
                    + "            descripcion_trabajo, descripcion_tiempo_produ, \n"
                    + "            precio_producto, cantidad_producto)\n"
                    + "    VALUES (?, ?, ?, \n"
                    + "            ?);";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, metodologia.getDescripcion_trabajo());
            stmt.setString(2, metodologia.getDescripcion_tiempo_produ());
            stmt.setDouble(3, metodologia.getPrecio_producto());
            stmt.setInt(4, metodologia.getCantidad_producto());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Metodologia metodologia) {

        try {
            String query = "UPDATE public.metodologias\n"
                    + "   SET descripcion_trabajo=?, descripcion_tiempo_produ=?, \n"
                    + "       precio_producto=?, cantidad_producto=?\n"
                    + " WHERE id_metodologia=?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
