package com.camada2.clase5;

public class Cliente {
    //Atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //Constructor
    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }
    //Getters(retorna) y Setters(void) - borrar los q no use

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    //metodos propios
     public void incrementarDeuda(Double monto){
        deuda+=monto;
         System.out.println("el valor de deuda es: "+deuda);
        }
     public  void pagarDeuda(){
         System.out.println("su deuda ha sido cancelada");
     }
     //sobrecargar metodo, s ellama igual
    public  void pagarDeuda(Double monto){
        double vuelto = 0;
        if(monto<=deuda){
            deuda-=monto;
            System.out.println("Su deuda ha sido parcialmente cancelada, el saldo es: "+deuda);
        }else{
           vuelto = monto - deuda;
            System.out.println("Su deuda ha sido cancelada completamente con un vuelto de: "+vuelto);
        }
    }
}
