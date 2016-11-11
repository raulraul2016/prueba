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
public class MPLugarObtencionMateriaPrima {

    private Long id_materia_prima_lugar_obtencion_mp;
    private Integer id_obtencion_mp;
    private Integer id_materia_prima;

    public MPLugarObtencionMateriaPrima() {
    }

    public MPLugarObtencionMateriaPrima(Long id_materia_prima_lugar_obtencion_mp, Integer id_obtencion_mp, Integer id_materia_prima) {
        this.id_materia_prima_lugar_obtencion_mp = id_materia_prima_lugar_obtencion_mp;
        this.id_obtencion_mp = id_obtencion_mp;
        this.id_materia_prima = id_materia_prima;
    }

    public Long getId_materia_prima_lugar_obtencion_mp() {
        return id_materia_prima_lugar_obtencion_mp;
    }

    public void setId_materia_prima_lugar_obtencion_mp(Long id_materia_prima_lugar_obtencion_mp) {
        this.id_materia_prima_lugar_obtencion_mp = id_materia_prima_lugar_obtencion_mp;
    }

    public Integer getId_obtencion_mp() {
        return id_obtencion_mp;
    }

    public void setId_obtencion_mp(Integer id_obtencion_mp) {
        this.id_obtencion_mp = id_obtencion_mp;
    }

    public Integer getId_materia_prima() {
        return id_materia_prima;
    }

    public void setId_materia_prima(Integer id_materia_prima) {
        this.id_materia_prima = id_materia_prima;
    }
    
    
}
