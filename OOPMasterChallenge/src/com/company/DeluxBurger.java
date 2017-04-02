package com.company;

/**
 * Created by Shaiful on 2017-02-27.
 */
public class DeluxBurger extends Hamburger{

    public DeluxBurger() {
        super("Delux", "White", "Chicken and Beef", 8);
        super.addHamburgerAddition1("Drinks",2);
        super.addHamburgerAddition2("Chips",2);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional item in Delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional item in Delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional item in Delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional item in Delux burger");
    }
}
