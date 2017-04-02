package com.company;

public class Main {

    public static void main(String[] args) {
        Case thecase = new Case("Case Model","ABC computer","standerd",new Dimensions(10,20,10));
        Motherboard motherboard = new Motherboard("A20","ASUS",4,6,"V2.2.1");
        Monitor monitor = new Monitor("abcModel","Dell",17,new Resolution(200,100));

        PC thepc = new PC(monitor,thecase,motherboard);
        thepc.powerup();
    }
}
