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
import modelo.Venta_comer_producciones;

/**
 *
 * @author bgh007
 */
public class Controlador_venta_comer_producciones {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(Venta_comer_producciones venta_comer_producciones) {

        try {
            String query = "INSERT INTO public.venta_comer_producciones(\n"
                    + "            periodo_mayor_venta, descripcion)\n"
                    + "    VALUES (?, ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, venta_comer_producciones.getPeriodo_mayor_venta());
            stmt.setString(2, venta_comer_producciones.getDescripcion());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Venta_comer_producciones venta_comer_producciones) {

        try {
            String query = "UPDATE public.venta_comer_producciones\n"
                    + "   SET periodo_mayor_venta=?, descripcion=?\n"
                    + " WHERE id_venta_comer_produ=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, venta_comer_producciones.getPeriodo_mayor_venta());
            stmt.setString(2, venta_comer_producciones.getDescripcion());
            stmt.setLong(3, venta_comer_producciones.getId_venta_comer_produ());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Venta_comer_producciones venta_comer_producciones) {

        try {
            String query = "DELETE FROM venta_comer_producciones_artesano\n"
                    + " WHERE id_venta_comer_produ=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, venta_comer_producciones.getId_venta_comer_produ());

            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Venta_comer_producciones extraer(Long id) {

        PreparedStatement stmt;
        Venta_comer_producciones venta_comer_producciones = new Venta_comer_producciones();

        try {

            String query = "SELECT id_venta_comer_produ, periodo_mayor_venta, descripcion\n"
                    + "  FROM venta_produccion WHERE id_venta_comer_produ = ?";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    venta_comer_producciones.setId_venta_comer_produ(rs.getLong("id_venta_comer_produ"));
                    venta_comer_producciones.setPeriodo_mayor_venta(rs.getString("periodo_mayor_venta"));
                    venta_comer_producciones.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Venta_comer_producciones> extraerTodo() {

        Venta_comer_producciones aux = new Venta_comer_producciones();
        ResultSet rs;
        ArrayList<Venta_comer_producciones> arrayVenta = new ArrayList<Venta_comer_producciones>();

        try {

            String query = "SELECT id_venta_comer_produ, periodo_mayor_venta, descripcion\n"
                    + "  FROM venta_produccion";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            rs = stmt.executeQuery();

            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayVenta.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayVenta;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_venta_comer_produ"
                    + " FROM venta_produccion";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;

    }

    public ArrayList<Venta_comer_producciones> extraerTodo(int tipo) {

        Venta_comer_producciones aux = new Venta_comer_producciones();
        ResultSet rs;
        ArrayList<Venta_comer_producciones> arrayVenta = new ArrayList<Venta_comer_producciones>();

        try {

            String query = "SELECT id_venta_comer_produ, periodo_mayor_venta, descripcion\n"
                    + "  FROM venta_produccion WHERE id_venta_comer_produ = ?";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);
            
            stmt.setInt(1, tipo);

            rs = stmt.executeQuery();

            if (rs.next()) {
                aux = extraer(rs.getLong(1));
                arrayVenta.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_venta_comer_producciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayVenta;

    }

}
