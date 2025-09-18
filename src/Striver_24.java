import java.util.*;
public class Striver_24 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    private void helper(int[]candidates,int target,int start,List<Integer> comb,List<List<Integer>> ans){
        if(target<0)return;
        if(target==0){
            ans.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(i>start&&candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            comb.add(candidates[i]);
            helper(candidates,target-candidates[i],i+1,comb,ans);
            comb.remove(comb.size()-1);
        }
    }
}
