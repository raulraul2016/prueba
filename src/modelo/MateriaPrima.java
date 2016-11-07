package modelo;

/**
 *
 * @author bangho
 */
public class MateriaPrima {

    private Long id_materia_prima;
    private String nombre_materia_prima;
    private String descripcion;

    public MateriaPrima() {
    }

    public MateriaPrima(Long id_materia_prima, String nombre_materia_prima, String descripcion) {
        this.id_materia_prima = id_materia_prima;
        this.nombre_materia_prima = nombre_materia_prima;
        this.descripcion = descripcion;
    }

    public Long getId_materia_prima() {
        return id_materia_prima;
    }

    public void setId_materia_prima(Long id_materia_prima) {
        this.id_materia_prima = id_materia_prima;
    }

    public String getNombre_materia_prima() {
        return nombre_materia_prima;
    }

    public void setNombre_materia_prima(String nombre_materia_prima) {
        this.nombre_materia_prima = nombre_materia_prima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
