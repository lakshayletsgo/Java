public class ReLeetCode_77 {
    public static void main(String[] args) {

    }
    private int moves = 0;
    public int distributeCoins(TreeNode root) {
        distributeCoins2(root);
        return moves;
    }
    public int distributeCoins2(TreeNode root) {
        if (root==null) return 0;
        int leftVal = distributeCoins2(root.left);
        int rightVal = distributeCoins2(root.right);
        moves+=Math.abs(leftVal)+Math.abs(rightVal);
        return root.val+leftVal+rightVal-1;
    }
}
