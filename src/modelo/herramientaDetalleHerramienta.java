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
public class herramientaDetalleHerramienta {
    
    private Long id_herramientaDetHerramienta;
    private Herramienta herramienta;
    private DetalleHerramienta detalleHerramienta;

    public herramientaDetalleHerramienta() {
    }

    public herramientaDetalleHerramienta(Long id_herramientaDetHerramienta, Herramienta herramienta, DetalleHerramienta detalleHerramienta) {
        this.id_herramientaDetHerramienta = id_herramientaDetHerramienta;
        this.herramienta = herramienta;
        this.detalleHerramienta = detalleHerramienta;
    }

    public Long getId_herramientaDetHerramienta() {
        return id_herramientaDetHerramienta;
    }

    public void setId_herramientaDetHerramienta(Long id_herramientaDetHerramienta) {
        this.id_herramientaDetHerramienta = id_herramientaDetHerramienta;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }

    public DetalleHerramienta getDetalleHerramienta() {
        return detalleHerramienta;
    }

    public void setDetalleHerramienta(DetalleHerramienta detalleHerramienta) {
        this.detalleHerramienta = detalleHerramienta;
    }
    
    
    
}
