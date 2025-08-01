public class Top150_80 {

    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int left = 0;
        if(root.left!=null)left = countNodes(root.left);
        int right = 0;
        if(root.right!=null)right = countNodes(root.right);
        return (left+right+1);
    }
}
