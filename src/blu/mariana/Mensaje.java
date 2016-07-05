/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.mariana;

import blu.fabian.Persona;
import blu.manuel.Conversacion;
import java.util.Date;

/**
 *
 * @author mc_ro
 */
public class Mensaje {
    private String texto;
    private Conversacion conversacion;
    private Persona creador;
    private Date fecha;
    private Adjunto adjunto;

    public Mensaje(String texto, Conversacion conversacion, Persona creador, Date fecha, Adjunto adjunto) {
        this.texto = texto;
        this.conversacion = conversacion;
        this.creador = creador;
        this.fecha = fecha;
        this.adjunto = adjunto;
    }
    
    
}
