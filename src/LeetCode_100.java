//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/submissions/1165600003/
import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.List;
public class LeetCode_100 {
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

        public static void main(String[] args) {

        }
        public boolean findTarget(TreeNode root, int k) {
            HashSet<Integer> set = new HashSet<>();
            return helper(root,k,set);
        }
        private boolean helper(TreeNode root, int k, HashSet<Integer> set){
          if(root==null){
              return false;
          }
          if(set.contains(k-root.val)){
              return true;
          }
          set.add(root.val);
          return helper(root.left,k,set)||helper(root.right,k,set);
      }
    }
}
