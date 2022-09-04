package com.camada2.clase12;

public class CajaAhorro1 extends Cuenta1{

    public static final double INTERES_CAJA_AHORRO = 0.2;

    //sobreescritura de método abstracto del padre
    @Override
    public void extraer(double monto) {
        if(informarSaldo() >= monto)
            setSaldo(informarSaldo() - monto);
    }


    public void cobrarIntereses() {
        setSaldo(informarSaldo()+(informarSaldo() * CajaAhorro1.INTERES_CAJA_AHORRO));

    }
}
