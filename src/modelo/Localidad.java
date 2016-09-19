/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bangho
 */
public class Localidad {
    
    private Long id_locaclidad;
    private String localidad;
    private String descripcion;

    public Localidad() {
    }

    public Localidad(Long id_locaclidad, String localidad, String descripcion) {
        this.id_locaclidad = id_locaclidad;
        this.localidad = localidad;
        this.descripcion = descripcion;
    }

    public Long getId_locaclidad() {
        return id_locaclidad;
    }

    public void setId_locaclidad(Long id_locaclidad) {
        this.id_locaclidad = id_locaclidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
