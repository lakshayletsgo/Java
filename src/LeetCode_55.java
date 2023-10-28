//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/submissions/1086292648/
//In this we have made so that first it will take the root from the preorder and then divivde the array of inorder in left and right and then we have made so that it will keep on call itself untill the array size is 0
import java.util.Arrays;

class TreeNode35 {
    int val;
    TreeNode35 left;
    TreeNode35 right;
    TreeNode35() {}
    TreeNode35(int val) { this.val = val; }
    TreeNode35(int val, TreeNode35 left, TreeNode35 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LeetCode_55 {
    public static void main(String[] args) {

    }
    public TreeNode35 buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;

        }
        int r =preorder[0];
        int index = 0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==r){
                index=  i;
            }
        }
        TreeNode35 node = new TreeNode35(r);
        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }
}
