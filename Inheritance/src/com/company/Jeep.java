package com.company;

/**
 * Created by Shaiful on 2017-02-22.
 */
public class Jeep extends Car {
    private int roadServiceMonths;

    public Jeep(int roadServiceMonths) {
        super("Jeep", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity()+rate;
        if(newVelocity ==0 ){
            stop();
        }else if{}
    }
}
