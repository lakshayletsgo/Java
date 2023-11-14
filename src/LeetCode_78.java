//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/submissions/1098740008/
//In this we have made so that we have taken a left and right variable and made so that if the right and left variable sum is less than the target then we have added the right-left to the count else reduced the right
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_78 {
    public static void main(String[] args) {

    }
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums); // sort the vector nums
        int count = 0; // variable to store the count
        int left = 0; // variable to store the left
        int right = nums.size()-1; // variable to store the right
        while(left < right){ // loop until left is less than right
            if(nums.get(left) + nums.get(right) < target){ // if nums[left] + nums[right] is less than target
                count += right-left; // update the count
                left++; // increment the left
            }
            else{ // else
                right--; // decrement the right
            }
        }
        return count; // return the count

    }
}
