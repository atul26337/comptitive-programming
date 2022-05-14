package com.topics.array;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            int index=nums[i];
            arr[i]=nums[index];
        }
        return arr;
    }
    public static void main(String args[]){

    }
}
