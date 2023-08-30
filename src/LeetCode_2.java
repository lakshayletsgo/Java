//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
public class LeetCode_2 {
    public static void main(String[] args) {
        int [] nums = {-3,-2,-1,0,0,1,2};

        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length;
        while (start<end){
            int mid  = start + (end-start)/2;
            if(nums[mid]<0){
                start= mid+1;

            }else{
                end  = mid;
            }
        }
        int pos = nums.length-start;
        int i = start;
        while(i<nums.length&&nums[i]==0){
            pos--;
            i++;
        }

        return start>pos?start:pos;
    }
}
