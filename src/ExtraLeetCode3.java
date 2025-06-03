import java.util.ArrayList;
import java.util.List;

public class ExtraLeetCode3 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    private void helper(TreeNode root, List<Integer> list){
        if(root==null)return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right,list);

    }
}
