package com.company;

/**
 * Created by Shaiful on 2017-02-24.
 */
public class Bed {
    private String manufacturerOfBed;
    private String bedSize;

    public Bed(String manufacturerOfBed, String bedSize) {
        this.manufacturerOfBed = manufacturerOfBed;
        this.bedSize = bedSize;
    }

    public void sleep(int people){
        System.out.println(people+" can sleep on "+bedSize+"size bed");
    }
    public String getManufacturerOfBed() {
        return manufacturerOfBed;
    }

    public String getBedSize() {
        return bedSize;
    }
}
