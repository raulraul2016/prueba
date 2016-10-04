package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public Herramienta extraer(Long id) {

        Herramienta herramienta = new Herramienta();

        try {

            ControladorTipoHerramienta cth = new ControladorTipoHerramienta();
            String query = "SELECT id_herramienta, nombre_herramienta, id_tipo_herramienta, descripcion";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    herramienta.setId(rs.getLong("id_herramienta"));
                    herramienta.setNombreHerramienta(rs.getString("nombre_herramienta"));
                    herramienta.setTipoHerramienta(cth.extraer(rs.getLong("id_tipo_herramienta")));
                    herramienta.setDescripcion(rs.getString("descripcion"));

                } catch (SQLException ex) {
                    Logger.getLogger(ControladorHerramienta.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
           
        } catch (SQLException ex) {
            Logger.getLogger(ControladorHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList <Herramienta> extraerTodo() {
        
        ArrayList <Herramienta> arrayHerramienta = new ArrayList <Herramienta>();

        try {
            String query = "SELECT * FROM herramientas";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayHerramienta;

    }
}
