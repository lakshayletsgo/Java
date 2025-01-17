public class ReLeetCode_65 {
    public static void main(String[] args) {

    }
    private int matchingPair = 0;
    public int averageOfSubtree(TreeNode root) {
        if (root ==null){
            return 0;
        }
        helper(root,0,0);
        return matchingPair;
    }

    private int[] helper(TreeNode root, int i, int i1) {
        if (root==null){
            return new int[]{0,0};
        }
        int[]leftSubtree = helper(root.left,i,i1);
        int[]rightSubtree = helper(root.right,i,i1);
        int totalAtLevel = leftSubtree[0]+rightSubtree[0]+root.val;
        int noOfNodes = leftSubtree[1]+rightSubtree[1]+1;
        if ((totalAtLevel/noOfNodes)==root.val) matchingPair++;
        return new int[]{totalAtLevel,noOfNodes};
    }

}
