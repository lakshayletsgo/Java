public class ReLeetCode_81 {
    public static void main(String[] args) {

    }
    TreeNode curr= null;
    public ReLeetCode_81(TreeNode root) {
        curr = root;
    }

    public int next() {
        int res = -1;
        while (curr!=null){
            TreeNode left = curr.left;
            if (left==null){
                res = curr.val;
                curr = curr.right;
                break;
            }
            else{
                TreeNode leftMostRightChild =  getLeftMostRight(curr.left,curr);
                if (leftMostRightChild.right==null){
                    leftMostRightChild.right = curr;
                    curr= curr.left;
                }else{
                    leftMostRightChild.right = null;
                    res = curr.val;
                    curr = curr.right;
                    break;
                }
            }
        }
        return res;
    }

    private TreeNode getLeftMostRight(TreeNode left, TreeNode curr) {
        while (left.right!=null&&left.right!=curr){
            left=  left.right;
        }
            return left;
    }

    public boolean hasNext() {
        return curr!=null;
    }
}
