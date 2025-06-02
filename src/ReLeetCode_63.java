public class ReLeetCode_63 {
    public static void main(String[] args) {

    }

    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root!=null){
            bstToGst(root.right);
            sum+=root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
}
