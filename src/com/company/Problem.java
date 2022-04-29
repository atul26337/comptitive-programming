package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Problem {
    public static void main(String[] args){
        String abc="           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String[] a=abc.split("[ .,?'!]+");
        System.out.println(a.length);
        for (String token:a){
            System.out.println(token);
        }
    }
//public static void main(String[] args){
//    Scanner in = new Scanner(System.in);
//    int testCases = Integer.parseInt(in.nextLine());
//    while(testCases>0){
//        String pattern = in.nextLine();
//        //Write your code
//        try{
//            Pattern.compile(pattern);
//            System.out.println("Valid");
//        }catch (Exception e){
//            System.out.println("Invalid");
//        }
//
//
//    }
//}
}
