package com.company.cuenta;

public abstract class Cuenta {

    private Double saldo;

    public void depositar(Double dinero) {
        this.saldo += dinero;
    }

    public abstract void extraer(Double monto);

    public Double informeSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
}
