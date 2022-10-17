package com.camada2.EjercicioparaParcial2Composite;
import java.util.ArrayList;
import java.util.List;

public class DepartComposite implements Departamento {
    private int id;
    private String name;
    private List<Departamento> childDepartments = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {

        childDepartments.forEach(Departamento::getName);
    }

    public void addDepart(Departamento department) {
        childDepartments.add(department);
        System.out.println("Se agrego el departamento con exito");
    }

    public void removeDepart(Departamento department) {

        childDepartments.remove(department);
    }
}
