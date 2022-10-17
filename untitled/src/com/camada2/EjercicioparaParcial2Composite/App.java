package com.camada2.EjercicioparaParcial2Composite;

import com.camada2.EjExtraPresupuestos.UnidadCombinada;

public class App {
    public static void main(String[] args) throws Exception {
       // Departamento vendas = new DepartVendas(
        //            1, "Departamento de Vendas");
        //        Departamento financeiro = new DepartFinanceiro(
        //            2, "Departamento Financiero");
        //
        //        DepartComposite composite = new DepartComposite(
        //            3, "Composite");
        //
        //          composite.addDepart(vendas);
        //          composite.addDepart(financeiro);
        //
        //          composite.getName();

        Departamento dto1 = DepartamentoFactory.getInstance().crearDepartamento("financiero");
        Departamento dto2 = DepartamentoFactory.getInstance().crearDepartamento("ventas");
        Departamento dto3 = DepartamentoFactory.getInstance().crearDepartamento("compuesto");

        ((DepartFinanceiro) dto1).setId(1);
        ((DepartFinanceiro) dto1).setName("Dto Financiero");
        ((DepartVendas) dto2).setId(2);
        ((DepartVendas) dto2).setName("Dto Ventas");
        ((DepartComposite) dto3).setId(2);
        ((DepartComposite) dto3).setName("Dto Compuesto");
        ((DepartComposite) dto3).addDepart(dto1);
        ((DepartComposite) dto3).addDepart(dto2);


        dto1.getName();
        dto2.getName();
        dto3.getName();

        System.out.println("elimino ventas");
        ((DepartComposite) dto3).removeDepart(dto2);
        dto3.getName();
    }
}
