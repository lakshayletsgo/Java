import java.util.*;
public class Top150_104 {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            helper(candidates,target,ans,new ArrayList<>(),0);
            return ans;
        }

        private void helper(int[] candidates, int target, List<List<Integer>> ans, List<Integer> subset,int start) {
            if (target==0){
                ans.add(new ArrayList<>(subset));
                return;
            }
            if (target<0)return;
            for (int j = start; j < candidates.length; j++) {
                subset.add(candidates[j]);
                helper(candidates,target-candidates[j],ans,subset,j);
                subset.remove(subset.size()-1);
            }
        }

}
