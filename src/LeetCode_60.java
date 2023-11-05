//https://leetcode.com/problems/maximum-subarray/description/
//In this we make it so that it add all the elements and if the sum at any point becoms negative we make it again zero
public class LeetCode_60 {
    public static void main(String[] args) {
        int[]arr  = {2,3,-2,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int sum=1;
        int max = Integer.MIN_VALUE;
        for(int element:nums){
            sum*=element;
            max = Math.max(max,sum);
            if(sum<0){
                sum=1;
            }
        }
        return max;

    }

}
