import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_104 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(nums,0,ans,subset);
        return ans;
    }

    private void helper(int[] nums,int index,List<List<Integer>> ans,List<Integer> subset) {
        if (nums.length==index){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        helper(nums,index+1,ans,subset);
        subset.remove(subset.size()-1);
        helper(nums,index+1,ans,subset);
    }

}
