public class Top150_78 {
    int global=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return global;
    }
    private int helper(TreeNode root){
        if(root==null)return 0;
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);

        int curNodeSum = left+right+root.val;
        int currMax = root.val+Math.max(left,right);
        global = Math.max(global,curNodeSum);
        return currMax;
    }
}
