//https://leetcode.com/problems/invert-binary-tree/submissions/
//Invert Tree
//In this we have to exchange the right and left of the node
//To do this we can first return the left of the node itself then we can exchange the node left and right
//To do this we can just swap them

class TreeNode26 {
    int val;
    TreeNode26 left;
    TreeNode26 right;
    TreeNode26() {}
    TreeNode26(int val) { this.val = val; }
    TreeNode26(int val, TreeNode26 left, TreeNode26 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeetCode_48 {
    public static void main(String[] args) {

    }
    public TreeNode26 invertNode(TreeNode26 root){
        if(root==null){
            return null;
        }
        TreeNode26 left = invertNode(root.left);
        TreeNode26 right = invertNode(root.right);

        root.right = left;
        root.left = right;


        return root;

    }

}
