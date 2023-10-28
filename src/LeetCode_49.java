//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
//In this we have just went down to the base and then returned from there
class TreeNode25 {
      int val;
      TreeNode25 left;
      TreeNode25 right;
      TreeNode25() {}
      TreeNode25(int val) { this.val = val; }
      TreeNode25(int val, TreeNode25 left, TreeNode25 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_49 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode25 root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right= maxDepth(root.right);

        return Math.max(left,right)+1;

    }
}
