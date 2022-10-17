package com.camada2.PreParcial2;


public class MainPreParcial {
    public static void main(String[] args) {
        try {
            OfertaAcademica fe = OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
            ((Curso) fe).setNombre("Front End");
            ((Curso) fe).setDescripcion("Curso de Front End");
            ((Curso) fe).setMeses(2);
            ((Curso) fe).setCantHorasMensuales(16);
            ((Curso) fe).setValorHora(1000);

            //otra posibilidad
            Curso be = (Curso) OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Curso");
            be.setMeses(2);
            be.setCantHorasMensuales(20);
            be.setValorHora(900);
            be.setNombre("Back End");
            be.setDescripcion("Curso de Back End");

            ProgramaIntensivo ci = (ProgramaIntensivo) OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Programa Intensivo");
            ci.setDescripcion("Curso Fullstack");
            ci.setNombre("Curso Fullstack");
            ci.setPorcentajeBonificacion(0.20);
            ci.getOfertaAcademicas().add(fe);
            ci.getOfertaAcademicas().add(be);

            Taller t1 = (Taller) OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Taller");
            t1.setDescripcion("Taller de DT");
            t1.setNombre("DT");
            t1.setCantTrabajosPracticos(2);
            t1.setCostoTrabPractico(2000);

            Carrera carr1 = (Carrera) OfertaAcademicaFactory.getInstancia().crearOfertaAcademica("Carrera");
            carr1.setDescripcion("Carrera de Desarrollador");
            carr1.setNombre("Desarrollador");
            carr1.setCostoBasico(18000);
            carr1.getOfertaAcademicas().add(t1);
            carr1.getOfertaAcademicas().add(be);

            Instituto c2 = new Instituto("Camada 2 Cod Sh");
            c2.getOfertaAcademicas().add(fe);
            c2.getOfertaAcademicas().add(be);
            c2.getOfertaAcademicas().add(t1);
            c2.getOfertaAcademicas().add(ci);
            c2.getOfertaAcademicas().add(carr1);
            c2.generarInforme();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
