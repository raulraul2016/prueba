package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Taller;

public class ControladorTaller {

    private static String url;
    private Conexion conexion = new Conexion();

    public ControladorTaller() {

    }

    public void agregar(Taller taller) {

        try {
            String query = "INSERT INTO talleres(\n"
                    + "            lugar_produccion, descripcion, id_herramientas, estado_taller)\n"
                    + "    VALUES (?, ?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, taller.getLugarProduccion());
            stmt.setString(2, taller.getDescripcion());
            stmt.setLong(3, taller.getHerramienta().getId());
            stmt.setString(4, taller.getEstadoTaller());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Taller taller) {

        try {
            String query = "UPDATE talleres\n"
                    + "   SET lugar_produccion=?, descripcion=?, id_herramientas=?, \n"
                    + "       estado_taller=?\n"
                    + " WHERE id_taller=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, taller.getLugarProduccion());
            stmt.setString(2, taller.getEstadoTaller());
            stmt.setString(3, taller.getDescripcion());
            stmt.setLong(4, taller.getHerramienta().getId());
            stmt.setLong(5, taller.getId());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Taller taller) {

        try {
            String query = "DELETE FROM talleres\n"
                    + " WHERE id_taller=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, taller.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Taller extraer(Long id) {

        PreparedStatement stmt;
        Taller taller = new Taller();

        ControladorHerramienta che = new ControladorHerramienta();

        try {

            String query = "SELECT id_taller, lugar_produccion, descripcion, estado_taller FROM talleres"
                    + "WHERE id_taller = ?";

            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    taller.setId(Long.valueOf(rs.getLong("id")));
                    taller.setLugarProduccion(rs.getString("lugar_produccion"));
                    taller.setDescripcion(rs.getString("descripcion"));
                    taller.setHerramienta(che.extraer(rs.getLong("id_herramientas")));
                    taller.setEstadoTaller(rs.getString("estado_taller"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return taller;
    }

    public ArrayList<Taller> extraerTodo() {

        Taller aux = new Taller();
        ResultSet rs;
        ArrayList<Taller> arrayTaller = new ArrayList<Taller>();

        try {
            String query = "SELECT * FROM  talleres";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();
            
            if(rs.next()){
                aux = extraer(rs.getLong(1));
                arrayTaller.add(aux);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayTaller;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_taller "
                    + "FROM talleres";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public ArrayList<Taller> extraerTodoTipo(int tipo) {

        Taller aux = new Taller();
        ResultSet rs;
        ArrayList<Taller> arrayTaller = new ArrayList<Taller>();

        try {
            String query = "SELECT * FROM  talleres WHERE id_taller = ?";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setInt(1, tipo);

            rs = stmt.executeQuery();
            
            if(rs.next()){
                aux = extraer(rs.getLong(1));
                arrayTaller.add(aux);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorTaller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayTaller;

    }
    
}
