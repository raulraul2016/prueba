package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MateriaPrima;
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

    public Producto extraer(Long id) {

        Producto producto = new Producto();
        ControladorMateriaPrima cmp = new ControladorMateriaPrima();
        try {

            String query = "SELECT id_producto, tipo_producto, descripcion, precio_producto, cantidad, \n"
                    + "       id_materia_prima\n"
                    + "  FROM productos";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    producto.setId_producto(rs.getLong("id_producto"));
                    producto.setTipo_producto(rs.getString("tipo_producto"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setPrecio(rs.getDouble("precio_producto"));
                    producto.setCantidad(rs.getInt("cantidad"));
                    producto.setMateriaPrima(cmp.extraer(rs.getLong("id_materia_prima")));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producto;
    }

    public ArrayList<Producto> extraerTodo() {

        ArrayList<Producto> arrayProducto = new ArrayList<Producto>();

        try {
            String query = "SELECT id_producto, tipo_producto, descripcion, precio_producto, cantidad, \n"
                    + "       id_materia_prima\n"
                    + "  FROM productos";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProducto;

    }

    public Long extraerUltimoId() {
        Long id = null;

        try {

            String query = "SELECT id_producto"
                    + "FROM productos";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
