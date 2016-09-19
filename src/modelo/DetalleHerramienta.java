/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author bangho
 */
public class DetalleHerramienta {
    
    private Long id_detalle_herramienta;
    private String nombre_Herramienta;
    private String tipo_herramienta;
    //Cargo los Detalles de las Herramientas en un jtf y los paso
    //a una jList. 

    public DetalleHerramienta() {
    }

    public DetalleHerramienta(Long id_detalle_herramienta, String nombre_Herramienta, String tipo_herramienta) {
        this.id_detalle_herramienta = id_detalle_herramienta;
        this.nombre_Herramienta = nombre_Herramienta;
        this.tipo_herramienta = tipo_herramienta;
    }

    public Long getId_detalle_herramienta() {
        return id_detalle_herramienta;
    }

    public void setId_detalle_herramienta(Long id_detalle_herramienta) {
        this.id_detalle_herramienta = id_detalle_herramienta;
    }

    public String getNombre_Herramienta() {
        return nombre_Herramienta;
    }

    public void setNombre_Herramienta(String nombre_Herramienta) {
        this.nombre_Herramienta = nombre_Herramienta;
    }

    public String getTipo_herramienta() {
        return tipo_herramienta;
    }

    public void setTipo_herramienta(String tipo_herramienta) {
        this.tipo_herramienta = tipo_herramienta;
    }

}
