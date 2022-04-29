package com.sorting;

public class Sorting {
    public static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = 0;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    /*Bubble sort time and space complexity
     * Worse case: O(n2)
     * When the array is reverse-sorted, we iterate through the array (n - 1) times. In the first iteration, we do (n - 1) swaps, (n - 2) in the second, and so on until in the last iteration where we do only one swap. Thus the total number of swaps sum up to n * (n - 1) / 2.
     *
     * Average case: O(n2)
     * For a completely random array, the total number of swaps averages out to be around n2 / 4, which is again O(n2).
     *
     * Best case: O(n)
     * In the first iteration of the array, if we do not perform any swap, we know that the array is already sorted so stop sorting, therefore the time complexity turns out to be linear.
     *
     * Space Complexity:O(1)
     * Since we use only a constant amount of additional memory apart from the input array, the space complexity is O(1).
     * */


    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    /*Insertion sort time and space complexity
    * Worse case: O(n2)
    * When we apply insertion sort on a reverse-sorted array, it will insert each element at the beginning of the sorted subarray, making it the worst time complexity of insertion sort.
    *
    * Average case: O(n2)
    * When the array elements are in random order, the average running time is O(n2 / 4) = O(n2).
    *
    * Best case: O(n)
    * When we initiate insertion sort on an already sorted array, it will only compare each element to its predecessor, thereby requiring n steps to sort the already sorted array of n elements.
    *
    * Space Complexity:O(1)
    * Since we use only a constant amount of additional memory apart from the input array, the space complexity is O(1).
    */

    public static int[] selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int index=i+1;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=0;
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
        return  arr;
    }

    public static void main(String[] args){
        int[] a ={3,60,35,2,45,320,5};
        int[] b =bubbleSort(a);
        int[] c =insertionSort(a);
        int[] d=selectionSort(a);
        System.out.println("Bubble Sort "+"\n");
        for (int j : b) {
            System.out.print(j+"\t");
        }

        System.out.println("\n \n"+"Insertion Sort "+"\n");
        for (int j : c) {
            System.out.print(j+"\t");
        }
        System.out.println("\n \n"+"Selection Sort "+"\n");
        for (int j : d) {
            System.out.print(j+"\t");
        }
    }
}
