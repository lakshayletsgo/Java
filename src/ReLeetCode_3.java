import java.util.Arrays;
import java.util.HashMap;

public class ReLeetCode_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3},6)));
    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        return new int[]{0,0};
    }
}
