import java.util.*;
public class Top150_84 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
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
            ans.add(level);
        }
        return ans;
    }
}
