package com.topics.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if(nums[i]== nums[i+1]){
                return  nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3};
        NRepeatedElementinSize2NArray nRepeatedElementinSize2NArray=new NRepeatedElementinSize2NArray();
        nRepeatedElementinSize2NArray.repeatedNTimes(arr);
    }
}
