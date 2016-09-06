package modelo;

/**
 *
 * @author Usuario
 */
public class Rubro {
    
    private Long id;
    private String tipoRubro;
    private String descripcionRubro;
    private Long id_especialidad;
    private Long id_aprendizaje;
    
    
    public Rubro(){
        
    }

    public Rubro(Long id, String tipoRubro, String descripcionRubro) {
        this.id = id;
        this.tipoRubro = tipoRubro;
        this.descripcionRubro = descripcionRubro;
        this.id_especialidad = id_especialidad;
        this.id_aprendizaje = id_aprendizaje;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoRubro() {
        return tipoRubro;
    }

    public void setTipoRubro(String tipoRubro) {
        this.tipoRubro = tipoRubro;
    }

    public String getDescripcionRubro() {
        return descripcionRubro;
    }

    public void setDescripcionRubro(String descripcionRubro) {
        this.descripcionRubro = descripcionRubro;
    }

    public Long getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(Long id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public Long getId_aprendizaje() {
        return id_aprendizaje;
    }

    public void setId_aprendizaje(Long id_aprendizaje) {
        this.id_aprendizaje = id_aprendizaje;
    }
    
    
}