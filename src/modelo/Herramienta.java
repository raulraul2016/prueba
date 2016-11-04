package modelo;

import java.util.ArrayList;

/**
 *
 * @author bangho
 */
public class Herramienta {

    private Long id;
    private String nombreHerramienta;
    private TipoHerramienta tipoHerramienta;
    private String descripcion;
    //private ArrayList<TipoHerramienta> dHerramienta;

    public Herramienta() {
    }

    public Herramienta(Long id, String nombreHerramienta, TipoHerramienta tipoHerramienta, String descripcion) {
        this.id = id;
        this.nombreHerramienta = nombreHerramienta;
        this.tipoHerramienta = tipoHerramienta;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public TipoHerramienta getTipoHerramienta() {
        return tipoHerramienta;
    }

    public void setTipoHerramienta(TipoHerramienta tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipoHerramienta(Integer tipoH) {
        this.tipoHerramienta = tipoHerramienta;
    }

    @Override
    public String toString() {
        return "Herramienta{" + "tipoHerramienta=" + tipoHerramienta + '}';
    }

   
}
