package com.camada2.InterfaceHashToSComT;

   public class Persona9 implements Amigable{

        private String nombre;
        private Integer felicidad;
        private Integer cantidadAmigos;

        // constructor no borrar


       public Persona9(String nombre, Integer felicidad, Integer cantidadAmigos) {
           this.nombre = nombre;
           this.felicidad = felicidad;
           this.cantidadAmigos = cantidadAmigos;
       }

       //implementa el metodo aca
        @Override
        public void hacerAmigo() {
            this.felicidad += 1;
            this.cantidadAmigos += 10;
        }


        //getters no borrar
        public Integer getFelicidad() {
            return felicidad;
        }

        public Integer getCantidadAmigos() {
            return cantidadAmigos;
        }

       public String getNombre() {
           return nombre;
       }

       public void setNombre(String nombre) {
           this.nombre = nombre;
       }
   }

