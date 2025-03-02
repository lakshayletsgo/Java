public class ReLeetCode_116 {
    public static void main(String[] args) {

    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==2){
                    helper(grid,i,j,2);
                }
            }
        }
        int min = 2;
        for (int[]rows:grid){
            for (int row:rows){
                if (row==1)return -1;
                min = Math.min(min,row);
            }
        }
        return min-2;
    }

    private void helper(int[][] grid, int i, int j, int i1) {
        if (i>=grid.length||i<0||j>=grid[0].length||j<0||grid[i][j]==0||(1<grid[i][j]&&grid[i][j]<i1))return;
        else grid[i][j] = i1;
        helper(grid,i+1,j,i1+1);
        helper(grid,i-1,j,i1+1);
        helper(grid,i,j+1,i1+1);
        helper(grid,i,j-1,i1+1);





    }
}
