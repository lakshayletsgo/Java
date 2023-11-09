//https://leetcode.com/problems/move-zeroes/
//In this i have made so that whenever a zero is reached we check for the next non zero element and then swap
import java.util.Arrays;
public class LeetCode_69 {
    public static void main(String[] args) {
        int[]arr = {0,1,0,3,12};
//        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public  void moveZeroes(int[] nums) {

        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int j = i;
                while (j < n) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                        break;
                    }
                    j++;
                }
            }
        }
    }

}
