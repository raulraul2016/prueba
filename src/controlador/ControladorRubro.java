package controlador;

//import static Controladores.ControladorDatoPersonalDatoCarga.url;
import conexion.Conexion;
import modelo.Rubro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ControladorRubro {

    private static String url;
    private static Conexion conexion = new Conexion();

    public ControladorRubro() {

    }

    public void agregar(Object o) {

        try {
            Rubro rubro = (Rubro) o;
            String query = "INSERT INTO rubros(\n"
                    + "            tipo_rubro, descripcion, id_aprendizaje, id_especialidad)\n"
                    + "    VALUES (?, ?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, rubro.getTipoRubro());
            stmt.setString(2, rubro.getDescripcionRubro());
            stmt.setLong(3, rubro.getAprendizaje().getId_aprendizaje());
            stmt.setLong(4, rubro.getEspecialidad().getIdEspecialidad());

            stmt.execute();
            //stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Rubro rubro) {

        try {
            String query = "UPDATE rubros\n"
                    + "   SET tipo_rubro=?, descripcion=?, id_aprendizaje=?, id_especialidad=?\n"
                    + " WHERE id_rubro=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, rubro.getTipoRubro());
            stmt.setString(2, rubro.getDescripcionRubro());
            stmt.setLong(3, rubro.getAprendizaje().getId_aprendizaje());
            stmt.setLong(4, rubro.getEspecialidad().getIdEspecialidad());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Rubro rubro) {

        try {
            String query = "DELETE FROM rubro WHERE id_rubro = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, rubro.getId());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Rubro extraer(Long id) {

        Rubro rubro = new Rubro();
        ControladorAprendizaje ca = new ControladorAprendizaje();
        ControladorEspecialidad ce = new ControladorEspecialidad();

        try {

            String query = "SELECT id_rubro, tipo_rubro, descripcion, id_aprendizaje, id_especialidad\n"
                    + "  FROM rubros";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    rubro.setId(rs.getLong("id_rubro"));
                    rubro.setTipoRubro(rs.getNString("tipo_rubro"));
                    rubro.setDescripcionRubro(rs.getString("descripcion"));
                    rubro.setAprendizaje(ca.extraer(rs.getLong("id_aprendizaje")));
                    rubro.setEspecialidad(ce.extraer(rs.getLong("id_especialidad")));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rubro;
    }

    public ArrayList<Rubro> extraerTodo() {

        ArrayList<Rubro> arrayRubro = new ArrayList<Rubro>();

        try {

            String query = "SELECT id_rubro, tipo_rubro, descripcion, id_aprendizaje, id_especialidad\n"
                    + "  FROM rubros";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayRubro;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_rubro "
                    + "FROM rubros";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorRubro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }
}
