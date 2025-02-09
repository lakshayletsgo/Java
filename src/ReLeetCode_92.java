import com.sun.source.tree.Tree;

public class ReLeetCode_92 {
    public static void main(String[] args) {

    }
    private class NodeWrap{
        final TreeNode node;
        int max;
        int min;
        int sum;
        boolean validBst = true;
        NodeWrap(TreeNode node){
            this.node = node;
            this.max = node.val;
            this.min = node.val;
            this.sum = node.val;
        }
    }
    int maxSum = 0;
    public int maxSumBST(TreeNode root) {
        getMaxSum(root);
        return maxSum;
    }

    private NodeWrap getMaxSum(TreeNode root) {
        if (root==null)return null ;
        NodeWrap leftTree = getMaxSum(root.left);
        NodeWrap rightTree = getMaxSum(root.right);
        NodeWrap curr = new NodeWrap(root);
        if (leftTree!=null){
            curr.sum+= leftTree.sum;
            curr.max= Math.max(curr.max,leftTree.max);
            curr.min= Math.min(curr.min,leftTree.min);
            curr.validBst &= leftTree.validBst&&leftTree.max<root.val;
        }
        if (rightTree!=null){
            curr.sum+= rightTree.sum;
            curr.max= Math.max(curr.max,rightTree.max);
            curr.min= Math.min(curr.min,rightTree.min);
            curr.validBst &= rightTree.validBst&&rightTree.min>root.val;
        }
        if (curr.validBst){
            maxSum  =Math.max(maxSum,curr.sum);
        }
        return curr;
    }
}
