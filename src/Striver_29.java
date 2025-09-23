import java.util.*;
public class Striver_29 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][]board = new char[n][n];
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)board[i][j] = '.';
        helper(ans,board,n,0);
        return ans;
    }
    private void helper(List<List<String>> ans, char[][]board,int n,int col){
        if(n==col){
            ans.add(constructBoard(board,col));
            return;
        }
        for(int row = 0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                helper(ans,board,n,col+1);
                board[row][col] = '.';
            }
        }
    }
    private List<String> constructBoard(char[][]board,int col){
        List<String> list = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String ans = new String(board[i]);
            list.add(ans);
        }
        return list;
    }
    private boolean isSafe(char[][]board,int row,int col,int n){
        int tempRow = row;
        int tempCol = col;
        while(row>=0&&col>=0){
            if(board[row][col]!='.')return false;
            row--;
            col--;
        }
        row = tempRow;
        col = tempCol;
        while(col>=0){
            if(board[row][col]!='.')return false;
            col--;
        }
        col = tempCol;
        while(col>=0&&row<n){
            if(board[row][col]!='.')return false;
            col--;
            row++;
        }
        return true;
    }
}
