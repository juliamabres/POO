package com.camada2.clase17;

public class ClienteException extends RuntimeException{
    //para hacer una excepcion primero porner extend
    // declarar un constructor vacio

    public ClienteException() {
    }

    public ClienteException(String message) {
        super(message);
    }

    //siguientes get vienen de object y get mesenger de extend run
    public String toString(){
        return  "Excepcion: " + getClass().getName() + "\n"+
                "Mensaje: " +getMessage();
    }
}
