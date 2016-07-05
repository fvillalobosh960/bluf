/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.fabian;

import blu.allan.Carrera;
import blu.manuel.Profesor;
import java.util.ArrayList;

/**
 *
 * @author mc_ro
 */
public class Curso {
    private Carrera carrera;
    private Profesor profesor;
    private ArrayList<Horario> horarios;

    public Curso(Carrera carrera, Profesor profesor, ArrayList<Horario> horarios) {
        this.carrera = carrera;
        this.profesor = profesor;
        this.horarios = horarios;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }
    
    
 
}
