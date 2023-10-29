//https://leetcode.com/problems/sum-root-to-leaf-numbers/submissions/1086770931/
class TreeNode40 {
    int val;
    TreeNode40 left;
    TreeNode40 right;
    TreeNode40() {}
    TreeNode40(int val) { this.val = val; }
    TreeNode40(int val, TreeNode40 left, TreeNode40 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LeetCode_57 {
    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode40 root) {
        return helper(root,0);
    }
    public int helper(TreeNode40 node,int sum){
        if(node==null){
            return 0;
        }
        sum=sum*10+node.val;
        if(node.left==null&&node.right==null){
            return sum;
        }

        return helper(node.left,sum)+helper(node.right,sum);
    }
}
