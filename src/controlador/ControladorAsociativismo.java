package controlador;

import conexion.Conexion;
import modelo.Asociativismo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bangho
 */
public class ControladorAsociativismo {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public ControladorAsociativismo() {
    }

    public void agregar(Asociativismo asociativismo) {

        try {

            String query = "insert into asociativismos (tipo_asociativismo, descripcion_legal_constituido, "
                    + "descripcion) values (?, ?, ?)";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, asociativismo.getTipo_asocit());
            stmt.setString(2, asociativismo.getDescripcionAciocit());
            stmt.setString(3, asociativismo.getDescripLegal());

            stmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificar(Asociativismo asociativismo) {

        try {

            String query = "UPDATE asociativismos SET tipo_asociativismo = ?, descripcion_legal_constituido = ?, \n"
                    + "descripcion = ? WHERE id_asociativismo = ?";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, asociativismo.getTipo_asocit());
            stmt.setString(2, asociativismo.getDescripcionAciocit());
            stmt.setString(3, asociativismo.getDescripLegal());
            stmt.setLong(4, asociativismo.getId_asocit());

            stmt.executeQuery();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminar(Asociativismo asociativismo) {

        try {

            String query = "delete from asociat where id_asociativismo = ?";
            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, asociativismo.getId_asocit());

            stmt.executeQuery();
        } catch (Exception e) {
        }
    }

    public Asociativismo extraer(Long id) {

        PreparedStatement stmt;
        Asociativismo aso = new Asociativismo();

        try {

            ControladorAsociativismo cas = new ControladorAsociativismo();

            String query = "SELECT * FROM asociativismos FROM asociativismos WHERE id_asociativismo = ?";

            stmt = conexion.getConexion().prepareStatement(query);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    aso.setId_asocit(rs.getLong("id_asociativismo"));
                    aso.setTipo_asocit(rs.getString("tipo_asociativismo"));
                    aso.setDescripLegal(rs.getString("descripcion_legal_constituido"));
                    aso.setDescripcionAciocit(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAsociativismo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAsociativismo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aso;
    }

    public ArrayList<Asociativismo> extraerTodo() {

        Asociativismo aux = new Asociativismo();
        ResultSet rs;
        ArrayList<Asociativismo> arrayAso = new ArrayList<Asociativismo>();
            
        try {
            String query = "SELECT * FROM asociativismos";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                aux = extraer(rs.getLong(1));
                arrayAso.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAsociativismo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayAso;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_asociativismo"
                    + "  FROM asociativismos";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorAsociativismo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAsociativismo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }
    
    public ArrayList<Asociativismo> extraerTodoTipo(int tipo) {

        Asociativismo aux = new Asociativismo();
        ResultSet rs;
        ArrayList<Asociativismo> arrayAso = new ArrayList<Asociativismo>();
            
        try {
            String query = "SELECT * FROM asociativismos WHERE id_asociativismo = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, tipo);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                aux = extraer(rs.getLong(1));
                arrayAso.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAsociativismo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayAso;

    }

}
