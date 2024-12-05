public class ReLeetCode_47 {
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
    private int diameter = 0; // To store the maximum diameter

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return diameter;
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0; // Base case: depth of an empty tree is 0
        }

        // Recursively find the depth of the left and right subtrees
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // Update the diameter at the current node
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the current subtree
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
