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
public class Curso {
    
    private Long id_cusro_perfeccionamiento;
    private String tipo_curso;
    private String institucion;
    private String descripcion;

    public Curso() {
    }

    public Curso(Long id_cusro_perfeccionamiento, String tipo_curso, String institucion, String descripcion) {
        this.id_cusro_perfeccionamiento = id_cusro_perfeccionamiento;
        this.tipo_curso = tipo_curso;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }

    public Long getId_cusro_perfeccionamiento() {
        return id_cusro_perfeccionamiento;
    }

    public void setId_cusro_perfeccionamiento(Long id_cusro_perfeccionamiento) {
        this.id_cusro_perfeccionamiento = id_cusro_perfeccionamiento;
    }

    public String getTipo_curso() {
        return tipo_curso;
    }

    public void setTipo_curso(String tipo_curso) {
        this.tipo_curso = tipo_curso;
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
