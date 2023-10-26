//https://leetcode.com/problems/symmetric-tree/
//As we can see it ask whether the element on the level is same. We know that Breadth First Search is going to use
//We then add in the queue in a format that it add the same mirror element

import java.util.LinkedList;
import java.util.Queue;
class TreeNode22 {
      int val;
      TreeNode22 left;
      TreeNode22 right;
      TreeNode22() {}
      TreeNode22(int val) { this.val = val; }
      TreeNode22(int val, TreeNode22 left, TreeNode22 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_46 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode22 root) {
        Queue<TreeNode22> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode22 left = queue.poll();
            TreeNode22 right = queue.poll();

            if(left==null&&right==null){
                continue;
            }
            if(left==null||right==null){
                return false;
            }
            if(left.val!=right.val){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
