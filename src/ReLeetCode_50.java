public class ReLeetCode_50 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }}
    public static void main(String[] args) {

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (root.val==subRoot.val&&sameTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    private boolean sameTree(TreeNode root,TreeNode subRoot){
        if (root==null||subRoot==null){
            return root==subRoot;
        }
        return sameTree(root.left,subRoot.left)&&sameTree(root.right,subRoot.right);
    }
}
