/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.DetalleHerramienta;

/**
 *
 * @author bangho
 */
public abstract class ControladorDetalleHerramienta  {
    
    public static String url;
    public static Connection conexion;

    public ControladorDetalleHerramienta() {
    
    try {
             Class.forName("org.postgresql.Driver");
             url= "jdbc:postgresql://localhost:5432/mercartenueva";
            this.conexion= DriverManager.getConnection(url,"postgres", "camello");
            System.out.println("conectado");
        } catch (Exception e) {
        }
    }
    public void agregar(Object o){
        
        try {
            
            DetalleHerramienta detalleTipoHerramienta = (DetalleHerramienta) o;
            String query = "insert into detalle_herramienta (detalle_herramienta) values (?)";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
//            stmt.setArray(1, (Array) detalleTipoHerramienta.getDetalleHerramienta());
            stmt.execute();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public int mostrar(int id){
        
            DetalleHerramienta detalleTipoHerramienta = new DetalleHerramienta() {};
        try {
            String query = "select detalle_herramienta from detalle_herramienta where id = ?";
            PreparedStatement stmt;
            stmt = conexion.prepareStatement(query);
            
//            stmt.setArray(1, (Array) detalleTipoHerramienta.getDetalleHerramienta().get(id));
            ResultSet fila = stmt.getGeneratedKeys();
            
            System.out.println(fila);
            
                      
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        return id;
    }
    }
