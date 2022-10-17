package com.camada2.clase17;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private double saldoEnCuenta;
    private Double deuda;
    private double limite;

    public Cliente(String nombre, String apellido, String dni, Double deuda, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.deuda = deuda;
        this.limite = limite;
    }

    public void comprar(double importe) throws ClienteException{
        if(importe > (limite-deuda)) throw new ClienteException("El importe supera su limite de compra disponible");
        else{
            deuda+=importe;
            System.out.println("Se ha realizado la compra, vuelva pronto.");
        }
    }
    public void saldarDeuda(double importe) throws ClienteException{
        if(deuda==0) throw new ClienteException();
        else if(deuda<importe){
            importe -= deuda;
            System.out.println("Su deuda ha sido saldada, su vuelto es: "+importe);
        }
        else{
            deuda-=importe;
            System.out.println("Se ha abonado: "+importe+". Su deuda actualizada es "+deuda);
        }
    }

}
