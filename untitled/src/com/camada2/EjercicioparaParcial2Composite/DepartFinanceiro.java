package com.camada2.EjercicioparaParcial2Composite;
public class DepartFinanceiro implements Departamento{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println(getClass().getSimpleName());
    }

}
