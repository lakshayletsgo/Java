//https://leetcode.com/problems/left-and-right-sum-differences/submissions/1101310439/
//This is best and easy solution other uses suffix and preffix in it
//In this I have first taken sum of the all the element and then add subtracted the element from the left and stored in the array and then the right
//Then i have just stored it in the original array
import java.util.Arrays;

public class LeetCode_87 {
    public static void main(String[] args) {
        int[]arr = {1};
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }
    public static int[] leftRightDifference(int[] nums) {
        int[]right = new int[nums.length];
        int[]left = new int[nums.length];

        int total = 0;
        for(int i:nums){
            total+=i;
        }
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            right[i] = total-temp;
        }
        temp=0;
        for(int i=nums.length-1;i>=0;i--){
            temp+=nums[i];
            left[i] = total-temp;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}
