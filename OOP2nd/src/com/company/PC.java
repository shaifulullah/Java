package com.company;

/**
 * Created by Shaiful on 2017-02-23.
 */
public class PC {
    private Monitor monitor;
    private Case thecase;
    private Motherboard motherboard;

    public PC(Monitor monitor, Case thecase, Motherboard motherboard) {
        this.monitor = monitor;
        this.thecase = thecase;
        this.motherboard = motherboard;
    }

    public void powerup(){
        thecase.pressPowerButton();
        drawLogo();
    }

    private  void drawLogo(){
        monitor.drawPixelAt(20,20,"red");
    }
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Case getThecase() {
//        return thecase;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
