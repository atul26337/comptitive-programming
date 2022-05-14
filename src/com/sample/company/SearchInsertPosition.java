package com.sample.company;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length -1 ;
        int mid = start + (end -start)/2;

        while(start <= end){
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] != target){
                if(nums[mid]+1 == target && nums[mid] - 1 == target){
                    return mid;
                }
            }

            if(nums[mid] <= target){
                start = mid + 1;
            }
            if(nums[mid]>target){
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }

        return mid;
    }
    public static void main(String[] args){
        int arr[]={1,3,5,6};
        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
        int result =searchInsertPosition.searchInsert(arr,8);
        System.out.print("result "+result);
    }
}
