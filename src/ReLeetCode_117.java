import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReLeetCode_117 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=heights.length;
        int m=heights[0].length;
        boolean[][]pacific = new boolean[n][m];
        boolean[][]atlantic = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            dfs(heights,pacific,Integer.MIN_VALUE,i,0);
            dfs(heights,atlantic,Integer.MIN_VALUE,i,m-1);
        }
        for (int i = 0; i < m; i++) {
            dfs(heights,pacific,Integer.MIN_VALUE,0,i);
            dfs(heights,atlantic,Integer.MIN_VALUE,n-1,i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (atlantic[i][j]&&pacific[i][j])ans.add(Arrays.asList(i,j));
            }
        }



        return ans;
    }

    private void dfs(int[][] heights, boolean[][] atlantic, int minValue, int i, int i1) {
        int n = heights.length;
        int m = heights[0].length;
        if (i<0||i>=n||i1<0||i1>=m||atlantic[i][i1]||minValue>heights[i][i1])return;
        atlantic[i][i1] = true;
        dfs(heights,atlantic,heights[i][i1],i+1,i1);
        dfs(heights,atlantic,heights[i][i1],i-1,i1);
        dfs(heights,atlantic,heights[i][i1],i,i1+1);
        dfs(heights,atlantic,heights[i][i1],i,i1-1);

    }
}
