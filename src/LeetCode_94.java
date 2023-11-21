//https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/submissions/1103629700/
//Everyone is using same approach
public class LeetCode_94 {
    public static void main(String[] args) {
        int[]arr = {1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }
    public static int differenceOfSum(int[] nums) {
        int total =0;
        for(int in:nums){
            total+=in;
        }
        int t = 0;
        for(int in:nums){
            while (in!=0){
                t = in%10+t;
                in/=10;
            }
        }
        return total-t;
    }
}
