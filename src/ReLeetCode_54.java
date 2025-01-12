import java.util.List;

public class ReLeetCode_54 {

    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return root;
        }
    }
}
