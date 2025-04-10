/*You are given an array/list 'prices' where the elements of the array represent the prices of the stock as they were yesterday and indices of the array represent minutes. Your task is to find and return the maximum profit you can make by buying and selling the stock. You can buy and sell the stock only once.

Note:

You can’t sell without buying first.*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){

        if(prices.size()==0){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
        int index=0;
        for(int i=0; i<prices.size(); i++){
            if (prices.get(i)<min){
                min=prices.get(i);
                index=i;
            }
            int currProfit=prices.get(i)-min;
            if(currProfit>profit){
                profit=currProfit;
            }
        }
        return profit;
    }
}
