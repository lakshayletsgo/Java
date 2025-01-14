import javax.swing.*;
import java.util.HashMap;

public class ReLeetCode_60 {
    public static void main(String[] args) {

    }
    int pre = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return helper(0,preorder.length-1,preorder);

    }

    private TreeNode helper(int i, int i1, int[] preorder) {
        if (pre>=preorder.length)return null;
        if (i1<i)return null;
        TreeNode node = new TreeNode(preorder[pre]);
        int in = map.get(preorder[pre++]);
        node.left = helper(i,i1-1,preorder);
        node.left = helper(i+1,i1,preorder);
            return node;
    }
}
