//https://leetcode.com/problems/validate-binary-search-tree/submissions/1085976453/
class TreeNode31 {
      int val;
      TreeNode31 left;
      TreeNode31 right;
      TreeNode31() {}
      TreeNode31(int val) { this.val = val; }
      TreeNode31(int val, TreeNode31 left, TreeNode31 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_52 {
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode31 root) {
        return  helperr(root,null,null);
    }

    private boolean helperr(TreeNode31 root, Integer o, Integer o1) {
        if(root==null){
            return true;
        }
        if(o!=null&&root.val<=o){
            return false;
        }
        if(o1!=null&&root.val>=o1){
            return false;
        }
        boolean leftTree = helperr(root.left,o,root.val);
        boolean rightTree = helperr(root.right,root.val,o1);

        return leftTree&&rightTree;

    }

}
