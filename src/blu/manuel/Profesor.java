/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.manuel;

import blu.fabian.Persona;
import blu.utils.Grado;

/**
 *
 * @author mc_ro
 */
public class Profesor extends Persona {
    private Grado grado;

    public Profesor(Grado grado, String apellido, boolean trabaja, String nombre, String telefono, String email) {
        super(apellido, trabaja, nombre, telefono, email);
        this.grado = grado;
    }
    
    
}
