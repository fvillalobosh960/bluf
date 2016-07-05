/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.fabian;

import blu.allan.Contacto;

/**
 *
 * @author mc_ro
 */
public class Persona extends Contacto {

    private String apellido;
    private boolean trabaja;

    public Persona(String apellido, boolean trabaja, String nombre, String telefono, String email) {
        super(nombre, telefono, email);
        this.apellido = apellido;
        this.trabaja = trabaja;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }

    
   

    
    
}
