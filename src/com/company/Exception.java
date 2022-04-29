package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int result=first/second;
            System.out.println(result);

        }catch (InputMismatchException w){
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch(ArithmeticException e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
