import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReLeetCode_108 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        join(nums,ans,new ArrayList<>(),0);
        return ans;
    }

    private void join(int[] nums, List<List<Integer>> ans, ArrayList<Integer> objects, int i) {
        ans.add(new ArrayList<>(objects));
        for (int j = i; j < nums.length; j++) {
            if (j>i&&nums[j]==nums[j-1])continue;
            objects.add(nums[j]);
            join(nums,ans,objects,j+1);
            objects.remove(objects.size()-1);
        }
    }

}

