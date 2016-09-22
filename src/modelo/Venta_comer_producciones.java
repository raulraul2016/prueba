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
public class Venta_comer_producciones {
    
    private Long id_venta_comer_produ;
    private String periodo_mayor_venta;
    private String descripcion;

    public Venta_comer_producciones() {
    }

    public Venta_comer_producciones(Long id_venta_comer_produ, String periodo_mayor_venta, String descripcion) {
        this.id_venta_comer_produ = id_venta_comer_produ;
        this.periodo_mayor_venta = periodo_mayor_venta;
        this.descripcion = descripcion;
    }

    public Long getId_venta_comer_produ() {
        return id_venta_comer_produ;
    }

    public void setId_venta_comer_produ(Long id_venta_comer_produ) {
        this.id_venta_comer_produ = id_venta_comer_produ;
    }

    public String getPeriodo_mayor_venta() {
        return periodo_mayor_venta;
    }

    public void setPeriodo_mayor_venta(String periodo_mayor_venta) {
        this.periodo_mayor_venta = periodo_mayor_venta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
