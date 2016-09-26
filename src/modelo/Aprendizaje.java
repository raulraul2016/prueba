package modelo;

public class Aprendizaje {

    Long id_aprendizaje;
    String TipoAprendizaje;
    String Descripcion;

    public Aprendizaje() {
    }

    public Aprendizaje(Long id_aprendizaje, String TipoAprendizaje, String Descripcion) {

        this.id_aprendizaje = id_aprendizaje;
        this.TipoAprendizaje = TipoAprendizaje;
        this.Descripcion = Descripcion;
    }

    public Long getId_aprendizaje() {
        return id_aprendizaje;
    }

    public void setId_aprendizaje(Long id_aprendizaje) {
        this.id_aprendizaje = id_aprendizaje;
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
