public class Top150_38 {
    public void gameOfLife(int[][] board) {
        if(board==null||board.length==0)return;
        int n = board.length,  m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int lives = getLives(board,i,j,n,m);
                if(board[i][j]==1&&lives>=2&&lives<=3)board[i][j]=3;
                if(board[i][j]==0&&lives==3)board[i][j]=2;
            }
        }
        for(int i=0;i<n;i++)for(int j=0;j<m;j++)board[i][j]>>=1;
    }
    private int getLives(int[][]board,int i, int j,int n, int m){
        int lives =0;
        for(int x=Math.max(i-1,0);x<=Math.min(i+1,n-1);x++){
            for(int y=Math.max(j-1,0);y<=Math.min(j+1,m-1);y++){
                lives+=board[x][y]&1;
            }
        }
        lives-=board[i][j]&1;
        return lives;
    }
}
