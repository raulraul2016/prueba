
package modelo;

import java.util.ArrayList;
import modelo.DetalleHerramienta;

/**
 *
 * @author bangho
 */
public class Herramienta {
    
    private Long id;
    private ArrayList<Herramienta> tipoHerramienta;
   
    private ArrayList <DetalleHerramienta> dHerramienta;
    private Herramienta tHerramienta[] = new Herramienta[4];

    public Herramienta() {
    }

    public Herramienta(Long id, ArrayList<Herramienta> tipoHerramienta, ArrayList<DetalleHerramienta> dHerramienta) {
        this.id = id;
        this.tipoHerramienta = tipoHerramienta;
        this.dHerramienta = dHerramienta;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Herramienta> getTipoHerramienta() {
        return tipoHerramienta;
    }

    public void setTipoHerramienta(ArrayList<Herramienta> tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }

    public ArrayList<DetalleHerramienta> getdHerramienta() {
        return dHerramienta;
    }

    public void setdHerramienta(ArrayList<DetalleHerramienta> dHerramienta) {
        this.dHerramienta = dHerramienta;
    }

    public Herramienta[] gettHerramienta() {
        return tHerramienta;
    }

    public void settHerramienta(Herramienta[] tHerramienta) {
        this.tHerramienta = tHerramienta;
    }

}
