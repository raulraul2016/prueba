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
public class MateriaPrimaFormaObtencion {

    private Long id_extraccion_mp;
    private String adquisicion_mp;
    private String descripcion;
    

    public MateriaPrimaFormaObtencion() {
    }

    public MateriaPrimaFormaObtencion(Long id_extraccion_mp, String adquisicion_mp, String descripcion) {
        this.id_extraccion_mp = id_extraccion_mp;
        this.adquisicion_mp = adquisicion_mp;
        this.descripcion = descripcion;
    }

    public Long getId_extraccion_mp() {
        return id_extraccion_mp;
    }

    public void setId_extraccion_mp(Long id_extraccion_mp) {
        this.id_extraccion_mp = id_extraccion_mp;
    }

    public String getAdquisicion_mp() {
        return adquisicion_mp;
    }

    public void setAdquisicion_mp(String adquisicion_mp) {
        this.adquisicion_mp = adquisicion_mp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    @Override
    public String toString() {
        return getAdquisicion_mp();
    }
    
    

}
