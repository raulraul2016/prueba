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
public class Premio {
    
    private Long id_premio;
    private String tipo_premio;
    private String institucion;
    private String descripcion;

    public Premio() {
    }

    public Premio(Long id_premio, String tipo_premio, String institucion, String descripcion) {
        this.id_premio = id_premio;
        this.tipo_premio = tipo_premio;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }

    public Long getId_premio() {
        return id_premio;
    }

    public void setId_premio(Long id_premio) {
        this.id_premio = id_premio;
    }

    public String getTipo_premio() {
        return tipo_premio;
    }

    public void setTipo_premio(String tipo_premio) {
        this.tipo_premio = tipo_premio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
