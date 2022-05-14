package com.sample.company.practice.array;

import com.sample.company.Array;

import java.util.Arrays;

public class SolveHeight {
    static int getMinDiff(int[] arr, int k){
        int ans = arr[arr.length-1] - arr[0];
        int small=arr[0]+k;
        int big=arr[arr.length-1]-k;
        int temp=0;
        if (small > big)
        {
            temp = small;
            small = big;
            big = temp;
        }
        for (int i=0;i<arr.length;i++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            // If both subtraction and addition
            // do not change diff
            if (subtract >= small || add <= big)
                continue;

            // Either subtraction causes a smaller
            // number or addition causes a greater
            // number. Update small or big using
            // greedy approach (If big - subtract
            // causes smaller diff, update small
            // Else update big)
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }
        return Math.min(ans, big - small);
    }
    public static void main(String args[]){
        int arr[]={2,6,3,4,7,2,10,3,2,1};
        Arrays.sort(arr);
        int b=getMinDiff(arr,5);
        System.out.println(b);
    }
}
