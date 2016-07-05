/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blu.manuel;

import blu.mariana.Mensaje;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mc_ro
 */
public class Conversacion {
    private ArrayList<Alumno> estudiantes;
    private ArrayList<Mensaje> mensajes;
    private Alumno creador;
    private Date fecha;

    public Conversacion(ArrayList<Alumno> estudiantes, ArrayList<Mensaje> mensajes, Alumno creador, Date fecha) {
        this.estudiantes = estudiantes;
        this.mensajes = mensajes;
        this.creador = creador;
        this.fecha = fecha;
    }
    
}
