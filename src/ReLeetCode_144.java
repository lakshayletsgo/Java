public class ReLeetCode_144 {
    public static void main(String[] args) {

    }
    boolean c(int nums[],int dp[][],int sum,int i)
    {
        if(sum==0)
        {
            return true;
        }
        if(sum<0 || i>=nums.length)
        {
            return false;
        }
        if(dp[i][sum]!=-1)
        {
            return dp[i][sum]==1;
        }
        boolean bool;
        bool= c(nums,dp,sum-nums[i],i+1) || c(nums,dp,sum,i+1);
        dp[i][sum]=(bool==true)?1:0;
        return bool;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2==1)
        {
            return false;
        }
        int dp[][]=new int[nums.length][sum+1];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                dp[i][j]=-1;
            }
        }
        return c(nums,dp,sum/2,0);
    }

}
