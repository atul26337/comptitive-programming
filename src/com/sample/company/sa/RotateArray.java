package com.sample.company.sa;

public class RotateArray {
    public void rotate(int[] nums, int k) {
//        Arrays.sort();
        k = k%nums.length;
        int[] newArr = new int[k];
        for(int i=0 ; i<k ; i++){
            newArr[i] = nums[nums.length-k+i];
        }
        for(int i = nums.length-1 ; i>=k ; i--){
            nums[i] = nums[i-k];
        }
        for(int i=0 ; i<k ; i++){
            nums[i] = newArr[i];
        }

    }

    public static void main(String args[]){
        RotateArray rotateArray=new RotateArray();
        int[] arr={1,2,3,4,5,6,7};
        rotateArray.rotate(arr,3);
    }
}
