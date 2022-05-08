package com.company.sa;

import com.company.Array;

import java.util.Arrays;

public class TwoSumArray {
    public int[] twoSum(int[] arr, int x) {
        Arrays.sort(arr);
        int z=0;
        int y=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[z]+arr[y]==x){
                break;
            }
            if(arr[z]+arr[y]<x ){
                z++;
            }else {
                y--;
            }
        }
        int[] a=new int[2];

        if(arr[z]+arr[y]!=x){
            a[0]=0;
            a[1]=0;
        }
        a[0]=z;
        a[1]=y;
        return a;
    }

    public static void main(String[] args){
        int arr[]={-10,-1,-18,-19};
        TwoSumArray twoSumArray=new TwoSumArray();
        twoSumArray.twoSum(arr,-19);
    }
}
