import java.util.Arrays;

public class ReLeetCode_155 {
    public static void main(String[] args) {

    }
    int [][]dp;
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        int max=0;
        n=matrix.length;
        m=matrix[0].length;
        dp=new int[n][m];
        for (int []d:dp) Arrays.fill(d,-1);
        for (int i=0;i<n;i++)for (int j=0;j<m;j++)if (dp[i][j]==-1)dfs(matrix,i,j,-1);
        for (int []i:dp)for (int j:i)max=Math.max(j,max);
        return max;
    }

    private int dfs(int[][] matrix, int i, int j, int parent) {
        if (i>=n||j>=m||i<0||j<0||matrix[i][j]<=parent)return 0;
        parent=matrix[i][j];
        if (dp[i][j]!=-1)return dp[i][j];
        int left = dfs(matrix,i,j-1,parent);
        int right = dfs(matrix,i,j+1,parent);
        int top = dfs(matrix,i-1,j,parent);
        int down = dfs(matrix,i+1,j,parent);
        dp[i][j]=1+Math.max(Math.max(left,right),Math.max(top,down));
        return dp[i][j];
    }
}
