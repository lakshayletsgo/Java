public class Striver_20 {
    int di = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return di;
        helper(root);
        return di;
    }
    private int helper(TreeNode root){
        if(root==null)return 0;
        int leftDi = helper(root.left);
        int rightDi = helper(root.right);
        di = Math.max(di,leftDi+rightDi);
        return 1+Math.max(leftDi,rightDi);
    }
}
