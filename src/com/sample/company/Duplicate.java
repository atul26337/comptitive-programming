package com.sample.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> integers=new ArrayList<>();
        Arrays.sort(arr);
        n=arr.length;
        for (int i=0;i<n;i++){
            if(arr.length-1==i){
                if(integers.isEmpty()){
                     integers.add(-1);
                     return integers;
                }
                break;
            }
            if(arr[i]==arr[i+1]){
                integers.add(arr[i]);
            }
        }
        return integers;
    }
    public static void main(String args[]){
        int[] arr={0,3,1,2};
        ArrayList<Integer> arrayList=duplicates(arr,arr.length);
        System.out.println(arrayList.toString());
    }
}
