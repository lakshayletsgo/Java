//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
import java.util.Arrays;

public class LeetCode_18 {
    public static void main(String[] args) {
        int []arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        int index=2;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]!=nums[index-2])
            {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
