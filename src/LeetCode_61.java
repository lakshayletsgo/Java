//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//In this we have used binary search and made it such that if the element at the begining is greater than the middle we make the begining the middle
//Just like we do in binary Search
public class LeetCode_61 {
    public static void main(String[] args) {
        int[]arr = {3,4,5,6,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while (s<e){
            int m = s+(e-s)/2;
            if(nums[m]<nums[e]){
                e=m;
            }else{
                s=m+1;
            }

        }
        return nums[s];
    }

}
