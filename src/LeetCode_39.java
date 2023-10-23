//https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;

public class LeetCode_39 {
    public static void main(String[] args) {
        int []arr={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }
    public static  int[] twoSum(int[] nums, int target) {
        int[]ans ={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
