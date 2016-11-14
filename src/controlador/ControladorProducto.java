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
            String query = "INSERT INTO productos(\n"
                    + "            tipo_producto, descripcion, id_materia_prima)\n"
                    + "    VALUES (?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, producto.getNomnbreProducto());
            stmt.setString(2, producto.getDescripcion());
            stmt.setLong(5, producto.getMateriaPrima().getId_materia_prima());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Producto producto) {

        try {
            String query = "UPDATE productos\n"
                    + "   SET tipo_producto=?, descripcion=?, id_materia_prima=?\n"
                    + " WHERE id_producto=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, producto.getNomnbreProducto());
            stmt.setString(2, producto.getDescripcion());
            stmt.setLong(5, producto.getMateriaPrima().getId_materia_prima());
            stmt.setLong(6, producto.getId_producto());

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

            String query = "SELECT id_producto, tipo_producto, descripcion,"
                    + "id_materia_prima FROM productos WHERE id_producto = ?";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    producto.setId_producto(rs.getLong("id_producto"));
                    producto.setNomnbreProducto(rs.getString("tipo_producto"));
                    producto.setDescripcion(rs.getString("descripcion"));
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

        Producto aux = new Producto();
        ResultSet rs;
        ArrayList<Producto> arrayProducto = new ArrayList<Producto>();

        try {
            String query = "SELECT id_producto, FROM productos";

            /*
             String query = "Select id_tipo_herramienta from tipo_herramienta";
             */
            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();
            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayProducto.add(aux);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProducto;

    }

    public ArrayList<Producto> extraerTodoTipo(int tipo) {

        Producto aux = new Producto();
        ResultSet rs;
        ArrayList<Producto> arrayProducto = new ArrayList<Producto>();

        try {
            String query = "SELECT id_producto, tipo_producto, descripcion,id_materia_prima\n"
                    + "  FROM productos WHERE id_producto = ?";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            stmt.setInt(1, tipo);

            rs = stmt.executeQuery();
            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayProducto.add(aux);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayProducto;

    }

}
