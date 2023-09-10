//https://leetcode.com/problems/3sum-closest/description/
//In this we have first sort the array and then add the first three number of the array and supppose it as the closet sum
//We then run the loop for i less than nums.length-2
//We have taken j = i+1 and k to be last element
//We have then run a loop so that we can check the sum by changing the value of the j and k
//We have taken the sum and store in different variable and then checked if its difference with the target is less than the difference of the first closet sum and target
//If the difference is less we have reassign the value of the closet sum to be new sum

import java.util.Arrays;
public class LeetCode_21 {
    public static void main(String[] args) {
        int[]arr = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
         System.out.println();
    }
    public static int threeSumClosest  (int[] nums, int target) {
        Arrays.sort(nums);
        int closetSUm = nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closetSUm)){
                    closetSUm = sum;
                }
                if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closetSUm;

    }
}
