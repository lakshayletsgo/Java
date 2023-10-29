//https://leetcode.com/problems/path-sum/submissions/1086765699/
//In this we again use the depth first search
//In this we first check whether the root value is equal to the target sum and left and right are null
//After that we check in the left and right
class TreeNode39 {
      int val;
      TreeNode39 left;
      TreeNode39 right;
      TreeNode39() {}
      TreeNode39(int val) { this.val = val; }
      TreeNode39(int val, TreeNode39 left, TreeNode39 right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }
public class LeetCode_56 {
    public static void main(String[] args) {

    }
    public boolean hasPathSum(TreeNode39 root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.val==targetSum&&root.left==null&&root.right==null){
            return true;
        }
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);

    }

}
