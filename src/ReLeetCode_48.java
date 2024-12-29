import com.sun.source.tree.Tree;

import java.util.Arrays;

public class ReLeetCode_48 {

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
        public int getHeight(TreeNode root){
            if (root==null)return 0;
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return left==-1||right==-1||(Math.abs(left-right)>1)?-1:1+Math.max(left,right);
        }

        public boolean isBalanced(TreeNode root) {
            if (root==null) return true;
            if (getHeight(root)==-1)return false;
            return true;
        }}

