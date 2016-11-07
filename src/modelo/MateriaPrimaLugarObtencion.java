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
    private String tipo_obten_mat_pri;
    private String descripcion;

    public MateriaPrimaLugarObtencion() {
    }

    public MateriaPrimaLugarObtencion(Long id_obtencion_mp, String tipo_obten_mat_pri, String descripcion) {
        this.id_obtencion_mp = id_obtencion_mp;
        this.tipo_obten_mat_pri = tipo_obten_mat_pri;
        this.descripcion = descripcion;
    }

    public Long getId_obtencion_mp() {
        return id_obtencion_mp;
    }

    public void setId_obtencion_mp(Long id_obtencion_mp) {
        this.id_obtencion_mp = id_obtencion_mp;
    }

    public String getTipo_obten_mat_pri() {
        return tipo_obten_mat_pri;
    }

    public void setTipo_obten_mat_pri(String tipo_obten_mat_pri) {
        this.tipo_obten_mat_pri = tipo_obten_mat_pri;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
