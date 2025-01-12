import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReLeetCode_55 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize  = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i <levelSize; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);
                if (curr.left!=null){
                    queue.add(curr.left);
                }
                if (curr.right!=null){
                    queue.add(curr.right);
                }
            }
            ans.add(level);
        }
        return  ans;



    }
}
