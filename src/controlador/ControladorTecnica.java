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
                    + "   SET tipo_tecnica=?, tecnica_diferente=?, descripcion=?\n"
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

    public Tecnica extraer() {

        Tecnica tecnica = new Tecnica();

        try {

            String query = "SELECT id_tecnica, tipo_tecnica, tecnica_diferente, descripcion\n"
                    + "  FROM tecnicas";

            PreparedStatement stmt = conexiion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    tecnica.setId_tecnica(rs.getLong("id_tecnica"));
                    tecnica.setTipo_tecnica(rs.getString("tipo_tecnica"));
                    tecnica.setTecnica_diferente(rs.getString("tecnica_diferente"));
                    tecnica.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorTecnica.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTecnica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tecnica;
    }

    public ArrayList<Tecnica> extraerTodo() {

        ArrayList<Tecnica> arrayTecnica = new ArrayList<Tecnica>();

        try {

            String query = "SELECT id_tecnica, tipo_tecnica, tecnica_diferente, descripcion\n"
                    + "  FROM tecnicas";

            PreparedStatement stmt = conexiion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTecnica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayTecnica;

    }

}
