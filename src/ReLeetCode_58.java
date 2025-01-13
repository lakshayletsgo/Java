public class ReLeetCode_58 {
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long minValue, long maxValue) {
        if (root==null){
            return true;
        }
        if (root.val<=minValue||root.val>=maxValue){
            return false;
        }
        return helper(root.right,root.val,maxValue)&&helper(root.left,minValue,root.val);
    }

}
