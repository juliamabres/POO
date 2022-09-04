package com.camada2.clase10Mesa;


public class Nave extends Objeto1 {

    private Double velocidad;
    private Integer vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        if(getDireccion() != direccion){
            girar(direccion);
            setPosx(x);
            setPosy(y);
        }
        else{
            setPosx(x);
            setPosy(y);
        }
    }

    public void girar(char direccion){
        setDireccion(direccion);
    }

    public void restaVida(int valor){
        this.vida-=valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * velocidad.hashCode();
        hash = hash * vida.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Objeto1)) return false;
        else {
            Nave NaveAuxiliar = (Nave)obj;
            return getDireccion() == (NaveAuxiliar.getDireccion()) &&
                    getPosx() == (NaveAuxiliar.getPosx()) &&
                    getPosy() == (NaveAuxiliar.getPosy());
        }
    }
    @Override
    public String toString() {
        return "Esta nave tiene una velocidad: "+velocidad+"\n"
                +"Tiene: "+vida+" vida/s"+"\n"
                +"Su posicion X es: "+getPosx()+"\n"
                +"Su posicion Y es: "+getPosy()+"\n"
                +"Su direccion es: "+getDireccion();

    }
}
