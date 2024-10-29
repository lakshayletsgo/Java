import java.util.Arrays;

public class ReLeetCode_1 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,4,1,4}));
    }
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length<=1){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
