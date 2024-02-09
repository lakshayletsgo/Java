//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/submissions/1170554094/
public class LeetCode_104 {
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    TreeNode ans = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original==null) {
            return null;
        }
        if(target==original){
            ans = cloned;
        }
        getTargetCopy(original.left,cloned.left,target);
        getTargetCopy(original.right,cloned.right,target);
        return ans;
    }
}
