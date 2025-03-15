public class ReLeetCode_130 {
    public static void main(String[] args) {

    }
    public int countSubstrings(String s) {
        int cnt=0;
        int n = s.length();
        boolean[][]dp = new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i] = true;
            cnt++;
        }
        for(int i=0;i<n-1;i++){
            dp[i][i+1]=  s.charAt(i)==s.charAt(i+1);
            cnt=dp[i][i+1]?1:0;
        }
        for(int len=3;len<=n;len++){
            for (int i=0,j=len-1;j<n;j++,i++){
                dp[i][j] = dp[i+1][j-1]&&(s.charAt(i)==s.charAt(j));
                cnt=dp[i][j]?1:0;
            }
        }
        return cnt;
    }
}
