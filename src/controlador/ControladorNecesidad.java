package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                    + "    VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, necesidad.getTipo_necesidad());
            stmt.setString(2, necesidad.getAsistencia_tecnica());
            stmt.setString(3, necesidad.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorNecesidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Necesidad necesidad) {

        try {
            String query = "UPDATE public.necesidades\n"
                    + "   SET tipo_necesidad=?, asistencia_tecnica=?, descripcion=?, \n"
                    + "       \"disponibilidad_enseñanza\"=?\n"
                    + " WHERE id_necesidad=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, necesidad.getTipo_necesidad());
            stmt.setString(2, necesidad.getAsistencia_tecnica());
            stmt.setString(3, necesidad.getDescripcion());
            stmt.setLong(4, necesidad.getId_necesidad());

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
}
