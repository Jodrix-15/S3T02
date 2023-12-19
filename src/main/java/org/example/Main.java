package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Subject sujeto = new Subject();

        Broker b1 = new Broker("Jor", sujeto);
        Broker b2 = new Broker("San", sujeto);

        sujeto.bolsaUp();
        sujeto.bolsDown();


    }
}