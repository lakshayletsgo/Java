import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReLeetCode_106 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(target,candidates,0,res,new ArrayList<>());
        return res;
    }

    private void dfs(int target,int []nums, int start, List<List<Integer>> res, List<Integer> sub) {
        if (target<0)return;
        if (target==0){
            res.add(new ArrayList<>(sub));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i>start&&nums[i]==nums[i-1])continue;
            if (target<nums[i]) break;
            sub.add(nums[i]);
            dfs(target-nums[i],nums,i+1,res,sub);
            sub.remove(sub.size()-1);
        }

    }
}
