/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import modelo.MateriaPrima;

/**
 *
 * @author bangho
 */
public class ControladorMateriaPrima {
    
    private static String url;
    private static final Conexion conexion = new Conexion();
    
    public void agregar( MateriaPrima materiaPrima){
        
        String query = "INSERT INTO materias_prima(tipo_materia_prima, descripcion) VALUES (?, ?)";
        
    }
    
}
