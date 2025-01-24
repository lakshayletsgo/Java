public class ReLeetCode_76 {
    public static void main(String[] args) {

    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root==null)return null;
        root.left =  removeLeafNodes(root.left,target);
        root.right =  removeLeafNodes(root.right,target);
        if (root.right==null&&root.left==null&&root.val==target)return null;
        return root;
    }
}
