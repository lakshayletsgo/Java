//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/1085966034/

//In this we have first taken the left of the root and then we have moved to the right of the root and the element that are already on the right of root we have shift them to the first null of the right of left side and then repeated it for entire tree
class TreeNode28 {
      int val;
      TreeNode28 left;
      TreeNode28 right;
      TreeNode28() {}
      TreeNode28(int val) { this.val = val; }
      TreeNode28(int val, TreeNode28 left, TreeNode28 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_51 {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode28 root) {
        TreeNode28 current = root;
        while (current!=null){
            if(current.left!=null){
                TreeNode28 temp =current.left;
                while (temp.right!=null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
