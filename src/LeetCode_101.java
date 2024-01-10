//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/
//I have already done this question
//This is more optimised solution to this where we have used the preorder and inorder traversal

import java.util.HashMap;

public class LeetCode_101 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i );
        }

        int[]index = {0};
        return helper(preorder,inorder,0,preorder.length-1,map,index);
    }
    public TreeNode helper(int[]preOrder,int[]inOrder,int left,int right, HashMap<Integer,Integer> map,int[]index){
        if(left>right){
            return null;
        }
        int current = preOrder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        if(left==right){
            return node;
        }
        int currIndex = map.get(current);

        node.left = helper(preOrder,inOrder,left,currIndex-1,map,index);
        node.right = helper(preOrder,inOrder,currIndex+1,right,map,index);

        return node;



    }
}
