//https://leetcode.com/problems/diameter-of-binary-tree/submissions/1084826662/
//In this we have used a global variable whose value we keep on updating
//We have used recursion and calculated height of every node and then took the max of it and update it in diameter varible


class TreeNode24 {
      int val;
      TreeNode24 left;
      TreeNode24 right;
      TreeNode24() {}
      TreeNode24(int val) { this.val = val; }
      TreeNode24(int val, TreeNode24 left, TreeNode24 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_47 {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode24 root){
        height(root);
        return diameter-1;
    }
    int height(TreeNode24 node){
        if(node==null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight+rightHeight+1;
        diameter = Math.max(dia,diameter);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] args) {

    }
}
