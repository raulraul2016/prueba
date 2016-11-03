package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public void eliminar(Metodologia metodologia) {

        try {
            String query = "DELETE FROM metodologias\n"
                    + " WHERE id_metodologia=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, metodologia.getId_metodologia());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Metodologia extraer(Long id) {

        PreparedStatement stmt;
        Metodologia metodologia = new Metodologia();

        try {

            String query = "SELECT id_metodologia, descripcion_trabajo, descripcion_tiempo_produ, \n"
                    + "       precio_producto, cantidad_producto\n"
                    + "  FROM metodologias WHERE id_metodologia = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    metodologia.setId_metodologia(rs.getLong("id_metodologia"));
                    metodologia.setDescripcion_trabajo(rs.getString("descripcion_trabajo"));
                    metodologia.setDescripcion_tiempo_produ("descripcion_tiempo_produ");
                    metodologia.setPrecio_producto(rs.getDouble("precio_producto"));
                    metodologia.setCantidad_producto(rs.getInt("cantidad_producto"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return metodologia;
    }

    public ArrayList<Metodologia> extraerTodo() {

        Metodologia aux = new Metodologia();
        ResultSet rs;
        ArrayList<Metodologia> arrayMetodologia = new ArrayList<Metodologia>();

        try {

            String query = "SELECT * FROM metodologias";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();
            if(rs.next()){
                aux = extraer(rs.getLong(1));
                arrayMetodologia.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMetodologia;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_metodologia "
                    + "FROM metodologias";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public ArrayList<Metodologia> extraerTodoTipo(int tipo) {

        Metodologia aux = new Metodologia();
        ResultSet rs;
        ArrayList<Metodologia> arrayMetodologia = new ArrayList<Metodologia>();

        try {

            String query = "SELECT * FROM metodologias WHERE id_metodologia = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();
            if(rs.next()){
                aux = extraer(rs.getLong(1));
                arrayMetodologia.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMetodologia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMetodologia;

    }
}
