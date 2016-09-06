/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import modelo.herramientaDetalleHerramienta;

/**
 *
 * @author bangho
 */
public class ControladorHdHerramienta {

    private static String url;
    private Connection conexion;

    public ControladorHdHerramienta() {
    
    
        try {
            Class.forName("org.postgresql.Driver");
            url = "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion = DriverManager.getConnection(url, "postgres", "camello");
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void agregar(Object o){
        
        PreparedStatement stmt;
        String query;
        
        try {
            
            herramientaDetalleHerramienta hDh = (herramientaDetalleHerramienta) o;
            query = "insert into ";
            
        } catch (Exception e) {
        }
    }
     
   }
