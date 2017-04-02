package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer number ");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0; i<array.length;i++){
            sum += array[i];
        }
        return (double) sum/(double) array.length;
    }

    public static void main(String[] args) {
        int [] myinteger = getIntegers(5);
        for (int i=0; i<myinteger.length; i++){
            System.out.println("For position of "+i+" you have entered "+ myinteger[i]);
        }

        System.out.println("The average is "+getAverage(myinteger));
    }
}
