//https://leetcode.com/problems/build-array-from-permutation/submissions/1098576430/
import java.util.Arrays;
public class LeetCode_71 {
    public static void main(String[] args) {
int[]arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    public static int[] buildArray(int[] nums) {
        int[]arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

}
