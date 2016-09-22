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
import modelo.Trueque;

/**
 *
 * @author bgh007
 */
public class ControladorTrueque {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Trueque trueque) {

        try {
            String query = "INSERT INTO public.trueques(\n"
                    + "            tipo_trueque, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, trueque.getTipo_trueque());
            stmt.setString(2, trueque.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Trueque trueque) {

        try {
            String query = "UPDATE public.trueques\n"
                    + "   SET tipo_trueque=?, descripcion=?\n"
                    + " WHERE id_trueque=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, trueque.getTipo_trueque());
            stmt.setString(2, trueque.getDescripcion());
            stmt.setLong(3, trueque.getId_trueque());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Trueque trueque) {

        try {
            String query = "DELETE FROM public.trueques\n"
                    + " WHERE id_trueque=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, trueque.getId_trueque());
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
