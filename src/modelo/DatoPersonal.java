
package modelo;

import java.sql.Date;


public class DatoPersonal {
    
    Long id;
    String apeNom;
    String lugNac;
    String fechaNacimiento;
    Integer dni;
    String estaCivil;
    String domicilio;
    String tel;
    String edad;
    String email;

    public DatoPersonal() {
    }

    public DatoPersonal(Long id, String apeNom, String lugNac, String fechaNacimiento, Integer dni, String estaCivil, String domicilio, String tel, String edad, String email) {
        this.id = id;
        this.apeNom = apeNom;
        this.lugNac = lugNac;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.estaCivil = estaCivil;
        this.domicilio = domicilio;
        this.tel = tel;
        this.edad = edad;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApeNom() {
        return apeNom;
    }

    public void setApeNom(String apeNom) {
        this.apeNom = apeNom;
    }

    public String getLugNac() {
        return lugNac;
    }

    public void setLugNac(String lugNac) {
        this.lugNac = lugNac;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getEstaCivil() {
        return estaCivil;
    }

    public void setEstaCivil(String estaCivil) {
        this.estaCivil = estaCivil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

      
}
