import java.util.HashMap;
import java.util.Map;

public class Top150_5 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        for(int i=0;i<size;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>(size/2))return nums[i];
        }
        return -1;
    }
}
