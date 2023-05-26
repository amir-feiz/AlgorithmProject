package com.company.models;

import java.util.Arrays;

//A Dynamic Programming based solution for 0-1 Knapsack problem
public class Knapsack {

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int knapSack(int W, int[] wt, int[] val) {
        int n = val.length;
        int i, w;
        int[][] K = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    }

    public static int knapsackForCount(int[] prices, int max){
        int count = 0;
        int addedAPrices=0;
        Arrays.sort(prices);
        System.out.println("You can buy these carpets.");
        for(int x:prices){
            addedAPrices+=x;
            if (addedAPrices > max) {
                return count;
            }
            else {
                System.out.println("Carpet " + count + " with price " + x);
                count++;
            }
        }
        return count;
    }
}