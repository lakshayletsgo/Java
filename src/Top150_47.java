import java.util.*;
public class Top150_47 {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1)return 0;
        Arrays.sort(nums);
        int curr = 1;
        int max =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                curr++;
                max = Math.max(max,curr);
            }else if(nums[i]==nums[i-1])continue;
            else curr=1;
        }
        return max;

    }
}
