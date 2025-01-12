import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReLeetCode_57 {
    public static void main(String[] args) {

    }

    public int goodNodes(TreeNode root) {
        return root!=null?dfs(root,root.val):0;
    }
    private int dfs(TreeNode root, int max) {
        if (root==null) return 0;
        max  = Math.max(root.val,max);
        return root.val>=max?1+dfs(root.left,max)+dfs(root.right,max):dfs(root.left,max)+dfs(root.right,max);
    }

}
