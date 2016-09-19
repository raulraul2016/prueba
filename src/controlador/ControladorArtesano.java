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
    
D    public void agregar(Artesano artesano){
        
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
            stmt.set
            
        } catch (Exception e) {
        }
        
    }
}
