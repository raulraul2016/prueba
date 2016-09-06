package modelo;


public class Aprendizaje {
    
    Long id;
    String TipoAprendizaje;
    String Descripcion;

    public Aprendizaje() {
    }

    public Aprendizaje(Long id, String TipoAprendizaje, String Descripcion) {
        this.id = id;
        this.TipoAprendizaje = TipoAprendizaje;
        this.Descripcion = Descripcion;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoAprendizaje() {
        return TipoAprendizaje;
    }

    public void setTipoAprendizaje(String TipoAprendizaje) {
        this.TipoAprendizaje = TipoAprendizaje;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
       
}
