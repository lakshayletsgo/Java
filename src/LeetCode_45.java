//https://leetcode.com/problems/cousins-in-binary-tree/
class TreeNode21 {
      int val;
      TreeNode21 left;
      TreeNode21 right;
      TreeNode21() {}
      TreeNode21(int val) { this.val = val; }
      TreeNode21(int val, TreeNode21 left, TreeNode21 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_45 {
    public static void main(String[] args) {

    }
    public boolean isCousins(TreeNode21 root, int x, int y) {
        TreeNode21 x1 = findNode(root,x);
        TreeNode21 y1 = findNode(root,y);


        return(
                (levell(root,x1,0)==levell(root,y1,0)&&(!siblings(root,x1,y1)))
                );
    }
    public TreeNode21 findNode(TreeNode21 root, int x){
        if(root==null){
            return null;
        }
        if(root.val==x){
            return root;
        }
        TreeNode21 n = findNode(root.left,x);
        if(n!=null){
            return  n;
        }
        return findNode(root.right,x);
    }
    public boolean siblings(TreeNode21 node, TreeNode21 x, TreeNode21 y){
        if(node==null){
            return false;
        }
        return (
                (node.left==x&&node.right==y)||(node.right==x&&node.left==y)||(siblings(node.left,x,y))||(siblings(node.right,x,y))
                );
    }
    public int levell(TreeNode21 node, TreeNode21 x, int current){
        if(node==null){
            return 0;
        }
        if(node==x){
            return current;
        }
        int l = levell(node.left,x, current+1);
        if(l!=0){
            return l;
        }
        return levell(node.right,x,current+1);
    }

}
