package com.company.sa;

public class MaximumSumSubArray {

    public int maxSumSubArr(int[ ] nums){
        int maxSum=nums[0];int currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(currSum+nums[i],nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }

        return maxSum;
    }

    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        MaximumSumSubArray maximumSumSubArray=new MaximumSumSubArray();
        maximumSumSubArray.maxSumSubArr(arr);
    }
}
