public class DP_3 {
    private static int N = 20;
    private static int W = 20;
    private static boolean[][] table ;

    public static void main(String[] args) {
        int []arr ={1,5,12};
        System.out.println(canBeDivided(arr,arr.length));
    }
    public static boolean canBeDivided(int[]arr, int n){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        sum/=2;
        W = sum;
        table = new boolean[N+1][W+1];
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[0].length;j++){
                if(i==0){
                    table[i][j] = false;
                }
                if(j==0){
                    table[i][j] = true;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    table[i][j] = table[i][j-arr[i-1]]||table[i-1][j];
                }else{
                    table[i][j] = table[i-1][j];
                }
            }
        }
        return table[n][sum];
    }

}
