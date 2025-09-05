public class Striver_7 {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++)for(int j=0;j<m;j++) if(grid[i][j]==2)helper(grid,i,j,2);
        int min = 2;
        for(int []rows:grid){
            for(int row:rows){
                if(row==1)return -1;
                min = Math.max(min,row);
            }
        }
        return min-2;
    }
    private void helper(int[][]grid,int i,int j,int val){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0||(1<grid[i][j]&&grid[i][j]<val))return;
        else{grid[i][j]=val;
            helper(grid,i-1,j,val+1);
            helper(grid,i+1,j,val+1);
            helper(grid,i,j-1,val+1);
            helper(grid,i,j+1,val+1);}

    }
}
