public class ReLeetCode_142 {
    public static void main(String[] args) {

    }
    public int maxProduct(int[] nums) {
        if(nums.length==1)return nums[0];
        int max = 0;
        int []dp = new int[nums.length];
            max = nums[0];
            for (int i=0;i<nums.length;i++){
                max = Math.max(max,nums[i]);
            }

        int currMin =1,currMax=1;
        for (int n:nums){
            int temp  = currMax*n;
            currMax = Math.max(temp,Math.max(n*currMin,n));
            currMin = Math.min(temp,Math.min(n*currMin,n));
            max = Math.max(max,currMax);
        }
        return max;
    }
}
