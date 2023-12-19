package org.example;

public abstract class Observer {

    protected Subject su;
    public abstract void update(String msj);
}
