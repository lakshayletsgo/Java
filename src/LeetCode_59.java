//https://leetcode.com/problems/same-tree/description/
//In this i have used depth first search
//In this i have made so that it only returns true when it is either both null or their val are equal
class TreeNode42 {
      int val;
      TreeNode42 left;
      TreeNode42 right;
      TreeNode42() {}
      TreeNode42(int val) { this.val = val; }
      TreeNode42(int val, TreeNode42 left, TreeNode42 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_59 {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode42 p, TreeNode42 q) {
        if(p==null&&q==null){
            return true;
        }
        if(p!=null&&q!=null){
            return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
        return false;


    }

}
