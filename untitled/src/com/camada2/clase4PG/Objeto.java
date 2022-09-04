//clase: https://www.youtube.com/watch?v=fdfXkiuVHp4
package com.camada2.clase4PG;

public class Objeto {
//atributos
    int id;
    String nombre;
    String apellido;
    double precio_venta;
    int stock;
    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    // constructor

    public Objeto(int id, String nombre, String apellido, double precio_venta, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.precio_venta = precio_venta;
        this.stock = stock;
    }

    //procedimiento s/rta - void
    public void mostrarNombre(){
       System.out.println("Hola soy un alumno y se decir mi nombre.");
    }
    public void saberAprobado(double calificacion) {
        if (calificacion >= 6) {
            System.out.println("Aprobe");
        } else {
            System.out.println("No aprobe");
        }
    }
    // metodos - funciones: con rta (return)

    public boolean hayStock(){
        return stock > 0;
    }
    public double consultarPrecio(){
        return precio_venta;
    }


    //crear alumno
    //public static void main(String[] args) {
//
//        Objeto alu1 = new Objeto(1, "Lopez", "Maria");
//        Objeto alu3 = new Objeto(5, "Luis","Perez");
//
//        //seteo 1 x 1
//        alu1.setId(1);
//        alu1.setApellido("Martinez");
//        alu1.setNombre("Maria");
//
//        System.out.println(alu1.getApellido());
//
//    }
}


