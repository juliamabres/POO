package com.camada2.clase19;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa("Camada 2 S.A.");


            Empleado emp1 = EmpleadoFactory.getInstancia().construirEmpleado("EMP-PH");
            emp1.setNombre("Gonzalo");
            emp1.setApellido("Gollo");
            emp1.setLegajo(1234);
            emp.agregarEmpleado(emp1);


        try{
            emp.mostrarEmpleados();
        } catch (NullPointerException e){
            System.err.println(e);
        }

        System.out.println("----Calcular sueldos totales de 10 dias----");
        System.out.println(emp.calcularTotalSueldos(10));


    }
}
