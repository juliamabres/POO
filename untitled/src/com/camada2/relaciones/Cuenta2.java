package com.camada2.relaciones;

public class Cuenta2 {
    public class Cuenta {
        private Cliente titular;
        private int numeroDeCuenta;
        private Double saldo;

        //Modificar este constructor

        public Cuenta(Cliente titular, int numeroDeCuenta, Double saldo) {
            this.titular = titular;
            this.numeroDeCuenta = numeroDeCuenta;
            this.saldo = saldo;
        }

        public class Cliente{
            private String titular;
        }
    }
}
