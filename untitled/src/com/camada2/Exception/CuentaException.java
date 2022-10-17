package com.camada2.Exception;

public class CuentaException extends Exception{
    public CuentaException(){
        super();
    }
    public CuentaException(String message) {
        super(message);
    }

    public String toString(){
        return  "Excepcion: " + this.getClass().getName() + "\n"+
                "Mensaje: " +this.getMessage()+ "\n";
    }
}
