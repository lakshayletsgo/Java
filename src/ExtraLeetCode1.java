//https://leetcode.com/problems/binary-tree-tilt/submissions/1641138125/?envType=problem-list-v2&envId=binary-tree
public class ExtraLeetCode1 {
    public static void main(String[] args) {

    }

    int totalTilt=0;
    public int findTilt(TreeNode root) {
        if(root==null)return 0;
        helper(root);
        return totalTilt;
    }
    private int helper(TreeNode root){
        if(root==null)return 0;
        int leftVal = helper(root.left);
        int rightVal = helper(root.right);
        totalTilt +=Math.abs(leftVal-rightVal);
        return leftVal+rightVal+root.val;
    }
}
