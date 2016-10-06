/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Curso;

/**
 *
 * @author bangho
 */
public class ControladorCurso {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Curso curso) {

        try {
            String query = "INSERT INTO cursos_perfeccionamiento\n"
                    + " (nombre_curso, descripcion, id_institucion,\n"
                    + "fecha_entrega )  VALUES(?,  ?,  ?,  ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, curso.getNombre_curso());
            stmt.setString(2, curso.getDescripcion());
            stmt.setLong(3, curso.getInstitucion().getId_institucion());
            stmt.setDate(4, curso.getFecha_entrega());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Curso curso) {
        try {
            String query = "UPDATE cursos_perfeccionamiento\n"
                    + " SET nombre_curso=?, descripcion=?,id_institucion\n"
                    + " fecha_entrega=?, \n"
                    + " WHERE id_curso_perfeccionamiento=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, curso.getNombre_curso());
            stmt.setString(2, curso.getDescripcion());
            stmt.setLong(3, Long.valueOf(curso.getInstitucion().getId_institucion()));
            stmt.setDate(4, (curso.getFecha_entrega()));
            stmt.setLong(5, curso.getId_cusro_perfeccionamiento());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Curso curso) {

        try {
            String query = "DELETE FROM cursos_perfeccionamiento WHERE id_curso_perfeccionamiento = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, curso.getId_cusro_perfeccionamiento());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Curso extraer(Long id) {

        Curso curso = new Curso();

        try {

            String query = "SELECT * FROM cursos_perfeccionamiento";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    curso.setId_cusro_perfeccionamiento(rs.getLong("id_curso_perfeccionamiento"));
                    curso.setNombre_curso(rs.getString("nombre_curso"));
                    curso.setDescripcion(rs.getString("descripcion"));
                    curso.setInstitucion(null);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return curso;
    }

    public ArrayList<Curso> extraerTodo() {

        ArrayList<Curso> arrayCurso = new ArrayList<Curso>();

        try {

            String query = "SELECT * FROM cursos_perfeccionamiento";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayCurso;
    }
}
