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
import modelo.Aprendizaje;
import modelo.Departamento;

/**
 *
 * @author bangho
 */
public class ControladorDepartamento {

    private static String url;
    private final static Conexion conexion = new Conexion();

    public void agregar(Departamento departamento) {

        try {

            String query = "INSERT INTO departamentos departamento, descripcion VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, departamento.getDepartamento());
            stmt.setString(2, departamento.getDescripcion());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void modificar(Departamento departamento){
        
        try {
            String query = "UPDATE departamentos SET id_departamento=?, departamento=?, descripcion=?\n" +
                    " WHERE id_departamento = ?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setString(1, departamento.getDepartamento());
            stmt.setString(2, departamento.getDescripcion());
            
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public void eliminar(Departamento departamento){
        
        try {
            String query = "DELETE FROM departamentos  WHERE id_departamento = ?";
            
            PreparedStatement stmt;
            
            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, departamento.getId_departamento());
            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
