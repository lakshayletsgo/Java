
import java.util.*;

public class LeetCode_4 {
    public static void main(String[] args) {
        int []nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums,target));

    }
        public static List<Integer> targetIndices(int[] nums, int target) {
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    list.add(i);
                }
            }
            return list;
        }

}
