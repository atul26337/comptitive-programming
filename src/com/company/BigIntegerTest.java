package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();
        BigInteger bigInteger=new BigInteger(n);
       Boolean prime= bigInteger.isProbablePrime(1);
        if(prime){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
