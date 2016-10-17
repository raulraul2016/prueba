package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.DatoPersonal;

/**
 *
 * @author bangho
 */
public class ControladorDatoPersonal {

    private static String url;
    private static final Conexion conexion = new Conexion();
    ResultSet rs;

    public ControladorDatoPersonal() {

    }

    //Metodo agregar tesis3
    public Long agregar(DatoPersonal dp) {

        Long llave = null;

        try {

            String query = "insert into personas(apellido_nombre, lugar_nacimiento,estado_civil, "
                    + "domicilio, e_mail, dni, telefono, edad, fecha_nacimiento)"
                    + "VALUES (?, ?, ?, ?,?, ?, ?, ?, ?)";
            PreparedStatement stmt;

            /*
             PreparedStatement ps = conn.prepareStatement("INSERT INTO bla(blabla)",PreparedStatement.RETURN_GENERATED_KEYS);
             ps.executeUpdate();
             if (rs != nul && rs.next()) {
             long llave = rs.getLong(1);
             }
             */
            stmt = conexion.getConexion().prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

            stmt.setString(1, dp.getApeNom());
            stmt.setString(2, dp.getLugNac());
            stmt.setString(3, dp.getEstaCivil());
            stmt.setString(4, dp.getDomicilio());
            stmt.setString(5, dp.getEmail());
            stmt.setInt(6, dp.getDni());
            stmt.setString(7, dp.getTel());
            stmt.setString(8, dp.getEdad());
            stmt.setString(9, dp.getFechaNacimiento());

            stmt.execute();

            if (rs != null && rs.next()) {
                llave = rs.getLong(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return llave;
    }

    public void modificar(DatoPersonal dp) {

        try {

            String query = "UPDATE personas\n"
                    + "SET apellido_nombre=?, lugar_nacimiento=?, estado_civil=?, \n"
                    + "domicilio=?, e_mail=?, telefono=?, edad=?, fecha_nacimiento=?, \n"
                    + "dni=? WHERE id_persona = ?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, dp.getApeNom());
            stmt.setString(2, dp.getLugNac());
            stmt.setString(3, dp.getEstaCivil());
            stmt.setString(4, dp.getDomicilio());
            stmt.setString(5, dp.getEmail());
            stmt.setInt(9, dp.getDni());
            stmt.setString(6, dp.getTel());
            stmt.setString(7, dp.getEdad());
            stmt.setString(8, dp.getFechaNacimiento());
            stmt.setLong(10, dp.getId());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(DatoPersonal dp) {

        try {

            String query = "DELETE FROM personas WHERE id_persona = ?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, dp.getId());

            try {
                stmt.execute();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DatoPersonal extraer(Long id) {

        DatoPersonal dp = new DatoPersonal();
        try {

            String query = "SELECT id_persona, apellido_nombre, lugar_nacimiento, estado_civil, domicilio,"
                    + "e_mail, telefono, edad, fecha_nacimiento, dni";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    dp.setId(rs.getLong("id_persona"));
                    dp.setApeNom(rs.getString("apellido_nombre"));
                    dp.setLugNac(rs.getString("lugar_nacimiento"));
                    dp.setEstaCivil(rs.getString("estado_civil"));
                    dp.setDomicilio(rs.getString("domicilio"));
                    dp.setEmail(rs.getString("e_mail"));
                    dp.setTel(rs.getString("telefono"));
                    dp.setEdad(rs.getString("edad"));
                    dp.setFechaNacimiento(rs.getString("fecha_nacimiento"));
                    dp.setDni(rs.getInt("dni"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            return dp;
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public ArrayList<DatoPersonal> extraerTodo() {

        ArrayList<DatoPersonal> arrayDatoPersonal = new ArrayList<DatoPersonal>();

        try {

            String query = "SELECT * FROM personas";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayDatoPersonal;
    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_persona "
                    + "FROM personas";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(3);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDatoPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
