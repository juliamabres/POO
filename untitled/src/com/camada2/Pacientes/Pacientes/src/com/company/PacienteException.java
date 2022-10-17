package com.camada2.Pacientes.Pacientes.src.com.company;

public class PacienteException extends RuntimeException{

    public PacienteException() {
    }

    public PacienteException(String message) {
        super(message);
    }

    public String toString(){
        return  "Excepcion: " + getClass().getName() + "\n"+
                "Mensaje: " +getMessage();
    }
}
