//https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/1086274593/
//In this we use the in-order traversal as we need to find the smallest of the element

class TreeNode34 {
      int val;
      TreeNode34 left;
      TreeNode34 right;
      TreeNode34() {}
      TreeNode34(int val) { this.val = val; }
      TreeNode34(int val, TreeNode34 left, TreeNode34 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_54 {
    public static void main(String[] args) {

    }

    int counter= 0;
    public int kthSmallest(TreeNode34 root, int k) {
        return helper(root,k).val;
    }
    private TreeNode34 helper(TreeNode34 node,int k){
        if(node==null){
            return null;
        }
        TreeNode34 left = helper(node.left,k);
        if(left!=null){
            return left;
        }
        counter++;
        if(k==counter){
            return node;
        }
        return helper(node.right,k);

    }
}
