/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author bangho
 */
public class Asociativismo {
    
    private Long idAsocit;
    private String tipoAsocit;
    private String descripLegal;
    private String descripcionAciocit;

    public Asociativismo() {
    }

    public Asociativismo(Long id_asocit, String tipo_asocit, String descripLegal, String descripcionAciocit) {
        this.idAsocit = id_asocit;
        this.tipoAsocit = tipo_asocit;
        this.descripLegal = descripLegal;
        this.descripcionAciocit = descripcionAciocit;
    }

    public Long getId_asocit() {
        return idAsocit;
    }

    public void setId_asocit(Long id_asocit) {
        this.idAsocit = id_asocit;
    }

    public String getTipo_asocit() {
        return tipoAsocit;
    }

    public void setTipo_asocit(String tipo_asocit) {
        this.tipoAsocit = tipo_asocit;
    }

    public String getDescripLegal() {
        return descripLegal;
    }

    public void setDescripLegal(String descripLegal) {
        this.descripLegal = descripLegal;
    }

    public String getDescripcionAciocit() {
        return descripcionAciocit;
    }

    public void setDescripcionAciocit(String descripcionAciocit) {
        this.descripcionAciocit = descripcionAciocit;
    }

    @Override
    public String toString() {
        return descripcionAciocit;
    }
    
    
    
}

