package modelo;

import java.util.ArrayList;
import modelo.DetalleHerramienta;

/**
 *
 * @author bangho
 */
public class Herramienta {

    private Long id;
    private ArrayList<DetalleHerramienta> dHerramienta;

    public Herramienta() {
    }

    public Herramienta(Long id, ArrayList<DetalleHerramienta> dHerramienta) {
        this.id = id;
        this.dHerramienta = dHerramienta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<DetalleHerramienta> getdHerramienta() {
        return dHerramienta;
    }

    public void setdHerramienta(ArrayList<DetalleHerramienta> dHerramienta) {
        this.dHerramienta = dHerramienta;
    }

}
