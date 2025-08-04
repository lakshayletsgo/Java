public class Top150_86 {
    TreeNode prev;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }
    private void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        if(prev!=null)min = Math.min(min,Math.abs(root.val-prev.val));
        prev = root;
        helper(root.right);
    }
}
