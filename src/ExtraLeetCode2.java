//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/?envType=problem-list-v2&envId=binary-tree
public class ExtraLeetCode2 {
    public int sumRootToLeaf(TreeNode root) {
        return  helper(root,0);
    }
    private int helper(TreeNode root, int sum){
        if(root==null)return 0;
        sum=(2*sum)+root.val;
        if(root.left==null&&root.right==null)return sum;
        return helper(root.left,sum)+helper(root.right,sum);
    }
}
