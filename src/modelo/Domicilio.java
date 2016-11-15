/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author bangho
 */
public class Domicilio {

    private Long id_domicilio;
    private String calle;
    private Integer nro;
    private String pais;
    private String provincia;
    private String observacion;
    private Localidad localidad;

    public Domicilio() {
    }

    public Domicilio(Long id_domicilio, String calle, Integer nro, String pais, String provincia, String observacion, Localidad localidad) {
        this.id_domicilio = id_domicilio;
        this.calle = calle;
        this.nro = nro;
        this.pais = pais;
        this.provincia = provincia;
        this.observacion = observacion;
        this.localidad = localidad;
    }

    public Long getId_domicilio() {
        return id_domicilio;
    }

    public void setId_domicilio(Long id_domicilio) {
        this.id_domicilio = id_domicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

}
