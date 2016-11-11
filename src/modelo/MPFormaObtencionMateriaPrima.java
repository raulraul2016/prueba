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
public class MPFormaObtencionMateriaPrima {
    
    private Long id_materia_prima_forma_obtencion_mp;
    private Integer id_materia_prima_forma_obtencion;
    private Integer id_materia_prima;

    public MPFormaObtencionMateriaPrima() {
    }

    public MPFormaObtencionMateriaPrima(Long id_materia_prima_forma_obtencion_mp, Integer id_materia_prima_forma_obtencion, Integer id_materia_prima) {
        this.id_materia_prima_forma_obtencion_mp = id_materia_prima_forma_obtencion_mp;
        this.id_materia_prima_forma_obtencion = id_materia_prima_forma_obtencion;
        this.id_materia_prima = id_materia_prima;
    }

    public Long getId_materia_prima_forma_obtencion_mp() {
        return id_materia_prima_forma_obtencion_mp;
    }

    public void setId_materia_prima_forma_obtencion_mp(Long id_materia_prima_forma_obtencion_mp) {
        this.id_materia_prima_forma_obtencion_mp = id_materia_prima_forma_obtencion_mp;
    }

    public Integer getId_materia_prima_forma_obtencion() {
        return id_materia_prima_forma_obtencion;
    }

    public void setId_materia_prima_forma_obtencion(Integer id_materia_prima_forma_obtencion) {
        this.id_materia_prima_forma_obtencion = id_materia_prima_forma_obtencion;
    }

    public Integer getId_materia_prima() {
        return id_materia_prima;
    }

    public void setId_materia_prima(Integer id_materia_prima) {
        this.id_materia_prima = id_materia_prima;
    }
    
    
    
}
