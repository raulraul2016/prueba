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
public class Producto {
    
    private Long id_producto;
    private String tipo_producto;
    private String descripcion;

    public Producto() {
    }

    public Producto(Long id_producto, String tipo_producto, String descripcion) {
        this.id_producto = id_producto;
        this.tipo_producto = tipo_producto;
        this.descripcion = descripcion;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
