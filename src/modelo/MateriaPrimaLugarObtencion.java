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
public class MateriaPrimaLugarObtencion {

    private Long id_obtencion_mp;
    private String lugar_obtencion;
    private String descripcion;

    public MateriaPrimaLugarObtencion() {
    }

    public MateriaPrimaLugarObtencion(Long id_obtencion_mp, String lugar_obtencion, String descripcion) {
        this.id_obtencion_mp = id_obtencion_mp;
        this.lugar_obtencion = lugar_obtencion;
        this.descripcion = descripcion;
    }

    public Long getId_obtencion_mp() {
        return id_obtencion_mp;
    }

    public void setId_obtencion_mp(Long id_obtencion_mp) {
        this.id_obtencion_mp = id_obtencion_mp;
    }

    public String getLugar_obtencion() {
        return lugar_obtencion;
    }

    public void setLugar_obtencion(String lugar_obtencion) {
        this.lugar_obtencion = lugar_obtencion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
