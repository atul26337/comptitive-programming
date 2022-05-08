package com.company.sa;

public class MinStepsInInfiniteGrid {
    public int coverPoints(int[] A, int[] B) {
        int steps=0;
        for (int i=0;i<A.length-1;i++){
            int x1=A[i];
            int x2=A[i+1];
            int y1=B[i];
            int y2=B[i+1];
            int diff_x=Math.abs(x1-x2);
            int diff_y=Math.abs(y1-y2);

            steps=Math.max(diff_x,diff_y);


        }
        return steps;
    }
    public static void main(String args[]){

    }
}
