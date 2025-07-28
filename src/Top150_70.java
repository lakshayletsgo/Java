public class Top150_70 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.right);
        invertTree(root.left);
        return root;
    }
}
