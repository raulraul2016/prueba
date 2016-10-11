
package modelo;

/**
 *
 * @author bgh007
 */
public class Necesidad {
    
    private Long id_necesidad;
    private String tipo_necesidad;
    private String asistencia_tecnica;
    private String descripcion;
    private String disponibilidad;

    public Necesidad() {
    }

    public Necesidad(Long id_necesidad, String tipo_necesidad, String asistencia_tecnica, String descripcion, String disponibilidad) {
        this.id_necesidad = id_necesidad;
        this.tipo_necesidad = tipo_necesidad;
        this.asistencia_tecnica = asistencia_tecnica;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    public Long getId_necesidad() {
        return id_necesidad;
    }

    public void setId_necesidad(Long id_necesidad) {
        this.id_necesidad = id_necesidad;
    }

    public String getTipo_necesidad() {
        return tipo_necesidad;
    }

    public void setTipo_necesidad(String tipo_necesidad) {
        this.tipo_necesidad = tipo_necesidad;
    }

    public String getAsistencia_tecnica() {
        return asistencia_tecnica;
    }

    public void setAsistencia_tecnica(String asistencia_tecnica) {
        this.asistencia_tecnica = asistencia_tecnica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


}
