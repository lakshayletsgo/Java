public class ReLeetCode_159 {
    public static void main(String[] args) {

    }
    public boolean isMatch(String s, String p) {
        if (s==null||p==null)return false;
        int sLen = s.length();
        int pLen = p.length();
        boolean [][]dp= new boolean[sLen+1][pLen+1];
        dp[0][0]=true;
        for (int i=0;i<pLen;i++)if (p.charAt(i)=='*'&&dp[0][i-1])dp[0][i+1]=true;
        for (int i = 0; i < sLen; i++) {
            for (int j = 0; j < pLen; j++) {
                if (p.charAt(j)=='.')dp[i+1][j+1]=dp[i][j];
                if(p.charAt(j)==s.charAt(i))dp[i+1][j+1]=dp[i][j];
                if (p.charAt(j)=='*'){
                    if (p.charAt(j-1)!=s.charAt(i)&&p.charAt(j-1)!='.')dp[i+1][j+1]=dp[i+1][j-1];
                    else dp[i+1][j+1]=(dp[i+1][j]||dp[i][j+1]||dp[i+1][j-1]);
                }
            }
        }
        return dp[sLen][pLen];



    }
}
