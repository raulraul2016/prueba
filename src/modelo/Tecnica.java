/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bgh007
 */
public class Tecnica {
    
    private Long id_tecnica;
    private String tipo_tecnica;
    private String tecnica_diferente;
    private String descripcion;

    public Tecnica() {
    }

    public Tecnica(Long id_tecnica, String tipo_tecnica, String tecnica_diferente, String descripcion) {
        this.id_tecnica = id_tecnica;
        this.tipo_tecnica = tipo_tecnica;
        this.tecnica_diferente = tecnica_diferente;
        this.descripcion = descripcion;
    }

    public Long getId_tecnica() {
        return id_tecnica;
    }

    public void setId_tecnica(Long id_tecnica) {
        this.id_tecnica = id_tecnica;
    }

    public String getTipo_tecnica() {
        return tipo_tecnica;
    }

    public void setTipo_tecnica(String tipo_tecnica) {
        this.tipo_tecnica = tipo_tecnica;
    }

    public String getTecnica_diferente() {
        return tecnica_diferente;
    }

    public void setTecnica_diferente(String tecnica_diferente) {
        this.tecnica_diferente = tecnica_diferente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
