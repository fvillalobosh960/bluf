/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.allan;

import java.util.ArrayList;

/**
 *
 * @author mc_ro
 */
public class Universidad extends Contacto {
    private ArrayList<Carrera> carreras;
    
    public Universidad(String nombre, String telefono, String email, ArrayList<Carrera> carreras) {
        super(nombre, telefono, email);
        this.carreras = carreras;
    }
    
}
