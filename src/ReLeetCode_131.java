import java.util.List;

public class ReLeetCode_131 {
    private class Trie{
        int val;
        Trie[]next;
        Trie(int val){
            this.val = val;
            next = new Trie[26];
        }
    }
    public static void main(String[] args) {

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new  boolean[n+1];
        int maxL = 0;

        dp[0] = true;
        for (String word:wordDict)maxL = Math.max(word.length(),maxL);
        for (int i=1;i<=n;i++){
            for (int j=i-1;j>=Math.max(i-maxL-1,0);j--){
                if (dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];

    }
}
