package com.sample.company.sa;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroCounter=nums.length-1,intCounter=0;boolean isContainsZero=false;


//            Arrays.sort(nums);
            int[] finalArray = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    finalArray[zeroCounter] = nums[i];
                    zeroCounter--;
                } else {
                    finalArray[intCounter] = nums[i];
                    intCounter++;
                }
            }
            for (int j = 0; j < nums.length; j++) {
                nums[j] = finalArray[j];
            }

    }


    public static void main(String args[]){
        int[] arr={0,1,0,3,12};
        MoveZeroes mz=new MoveZeroes();
        mz.moveZeroes(arr);
    }
}
