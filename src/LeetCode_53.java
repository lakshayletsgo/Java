//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/1086261541/
//In this we have made so that if we reach any of the child we then return from there.
//After we have got both the ans we have return that node


    class TreeNode38 {
      int val;
      TreeNode38 left;
      TreeNode38 right;
      TreeNode38(int x) { val = x; }
  }
public class LeetCode_53 {
    public static void main(String[] args) {

    }
    public TreeNode38 lowestCommonAncestor(TreeNode38 root, TreeNode38 p, TreeNode38 q) {
        if(root==null){
            return null;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode38 left = lowestCommonAncestor(root.left,p,q);
        TreeNode38 right = lowestCommonAncestor(root.right,p,q);

        if(left!=null&&right!=null){
            return root;
        }
        return left==null?right:left;

    }
}
