//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
//In this we have been given a sorted array so we can easily store them in a balanced bst
class TreeNode29 {
      int val;
      TreeNode29 left;
      TreeNode29 right;
      TreeNode29() {}
      TreeNode29(int val) { this.val = val; }
      TreeNode29(int val, TreeNode29 left, TreeNode29 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class LeetCode_50 {
    public static void main(String[] args) {

    }
    private TreeNode29 create(int[] nums, int l, int r){
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        TreeNode29 root = new TreeNode29(nums[mid]);

        root.left = create(nums,l,mid-1);
        root.right = create(nums,mid+1,r);
        return root;
    }
    public TreeNode29 sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }

}
