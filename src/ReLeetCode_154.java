public class ReLeetCode_154 {
    public static void main(String[] args) {

    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int m=s1.length(),n=s2.length(),o=s3.length();
        if (m+n!=o)return false;
        boolean[]dp = new boolean[n+1];
        dp[0]=true;
        for (int i=1;i<=n;i++)dp[i]=dp[i-1]&&s2.charAt(i-1)==s3.charAt(i-1);
        for (int i=1;i<=m;i++){
            dp[0]=dp[0]&&s1.charAt(i-1)==s3.charAt(i-1);
            for (int j=1;j<=n;j++){
                dp[j]=(dp[j]&&s1.charAt(i-1)== s3.charAt(i+j-1))||(dp[j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1));
            }
        }
        return dp[n];
    }
}
