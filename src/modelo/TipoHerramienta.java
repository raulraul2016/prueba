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
public class TipoHerramienta {
    
   private Long tipo_herramienta;
   private String nombre_tipo_herramienta;

    public TipoHerramienta() {
    }

    public TipoHerramienta(Long tipo_herramienta, String nombre_tipo_herramienta) {
        this.tipo_herramienta = tipo_herramienta;
        this.nombre_tipo_herramienta = nombre_tipo_herramienta;
    }

    public Long getTipo_herramienta() {
        return tipo_herramienta;
    }

    public void setTipo_herramienta(Long tipo_herramienta) {
        this.tipo_herramienta = tipo_herramienta;
    }

    public String getNombre_tipo_herramienta() {
        return nombre_tipo_herramienta;
    }

    public void setNombre_tipo_herramienta(String nombre_tipo_herramienta) {
        this.nombre_tipo_herramienta = nombre_tipo_herramienta;
    }
   
   
}
