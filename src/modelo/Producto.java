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
    private String nomnbreProducto;
    private String descripcion;
    private MateriaPrima materiaPrima;

    public Producto() {
    }

    public Producto(Long id_producto, String nomnbreProducto, String descripcion, MateriaPrima materiaPrima) {
        this.id_producto = id_producto;
        this.nomnbreProducto = nomnbreProducto;
        this.descripcion = descripcion;
        this.materiaPrima = materiaPrima;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNomnbreProducto() {
        return nomnbreProducto;
    }

    public void setNomnbreProducto(String nomnbreProducto) {
        this.nomnbreProducto = nomnbreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    
}
