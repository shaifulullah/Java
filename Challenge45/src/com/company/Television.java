package com.company;

/**
 * Created by Shaiful on 2017-02-24.
 */
public class Television {
    private String model;
    private String name;
    private int display;
    private Resolution resolution;

    public Television(String model, String name, int display, Resolution resolution) {
        this.model = model;
        this.name = name;
        this.display = display;
        this.resolution = resolution;
    }

    public void watch(){
        System.out.println("watch television");
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public int getDisplay() {
        return display;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
