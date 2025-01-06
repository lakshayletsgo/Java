public class ReLeetCode_52 {
    public static void main(String[] args) {

    }
    TreeNode prev;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode root){
        if (root==null)return;
        dfs(root.left);
        if (prev!=null)ans = Math.min(ans,root.val-prev.val);
        prev = root;
        dfs(root.right);
    }

}
