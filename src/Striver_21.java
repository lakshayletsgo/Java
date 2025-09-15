public class Striver_21 {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char val='1';val<='9';val++){
                        if(isValid(board,i,j,val)){
                            board[i][j]=val;
                            if(solve(board))return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][]board,int i,int j,char val){
        for(int x=0;x<9;x++){
            if(board[i][x]==val)return false;
            if(board[x][j]==val)return false;
            if(board[3*(i/3)+x/3][3*(j/3)+x%3]==val)return false;
        }
        return true;
    }
}
