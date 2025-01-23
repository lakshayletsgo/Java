public class ReLeetCode_74 {
    public static void main(String[] args) {

    }
    private int diff = 0;
    public int maxAncestorDiff(TreeNode root) {
        if (root==null){
            return 0;
        }
        maxDiff(root,root.val,root.val);
        return diff;

    }

    private void maxDiff(TreeNode root, int val, int val1) {
        if (root==null){
            return;
        }
        diff = Math.max(diff,Math.max(Math.abs(val-root.val),Math.abs(val1-root.val)));
        val = Math.min(root.val,val);
        val1 = Math.max(root.val,val1);
        maxDiff(root.left,val,val1);
        maxDiff(root.right,val,val1);
    }
}
