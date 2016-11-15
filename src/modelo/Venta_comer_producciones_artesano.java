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
public class Venta_comer_producciones_artesano {
    
    private Long id_venta_comer_produ_artesano;
    private Artesano artesano;
    private Venta_comer_producciones venta_comer_producciones;

    public Venta_comer_producciones_artesano() {
    }

    public Venta_comer_producciones_artesano(Long id_venta_comer_produ_artesano, Artesano artesano, Venta_comer_producciones venta_comer_producciones) {
        this.id_venta_comer_produ_artesano = id_venta_comer_produ_artesano;
        this.artesano = artesano;
        this.venta_comer_producciones = venta_comer_producciones;
    }

    public Long getId_venta_comer_produ_artesano() {
        return id_venta_comer_produ_artesano;
    }

    public void setId_venta_comer_produ_artesano(Long id_venta_comer_produ_artesano) {
        this.id_venta_comer_produ_artesano = id_venta_comer_produ_artesano;
    }

    public Artesano getArtesano() {
        return artesano;
    }

    public void setArtesano(Artesano artesano) {
        this.artesano = artesano;
    }

    public Venta_comer_producciones getVenta_comer_producciones() {
        return venta_comer_producciones;
    }

    public void setVenta_comer_producciones(Venta_comer_producciones venta_comer_producciones) {
        this.venta_comer_producciones = venta_comer_producciones;
    }
    
    
    
}
