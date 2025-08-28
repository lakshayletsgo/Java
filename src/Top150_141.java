import java.util.*;
public class Top150_141 {
    public int lengthOfLIS(int[] nums) {
        int n  = nums.length;
        int max = 1;
        int [] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++)if(nums[i]>nums[j])dp[i]= Math.max(dp[j]+1,dp[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
