package com.company.sa;

import com.company.Array;

import java.util.Arrays;

public class FindDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]){

    }
}
