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
import modelo.Domicilio;
import modelo.Institucion;

/**
 *
 * @author bangho
 */
public class ControladorInstitucion {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public ControladorInstitucion() {
    }

    public void agregar(Institucion institucion) {

        try {
            String query = "INSERT INTO institucion(\n"
                    + "            nombre_institucion, observacion, id_domicilio, \n"
                    + "            fecha_entrega)\n"
                    + "    VALUES (?, ?, ?, \n"
                    + "            ?)";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, institucion.getNombre_institucion());
            stmt.setString(2, institucion.getObservacion());
            stmt.setLong(3, institucion.getDomicilio().getId_domicilio());
            stmt.setDate(4, institucion.getFecha_entrega());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificar(Institucion institucion) {

        try {
            String query = "UPDATE institucion\n"
                    + "   SET nombre_institucion=?, observacion=?, id_domicilio=?, \n"
                    + "       fecha_entrega=?\n"
                    + " WHERE id_institucion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, institucion.getNombre_institucion());
            stmt.setString(2, institucion.getObservacion());
            stmt.setLong(3, institucion.getDomicilio().getId_domicilio());
            stmt.setDate(4, institucion.getFecha_entrega());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar(Institucion institucion) {

        try {
            String query = "DELETE FROM institucion\n"
                    + " WHERE id_institucion=?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, institucion.getNombre_institucion());
            stmt.setLong(2, institucion.getId_institucion());

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Institucion extraer() {

        ControladorDomicilio cdo = new ControladorDomicilio();

        Institucion institucion = new Institucion();

        try {

            String query = "SELECT * FROM institucion";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    institucion.setId_institucion(rs.getLong("id_institucion"));
                    institucion.setNombre_institucion(rs.getString("nombre_institucion"));
                    institucion.setObservacion(rs.getString("observacion"));
                    institucion.setDomicilio(cdo.extraer(rs.getLong("id_domicilio")));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorInstitucion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControladorInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return institucion;
    }

    public ArrayList<Institucion> extraerTodo() {

        ArrayList<Institucion> arrayInstitucion = new ArrayList<Institucion>();

        try {

            String query = "SELECT * FROM institucion";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorInstitucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayInstitucion;
    }

}
