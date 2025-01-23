import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ReLeetCode_75 {
    class FindElements {
        TreeNode root ;
        public FindElements(TreeNode root) {
            this.root = root;
            Queue<TreeNode> queue = new LinkedList<>();
            this.root.val = 0;
            queue.offer(this.root);
            while (!queue.isEmpty()){
                int level = queue.size();
                for (int i = 0; i < level; i++) {
                    TreeNode temp = queue.poll();
                    if (temp.left!=null){
                        temp.left.val = 2*temp.val+1;
                        queue.add(temp.left);
                    }
                    if (temp.right!=null){
                        temp.right.val = 2*temp.val+1;
                        queue.add(temp.right);
                    }
                }
            }
        }

        public boolean find(int target) {
            return helper(target,root);
        }

        private boolean helper(int target, TreeNode root) {
            if (root==null){
                return false;
            }
            if (root.val==target){return true;}
            return helper(target,root.left)||helper(target,root.right);
        }
    }
    public static void main(String[] args) {

    }

}
