//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
//In this we have made so that we first create a frequency array and then add all the frequency before it and then add it to it
//So that we have array where at the position we have the total before it
import java.util.Arrays;

public class LeetCode_84 {
    public static void main(String[] args) {
        int[]arr = {2,5,1,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        int[] count = new int[101]; // since the numbers are between 0 and 100
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i] == 0 ? 0 : count[nums[i]-1];
        }
        return output;
    }
}
