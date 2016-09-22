/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bgh007
 */
public class Trueque {
    
    private Long id_trueque;
    private String tipo_trueque;
    private String descripcion;

    public Trueque() {
    }

    public Trueque(Long id_trueque, String tipo_trueque, String descripcion) {
        this.id_trueque = id_trueque;
        this.tipo_trueque = tipo_trueque;
        this.descripcion = descripcion;
    }

    public Long getId_trueque() {
        return id_trueque;
    }

    public void setId_trueque(Long id_trueque) {
        this.id_trueque = id_trueque;
    }

    public String getTipo_trueque() {
        return tipo_trueque;
    }

    public void setTipo_trueque(String tipo_trueque) {
        this.tipo_trueque = tipo_trueque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
