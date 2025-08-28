import java.util.*;
public class Top150_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[]dp = new boolean[n+1];
        dp[0]= true;
        int maxLength=0;
        for(String word:wordDict)maxLength= Math.max(word.length(),maxLength);
        for(int i=0;i<=n;i++){
            for(int j=i-1;j>=Math.max(i-maxLength-1,0);j--){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]= true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
