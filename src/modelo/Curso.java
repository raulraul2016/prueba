package modelo;

import java.sql.Date;

/**
 *
 * @author bangho
 */
public class Curso {

    private Long id_cusro_perfeccionamiento;
    private String nombre_curso;
    private Date fecha_entrega;
    private String descripcion;
    private Institucion institucion;

    public Curso() {
    }

    public Curso(Long id_cusro_perfeccionamiento, String nombre_curso, Date fecha_entrega, String descripcion, Institucion institucion) {
        this.id_cusro_perfeccionamiento = id_cusro_perfeccionamiento;
        this.nombre_curso = nombre_curso;
        this.fecha_entrega = fecha_entrega;
        this.descripcion = descripcion;
        this.institucion = institucion;
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

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
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

}
