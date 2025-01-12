import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReLeetCode_56 {
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level= new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left!=null){
                    queue.add(curr.left);
                }
                if (curr.right!=null) queue.add(curr.right);
            }
             ans.add(level.getLast());
        }
        return ans;
    }
}
