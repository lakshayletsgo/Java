public class ReLeetCode_114 {
    public static void main(String[] args) {

    }
    private static int area =0;
    private static int row;
    private static int col;
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        row = grid.length;
        col = grid[0].length;
        if (row==0||col==0)return 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j]==1){
                    DFS(grid,i,j);
                    if (maxArea<area) maxArea = area;
                    area=0;
                }
            }
        }
        return maxArea;
    }

    private void DFS(int[][] grid, int i, int j) {
        if (i<0||j<0||i>=row||j>=col||grid[i][j]==0)return;
        if (grid[i][j]==1)area++;
        grid[i][j]=0;
        DFS(grid,i+1,j);
        DFS(grid,i-1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
    }
}
