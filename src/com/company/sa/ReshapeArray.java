package com.company.sa;

public class ReshapeArray {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int pr= mat.length,pc=mat[0].length,sr=0,sc=0;
        if(pr*pc!=r*c)
            return mat;
        int[][] output=new int[r][c];
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if(sc==c){
                    sr++;
                    sc=0;
                }
                output[sr][sc]= mat[i][j];
                sc++;
            }
        }
        return output;
    }


    public static void main(String args[]){
        int[][] arr= {{1,2},{3,4}};
        ReshapeArray reshapeArray=new ReshapeArray();
        reshapeArray.matrixReshape(arr,1,4);
    }
}
