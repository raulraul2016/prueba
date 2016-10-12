package modelo;

/**
 *
 * @author bangho
 */
public class DatosCarga {

    private Long id_dato_carga;
    private String fecha_carga;
    private String lugarCarga;
    private DatoPersonal datoPersonal;

    public DatosCarga() {
    }

    public DatosCarga(Long id_dato_carga, String fecha_carga, String lugarCarga, DatoPersonal datoPersonal) {
        this.id_dato_carga = id_dato_carga;
        this.fecha_carga = fecha_carga;
        this.lugarCarga = lugarCarga;
        this.datoPersonal = datoPersonal;
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

    public DatoPersonal getDatoPersonal() {
        return datoPersonal;
    }

    public void setDatoPersonal(DatoPersonal datoPersonal) {
        this.datoPersonal = datoPersonal;
    }

}
