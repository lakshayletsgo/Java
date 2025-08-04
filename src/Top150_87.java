public class Top150_87 {
    int count = 0;
    int index = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return index;
    }
    private void helper(TreeNode root){
        if(root.left!=null)helper(root.left);
        count--;
        if(count==0){
            index = root.val;
            return;
        }
        if(root.right!=null)helper(root.right);
    }
}
