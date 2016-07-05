/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.fabian;

import java.util.Date;

/**
 *
 * @author mc_ro
 */
public class Horario {
    private String nombre;
    private Date horaInicial;
    private Date horaFinal;

    public Horario(String nombre, Date horaInicial, Date horaFinal) {
        this.nombre = nombre;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }
    
    
    
}
