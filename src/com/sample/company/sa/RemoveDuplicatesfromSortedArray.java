package com.sample.company.sa;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] arr) {
        int i=0, j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }else{
                arr[i+1]=arr[j];
                i++;
                j++;
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int[] arr={1,1,2};
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray=new RemoveDuplicatesfromSortedArray();
        removeDuplicatesfromSortedArray.removeDuplicates(arr);
    }
}
