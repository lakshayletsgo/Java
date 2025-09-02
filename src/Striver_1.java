import java.util.*;
public class Striver_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)map.put(nums[i],i);
        for(int i=0;i<nums.length;i++)if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i)return new int[]{map.get(target-nums[i]),i};

        return new int[]{-1,-1};
    }
}
