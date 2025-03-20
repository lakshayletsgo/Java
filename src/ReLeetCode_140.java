public class ReLeetCode_140 {
    public static void main(String[] args) {

    }

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int dp[] = new int[s.length() + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            int first = Character.getNumericValue(s.charAt(i - 1));
            int sec = Integer.parseInt(s.substring(i - 2, i));
            if (first >= 1 && first < 10) dp[i] += dp[i - 1];
            if (sec >= 10 && sec <= 26) dp[i] += dp[i - 2];
        }
        return dp[s.length()];
    }
}