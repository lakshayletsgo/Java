//https://leetcode.com/problems/subtree-of-another-tree/description/
//In this we take the path of every element and check if the path is equal to the path of the subtree
import java.util.ArrayList;
import java.util.List;

public class LeetCode_63 {
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
    List<TreeNode> list = new ArrayList<>();
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        dfs(root);
        String str = path(subRoot);
        for(int i=0;i<list.size();i++){
            TreeNode front = list.get(i);
            String temp= path(front);
            if(temp.equals(str)){
                return true;
            }
        }
        return false;
    }
    private String path(TreeNode node){
        if(node==null){
            return "#";
        }
        return node.val+" , "+path(node.left)+" , "+path(node.right);
    }
    private void dfs(TreeNode root){
        if(root==null)return;
        list.add(root);
        dfs(root.left);
        dfs(root.right);
    }
}
