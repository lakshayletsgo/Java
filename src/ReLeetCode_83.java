public class ReLeetCode_83 {
    public static void main(String[] args) {

    }
    int globalMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return globalMax;
    }

    private int helper(TreeNode root) {
        if (root==null)return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        left = Math.max(left,0);
        right = Math.max(right,0);
        int currNodeSum = root.val+left+right;
        int currMax = root.val+Math.max(left,right);
        globalMax = Math.max(currNodeSum,globalMax);
        return currMax;
    }

}
