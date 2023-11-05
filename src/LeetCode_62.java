//https://leetcode.com/problems/sum-of-left-leaves/submissions/1092142354/
//In this we go the extreme left and checks if it has a right child or not
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_62 {
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
      }
  }
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root){
        int s = 0;
        if(root==null)return 0;
        if(root.left!=null&&root.left.right==null&&root.left.left==null){
            s+=root.left.val;
        }
        s+=sumOfLeftLeaves(root.left);
        s+=sumOfLeftLeaves(root.right);
        return s;
    }
}
