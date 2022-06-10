package com.company.gatos;

public class GatoPersa extends Gato{
    public GatoPersa(String name, int age) {
        super(name, age);
    }

    @Override
    public String Miauuu() {
        return super.Miauuu() + " Gato Persa";
    }

    public String PedirComida(){
        return "Miauuu Miauuu mucha hambre";
    }
}
