import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_153 {
    int c,target;
    public int findTargetSumWays(int[] nums, int target) {
        this.target = target;
        helper(nums,0,0);
        return c;
    }

    private void helper(int[] nums, int i, int index) {
        if (index==nums.length){
            if(target==i)c++;
            return;
        }
        helper(nums,i+nums[index],index+1);
        helper(nums,i-nums[index],index+1);
    }

    public static void main(String[] args) {

    }
}

