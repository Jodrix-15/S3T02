package org.example;

public class Broker extends Observer{

    private String name;

    public Broker(String name, Subject su){
        this.name = name;
        this.su = su;
        this.su.addObserver(this);
    }
    @Override
    public void update(String msj) {
        System.out.println("Acciones " + name + " respuesta: " + msj);
    }
}
