
package modelo;

/**
 *
 * @author bangho
 */
public class DatosCarga {
    
    private Long id_dato_carga;
    private String fecha_carga;
    private String lugarCarga;
    private Personas personas;

    
    public DatosCarga() {
    }

    public DatosCarga(Long id_dato_carga, String fecha_carga, String lugarCarga, Personas personas) {
        this.id_dato_carga = id_dato_carga;
        this.fecha_carga = fecha_carga;
        this.lugarCarga = lugarCarga;
        this.personas = personas;
    }

    public Long getId_dato_carga() {
        return id_dato_carga;
    }

    public void setId_dato_carga(Long id_dato_carga) {
        this.id_dato_carga = id_dato_carga;
    }

    public String getFecha_carga() {
        return fecha_carga;
    }

    public void setFecha_carga(String fecha_carga) {
        this.fecha_carga = fecha_carga;
    }

    public String getLugarCarga() {
        return lugarCarga;
    }

    public void setLugarCarga(String lugarCarga) {
        this.lugarCarga = lugarCarga;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    
    

    
}
