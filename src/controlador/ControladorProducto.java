package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;

/**
 *
 * @author bgh007
 */
public class ControladorProducto {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Producto producto) {

        try {
            String query = "INSERT INTO public.productos(\n"
                    + "            tipo_producto, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, producto.getTipo_producto());
            stmt.setString(2, producto.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Producto producto) {

        try {
            String query = "UPDATE public.productos\n"
                    + "   SET tipo_producto=?, descripcion=?\n"
                    + " WHERE id_producto=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, producto.getTipo_producto());
            stmt.setString(2, producto.getDescripcion());
            stmt.setLong(3, producto.getId_producto());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Producto producto) {

        try {
            String query = "DELETE FROM public.productos\n"
                    + " WHERE id_producto=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, producto.getId_producto());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
