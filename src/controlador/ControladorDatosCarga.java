/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import conexion.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import modelo.DatoPersonal;
import modelo.DatosCarga;

/**
 *
 * @author bangho
 */
public class ControladorDatosCarga {

    private static String url;
    private static final Conexion conexion = new Conexion();

    public void agregar(DatosCarga datosCarga) {

        PreparedStatement stmt;

        ControladorDatoPersonal cdp = new ControladorDatoPersonal();

        DatosCarga dc = new DatosCarga();
        try {

            String query = "INSERT INTO datos_carga(\n"
                    + "            lugar_carga, id_dato_carga, id_personas, fecha_carga)\n"
                    + "    VALUES (?, ?, ?, ?);";

            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, datosCarga.getLugarCarga());
            stmt.setLong(2, datosCarga.getId_dato_carga());
            stmt.setLong(3, datosCarga.getPersonas(cdp.extraer(dc.getId_dato_carga("")));
            stmt.setString(4, datosCarga.getFecha_carga());

            stmt.executeQuery();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void modificar(DatosCarga datosCarga) {

        ControladorDatoPersonal cdp = new ControladorDatoPersonal();

        try {

            String query = "UPDATE datos_carga SET lugar_carga = ?, id_personas, fecha_carga = ? \n"
                    + " WHERE id_dato_carga = ?";

            PreparedStatement stmt;
            stmt = conexion.getConexion().prepareStatement(query);

            stmt.setString(1, datosCarga.getLugarCarga());
            stmt.setString(2, datosCarga.getFecha_carga());
            stmt.setInt(3, datosCarga.getPersonas(cdp.extraer());

            stmt.execute();
        } catch (Exception e) {
        }
    }
}
