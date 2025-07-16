public class Top150_34 {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'&&(!isValidRow(board,i,j)||!isValidCol(board,i,j)||!isValidBox(board,i,j)))return false;
            }
        }
        return true;
    }
    private boolean isValidRow(char[][]board, int x, int y){
        for(int i=0;i<board.length;i++){
            if(board[x][i]==board[x][y]&&i!=y)return false;
        }
        return true;
    }

    private boolean isValidCol(char[][]board, int x, int y){
        for(int i=0;i<board.length;i++){
            if(board[i][y]==board[x][y]&&i!=x)return false;
        }
        return true;
    }

    private boolean isValidBox(char[][]board, int x, int y){
        int startR = x-x%3;
        int startC = y-y%3;
        for(int i=startR;i<startR+3;i++){
            for(int j=startC;j<startC+3;j++)
            {if(i==x&&j==y)continue;
                if(board[i][j]==board[x][y])return false;}
        }
        return true;
    }
}
