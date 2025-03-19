public class ReLeetCode_139 {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        if (nums.length==1)return nums[0];
        if (nums.length==2)return Math.max(nums[0],nums[1]);
        int withLast = getMax(nums,1,nums.length-1);
        int withOutLast = getMax(nums,0,nums.length-2);
        return Math.max(withLast,withOutLast);

    }

    private int getMax(int[] nums, int i, int i1) {
        if(i==i1)return nums[i];
        int[]dp = new int[nums.length];
        dp[i] = nums[i];
        dp[i+1] = Math.max(nums[i],nums[i+1]);
        for (int j=i+2;j<=i1;j++)dp[j] = Math.max(dp[j-1],nums[j]+dp[j-2]);
        return dp[i1];
    }
}
