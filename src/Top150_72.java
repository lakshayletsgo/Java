import java.util.*;
public class Top150_72 {
    Map<Integer,Integer> map = new HashMap<>();
    int preOrderInd = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)map.put(inorder[i],i);
        return helper(0,preorder.length-1,preorder);
    }
    private TreeNode helper( int i, int j,int[]preorder){
        if(preOrderInd>=preorder.length||i>j)return null;
        TreeNode node = new TreeNode(preorder[preOrderInd]);
        int index = map.get(preorder[preOrderInd++]);
        node.left = helper(i,index-1,preorder);
        node.right = helper(index+1,j,preorder);
        return node;

    }
}
