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
import modelo.DetalleHerramienta;

/**
 *
 * @author bangho
 */
public class ControladorDetalleHerramienta {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(DetalleHerramienta detalleHerramienta) {

        try {

            String query = "INSERT INTO herramientas(descripcion, nombre_herramienta, ) VALUES (?, ?)";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, detalleHerramienta.getTipo_herramienta());
            stmt.setString(2, detalleHerramienta.getNombre_Herramienta());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDetalleHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(DetalleHerramienta detalleHerramienta) {

        try {
            String query = "UPDATE herramientas SET descripcion=?, nombre_herramienta=? WHERE id_herramienta=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, detalleHerramienta.getNombre_Herramienta());
            stmt.setString(2, detalleHerramienta.getTipo_herramienta());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDetalleHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(DetalleHerramienta detalleHerramienta) {

        try {
            String query = "DELETE FROM herramientas WHERE id_herramienta = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, detalleHerramienta.getId_detalle_herramienta());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDetalleHerramienta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrar(DetalleHerramienta detalleHerramienta) {

        try {
            String query = "select * from detalle_herramienta where id = ?";
            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();

            //ResultSet fila = stmt.getGeneratedKeys();
            //System.out.println(fila);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
