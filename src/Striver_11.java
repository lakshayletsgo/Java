import java.util.*;
public class Striver_11 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int left = j+1,right = n-1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right&&nums[left]==nums[left+1])left++;
                        while(left<right&&nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    }else if(sum<target)left++;
                    else right--;
                }
            }
        }
        return result;
    }
}
