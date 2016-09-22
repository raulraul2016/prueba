package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Premio;

/**
 *
 * @author bgh007
 */
public class ControladorPremio {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Premio premio) {

        try {
            String query = "INSERT INTO public.premios(\n"
                    + "            tipo_premio, institucion, descripcion)\n"
                    + "    VALUES (?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, premio.getTipo_premio());
            stmt.setString(2, premio.getInstitucion());
            stmt.setString(3, premio.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPremio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Premio premio) {

        try {
            String query = "UPDATE public.premios\n"
                    + "   SET tipo_premio=?, institucion=?, descripcion=?\n"
                    + " WHERE id_premio=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, premio.getTipo_premio());
            stmt.setString(2, premio.getInstitucion());
            stmt.setString(3, premio.getDescripcion());
            stmt.setLong(4, premio.getId_premio());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPremio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Premio premio) {

        try {
            String query = "DELETE FROM public.premios\n"
                    + " WHERE id_premio=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, premio.getId_premio());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPremio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
