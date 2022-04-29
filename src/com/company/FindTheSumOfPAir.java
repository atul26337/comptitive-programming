package com.company;

import java.util.Arrays;

public class FindTheSumOfPAir {
    static void sum(int[] arr,int traget){
        int size=arr.length;
        for(int i=0;i<size;i++){
            for (int j=i;j<size;j++){
                if(arr[i]+arr[j]==traget){
                    System.out.println("find pair for target "+traget+" is ("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    static void findPair(int[] arr,int traget){
        int min=0;
        int max=arr.length-1;
        Arrays.sort(arr);
        while (min<max){
            if(arr[min]+arr[max]==traget){
                System.out.println("find pair for target "+traget+" is ("+arr[min]+","+arr[max]+")");
                return;
            }
            if (arr[min] + arr[max] < traget) {
                min++;
            }
            else {
                max--;
            }
        }
    }

    public static void main(String args[]){
    int[] arr= {8, 7, 2, 5, 3, 1};
        findPair(arr,10);
    }
}
