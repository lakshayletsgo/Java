import java.util.*;
public class Top150_83 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            while(levelSize-- >0){
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);
            }
            ans.add(getAvg(level));
        }
        return ans;
    }
    private double getAvg(List<Integer>level){
        double ans = 0;
        for(int val:level){
            ans+=val;
        }
        return ans/level.size();
    }
}
