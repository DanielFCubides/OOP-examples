package com.company.cuenta;

public class CuentaComitente extends Cuenta {
    private String claveCNV;

    @Override
    public void extraer(Double monto) {
        if (monto > informeSaldo() * 0.5) {
            System.out.println("no dejas sacar");
            return;
        }
        setSaldo(informeSaldo() - monto);

    }

    public void extraer(Double monto, String claveCNV) {
        if (!claveCNV.equals(this.claveCNV)) {
            System.out.println("no dejas sacar");
            return;
        }
        if (monto>informeSaldo()){
            System.out.println("no suficienete saldo");
            return;
        }
        setSaldo(informeSaldo() - monto);
    }

    @Override
    public void depositar(Double dinero) {
        super.depositar(dinero * 0.9);
    }
}
