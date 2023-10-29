//https://leetcode.com/problems/binary-tree-maximum-path-sum/submissions/1086945317/
//In this we again use depth first search
//In this we visit every node and return its maximum path and then update in global variable and then we repeat it at every step
class TreeNode41 {
      int val;
      TreeNode41 left;
      TreeNode41 right;
      TreeNode41() {}
      TreeNode41(int val) { this.val = val; }
      TreeNode41(int val, TreeNode41 left, TreeNode41 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_58 {
    public static void main(String[] args) {

    }
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode41 root) {
        helperr(root);
        return ans;
    }
    public int helperr(TreeNode41 node){
        if(node==null){
            return 0;
        }
        int left = helperr(node.left);
        int right = helperr(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int sum=left+right+node.val;
        ans = Math.max(ans,sum);

        return Math.max(left,right)+node.val;
    }
}
