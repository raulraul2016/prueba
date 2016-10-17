package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Necesidad;

/**
 *
 * @author bgh007
 */
public class ControladorNecesidad {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Necesidad necesidad) {

        try {
            String query = "INSERT INTO public.necesidades(\n"
                    + "            tipo_necesidad, asistencia_tecnica, descripcion, \n"
                    + "            \"disponibilidad_enseñanza\")\n"
                    + "    VALUES (?, ?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, necesidad.getTipo_necesidad());
            stmt.setString(2, necesidad.getAsistencia_tecnica());
            stmt.setString(3, necesidad.getDescripcion());
            stmt.setString(4, necesidad.getDisponibilidad());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Necesidad necesidad) {

        try {
            String query = "UPDATE public.necesidades\n"
                    + "   SET tipo_necesidad=?, asistencia_tecnica=?, descripcion=?, \n"
                    + "       \"disponibilidad_enseñanza=?\n"
                    + " WHERE id_necesidad=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, necesidad.getTipo_necesidad());
            stmt.setString(2, necesidad.getAsistencia_tecnica());
            stmt.setString(3, necesidad.getDescripcion());
            stmt.setString(4, necesidad.getDisponibilidad());
            stmt.setLong(5, necesidad.getId_necesidad());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Necesidad necesidad) {

        try {
            String query = "DELETE FROM public.necesidades\n"
                    + " WHERE id_necesidad=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, Long.valueOf(necesidad.getId_necesidad()));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Necesidad extraer(Long id) {

        Necesidad necesidad = new Necesidad();

        try {

            String query = "SELECT id_necesidad, tipo_necesidad, asistencia_tecnica, descripcion, \n"
                    + "       \"disponibilidad_enseñanza\"\n"
                    + "  FROM necesidades";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    necesidad.setId_necesidad(rs.getLong("id_necesidad"));
                    necesidad.setTipo_necesidad(rs.getString("tipo_necesidad"));
                    necesidad.setAsistencia_tecnica(rs.getString("asistencia_tecnica"));
                    necesidad.setDescripcion(rs.getString("descripcion"));
                    necesidad.setDisponibilidad(rs.getString("disponibilidad_enseñanza"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return necesidad;
    }

    public ArrayList<Necesidad> extraerTodo() {

        ArrayList<Necesidad> arrayNecesidad = new ArrayList<Necesidad>();

        try {

            String query = "SELECT * FROM necesidades";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayNecesidad;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_necesidad "
                    + "FROM necesidades;";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
