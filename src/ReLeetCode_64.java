public class ReLeetCode_64 {
    public static void main(String[] args) {

    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root==null){
            return null;
        }
         helper(root.left,root.right,0);
        return root;
    }

    private void helper(TreeNode left,TreeNode right, int level) {
        if (left==null||right==null){
            return ;
        }
        if (level%2==0)
        {
            int temp= left.val;
            left.val = right.val;
            right.val = temp;
        }
        helper(left.left,right.right,level+1);
        helper(left.right,right.left,level+1);

    }
}
