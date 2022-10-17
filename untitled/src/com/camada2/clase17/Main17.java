package com.camada2.clase17;

public class Main17 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Monse", "Ledezma", "1234", 10000., 15000);
        Cliente cliente2 = new Cliente("Juli", "Mabres", "12345", 11000., 12000);
        Cliente cliente3 = new Cliente("Julio", "Lopez", "123456", 10000., 12000);
      //probamos sin exedernos en limite
        try{
            cliente1.comprar(2000);
        }
        catch(ClienteException e){
            System.out.println(e);
        }
        //probamos exediendonos en limite
        try{
            cliente2.comprar(5000);
        }
        catch(ClienteException e){
            System.out.println(e);
        }
        //saldar deuda
        try{
            cliente3.saldarDeuda(2000);
        }
        catch(ClienteException e){
            System.out.println(e);
        }
    }

}
