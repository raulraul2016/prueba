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
public class Artesano {
    
    private Long id_artesano;
    private String descripcion;
    private String disp_viajar;//disponibilidad de viajar
    private String disp_horaria;//disponibilidad horaria
    private String monotributista;
    private String subsidio;
    private String beca;
    private String enseñar;
    private String institucion;
    private Personas personas;
    private Formacion formacion;
    private Taller taller;
    private Asociativismo asociativismo;
    private Localidad localidad;
    private Departamento departamento;

    public Artesano() {
    }

    public Artesano(Long id_artesano, String descripcion, String disp_viajar, String disp_horaria, String monotributista, String subsidio, String beca, String enseñar, String institucion, Personas personas, Formacion formacion, Taller taller, Asociativismo asociativismo, Localidad localidad, Departamento departamento) {
        this.id_artesano = id_artesano;
        this.descripcion = descripcion;
        this.disp_viajar = disp_viajar;
        this.disp_horaria = disp_horaria;
        this.monotributista = monotributista;
        this.subsidio = subsidio;
        this.beca = beca;
        this.enseñar = enseñar;
        this.institucion = institucion;
        this.personas = personas;
        this.formacion = formacion;
        this.taller = taller;
        this.asociativismo = asociativismo;
        this.localidad = localidad;
        this.departamento = departamento;
    }

    

    public Long getId_artesano() {
        return id_artesano;
    }

    public void setId_artesano(Long id_artesano) {
        this.id_artesano = id_artesano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisp_viajar() {
        return disp_viajar;
    }

    public void setDisp_viajar(String disp_viajar) {
        this.disp_viajar = disp_viajar;
    }

    public String getDisp_horaria() {
        return disp_horaria;
    }

    public void setDisp_horaria(String disp_horaria) {
        this.disp_horaria = disp_horaria;
    }

    public String getMonotributista() {
        return monotributista;
    }

    public void setMonotributista(String monotributista) {
        this.monotributista = monotributista;
    }

    public String getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(String subsidio) {
        this.subsidio = subsidio;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public String getEnseñar() {
        return enseñar;
    }

    public void setEnseñar(String enseñar) {
        this.enseñar = enseñar;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public Formacion getFormacion() {
        return formacion;
    }

    public void setFormacion(Formacion formacion) {
        this.formacion = formacion;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public Asociativismo getAsociativismo() {
        return asociativismo;
    }

    public void setAsociativismo(Asociativismo asociativismo) {
        this.asociativismo = asociativismo;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

   
    
}
