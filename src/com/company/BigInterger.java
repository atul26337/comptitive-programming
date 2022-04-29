package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInterger {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        BigInteger a=scanner.nextBigInteger();
        BigInteger b=scanner.nextBigInteger();
        BigInteger bigInteger=new BigInteger(String.valueOf(a));
        BigInteger bigInteger1=new BigInteger(String.valueOf(b));
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));

    }
}
