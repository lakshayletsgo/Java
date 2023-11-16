//https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
//This was good where we have to find that if a remove a element can we make it strictly increasing
//For that we count number of number of peek element and if the number of peek element is greater than 1 we return false
//If it is 1 we check its position and check if previous element and 2 element ahead element is greater

public class LeetCode_81 {
    public static void main(String[] args) {
        int[]arr = {1,2,10,5,7};
        System.out.println(canBeIncreasing(arr));
    }
    public static boolean canBeIncreasing(int[] nums) {
        int count=0;
        int p=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] || nums[i]==nums[i+1]) {
                count++;
                p=i;
            }
        }
        if(count>1) return false;
        else if(count==1){
            if(p==0 || p== nums.length-2) return true;
            if(nums[p+1]>nums[p-1] || nums[p+2]>nums[p]) return true;
            else return false;
        }
        return true;
    }
}
