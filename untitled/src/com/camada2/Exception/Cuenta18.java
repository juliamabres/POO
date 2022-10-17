package com.camada2.Exception;

public class Cuenta18 {
        private String titular;
        private double saldo;

        public Cuenta18(String titular, double saldo) throws CuentaException
        {
            this.titular=titular;
            if (saldo<0)
                throw new CuentaException("No se puede crear una cuenta con saldo negativo");
            this.saldo=saldo;
        }
        public void extraer(double importe) throws  CuentaException
        {
            if (importe >saldo)
                throw new CuentaException("No hay saldo sufieciente para esta extracción");
            saldo=saldo-importe;
        }
        public void depositar(double importe)
        {
            saldo+=importe;
        }

}
