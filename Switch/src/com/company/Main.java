package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i <= 8; i++) {
            System.out.println(" for 10000 in " + i + "% interest is "
                    + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("****************************************");

        for (int i = 8; i > 1; i--) {
            System.out.println(" for 10000 in " + i + "% interest is "
                    + String.format("%.2f", calculateInterest(10000, i)));
        }
        System.out.println("**********For loop*************");

        int count = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i) == true) {
                count++;
                System.out.println("Number " + i + " is Prime Number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("**********while loop**********");
        int numberCount =0;
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even Number "+number);
            number++;
            numberCount++;
            if (numberCount==5){
                System.out.println("total number count = "+numberCount);
                break;
            }
        }
        System.out.println("****************************************");

    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
// For loop
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
// while loop
    public static boolean isEvenNumber(int number) {
        if (number % 2 != 0)
            return false;
        else
            //System.out.println(number + " is an even number");
            return true;

    }
}
