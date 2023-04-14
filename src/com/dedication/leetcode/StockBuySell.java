package com.dedication.leetcode;

public class StockBuySell {

    public static void main(String[] args) {

        int prices[] = {7,1,1,3,23,6};

        int n = prices.length;

        int min = prices[0],diff=0,result=0;

        for(int i=0;i<n;i++)
        {
            if(prices[i]<min)
                min=prices[i];

            diff = prices[i]-min;

            if(diff>result)
                result=diff;
        }

        System.out.println(result);
    }
}
