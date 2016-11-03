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

    public Trueque extraer(Long id) {

        PreparedStatement stmt;
        Trueque trueque = new Trueque();

        try {

            String query = "SELECT id_trueque FROM trueques WHERE id_trueque = ?";

            stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    trueque.setId_trueque(rs.getLong("id_trueque"));
                    trueque.setTipo_trueque(rs.getString("tipo_trueque"));
                    trueque.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trueque;
    }

    public ArrayList<Trueque> extraerTodo() {

        Trueque aux = new Trueque();
        ResultSet rs;
        ArrayList<Trueque> arrayTrueque = new ArrayList<Trueque>();

        try {

            String query = "SELECT id_trueque, tipo_trueque, descripcion\n"
                    + "  FROM trueques";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();
            
            if(rs.next()){
                aux = extraer(rs.getLong(1));
                arrayTrueque.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayTrueque;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_trueque"
                    + " FROM trueques";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public ArrayList<Trueque> extraerTodoTipo(int tipo) {

        Trueque aux = new Trueque();
        ResultSet rs;
        ArrayList<Trueque> arrayTrueque = new ArrayList<Trueque>();

        try {

            String query = "SELECT id_trueque, tipo_trueque, descripcion\n"
                    + "  FROM trueques";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setInt(1, tipo);

            rs = stmt.executeQuery();
            
            if(rs.next()){
                aux = extraer(rs.getLong(1));
                arrayTrueque.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorTrueque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayTrueque;

    }

}
