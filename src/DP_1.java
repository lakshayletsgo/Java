import java.util.Arrays;

//Dynamic Programming
//In this we learn what is dynamic programing
//First we will learn about the KnapSack Problem
//Dyanamic Programming is nothing just recursion with some changes
//There are two ways to solve a DP problem
//1. Recursion + Memoziation
//2. Recursion + Top-Down
public class DP_1 {
    public static void main(String[] args) {
        int[]val = {20,40,10,60};
        int[]wt={1,3,4,6};
        N = val.length;
        int max = 10;
        W = max;
        System.out.println(knapSack(val,wt,N,W));
    }
    public static int N = Integer.MAX_VALUE;
    public static int W = 10;
    public static int [][]  table= new int[N+1][W+1];
    public static int knapSack(int[]val, int []wt,int n, int w){
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                if(i==0||j==0){
                    table[i][j] = 0;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1]<=j){
                    table[i][j] = Math.max(val[i-1]+table[i-1][j-wt[i-1]],table[i-1][j]);
                }else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
        return table[n][w];
    }

}
