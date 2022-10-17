package com.camada2.Pacientes.Pacientes.src.com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Paciente paciente2=new Paciente("Pablo","Lopez","123456",new Date(9,5,2021));
        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(10,5,2021));

        }
        catch (PacienteException e){
            System.out.println(e);

        }

       try{
           paciente2.darAlta(new Date(15,5,2021));
       }
       catch(PacienteException e){
           System.out.println(e);
        }



    }
}
