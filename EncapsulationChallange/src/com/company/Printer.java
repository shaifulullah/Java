package com.company;

/**
 * Created by Shaiful on 2017-02-24.
 */
public class Printer {
    private int tonerLevel;
    private int numberOfPagePrinted;
    private boolean duplexPrinetr;

    public Printer(int tonerLevel, int numberOfPagePrinted, boolean duplexPrinetr) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.numberOfPagePrinted = numberOfPagePrinted;
        this.duplexPrinetr = duplexPrinetr;
    }

    public void tonerRefill(int refill){
        this.tonerLevel += refill;
        if(this.tonerLevel>100){
            System.out.println("You can not refill more than "+refill+"%");
        }else{
            System.out.println("You have refilled "+refill+"%"+"Your toner level is now "+this.tonerLevel+"%");
        }
    }

    public int print(int page){

        int pagesprinted = page;
        if(this.duplexPrinetr){
           pagesprinted /=2;
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagePrinted += pagesprinted;
        return pagesprinted;

    }

//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
    public int getNumberOfPagePrinted() {
        return numberOfPagePrinted;
    }
//
//    public boolean isDuplexPrinetr() {
//        return duplexPrinetr;
//    }
}
