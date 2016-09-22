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
import modelo.Tecnica;

/**
 *
 * @author bgh007
 */
public class ControladorTecnica {

    private static String url;
    private static final Conexion conexiion = new Conexion();

    public void agregar(Tecnica tecnica) {

        try {
            String query = "INSERT INTO public.tecnicas(\n"
                    + "            tipo_tecnica, tecnica_diferente, descripcion)\n"
                    + "    VALUES (?, ?, ?)";

            PreparedStatement stmt;

            stmt = conexiion.getConexion().prepareStatement(query);

            stmt.setString(1, tecnica.getTipo_tecnica());
            stmt.setString(2, tecnica.getTecnica_diferente());
            stmt.setString(3, tecnica.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTecnica.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Tecnica tecnica) {

        try {
            String query = "UPDATE public.tecnicas\n"
                    + "   SET id_tecnica=?, tipo_tecnica=?, tecnica_diferente=?, descripcion=?\n"
                    + " WHERE id_tecnica=?";

            PreparedStatement stmt;

            stmt = conexiion.getConexion().prepareStatement(query);

            stmt.setString(1, tecnica.getTipo_tecnica());
            stmt.setString(2, tecnica.getTecnica_diferente());
            stmt.setString(3, tecnica.getDescripcion());
            stmt.setLong(4, tecnica.getId_tecnica());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTecnica.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Tecnica tecnica) {

        try {
            String query = "DELETE FROM public.tecnicas\n"
                    + " WHERE id_tecnica=?";

            PreparedStatement stmt;

            stmt = conexiion.getConexion().prepareStatement(query);

            stmt.setLong(1, tecnica.getId_tecnica());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTecnica.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
