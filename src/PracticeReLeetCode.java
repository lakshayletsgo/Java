import java.util.*;

public class PracticeReLeetCode {



    public boolean isValidSudoku(char[][] board) {
        int row= board.length;
        int col=board.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]!='.'&&(!isValidHor(board,i,j)||!isValidVer(board,i,j)||!isValidBox(board,i,j)))return false;
            }
        }
        return true;
    }
    private boolean isValidHor(char[][]board,int posRow,int posCol){
        for(int i=0;i<board.length&&i!=posCol;i++){
            if(board[posRow][i]==board[posRow][posCol])return false;
        }
        return true;
    }
    private boolean isValidVer(char[][]board,int posRow,int posCol){
        for(int i=0;i<board.length&&i!=posRow;i++)if(board[i][posCol]==board[posRow][posCol])return false;
        return true;
    }
    private boolean isValidBox(char[][]board,int posRow,int posCol){
        int i=posRow-posRow%3;
        int j=posCol-posCol%3;
        for(int i1=i;i1<i+3;i1++){
            for(int j1=j;j1<j+3;j1++){
                if(i1==posRow) if(j1==posCol)continue;
                if(board[i1][j1]==board[posRow][posCol])return false;
            }
        }
        return true;
    }

}
