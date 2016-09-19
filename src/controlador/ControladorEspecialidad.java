package controlador;

//import static Controladores.ControladorAsociativismo.url;
import conexion.Conexion;
import modelo.Especialidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            String query = "UPDATE especialidades SET id_especialidad=?, tipo_especialidad=?, descripcion=?\n"
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
    
    public void eliminar(Especialidad especialidad){
        
        try {
            String query = "DELETE FROM especialidades  WHERE id_especialidad = ?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, especialidad.getIdEspecialidad());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEspecialidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
