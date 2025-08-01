public class Top150_79 {
     private class BSTIterator {
        TreeNode curr = null;
        public BSTIterator(TreeNode root) {
            curr = root;
        }

        public int next() {
            int res= -1;
            while(curr!=null){
                TreeNode left = curr.left;
                if(left==null){
                    res = curr.val;
                    curr = curr.right;
                    break;
                }else{
                    TreeNode leftMostChildRight = getLeftMostRight(curr.left,curr);
                    if(leftMostChildRight.right==null){
                        leftMostChildRight.right = curr;
                        curr = curr.left;
                    }else{
                        leftMostChildRight.right = null;
                        res= curr.val;
                        curr = curr.right;
                        break;
                    }
                }
            }
            return res;
        }
        private TreeNode getLeftMostRight(TreeNode left, TreeNode curr){
            while(left.right!=null&&left.right!=curr)left = left.right;
            return left;
        }

        public boolean hasNext() {
            return curr!=null;
        }
    }
}
