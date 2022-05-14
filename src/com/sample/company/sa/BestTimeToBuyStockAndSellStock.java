package com.sample.company.sa;

public class BestTimeToBuyStockAndSellStock {

    public int bestTimeToBuyAndSell(int[] prices){
        int minSoFar=prices[0],maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            minSoFar=Math.min(minSoFar,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minSoFar);
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int arr[]={7,6,4,3,1};
        BestTimeToBuyStockAndSellStock bestTimeToBuyStockAndSellStock=new BestTimeToBuyStockAndSellStock();
        bestTimeToBuyStockAndSellStock.bestTimeToBuyAndSell(arr);
    }
}
