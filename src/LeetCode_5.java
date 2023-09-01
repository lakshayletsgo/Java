import java.util.Arrays;

public class LeetCode_5 {
    public static void main(String[] args) {
        int []arr  = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length;
        while(s<=e){
            int m = s+(e-s)/2;
            return nums[m];
        }
        return e;
    }
}
