package com.camada2.EjercicioparaParcial2Composite;


public class DepartamentoFactory {
    private static DepartamentoFactory instancia;
    public DepartamentoFactory() {
    }
    public static DepartamentoFactory getInstance() {
        if (instancia == null)
            instancia = new DepartamentoFactory();
        return instancia;
    }
    public Departamento crearDepartamento(String tipo) throws RuntimeException {
        switch (tipo) {
            case "financiero":
                DepartFinanceiro depfinan = new DepartFinanceiro();
                return depfinan;
            case "ventas":
                DepartVendas depvent = new DepartVendas();
                return depvent;
            case "compuesto":
                DepartComposite depcomp = new DepartComposite();
                return depcomp;
            default:
                throw new RuntimeException("Ese departamento no se encuentra clasificado");
        }
    }
}
