package modelo;

/**
 *
 * @author Usuario
 */
public class Rubro {
    
    private Long id;
    private String tipoRubro;
    private String descripcionRubro;
    private Especialidad especialidad;
    private Aprendizaje aprendizaje;
    
    
    public Rubro(){
        
    }

    public Rubro(Long id, String tipoRubro, String descripcionRubro, Especialidad especialidad, Aprendizaje aprendizaje) {
        this.id = id;
        this.tipoRubro = tipoRubro;
        this.descripcionRubro = descripcionRubro;
        this.especialidad = especialidad;
        this.aprendizaje = aprendizaje;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Aprendizaje getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(Aprendizaje aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    
}