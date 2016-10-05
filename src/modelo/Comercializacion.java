/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Gonza
 */
public class Comercializacion {

    private Long id_comercializacion;
    private String destino_produccion;
    private String descripcion;

    public Comercializacion() {
    }

    public Comercializacion(Long id_comercializacion, String destino_produccion, String descripcion) {
        this.id_comercializacion = id_comercializacion;
        this.destino_produccion = destino_produccion;
        this.descripcion = descripcion;
    }

    public Long getId_comercializacion() {
        return id_comercializacion;
    }

    public void setId_comercializacion(Long id_comercializacion) {
        this.id_comercializacion = id_comercializacion;
    }

    public String getDestino_produccion() {
        return destino_produccion;
    }

    public void setDestino_produccion(String destino_produccion) {
        this.destino_produccion = destino_produccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
