
package modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.text.DateFormat;

/**
 *
 * @author bangho
 */
public class DatosCarga {
    
    private Long id_dato_carga;
    private String fecha_carga;
    private String lugarCarga;
    private Long id_personas;

    
    public DatosCarga() {
    }
    
    public DatosCarga(Long id_dato_carga, String fecha_carga, String lugarCarga) {
        this.id_dato_carga = id_dato_carga;
        this.fecha_carga = fecha_carga;
        this.lugarCarga = lugarCarga;
        this.id_personas = id_personas;
        
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

    public Long getId_personas() {
        return id_personas;
    }

    public void setId_personas(Long id_personas) {
        this.id_personas = id_personas;
    }
    
}
