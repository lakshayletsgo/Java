public class ReLeetCode_162 {
    public static void main(String[] args) {

    }
    public int[] countBits(int n) {
//        int []ans= new int[n+1];
//        for (int i=0;i<=n;i++){
//            int temp=0;
//            for (int j = 0; j < 32; j++) if (((i>>j)&1)==1)temp++;
//            ans[i]=temp;
//        }
//        return ans;



        int []dp = new int[n+1];
        int temp=1;
        for (int i = 1; i <= n; i++) {
            if (temp*2==i)temp=i;
            dp[i]=dp[i-temp]+1;
        }
        return dp;
    }
}
