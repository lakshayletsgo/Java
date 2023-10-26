//https://leetcode.com/problems/binary-tree-right-side-view/description/
import java.util.*;

class TreeNode12 {
      int val;
      TreeNode12 left;
      TreeNode12 right;
      TreeNode12() {}
      TreeNode12(int val) { this.val = val; }
      TreeNode12(int val, TreeNode12 left, TreeNode12 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_44 {
    public static void main(String[] args) {

    }
    public List<Integer> rightSideView(TreeNode12 root) {

        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<TreeNode12> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode12 current = queue.poll();
                if(i==levelSize-1){
                    ans.add(current.val);
                }
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
        }



        return ans;
    }
    
}
