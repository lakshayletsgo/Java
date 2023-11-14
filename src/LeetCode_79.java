//https://leetcode.com/problems/running-sum-of-1d-array/
//We can optimise it by just adding the previous sum to the present iterating element
import java.util.Arrays;
public class LeetCode_79 {
    public static void main(String[] args) {
    int[]arr  = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
//    public int[] runningSum(int[] nums) {
//
//        int[]ans = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            int sum =nums[i];
//
//            for(int j=0;j<i;j++){
//                sum+=nums[j];
//            }
//            ans[i] =sum;
//        }
//        return ans;
//    }

//    OR
    public static int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
