//Knap Sack Sum Problem
//In this we make it so that if we enter any array and then ask whether there can be elements that make it to the sum it will return true else false

public class DP_2 {
    private static int N = 29;
    private static int W = 29;
    private static boolean[][]table = new boolean[N+1][W+1];
    public static void main(String[] args) {
        int[]arr = {2,4,3,6};
        N = arr.length;
        W  = 1;
        System.out.println(knapSackSumProb(arr,W));
    }
    public  static boolean knapSackSumProb(int[]arr,int w){
        for(int i=0;i< table.length;i++){
            for(int j=0;j<table[0].length;j++){
                if(i==0){
                    table[i][j] = false;
                }
                if(j==0){
                    table[i][j] = true;
                }
            }
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<w+1;j++){
                if(arr[i-1]<=j){
                    table[i][j] = table[i][j-arr[i-1]]||table[i-1][j];
                }else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
        return table[arr.length][w];
    }

}
