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
    
    public void agregar(Artesano artesano){
        
        try {
            
            String query = "INSERT INTO public.artesanos(descripcion,"
                    + " disponibilidad_viajar, disponibilidad_horaria,monotributista,"
                    + " subsidio, beca, institucion, \"enseñar\", id_persona,"
                    + "id_formacion, id_taller, id_asociativismo, id_localidad,"
                    + " id_departamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                    + "?, ?, ?, ?);";
            
            PreparedStatement stmt;
            
            stmt =conexion.getConexion().prepareCall(query);
            
            stmt.setString(1, artesano.getDescripcion());
            stmt.setString(2, artesano.getDisp_viajar());
            stmt.setString(3, artesano.getDisp_horaria());
            stmt.setString(4, artesano.getMonotributista());
            stmt.setString(5, artesano.getSubsidio());
            stmt.setString(6, artesano.getBeca());
            stmt.setString(6, artesano.getInstitucion());
            stmt.setString(8, artesano.getEnseñar());
            stmt.setObject(9, artesano.getPersonas());
            stmt.setObject(10, artesano.getFormacion());
            stmt.setObject(11, artesano.getTaller());
            stmt.setObject(12, artesano.getAsociativismo());
            stmt.setObject(13, artesano.getLocalidad());
            stmt.setObject(14, artesano.getDepartamento());
            
            stmt.execute();
            
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificar (Artesano artesano){
        
        try {
            
            String query = "UPDATE public.artesanos SET descripcion=?,"
               + " disponibilidad_viajar=?, disponibilidad_horaria=?,monotributista=?,"
               + " subsidio=?, beca=?, institucion=?, \"enseñar\"=?,id_persona=?,"
               + " id_formacion=?, id_taller=?, id_asociativismo=?, id_localidad=?,"
               + " id_departamento=? WHERE id_artesano = ?";
            
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
            stmt.setObject(9, artesano.getPersonas());
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
    
    public void eliminar (Artesano artesano){
        
        try {
            
            String query = "DELETE FROM public.artesanos WHERE id_artesano = ?";
            
            PreparedStatement stmt;
            
            stmt =conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, artesano.getId_artesano());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorArtesano.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
