package com.company;

/**
 * Created by Shaiful on 2017-02-24.
 */
public class Table {
    private int legs;
    private String manufacturer;

    public Table(int legs, String manufacturer) {
        this.legs = legs;
        this.manufacturer = manufacturer;
    }

    public void eatingPersonOnTable(int person){
        System.out.println(person+" Persons are eatimg on the table");
    }

    public int getLegs() {
        return legs;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
