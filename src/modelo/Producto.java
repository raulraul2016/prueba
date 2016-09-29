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
    private Double precio;
    private Integer cantidad;
    private MateriaPrima materiaPrima;

    public Producto() {
    }

    public Producto(Long id_producto, String tipo_producto, String descripcion, Double precio, Integer cantidad, MateriaPrima materiaPrima) {
        this.id_producto = id_producto;
        this.tipo_producto = tipo_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.materiaPrima = materiaPrima;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

}
