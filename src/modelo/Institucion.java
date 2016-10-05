/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author bangho
 */
public class Institucion{ 

    private Long id_institucion;
    private String nombre_institucion;
    private String observacion;
    private Domicilio domicilio;
    private Date fecha_entrega;

    public Institucion() {
    }

    public Institucion(Long id_institucion, String nombre_institucion, String observacion, Domicilio domicilio, Date fecha_entrega) {
        this.id_institucion = id_institucion;
        this.nombre_institucion = nombre_institucion;
        this.observacion = observacion;
        this.domicilio = domicilio;
        this.fecha_entrega = fecha_entrega;
    }

    public Long getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(Long id_institucion) {
        this.id_institucion = id_institucion;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

   
}
