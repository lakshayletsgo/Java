public class ReLeetCode_53 {
    public static void main(String[] args) {

    }
    int val;
    public boolean isUnivalTree(TreeNode root) {
        if (root ==null){
            return true;
        }
        val =  root.val;
        return helper(root);
    }

    private boolean helper(TreeNode root) {
        if (root==null){
            return true;
        }
        return root.val==val&&helper(root.left)&&helper(root.right);
    }

}
