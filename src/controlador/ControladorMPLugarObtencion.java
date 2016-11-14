package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.MateriaPrimaLugarObtencion;

/**
 *
 * @author bgh007
 */
public class ControladorMPLugarObtencion {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(MateriaPrimaLugarObtencion materiaPrimaLugarObtencion) {

        try {
            String query = "INSERT INTO public.materia_prima_lugar_obtenciones(\n"
                    + "            tipo_obten_mat_pri, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrimaLugarObtencion.getLugar_obtencion());
            stmt.setString(2, materiaPrimaLugarObtencion.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(MateriaPrimaLugarObtencion materiaPrimaLugarObtencion) {

        try {
            String query = "UPDATE public.materia_prima_lugar_obtenciones\n"
                    + "   SET id_obtencion_mp=?, tipo_obten_mat_pri=?, descripcion=?\n"
                    + " WHERE id_obtencion_mp=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, materiaPrimaLugarObtencion.getLugar_obtencion());
            stmt.setString(2, materiaPrimaLugarObtencion.getDescripcion());
            stmt.setLong(3, materiaPrimaLugarObtencion.getId_obtencion_mp());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(MateriaPrimaLugarObtencion materiaPrimaLugarObtencion) {

        try {
            String query = "DELETE FROM public.materia_prima_lugar_obtenciones\n"
                    + " WHERE id_obtencion_mp=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, materiaPrimaLugarObtencion.getId_obtencion_mp());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public MateriaPrimaLugarObtencion extraer(Long id) {

        PreparedStatement stmt;

        MateriaPrimaLugarObtencion materiaPrimaLugarObtencion = new MateriaPrimaLugarObtencion();

        try {

            String query = "SELECT id_lugar_obtencion, lugar_obtencion, descripcion "
                    + "FROM materia_prima_lugar_obtenciones = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    materiaPrimaLugarObtencion.setId_obtencion_mp(rs.getLong(1));
                    materiaPrimaLugarObtencion.setLugar_obtencion(rs.getString(2));
                    materiaPrimaLugarObtencion.setDescripcion(rs.getString(3));

                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materiaPrimaLugarObtencion;
    }

    public ArrayList<MateriaPrimaLugarObtencion> extraerTodo() {

        MateriaPrimaLugarObtencion aux = new MateriaPrimaLugarObtencion();
        ResultSet rs;
        ArrayList<MateriaPrimaLugarObtencion> arrayMateriaPrimaLugraObtencion = new ArrayList<MateriaPrimaLugarObtencion>();

        try {

            String query = "SELECT * FROM materia_prima_lugar_obtenciones";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();

            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayMateriaPrimaLugraObtencion.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMateriaPrimaLugraObtencion;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_extraccion_mp"
                    + " FROM materia_prima_lugar_obtenciones";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public ArrayList<MateriaPrimaLugarObtencion> extraerTodoTipo(int tipo) {

        MateriaPrimaLugarObtencion aux = new MateriaPrimaLugarObtencion();
        ResultSet rs;
        ArrayList<MateriaPrimaLugarObtencion> arrayMateriaPrimaLugarObtencion = new ArrayList<MateriaPrimaLugarObtencion>();

        try {

            String query = "SELECT * FROM materia_prima_lugar_obtenciones WHERE id_extraccion_mp = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, tipo);

            rs = stmt.executeQuery();

            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayMateriaPrimaLugarObtencion.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorMPLugarObtencion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayMateriaPrimaLugarObtencion;

    }
}
