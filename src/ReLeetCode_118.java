public class ReLeetCode_118 {
    public static void main(String[] args) {

    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for (int i = 0; i < m; i++) {
            DFS(board,0,i);
            DFS(board,n-1,i);
        }
        for (int i = 0; i < n; i++) {
            DFS(board,i,0);
            DFS(board,i,m-1);
        }
        for (int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if (board[i][j]=='O')board[i][j]='X';
                else if (board[i][j]=='P') board[i][j]='O';
            }
        }
    }

    private void DFS(char[][] board, int i, int j) {
        if (i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!='O')return;
        board[i][j]='P';
        DFS(board,i+1,j);
        DFS(board,i-1,j);
        DFS(board,i,j+1);
        DFS(board,i,j-1);
    }
}
