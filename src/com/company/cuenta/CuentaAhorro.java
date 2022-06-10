package com.company.cuenta;

public class CuentaAhorro extends Cuenta{
    private Double tasaInteres;


    @Override
    public void extraer(Double monto) {
        if (monto > informeSaldo()){
            System.out.println("no permitido");
        }else{
            setSaldo(monto);
        }

    }

    public void cobrarIntereses(){
        System.out.println("intereses cobrados " + tasaInteres);
    }
}
