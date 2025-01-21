import java.lang.reflect.Array;
import java.util.Arrays;

public class ReLeetCode_70 {
    public static void main(String[] args) {

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (int i:preorder){
            root = insertNode(root,i);
        }
        return root;
    }

    private TreeNode insertNode(TreeNode root, int i) {
        if (root==null)return null;
        if (root.val<i) root.left = insertNode(root.left,i);
        if (root.val>i) root.right = insertNode(root.right,i);
        return root;
    }
}
