package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Obtencion_mp;

/**
 *
 * @author bgh007
 */
public class ControladorObtencion_mp {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Obtencion_mp obtencion_mp) {

        try {
            String query = "INSERT INTO public.obtenciones_mp(\n"
                    + "            tipo_obten_mat_pri, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, obtencion_mp.getTipo_obten_mat_pri());
            stmt.setString(2, obtencion_mp.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorObtencion_mp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Obtencion_mp obtencion_mp) {

        try {
            String query = "UPDATE public.obtenciones_mp\n"
                    + "   SET id_obtencion_mp=?, tipo_obten_mat_pri=?, descripcion=?\n"
                    + " WHERE id_obtencion_mp=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, obtencion_mp.getTipo_obten_mat_pri());
            stmt.setString(2, obtencion_mp.getDescripcion());
            stmt.setLong(3, obtencion_mp.getId_obtencion_mp());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorObtencion_mp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Obtencion_mp obtencion_mp) {

        try {
            String query = "DELETE FROM public.obtenciones_mp\n"
                    + " WHERE id_obtencion_mp=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, obtencion_mp.getId_obtencion_mp());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorObtencion_mp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Obtencion_mp extraer(Long id) {

        Obtencion_mp obtencion_mp = new Obtencion_mp();

        try {

            String query = "SELECT id_extraccion_mp, adquisicion_mp, descripcion"
                    + " FROM materia_prima_forma_obtencion";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    obtencion_mp.setId_obtencion_mp(rs.getLong("id_extraccion_mp"));
                    obtencion_mp.setTipo_obten_mat_pri(rs.getString("adquisicion_mp"));
                    obtencion_mp.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorObtencion_mp.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorObtencion_mp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obtencion_mp;
    }
}
