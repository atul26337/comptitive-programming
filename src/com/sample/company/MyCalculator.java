package com.sample.company;

import java.util.Scanner;
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public static int power(int a ,int b ) throws java.lang.Exception {
        if(a==0 && b==0){
            throw new java.lang.Exception("n and p should not be zero.");
        }else if( a<0 && b<0){
            throw  new java.lang.Exception("n or p should not be negative.");
        }
        int pow = 1;
        if(a==0){
            pow=0;
            return pow;
        }
        for (int i = 1; i <= b; i++)
            pow *= a;
        if(pow<0){
            throw  new java.lang.Exception("n or p should not be negative.");

        }else if(pow==0){
            pow=1;
        }
        return pow;

    }
}

class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (java.lang.Exception e) {
                System.out.println(e);
            }
        }
    }
}