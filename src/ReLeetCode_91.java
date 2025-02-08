public class ReLeetCode_91 {
    public static void main(String[] args) {

    }
    private int numOfCameras = 0;

    public int minCameraCover(TreeNode root){
        return dfs(root)==-1?numOfCameras+1:numOfCameras;
    }

    private int dfs(TreeNode root) {
        if (root==null)return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left==-1||right==-1){
            numOfCameras++;
            return 1;
        }
        if (left==1||right==1)return 0;
        return -1;
    }

}
