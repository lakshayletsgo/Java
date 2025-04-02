public class ReLeetCode_158 {
    public static void main(String[] args) {

    }
    public int maxCoins(int[] nums) {
        int[]temp = new int[nums.length+2];
        int n=1;
        for (int i:nums)temp[n++]=i;
        temp[0]=temp[n++]=0;
        int [][]dp=new int[n][n];
        for (int i=0;i<n;i++){
            for (int left=0;left<n-i;left++){
                int right= left+i;
                for (int k=left+1;k<right;k++)dp[left][right]=Math.max(dp[left][right],nums[left]*nums[k]*nums[right]+dp[left][k]+dp[k][right]);
            }
        }
        return dp[0][n-1];
    }
}
