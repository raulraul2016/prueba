package controlador;

//import static Controladores.ControladorAsociativismo.url;
import conexion.Conexion;
import modelo.Especialidad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorEspecialidad {

    public static String url;
    public static final Conexion conexion = new Conexion();

    public void agregar(Especialidad especialidad) {

        try {
            String query = "insert into especialidades (tipo_especialidad, descripcion) values (?, ?)";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, especialidad.getTipoEspecialidad());
            stmt.setString(2, especialidad.getDescripcionEspecialidad());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Especialidad especialidad) {

        try {
            String query = "UPDATE especialidades SET tipo_especialidad=?, descripcion=?\n"
                    + " WHERE id_especialidad=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, especialidad.getTipoEspecialidad());
            stmt.setString(2, especialidad.getDescripcionEspecialidad());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Especialidad especialidad) {

        try {
            String query = "DELETE FROM especialidades  WHERE id_especialidad = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, especialidad.getIdEspecialidad());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Especialidad extraer(Long id) {

        Especialidad esp = new Especialidad();

        try {
            String query = "SELECT id_especialidad, tipo_especialidad, descripcion\n"
                    + "  FROM especialidades";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    esp.setIdEspecialidad(rs.getLong("id_especialidad"));
                    esp.setTipoEspecialidad(rs.getString("tipo_especialidad"));
                    esp.setDescripcionEspecialidad(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return esp;
    }

    public ArrayList<Especialidad> extraerTodo() {

        ArrayList<Especialidad> arrayEspecialidad = new ArrayList<Especialidad>();

        try {

            String query = "SELECT * FROM especialidad";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayEspecialidad;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {
            String query = "SELECT id_especialidad "
                    + "FROM especialidades";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
