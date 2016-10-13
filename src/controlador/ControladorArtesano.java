/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Artesano;

/**
 *
 * @author bangho
 */
public class ControladorArtesano {

    private String url;
    private static final Conexion conexion = new Conexion();

    public ControladorArtesano() {

    }

    public void agregar(Artesano artesano) {

        try {

            String query = "INSERT INTO artesanos(\n"
                    + "            descripcion, disponibilidad_viajar, disponibilidad_horaria, \n"
                    + "            monotributista, subsidio, beca, institucion, \"enseñar\", id_dato_personal, \n"
                    + "            id_formacion, id_taller, id_asociativismo, id_localidad, id_departamento)\n"
                    + "    VALUES (?, ?, ?, ?, \n"
                    + "            ?, ?, ?, ?, ?, ?, \n"
                    + "            ?, ?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareCall(query);

            stmt.setString(1, artesano.getDescripcion());
            stmt.setString(2, artesano.getDisp_viajar());
            stmt.setString(3, artesano.getDisp_horaria());
            stmt.setString(4, artesano.getMonotributista());
            stmt.setString(5, artesano.getSubsidio());
            stmt.setString(6, artesano.getBeca());
            stmt.setString(6, artesano.getInstitucion());
            stmt.setString(8, artesano.getEnseñar());
            stmt.setLong(9, artesano.getDatoPersonal().getId());
            stmt.setObject(10, artesano.getFormacion());
            stmt.setObject(11, artesano.getTaller());
            stmt.setObject(12, artesano.getAsociativismo());
            stmt.setObject(13, artesano.getLocalidad());
            stmt.setObject(14, artesano.getDepartamento());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificar(Artesano artesano) {

        try {

            String query = "UPDATE artesanos\n"
                    + "   SET descripcion=?, disponibilidad_viajar=?, disponibilidad_horaria=?, \n"
                    + "       monotributista=?, subsidio=?, beca=?, institucion=?, \"enseñar\"=?, \n"
                    + "       id_dato_personal=?, id_formacion=?, id_taller=?, id_asociativismo=?, \n"
                    + "       id_localidad=?, id_departamento=?\n"
                    + " WHERE id_artesano=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, artesano.getDescripcion());
            stmt.setString(2, artesano.getDisp_viajar());
            stmt.setString(3, artesano.getDisp_horaria());
            stmt.setString(4, artesano.getMonotributista());
            stmt.setString(5, artesano.getSubsidio());
            stmt.setString(6, artesano.getBeca());
            stmt.setString(6, artesano.getInstitucion());
            stmt.setString(8, artesano.getEnseñar());
            stmt.setLong(9, artesano.getDatoPersonal().getId());
            stmt.setObject(10, artesano.getFormacion());
            stmt.setObject(11, artesano.getTaller());
            stmt.setObject(12, artesano.getAsociativismo());
            stmt.setObject(13, artesano.getLocalidad());
            stmt.setObject(14, artesano.getDepartamento());
            stmt.setLong(15, artesano.getId_artesano());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Artesano artesano) {

        try {

            String query = "DELETE FROM public.artesanos WHERE id_artesano = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, artesano.getId_artesano());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Artesano extraer(Long id) {

        ControladorDatoPersonal cdp = new ControladorDatoPersonal();
        ControladorFormacion cfo = new ControladorFormacion();
        ControladorTaller cta = new ControladorTaller();
        ControladorAsociativismo cas = new ControladorAsociativismo();
        ControladorLocalidad clo = new ControladorLocalidad();
        ControladorDepartamento cde = new ControladorDepartamento();
        
        Artesano artesano = new Artesano();

        try {

            String query = "SELECT id_artesano, descripcion, disponibilidad_viajar, disponibilidad_horaria, \n"
                    + "       monotributista, subsidio, beca, institucion, \"enseñar\", id_dato_personal, \n"
                    + "       id_formacion, id_taller, id_asociativismo, id_localidad, id_departamento\n"
                    + "  FROM artesanos;";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    artesano.setId_artesano(rs.getLong("id_artesano"));
                    artesano.setDescripcion(rs.getString("descripcion"));
                    artesano.setDisp_viajar(rs.getString("disponibilidad_viajar"));
                    artesano.setDisp_horaria(rs.getString("disponibilidad_horaria"));
                    artesano.setMonotributista(rs.getString("monotributista"));
                    artesano.setSubsidio(rs.getString("subsidio"));
                    artesano.setInstitucion(rs.getString("institucion"));
                    artesano.setEnseñar(rs.getString("enseñar"));
                    artesano.setDatoPersonal(cdp.extraer(rs.getLong("id_dato_personal")));
                    artesano.setFormacion(cfo.extraer(rs.getLong("id_formacion")));
                    artesano.setTaller(cta.extraer(rs.getLong("id_taller")));
                    artesano.setAsociativismo(cas.extraer(rs.getLong("id_asociativismo")));
                    artesano.setLocalidad(clo.extraer(rs.getLong("id_localidad")));
                    artesano.setDepartamento(cde.extaer(rs.getLong("id_departamento")));

                } catch (SQLException ex) {
                    Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
