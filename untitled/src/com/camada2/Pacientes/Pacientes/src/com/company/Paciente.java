package com.camada2.Pacientes.Pacientes.src.com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    public Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy)) throw new PacienteException("La fecha esta fuera del rango");
        else if(fechaInternacion.after(hoy)) throw new PacienteException("La fecha esta fuera del rango");
        else{
            this.fechaInternacion=fechaInternacion;
        }

    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else throw new PacienteException("Error en fecha de alta");
            System.out.println("No se puede");
    }


}
