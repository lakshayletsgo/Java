import java.util.Arrays;

public class ReLeetCode_67 {
    public static void main(String[] args) {

    }
    private TreeNode helper(int[]nums,int start,int end){
        if (start>=end){
            return null;
        }
        int[] maxVal = getMax(nums,start,end);
        int maxInd = maxVal[1];
        TreeNode root = new TreeNode(nums[maxInd]);
        if (maxInd==0){
            root.right = helper(nums,maxInd+1,end);
        } else if (maxInd==nums.length-1)    {
            root.left=  helper(nums,start,maxInd);
        }else{
            root.left = helper(nums,start,maxInd);
            root.right = helper(nums,maxInd+1,end);
        }
        return root;

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length);

    }
    private int[] getMax(int[]nums,int start,int end){
        int maxInd = 0;
        int max = Integer.MIN_VALUE;
        for (int i=start;i<end;i++){
            if (max<nums[i]){
                max = nums[i];
                maxInd= i;
            }
        }
        return new int[]{max,maxInd};
    }
}
