public class ReLeetCode_63 {
    public static void main(String[] args) {

    }
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root!=null){
            bstToGst(root.left);
            sum+=root.val;
            root.val = sum;
            bstToGst(root.right);
        }
        return root;
    }
}
