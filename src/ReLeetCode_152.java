public class ReLeetCode_152 {
    public static void main(String[] args) {

    }
    public int change(int amount, int[] coins) {
        int[]dp = new int[amount+1];
        dp[0]=1;
        for (int coin:coins) for (int i = coin; i <=amount ; i++) dp[i]+=dp[i-coin];
        return dp[amount];
    }
}
