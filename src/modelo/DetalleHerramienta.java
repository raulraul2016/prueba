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
    private String detalleHerramienta;
    //Cargo los Detalles de las Herramientas en un jtf y los paso
    //a una jList. 

    public DetalleHerramienta() {
    }

    public DetalleHerramienta(Long id_detalle_herramienta, String detalleHerramienta) {
        this.id_detalle_herramienta = id_detalle_herramienta;
        this.detalleHerramienta = detalleHerramienta;
    }

    public Long getId_detalle_herramienta() {
        return id_detalle_herramienta;
    }

    public void setId_detalle_herramienta(Long id_detalle_herramienta) {
        this.id_detalle_herramienta = id_detalle_herramienta;
    }

    public String getDetalleHerramienta() {
        return detalleHerramienta;
    }

    public void setDetalleHerramienta(String detalleHerramienta) {
        this.detalleHerramienta = detalleHerramienta;
    }

}
