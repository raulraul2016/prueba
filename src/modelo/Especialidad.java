package modelo;


public class Especialidad {
    
    Long idEspecialidad;
    String tipoEspecialidad;
    String descripcionEspecialidad;

    public Especialidad() {
    }

    public Especialidad(Long idEspecialidad, String tipoEspecialidad, String descripcionEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.tipoEspecialidad = tipoEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
    }
    
    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }
    
    
    
    
    
    
    
}