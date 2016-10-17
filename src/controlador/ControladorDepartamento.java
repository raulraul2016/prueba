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

    public void modificar(Departamento departamento) {

        try {
            String query = "UPDATE departamentos SET departamento=?, descripcion=?\n"
                    + " WHERE id_departamento = ?";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, departamento.getDepartamento());
            stmt.setString(2, departamento.getDescripcion());

        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminar(Departamento departamento) {

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

    public Departamento extaer(Long id) {

        Departamento departamento = new Departamento();

        try {

            String query = "SELECT * FROM departamentos";

            PreparedStatement stmt;

            ResultSet rs = null;

            while (rs.next()) {

                try {
                    departamento.setId_departamento(rs.getLong("id_departamento"));
                    departamento.setDepartamento(rs.getString("departamento"));
                    departamento.setDescripcion(rs.getString("descripcion"));
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departamento;
    }

    public ArrayList<Departamento> extraerTodo() {

        ArrayList<Departamento> arrayDepartamento = new ArrayList<Departamento>();

        try {

            String query = "SELECT * FROM departamentos";

            PreparedStatement stmt;

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayDepartamento;

    }

    public Long extraerUltimoId() {

        Long id = null;

        try {

            String query = "SELECT id_departamento FROM departamentos;";

            PreparedStatement stmt = conexion.getConexion().prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                try {
                    id = rs.getLong(1);
                } catch (SQLException ex) {
                    Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
