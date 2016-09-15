/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorDatoPersonal;

/**
 *
 * @author bangho
 */
public class Controlador {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    DatoPersonal dp = new DatoPersonal();
    ControladorDatoPersonal cdp = new ControladorDatoPersonal();
    
    dp.setApeNom("Leo Garay");
    dp.setDni(5555555);
    dp.setDomicilio("Siempre vivas sin numero");
    dp.setEdad("25");
    dp.setEmail("leo@gmail.com");
    dp.setEstaCivil("Soltero");
    dp.setFechaNacimiento("01-01-2016");
    dp.setLugNac("Chepes City");
    dp.setTel("0380 154236598");
    cdp.agregar(dp);
    
    }
}
