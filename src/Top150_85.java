import java.util.*;
public class Top150_85 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        boolean reverse = false;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            while(levelSize-- >0){
                if(reverse){
                    TreeNode curr = queue.pollLast();
                    level.add(curr.val);
                    if(curr.right!=null)queue.addFirst(curr.right);
                    if(curr.left!=null)queue.addFirst(curr.left);
                }else{
                    TreeNode curr = queue.pollFirst();
                    level.add(curr.val);
                    if(curr.left!=null)queue.addLast(curr.left);
                    if(curr.right!=null)queue.addLast(curr.right);
                }
            }
            reverse = !reverse;

            ans.add(level);
        }
        return ans;
    }
}
