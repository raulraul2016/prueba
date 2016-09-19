/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            String query = "INSERT INTO cursos_perfeccionamiento(tipo_curso, institucion, descripcion)\n"
                    + "VALUES (?, ?, ?);";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, curso.getTipo_curso());
            stmt.setString(2, curso.getInstitucion());
            stmt.setString(3, curso.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Curso curso) {
        try {
            String query = "UPDATE cursos_perfeccionamiento SET tipo_curso=?, institucion=?, descripcion=?\n"
                    + " WHERE id_curso_perfeccionamiento=?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            stmt.setString(1, curso.getTipo_curso());
            stmt.setString(2, curso.getInstitucion());
            stmt.setString(3, curso.getDescripcion());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminar(Curso curso){
        
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
}
