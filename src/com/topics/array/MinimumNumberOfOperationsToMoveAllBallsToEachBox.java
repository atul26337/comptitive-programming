package com.topics.array;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int[] result=new int[boxes.length()];
        int operationCount=0;
        for (int i=0;i<boxes.length();i++){
            for(int j=0;j<boxes.length();j++){
                if(i!=j){
                    if(String.valueOf(boxes.charAt(j)).equals("1")){
                        int count=Math.abs(j-i);
                        operationCount+=count;
                    }

                }
            }
            result[i]=operationCount;
            operationCount=0;
        }
        return result;
    }

    public static void main(String args[]){
        String arr="110";
        MinimumNumberOfOperationsToMoveAllBallsToEachBox minimumNumberOfOperationsToMoveAllBallsToEachBox=new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        minimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations(arr);
    }
}
