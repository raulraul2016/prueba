package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MateriaPrimaFormaObtencion;

/**
 *
 * @author bangho
 */
public class ControladorMPFormaObtencion {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(MateriaPrimaFormaObtencion materiaPrimaFormaObtencion) {

        try {
            String query = "INSERT INTO materia_prima_forma_obtencion(\n"
                    + "    adquisicion_mp, descripcion, id_materia_prima)\n"
                    + "    VALUES (?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrimaFormaObtencion.getAdquisicion_mp());
            stmt.setString(2, materiaPrimaFormaObtencion.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(MateriaPrimaFormaObtencion materiaPrimaFormaObtencion) {

        try {
            String query = "UPDATE materia_prima_forma_obtencion\n"
                    + "   SET adquisicion_mp=?, descripcion=?, id_materia_prima=?\n"
                    + " WHERE id_extraccion_mp=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrimaFormaObtencion.getAdquisicion_mp());
            stmt.setString(2, materiaPrimaFormaObtencion.getDescripcion());
            stmt.setLong(3, materiaPrimaFormaObtencion.getId_extraccion_mp());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(MateriaPrimaFormaObtencion materiaPrimaFormaObtencion) {

        try {
            String query = "DELETE FROM public.materia_prima_lugar_obtenciones\n"
                    + " WHERE id_obtencion_mp=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, materiaPrimaFormaObtencion.getId_extraccion_mp());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public MateriaPrimaFormaObtencion extraer(Long id) {

        PreparedStatement stmt;

        MateriaPrimaFormaObtencion materiaPrimaFormaObtencion = new MateriaPrimaFormaObtencion();

        try {

            String query = "SELECT id_extraccion_mp, adquisicion_mp, descripcion"
                    + " FROM materia_prima_lugar_obtenciones WHERE id_extraccion = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {

                    materiaPrimaFormaObtencion.setId_extraccion_mp(rs.getLong("id_extraccion_mp"));
                    materiaPrimaFormaObtencion.setAdquisicion_mp(rs.getString("adquisicion_mp"));
                    materiaPrimaFormaObtencion.setDescripcion(rs.getString("descripcion"));

                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materiaPrimaFormaObtencion;
    }

    public ArrayList<MateriaPrimaFormaObtencion> extraerTodo() {

        MateriaPrimaFormaObtencion aux = new MateriaPrimaFormaObtencion();
        ResultSet rs;
        ArrayList<MateriaPrimaFormaObtencion> arrayMateriaPrimaFormaObtencion = new ArrayList<MateriaPrimaFormaObtencion>();

        try {

            String query = "SELECT id_lugar_obtencion FROM materia_prima_lugar_obtenciones";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();

            while (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayMateriaPrimaFormaObtencion.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMateriaPrimaFormaObtencion;

    }

    public ArrayList<MateriaPrimaFormaObtencion> extraerTodoTipo(int tipo) {

        MateriaPrimaFormaObtencion aux = new MateriaPrimaFormaObtencion();
        ResultSet rs;
        ArrayList<MateriaPrimaFormaObtencion> arrayMateriaPrimaFormaObtencion = new ArrayList<MateriaPrimaFormaObtencion>();

        try {

            String query = "SELECT * FROM materia_prima_lugar_obtenciones WHERE id_extraccion_mp = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, tipo);

            rs = stmt.executeQuery();

            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayMateriaPrimaFormaObtencion.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPFormaObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMateriaPrimaFormaObtencion;

    }
}
