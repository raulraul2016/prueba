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
public class Formacion {
    
    private Long id_formacion;
    private String nivelFormacion;
    private String descripcion;

    public Formacion() {
    }

    public Formacion(Long id_formacion, String nivelFormacion, String descripcion) {
        this.id_formacion = id_formacion;
        this.nivelFormacion = nivelFormacion;
        this.descripcion = descripcion;
    }

    public Long getId_formacion() {
        return id_formacion;
    }

    public void setId_formacion(Long id_formacion) {
        this.id_formacion = id_formacion;
    }

    public String getNivelFormacion() {
        return nivelFormacion;
    }

    public void setNivelFormacion(String nivelFormacion) {
        this.nivelFormacion = nivelFormacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
