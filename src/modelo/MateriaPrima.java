
package modelo;

/**
 *
 * @author bangho
 */
public class MateriaPrima {
    
    private Long id_materia_prima;
    private String tipo_materia_prima;
    private String descripcion;

    public MateriaPrima() {
    }

    public MateriaPrima(Long id_materia_prima, String tipo_materia_prima, String descripcion) {
        this.id_materia_prima = id_materia_prima;
        this.tipo_materia_prima = tipo_materia_prima;
        this.descripcion = descripcion;
    }

    public Long getId_materia_prima() {
        return id_materia_prima;
    }

    public void setId_materia_prima(Long id_materia_prima) {
        this.id_materia_prima = id_materia_prima;
    }

    public String getTipo_materia_prima() {
        return tipo_materia_prima;
    }

    public void setTipo_materia_prima(String tipo_materia_prima) {
        this.tipo_materia_prima = tipo_materia_prima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
