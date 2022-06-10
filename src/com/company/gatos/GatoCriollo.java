package com.company.gatos;

public class GatoCriollo extends Gato{

    public GatoCriollo(String name, int age) {
        super(name, age);
    }

    @Override
    public String Miauuu() {
        return super.Miauuu() + " De Gato Criollo";
    }

    public String BuscarComida(){
        return "Buscando comida en la calle";
    }
}
