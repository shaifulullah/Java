package com.company;

public class Vehicle{

    private String name;
    private String size;

    private int currentVelocity;
    private int curremtDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.curremtDirection = 0;
    }

    public void steer(int direction){
        this.curremtDirection += direction;
        System.out.println("vehicle.streer(): streeing at  "+curremtDirection+" degrees ");
    }

    public void move(int velocity, int direction){
        this.curremtDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("vehicle.move(): Moving at "+currentVelocity+ " in direction "+curremtDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurremtDirection() {
        return curremtDirection;
    }
}
