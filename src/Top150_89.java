public class Top150_89 {
    private static int n;
    private static int m;

    public int numIslands(char[][] grid) {
        int c = 0;
        n = grid.length;
        m=  grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ++c;
                }
            }
        }
        return c;
    }
    private void dfs(char[][]grid,int i,int j){
        if(i<0||i>=n||j<0||j>=m||grid[i][j]!='1')return;
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
