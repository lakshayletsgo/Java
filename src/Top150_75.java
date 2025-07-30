public class Top150_75 {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        helper(root);
    }
    private void helper(TreeNode root){
        if(root==null)return;
        helper(root.right);
        helper(root.left);
        root.right  = prev;
        root.left = null;
        prev = root;
    }
}
