package com.company.cuenta;

public class Cliente {

    private String apellido;
    private int numeroCliente;
    private int DNI;
    private int CUIT;

    public Cliente(String apellido, int numeroCliente, int DNI, int CUIT) {
        this.apellido = apellido;
        this.numeroCliente = numeroCliente;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }
}
