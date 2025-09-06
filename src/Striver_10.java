import java.util.*;
public class Striver_10 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++)map.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int newTarget=-nums[i];
            int start=i+1;
            int end = nums.length-1;
            while(start<end&&start!=i&&end!=i){
                if(nums[start]+nums[end]==newTarget){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    while(nums[start]==nums[start-1]&&start<end)start++;
                }else if(nums[start]+nums[end]<newTarget)start++;
                else end--;
            }
        }
        return ans;
    }
}
