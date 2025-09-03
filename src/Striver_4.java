public class Striver_4 {
    public String longestPalindrome(String s) {
        int n = s.length(),start = 0,end = 0;
        boolean [][] dp = new boolean [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j+i<n;j++){
                dp[j][i+j] =  s.charAt(j)==s.charAt(i+j)&&(i<2||dp[j+1][i+j-1]);
                if(dp[j][j+i]&&i>end-start){
                    start = j;
                    end = j+i;
                }
            }
        }
        return s.substring(start,end+1);
    }
}
