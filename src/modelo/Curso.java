package modelo;

import java.sql.Date;

/**
 *
 * @author bangho
 */
public class Curso {

    private Long id_cusro_perfeccionamiento;
    private String nombre_curso;
    private String descripcion;
    private Institucion institucion;
    private Date fecha_entrega;

    public Curso() {
    }

    public Curso(Long id_cusro_perfeccionamiento, String nombre_curso, String descripcion, Institucion institucion, Date fecha_entrega) {
        this.id_cusro_perfeccionamiento = id_cusro_perfeccionamiento;
        this.nombre_curso = nombre_curso;
        this.descripcion = descripcion;
        this.institucion = institucion;
        this.fecha_entrega = fecha_entrega;
    }

    public Long getId_cusro_perfeccionamiento() {
        return id_cusro_perfeccionamiento;
    }

    public void setId_cusro_perfeccionamiento(Long id_cusro_perfeccionamiento) {
        this.id_cusro_perfeccionamiento = id_cusro_perfeccionamiento;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }



}
