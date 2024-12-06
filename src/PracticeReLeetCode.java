import java.util.HashMap;
import java.util.Map;

public class PracticeReLeetCode {
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
//        System.out.println(minWindow("eidbaooo","ab"));
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

//        We just swap the left and right nodes
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


    }
