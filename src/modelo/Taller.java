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
public class Taller {

    Long id;
    String lugarProduccion;
    String descripcion;
    String estadoTaller;
    Herramienta herramienta;// Esta debe ser Vector o ArrayList
    //ArrayList<Herramienta> herramienta;

    public Taller() {
    }

    public Taller(Long id, String lugarProduccion, String descripcion, String estadoTaller, Herramienta herramienta) {
        this.id = id;
        this.lugarProduccion = lugarProduccion;
        this.descripcion = descripcion;
        this.estadoTaller = estadoTaller;
        this.herramienta = herramienta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLugarProduccion() {
        return lugarProduccion;
    }

    public void setLugarProduccion(String lugarProduccion) {
        this.lugarProduccion = lugarProduccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoTaller() {
        return estadoTaller;
    }

    public void setEstadoTaller(String estadoTaller) {
        this.estadoTaller = estadoTaller;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }

}
