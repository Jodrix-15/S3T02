package org.example;
import java.util.*;
public class Subject {

    private List<Observer> observadores = new ArrayList<Observer>();

    public void addObserver(Observer o){
        observadores.add(o);
    }

    public void notifyAllObservers(String msj){
        for(Observer o: observadores){
            o.update(msj);
        }
    }

    public void bolsaUp(){
        notifyAllObservers("La bolsa está subiendo");

    }

    public void bolsDown(){
        notifyAllObservers("La bolsa está bajando");
    }
}
