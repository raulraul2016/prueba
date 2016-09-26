package controlador;

import conexion.Conexion;
import static controlador.ControladorEspecialidad.url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
