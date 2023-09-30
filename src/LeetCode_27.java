//https://leetcode.com/problems/monotonic-array/?envType=daily-question&envId=2023-09-29
//In this we have first instaniated the variable and then if any of them will remain true it will return true else false

public class LeetCode_27 {
    public static void main(String[] args) {
        int [] nums  ={1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
