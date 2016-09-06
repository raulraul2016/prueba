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
    private Integer id_persona;
    private Integer id_formacion;
    private Integer id_taller;
    private Integer id_asociativismo;
    private Integer id_localidad;
    private Integer id_departamento;

    public Artesano() {
    }

    public Artesano(Long id_artesano, String descripcion, String disp_viajar, String disp_horaria, String monotributista, String subsidio, String beca, String enseñar, String institucion, Integer id_persona, Integer id_formacion, Integer id_taller, Integer id_asociativismo, Integer id_localidad, Integer id_departamento) {
        this.id_artesano = id_artesano;
        this.descripcion = descripcion;
        this.disp_viajar = disp_viajar;
        this.disp_horaria = disp_horaria;
        this.monotributista = monotributista;
        this.subsidio = subsidio;
        this.beca = beca;
        this.enseñar = enseñar;
        this.institucion = institucion;
        this.id_persona = id_persona;
        this.id_formacion = id_formacion;
        this.id_taller = id_taller;
        this.id_asociativismo = id_asociativismo;
        this.id_localidad = id_localidad;
        this.id_departamento = id_departamento;
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

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public Integer getId_formacion() {
        return id_formacion;
    }

    public void setId_formacion(Integer id_formacion) {
        this.id_formacion = id_formacion;
    }

    public Integer getId_taller() {
        return id_taller;
    }

    public void setId_taller(Integer id_taller) {
        this.id_taller = id_taller;
    }

    public Integer getId_asociativismo() {
        return id_asociativismo;
    }

    public void setId_asociativismo(Integer id_asociativismo) {
        this.id_asociativismo = id_asociativismo;
    }

    public Integer getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(Integer id_localidad) {
        this.id_localidad = id_localidad;
    }

    public Integer getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(Integer id_departamento) {
        this.id_departamento = id_departamento;
    }
    
}
