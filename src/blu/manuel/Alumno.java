/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.manuel;

import blu.allan.Carrera;
import blu.fabian.Curso;
import blu.fabian.Persona;
import java.util.ArrayList;

/**
 *
 * @author mc_ro
 */
public class Alumno extends Persona {
    private Carrera carrera;
    private ArrayList<Curso> cursos;

    public Alumno(Carrera carrera, ArrayList<Curso> cursos, String apellido, boolean trabaja, String nombre, String telefono, String email) {
        super(apellido, trabaja, nombre, telefono, email);
        this.carrera = carrera;
        this.cursos = cursos;
    }
    
    
}
