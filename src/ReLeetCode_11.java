import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReLeetCode_11 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int target = -nums[i];
            int p2=i+1;
            int p3=nums.length-1;
            while (p2<p3&&p2!=i&&p3!=i){
                if(nums[p2]+nums[p3]==target){
                    ans.add(Arrays.asList(nums[i],nums[p2],nums[p3]));
                    p2++;
                    while (nums[p2]==nums[p2-1]&&p2<p3){
                        p2++;
                    }
                } else if (nums[p2]+nums[p3]<target) {
                    p2++;
                }else{
                    p3--;
                }
            }
        }

        return ans;

    }
}
