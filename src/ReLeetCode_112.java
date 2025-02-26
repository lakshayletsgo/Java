import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_112 {
    public static void main(String[] args) {

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        if (n<=0)return ans;
        char [][]board= new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';
            }
        }
        backTrack(0,n,ans,board,n);
        return ans;
    }

    private void backTrack(int col, int i, List<List<String>> ans, char[][] board,int n) {
        if (col==i){
            ans.add(construct(board,n));
            return;
        }
        for (int row=0;row<n;row++){
            if (isSafe(row,col,board,n)){
                board[row][col]= 'Q';
                backTrack(col+1,i,ans,board,n);
                board[row][col]='.';
            }
        }

    }

    private List<String> construct(char[][] ans, int n) {
        List<String> newTemp  = new ArrayList<>();
        for (int i=0;i<n;i++){
            String rowElement = new String(ans[i]);
            newTemp.add(rowElement);
        }
        return newTemp;
    }

    private boolean isSafe(int row, int col, char[][] board, int n) {
        int tempRow = row;
        int tempCol = col;
        while (row>=0&&col>=0){
            if (board[row][col]=='Q')return false;
            row--;
            col--;
        }
        row = tempRow;
        col = tempCol;
        while (col>=0){
            if (board[row][col]=='Q')return false;
            col--;
        }
        col= tempCol;
        while (row<n&&col>=0){
            if (board[row][col]=='Q')return false;
            row++;
            col--;
        }
        return true;
    }

}
