public class ReLeetCode_156 {
    public static void main(String[] args) {

    }public int numDistinct(String s, String t) {
        int sLen = s.length();int tLen=t.length();
        int [][]dp= new int[tLen+1][sLen+1];
        for (int i=0;i<=sLen;i++)dp[0][i]=1;
        for (int i=0;i<tLen;i++){
            for (int j=0;j<sLen;j++){
                if (s.charAt(j)==t.charAt(i))dp[i+1][j+1]=dp[i][j]+dp[i+1][j];
                else dp[i+1][j+1]=dp[i+1][j];
            }
        }
        return dp[tLen][sLen];
    }
}
