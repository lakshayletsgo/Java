//https://leetcode.com/problems/concatenation-of-array/submissions/

import java.util.Arrays;

public class LeetCode_70 {
    public static void main(String[] args) {
        int[]arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int []newArr = new int[nums.length*2];
        for(int i=0;i<newArr.length;i++){
            if(i<nums.length){
                newArr[i] = nums[i];
            }else{
                newArr[i]=  nums[i-nums.length];
            }

        }
        return newArr;
    }
}
