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
import modelo.Comercializacion;

/**
 *
 * @author bangho
 */
public class ControladorComercializacion {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Comercializacion comercializacion) {

        try {
            String query = "INSERT INTO comercializacion(\n"
                    + "            destino_produccion, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, comercializacion.getDescripcion());
            stmt.setString(2, comercializacion.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Comercializacion comercializacion) {

        try {
            String query = "UPDATE comercializacion\n"
                    + "   SET destino_produccion=?, descripcion=?\n"
                    + " WHERE id_comercializacion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, comercializacion.getDestino_produccion());
            stmt.setString(2, comercializacion.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Comercializacion comercializacion) {

        try {
            String query = "DELETE FROM comercializacion\n"
                    + " WHERE id_comercializacion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, Long.valueOf(comercializacion.getId_comercializacion()));
        } catch (SQLException ex) {
            Logger.getLogger(ControladorComercializacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
