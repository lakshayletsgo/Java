import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReLeetCode_66 {
    public static void main(String[] args) {

    }

    private int sumAtLastLevel = 0;
    public int deepestLeavesSum(TreeNode root) {
        if (root==null){
            return 0;
        }
        sumAtEachLevel(root);
        return sumAtLastLevel;
    }

    private void sumAtEachLevel(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<TreeNode> level = new ArrayList<>();
            for (int i=0;i<levelSize;i++){
                TreeNode curr = queue.poll();
                level.add(curr);
                if (curr.left!=null){
                    queue.add(curr.left);
                }
                if (curr.right!=null){
                    queue.add(curr.right);
                }
            }
            sumAtLastLevel = getSumOfList(level);
        }
    }

    private int getSumOfList(List<TreeNode> level) {
        int sum = 0;
        for (TreeNode curr:level){
            sum+=curr.val;
        }
        return sum;
    }

}
