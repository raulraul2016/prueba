package controlador;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import conexion.Conexion;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Herramienta;

public class ControladorHerramienta {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public ControladorHerramienta() {

    }

    public void agregar(Herramienta herramienta) {

        try {
            String query = "INSERT INTO herramientas(\n"
                    + "            nombre_herramienta, id_tipo_herramienta, descripcion)\n"
                    + "    VALUES (?, ?, ?)";
            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, herramienta.getNombreHerramienta());
            stmt.setLong(2, Long.valueOf(herramienta.getTipoHerramienta().getTipo_herramienta()));
            stmt.setString(3, herramienta.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Herramienta herramienta) {

        try {
            String query = "UPDATE herramientas\n"
                    + "   SET nombre_herramienta=?, id_tipo_herramienta=?, \n"
                    + "       descripcion=?\n"
                    + " WHERE id_herramienta=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, herramienta.getNombreHerramienta());
            stmt.setLong(2, herramienta.getTipoHerramienta().getTipo_herramienta());
            stmt.setString(3, herramienta.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Herramienta herramienta) {

        try {
            String query = "DELETE FROM herramientas\n"
                    + " WHERE id_herramienta = ? ";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, Long.valueOf(herramienta.getId()));
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
