package com.company.cuenta;

public class CuentaCorriente extends Cuenta{
    private Double montoAutorizado;

    @Override
    public void extraer(Double monto) {
        if (monto > informeSaldo() + montoAutorizado){
            System.out.println("no permitido");
        }else{
            setSaldo(monto);
        }
    }


}
