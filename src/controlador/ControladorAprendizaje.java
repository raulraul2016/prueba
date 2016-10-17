package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Aprendizaje;

/**
 *
 * @author bangho
 */
public class ControladorAprendizaje {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public ControladorAprendizaje() {

    }

    public void agregar(Aprendizaje aprendizaje) {

        try {
            String query = "insert into aprendizajes (tipo_aprendizaje, descripcion) values (?, ? )";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, aprendizaje.getTipoAprendizaje());
            stmt.setString(2, aprendizaje.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Aprendizaje aprendizaje) {

        try {
            String query = "UPDATE aprendizajes SET tipo_aprendizaje=?, descripcion=?"
                    + " WHERE id_aprendizaje=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, aprendizaje.getTipoAprendizaje());
            stmt.setString(2, aprendizaje.getDescripcion());
            stmt.setLong(3, aprendizaje.getId_aprendizaje());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Aprendizaje aprendizaje) {

        try {
            String query = "DELETE FROM aprendizajes WHERE id_aprendizaje=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            //stmt.setLong(1, aprendizaje.getId_aprendizaje());
            stmt.setLong(1, aprendizaje.getId_aprendizaje());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Aprendizaje extraer(Long id) {

        Aprendizaje aprendizaje = new Aprendizaje();

        try {

            String query = "SELECT id_aprendizaje, tipo_aprendizaje, descripcion";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                aprendizaje.setTipoAprendizaje(rs.getString("id_aprendizaje"));
                aprendizaje.setDescripcion(rs.getString("tipo_aprendizaje"));
                aprendizaje.setTipoAprendizaje("descripcion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Aprendizaje> extraerTodo() {

        ArrayList<Aprendizaje> arrayAprendizaje = new ArrayList<Aprendizaje>();

        try {

            String query = "SELECT * FROM aprendizajes";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayAprendizaje;
    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_aprendizaje\n"
                    + "  FROM aprendizajes";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAprendizaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

}
